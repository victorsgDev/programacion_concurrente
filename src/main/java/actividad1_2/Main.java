package actividad1_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ExamBuffer generador = new ExamBuffer();

        Arrays.stream(args)
                .forEach(arg -> {
                    new ExamGenerator(generador);
                    new ExamConsumer(arg, generador);
                });
    }
}