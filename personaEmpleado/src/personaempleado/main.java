package personaempleado;
public class main {
     public static void main(String[] args) {
        Empleado emp = new Empleado();
        emp.nombre = "Fulano";
        emp.edad = 30;
        emp.sexo = "Masculino";
        emp.sueldo = 50000.0;
        emp.mostrarDatos();
        emp.mostrarSueldo();
    }
    
}
