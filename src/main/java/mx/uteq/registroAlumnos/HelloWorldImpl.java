
package mx.uteq.registroAlumnos;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface = "mx.uteq.registroAlumnos.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
	
	static List<Alumno> alumnos = new ArrayList<>();

    public String sayHi(String text) {
        return "Hello " + text;
    }

	@Override
	public Alumno saveAlumno(Alumno alumno) {
		// TODO Auto-generated method stub
		alumnos.add(alumno);
		return alumno;
	}

	@Override
	public List<Alumno> getAll() {
		// TODO Auto-generated method stub
		return alumnos;
	}
}

