
package patronobserver_java;

import patronobserver_java.PesoDOPObservador;
import patronobserver_java.EuroObservador;
import patronobserver_java.RUBObservador;
import patronobserver_java.Subject;

public class Main {

	public static void main(String[] args) {
		Subject subject = new Subject();

		new RUBObservador(subject);
		new PesoDOPObservador(subject);
		new EuroObservador(subject);
		
		System.out.println("Si desea cambiar 500 dólares obtendrá : ");
		subject.setEstado(500);
		System.out.println("-----------------");
		System.out.println("Si desea cambiar 100 dólares obtendrá : ");
		subject.setEstado(100);
	}
}
