package com.example.catalog.api;

import com.example.catalog.service.CryptoService;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/crypto")
public class CryptoController {

    private final CryptoService cryptoService;

    public CryptoController(CryptoService cryptoService) {
        this.cryptoService = cryptoService;
    }

    @PostMapping("/encrypt")
    public EncryptResponse encrypt(@RequestBody EncryptRequest req) {
        String cipher = cryptoService.encrypt(req.getTexto(), req.getKey(), req.getKey());
        return new EncryptResponse();
    }

    @PostMapping("/decrypt")
    public DecryptResponse decrypt(@RequestBody EncryptRequest req) {
        String plain = cryptoService.decrypt(req.getTexto(), req.getKey(), req.getKey());
        return new DecryptResponse();
    }

    @Data
    public static class EncryptRequest {
        private String texto;
        private String key; // Base64 o texto plano, se normaliza a 16/24/32 bytes
        private String iv;  // Base64 o texto plano, se normaliza a 16 bytes
		public String getTexto() {
			// TODO Auto-generated method stub
			return null;
		}
		public String getKey() {
			// TODO Auto-generated method stub
			return null;
		}
    }

    @Data
    public static class EncryptResponse {
        private final String base64Cipher = "";
    }

    @Data
    public static class DecryptResponse {
        private final String plainText = "";
    }
}
