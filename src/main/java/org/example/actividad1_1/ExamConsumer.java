package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ExamConsumer implements Runnable {
    private Thread hilo;
    ExamBuffer buffer;

    public Thread getHilo() {
        return hilo;
    }

    public ExamConsumer(String alumno, ExamBuffer generador) {
        hilo = new Thread(this, alumno);
        this.buffer = generador;
        hilo.start();
    }

    @Override
    public void run() {
        String codigoExamen = this.buffer.consumirExamen();
        if (codigoExamen != null) {
            int numPreg = 1;
            ArrayList<Character> res = new ArrayList<>();
            res.add('A');
            res.add('B');
            res.add('C');
            res.add('D');
            res.add('-');

            while (numPreg<=10){
                int res_azar = (int) (Math.random() * 4) +1;
                System.out.println(codigoExamen+"; "+getHilo().getName()+" ;Pregunta "+numPreg+": "+ res.get(res_azar));
                numPreg++;
            }

        } else {
            System.out.println("Agotado tiempo de espera y " +
                    "no hay más exámenes");
        }
    }


}
