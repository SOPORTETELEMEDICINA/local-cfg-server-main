package com.jonima.local.cfg.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Entry point para local cfg server
 * @author SRE
 */
@EnableConfigServer
@SpringBootApplication
public class Servidor {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(Servidor.class, args);
    }
}
