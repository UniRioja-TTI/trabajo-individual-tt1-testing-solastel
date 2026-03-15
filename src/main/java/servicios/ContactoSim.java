package servicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Service;

import interfaces.InterfazContactoSim;
import modelo.DatosSimulation;
import modelo.DatosSolicitud;
import modelo.Entidad;

@Service
public class ContactoSim implements InterfazContactoSim{
	private Random r = new Random();
	private List<Entidad> e = new ArrayList<>();
	private Map<Integer, DatosSolicitud> s = new HashMap<>();

	public ContactoSim() {
		Entidad e1 = new Entidad();
		e1.setId(1);
		e1.setName(" Entidad A");
		Entidad e2 = new Entidad();
		e2.setName(" Entidad B");
		e2.setId(2);
		Entidad e3 = new Entidad();
		e3.setName(" Entidad C");
		e3.setId(3);
		e.add(e1);
		e.add(e2);
		e.add(e3);
	}
	@Override
	public int solicitarSimulation(DatosSolicitud sol) {
		int token = r.nextInt(10000);
		s.put(token, sol);
		return token;
	}

	@Override
	public DatosSimulation descargarDatos(int ticket) {
		if(s.containsKey(ticket)) {
			return new DatosSimulation();
		}
		return null;
	}

	@Override
	public List<Entidad> getEntities() {
		return this.e;
	}

	@Override
	public boolean isValidEntityId() {
		return true;
	}

}
