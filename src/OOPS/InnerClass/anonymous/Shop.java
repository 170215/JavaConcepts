package OOPS.InnerClass.anonymous;

public class Shop {

    public static void main(String[] args) {
        Door door = new Door();
        if(door.getLk().isUnlocked("qwerty")){
            System.out.println("welcomed its opened");
        }
        else{
            System.out.println("Please visit after sometime");
        }
    }
}
