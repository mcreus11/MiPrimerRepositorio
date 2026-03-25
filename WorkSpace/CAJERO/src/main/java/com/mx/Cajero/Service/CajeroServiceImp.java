package com.mx.Cajero.Service;

import java.math.BigDecimal;

import com.mx.Cajero.Dao.IDenominacionDao;
import com.mx.Cajero.Dominio.Denominacion;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CajeroServiceImp implements ICajeroService {
	
	

    private IDenominacionDao dao;

    public CajeroServiceImp(IDenominacionDao dao) {
        this.dao = dao;
    }

    @Override
    public Map<BigDecimal, Integer> retirar(BigDecimal monto) {
    	
        List<Denominacion> disponibles = dao.findAllByOrderByValorDesc();
        Map<BigDecimal, Integer> entrega = new LinkedHashMap<>();
        BigDecimal restante = monto;

        for (Denominacion d : disponibles) {
            int maxUso = restante.divideToIntegralValue(d.getValor()).intValue();
            int usar = Math.min(maxUso, d.getCantidad());
            if (usar > 0) {
                entrega.put(d.getValor(), usar);
                restante = restante.subtract(d.getValor().multiply(BigDecimal.valueOf(usar)));
            }
        }

        if (restante.compareTo(BigDecimal.ZERO) > 0) {
            return null; 
        }

        for (Map.Entry<BigDecimal, Integer> entry : entrega.entrySet()) {
            Denominacion d = dao.findByValor(entry.getKey());
            d.setCantidad(d.getCantidad() - entry.getValue());
            dao.save(d);
        }

        return entrega;
    }

	@Override
	public List<Denominacion> obtenerDenominaciones() {
		return dao.findAllByOrderByValorDesc();
	}
}
