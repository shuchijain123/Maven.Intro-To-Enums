package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator {

    String input = "";

    public AliceBobEvaluator(String input) {

        this.input = input;


    }

    public boolean isBob() {


        if (input.equalsIgnoreCase(AliceBobEnum.BOB.name())) {

            return true;
        } else
            return false;
    }

    public boolean isAlice() {
        if (input.equalsIgnoreCase(AliceBobEnum.ALICE.name())) {

            return true;

        } else {

            return false;
        }
    }
}
