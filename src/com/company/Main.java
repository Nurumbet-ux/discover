package com.company;

public class Main {

    public static void main(String[] args) {
          Transport <Number,Number> stepWGN = new Transport<>("STEPwgn",8,300);
          Transport <Number, Number> BMW = new Transport<>("BMW",4,500);
          stepWGN.canSit(stepWGN.capacity);
    }
}
