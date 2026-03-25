package com.example.catalog.service;

import org.springframework.stereotype.Service;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

@Service
public class CryptoService {

    // AES/CBC/PKCS5Padding with provided key and iv (Base64 or raw 16/24/32-byte strings)
    public String encrypt(String plainText, String key, String iv) {
        try {
            byte[] keyBytes = normalizeToAesKeyBytes(key);
            byte[] ivBytes = normalizeToIvBytes(iv);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            SecretKeySpec secretKeySpec = new SecretKeySpec(keyBytes, "AES");
            IvParameterSpec ivSpec = new IvParameterSpec(ivBytes);
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivSpec);
            byte[] encrypted = cipher.doFinal(plainText.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(encrypted);
        } catch (Exception e) {
            throw new RuntimeException("Error al cifrar: " + e.getMessage(), e);
        }
    }

    public String decrypt(String base64Cipher, String key, String iv) {
        try {
            byte[] keyBytes = normalizeToAesKeyBytes(key);
            byte[] ivBytes = normalizeToIvBytes(iv);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            SecretKeySpec secretKeySpec = new SecretKeySpec(keyBytes, "AES");
            IvParameterSpec ivSpec = new IvParameterSpec(ivBytes);
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, ivSpec);
            byte[] decoded = Base64.getDecoder().decode(base64Cipher);
            byte[] plain = cipher.doFinal(decoded);
            return new String(plain, StandardCharsets.UTF_8);
        } catch (Exception e) {
            throw new RuntimeException("Error al descifrar: " + e.getMessage(), e);
        }
    }

    private byte[] normalizeToAesKeyBytes(String keyInput) {
        // Accepts Base64 or raw text; pad/truncate to 16/24/32 bytes (AES-128/192/256)
        byte[] raw;
        try {
            raw = Base64.getDecoder().decode(keyInput);
        } catch (IllegalArgumentException ex) {
            raw = keyInput.getBytes(StandardCharsets.UTF_8);
        }
        if (raw.length == 16 || raw.length == 24 || raw.length == 32) return raw;
        // pad with zeros up to 32, then truncate to 16
        byte[] tmp = new byte[32];
        System.arraycopy(raw, 0, tmp, 0, Math.min(raw.length, 32));
        // default AES-256 if JCE unlimited; otherwise many JDKs support 256 since Java 8u162
        return tmp; // 32 bytes
    }

    private byte[] normalizeToIvBytes(String ivInput) {
        byte[] raw;
        try {
            raw = Base64.getDecoder().decode(ivInput);
        } catch (IllegalArgumentException ex) {
            raw = ivInput.getBytes(StandardCharsets.UTF_8);
        }
        byte[] iv = new byte[16];
        System.arraycopy(raw, 0, iv, 0, Math.min(raw.length, 16));
        return iv;
    }
}
