package OOPS.InnerClass.anonymous;


abstract class Lock{

    public abstract boolean isUnlocked(String key);
    public void test(){
        System.out.println("testing");
    }


}
public class Door {
    Lock lk= new Lock(){

        @Override
        public boolean isUnlocked(String key) {
            if(key.equals("qwerty")){
                return false;
            }
            return true;
        }


    };

    public Lock getLk() {
        return lk;
    }
}
