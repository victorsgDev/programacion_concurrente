package org.example;

import java.time.LocalDateTime;

public class ExamGenerator implements Runnable{
    private ExamBuffer buffer;
    private static int numeroExamen = 0;
    private Thread hilo;

    public ExamGenerator(ExamBuffer buffer) {
        numeroExamen++;
        hilo = new Thread(this, "E"+numeroExamen);
        this.buffer =  buffer;
        hilo.start();
    }

    @Override
    public void run() {
        int aa = LocalDateTime.now().getYear();
        String codigo = this.hilo.getName() + "-" +aa;

        buffer.fabricarNuevoExamen(codigo);
        System.out.println("Se acaba de producir el código de examen: "+codigo);
    }

}
