package com.mernies.atixLabs.Simulador.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.mernies.atixLabs.Simulador.bean.Medicion;
import com.mernies.atixLabs.Simulador.bean.MedicionStatus;
import com.mernies.atixLabs.Simulador.util.JsonUtil;

/**
 * Representa a unos de los sensores IOT
 * @author diego
 *
 */
@Component
public class Sensor{
	private static final Logger logger = LogManager.getLogger(Sensor.class); 
	private String sensorId;
	private String url;
	
	public Sensor() {
		super();
	}
	
	public String getSensorId() {
		return sensorId;
	}
	public void setSensorId(String sensorId) {
		this.sensorId = sensorId;
	} 
	
	public void simular() throws Exception{
		Medicion m = this.medir();
		RestTemplate rest = new RestTemplate();
		MedicionStatus status = rest.postForObject(url, m, MedicionStatus.class);
		logger.info("Sensor " + sensorId + " - Response: " + JsonUtil.toJsonString(status));
	}
	
	/**
	 * Realiza una medición con un número aleatorio antre 0 y 6000
	 * @return m
	 */
	private Medicion medir() throws Exception {
		Random rand = new Random();
		Float randomValue = rand.nextFloat();
		BigDecimal randomBD = new BigDecimal(Math.abs(randomValue));
		Medicion m = new Medicion(new Date(), this.sensorId, randomBD);
		return m;		
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
