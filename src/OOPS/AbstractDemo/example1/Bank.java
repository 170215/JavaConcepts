package OOPS.AbstractDemo.example1;

abstract class Bank {

    Bank(){
        System.out.println("Welcome to the bank");
    }


    int rates=200;
    abstract void accountCreation();
    abstract void validKYC();

    void greetings(){
        System.out.println("hey how are you");
    }
}

class Saving extends Bank{

    @Override
    void accountCreation() {
        System.out.println("Congratulations, Your account has been created");
    }

    @Override
    void validKYC() {
        System.out.println("KYC is done");
    }
}
