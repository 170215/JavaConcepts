package Basics.Basic.Enum;

public enum Season {
    //nothing but objects so we need to have constructors for intializing it
    WINTER("hello"),SPRING("Hi"),SUMMER("hye"),FALL("hey");
    private String h;
    Season(String h) {
        this.h=h;
    }

    public String getH() {
        return h;
    }

}


