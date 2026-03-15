package com.tt1.trabajo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.slf4j.Logger;

import modelo.Destinatario;
import servicios.EnviarEmails;

class TestEnviarEmails {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	void enviarEmailDebeLoggearYDevolverTrue() {
        Logger mockLogger = Mockito.mock(Logger.class);
        EnviarEmails service = new EnviarEmails(mockLogger);

        Destinatario dest = new Destinatario();
        boolean resultado = service.enviarEmail(dest, "Hola!");

        assertTrue(resultado);
        verify(mockLogger).info(Mockito.anyString());
    }

}
