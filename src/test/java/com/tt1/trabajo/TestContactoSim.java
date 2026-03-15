package com.tt1.trabajo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.DatosSimulation;
import modelo.DatosSolicitud;
import servicios.ContactoSim;

class TestContactoSim {

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

	@Test
	void solicitarSimulationDevuelveTokenValido() {
	    ContactoSim service = new ContactoSim();
	    DatosSolicitud ds = new DatosSolicitud(null);
	    int token = service.solicitarSimulation(ds);
	    assertTrue(token > 0);
	}
	
	@Test
	void descargarDatosConTicketValidoDevuelveDatos() {
	    ContactoSim service = new ContactoSim();
	    DatosSimulation datos = service.descargarDatos(1);
	    assertNotNull(datos);
	}
	
	@Test
	void getEntitiesNoDebeDevolverNull() {
	    ContactoSim service = new ContactoSim();
	    assertNotNull(service.getEntities());
	}
	
	@Test
	void isValidEntityIdDevuelveTrueParaIdValido() {
	    ContactoSim service = new ContactoSim();
	    assertTrue(service.isValidEntityId());
	}
}
