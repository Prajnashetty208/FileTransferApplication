package com.order.filetransfer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class FileTransferApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileTransferApplication.class, args);
	}

}
