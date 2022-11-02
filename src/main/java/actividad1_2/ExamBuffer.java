package actividad1_2;

import java.util.LinkedList;
import java.util.Queue;

public class ExamBuffer {
    private Queue<String> colaExamenes;

    public ExamBuffer() {
        colaExamenes = new LinkedList<String>();
    }

    public synchronized void fabricarNuevoExamen(String codigo) {
        colaExamenes.add(codigo);
        notify();
    }

    public synchronized String consumirExamen() {
        int esperas = 0;
        while (colaExamenes.isEmpty()){
            esperas++;
            try {
                wait(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if (esperas<15){
            return colaExamenes.remove();
        }
        else {
            return "No hemos encontrado un examen que consumir";
        }

    }

}
