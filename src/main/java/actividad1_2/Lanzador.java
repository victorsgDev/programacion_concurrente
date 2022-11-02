package actividad1_2;

import java.io.File;
import java.io.IOException;

public class Lanzador {
    public static void main(String[] args) {
        ProcessBuilder p1 = new ProcessBuilder("java","Main","Pepe","Juan","Luis");
        p1.redirectOutput(new File("C:\\Users\\grand\\Documents\\jetbrains\\IntellijProyects\\hito1_serviciosProcesos_victors\\src\\main\\java\\actividad1_2\\examen1.txt"));
        ProcessBuilder p2 = new ProcessBuilder("java","Main","Rosa","Miguel","Pedro");
        p2.redirectOutput(new File("C:\\Users\\grand\\Documents\\jetbrains\\IntellijProyects\\hito1_serviciosProcesos_victors\\src\\main\\java\\actividad1_2\\examen2.txt"));

        try {
            p1.start();
            p2.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Fin del programa, debe comprobar los .txt");
    }
}
