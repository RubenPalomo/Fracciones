package Fracciones;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;


public class BBDD {
	protected static Connection conexion;
	protected static Statement peticion;
	protected static ResultSet resultados;
	
	public static boolean crearFraccion(int numerador, int denominador) {
		int resultado = 0;
		
		try {
			DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
			conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/RubenPalomo", "root", "");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("Error al conectar");
			System.exit(0);
		}

		try {
			peticion = (Statement) conexion.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			try {
				resultado = peticion.executeUpdate("INSERT INTO `fracciones`(`Numerador`, `Denominador`) VALUES (" + numerador + ", " + denominador + ")");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			if (resultado == 1) {
				return true;
			}

			else {
				return false;
			}

		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public static void listarFracciones() {
		try {
			DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
			conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/RubenPalomo", "root", "");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("Error al conectar");
			System.exit(0);
		}
		
		try {
			peticion = (Statement) conexion.createStatement();
			resultados = (ResultSet) peticion.executeQuery("SELECT * FROM fracciones");

			while (resultados.next()) {
				System.out.println("Fracción #" + resultados.getString(1) + ": " + resultados.getString(2) + "/" + resultados.getString(3) + "\n");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("Error al conectar");
			System.exit(0);
		}
	}
}
