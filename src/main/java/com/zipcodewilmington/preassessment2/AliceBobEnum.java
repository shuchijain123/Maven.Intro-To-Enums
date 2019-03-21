package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {
    ALICE ("Hey, my name is ALICE!"),
    BOB ("Hey, my name is BOB!"),
    ;


    private String catchPhrase="";

    AliceBobEnum(String s) {

        this.catchPhrase= s;

    }

    public String getCatchPhrase() {

        String myString="";

       if (this.name().equalsIgnoreCase("ALICE"))

           myString=  ALICE.catchPhrase;

       else
           if (this.name().equalsIgnoreCase("BOB")) {


               myString= BOB.catchPhrase;
           }

           return myString;
    }

    public boolean isAlice() {

       return (this.name().equalsIgnoreCase("ALICE"));







    }

    public boolean isBob() {

        return (this.name().equalsIgnoreCase("BOB"));
    }
}
