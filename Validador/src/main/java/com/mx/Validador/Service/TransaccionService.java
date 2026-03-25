package com.mx.Validador.Service;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import com.mx.Validador.Entity.Transaccion;
@Service
public class TransaccionService {
	public boolean validarSha(Transaccion transaccion) {

	String cadena = transaccion.getOperacion() + transaccion.getImporte() + transaccion.getCliente();
    String shaGenerado = DigestUtils.sha512Hex(cadena);    

    return shaGenerado.equals(transaccion.getSha());
}

}