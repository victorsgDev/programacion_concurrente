package org.example;

public class Main {
    public static void main(String[] args) {

        ExamBuffer generador = new ExamBuffer();
        new ExamGenerator(generador);
        new ExamConsumer("Rosa", generador);
        new ExamGenerator(generador);
        new ExamConsumer("Miguel", generador);
        new ExamGenerator(generador);
        new ExamConsumer("Carlos", generador);


    }
}