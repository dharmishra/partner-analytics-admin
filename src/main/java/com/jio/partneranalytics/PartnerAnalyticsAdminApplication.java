package com.jio.partneranalytics;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
@EnableScheduling
public class PartnerAnalyticsAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(PartnerAnalyticsAdminApplication.class, args);
	}

}
