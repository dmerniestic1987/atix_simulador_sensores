package com.mernies.atixLabs.Simulador.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service("medicionServiceImpl")
public class MedicionServiceImpl implements MedicionService{
	private static final Logger logger = LogManager.getLogger(MedicionServiceImpl.class); 
	@Autowired
	private Sensor s1;
	
	@Autowired
	private Sensor s2;
	
	@Autowired
	private Sensor s3;
	
	@Autowired
	private Sensor s4;
	
	@Value("${serverMonitor}")
	private String server;
	
	@Scheduled(fixedRate = 500)
	@Override
	public void simularSensor1() {
		s1.setSensorId("S1");
		s1.setUrl(server + "/medicion");
		try {
			s1.simular();
		} catch (Exception e) {
			logger.error("Simulador 1", e);
		}
	}
	
	@Scheduled(fixedRate = 500)
	@Override
	public void simularSensor2() {
		s2.setSensorId("S2");
		s2.setUrl(server + "/medicion");
		try {
			s1.simular();
		} catch (Exception e) {
			logger.error("Simulador 2", e);
		}
	}
	@Scheduled(fixedRate = 500)
	@Override
	public void simularSensor3() {
		s3.setSensorId("S3");
		s3.setUrl(server + "/medicion");
		try {
			s3.simular();
		} catch (Exception e) {
			logger.error("Simulador 3", e);
		}
	}
	
	@Scheduled(fixedRate = 500)
	@Override
	public void simularSensor4() {
		s4.setSensorId("S4");
		s4.setUrl(server + "/medicion");
		try {
			s3.simular();
		} catch (Exception e) {
			logger.error("Simulador 4", e);
		}
	}
}
