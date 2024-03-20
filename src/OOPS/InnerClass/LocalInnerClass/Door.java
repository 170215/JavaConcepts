package OOPS.InnerClass.LocalInnerClass;

public class Door {

    public boolean isLocked(String key){

        class Lock{
            public boolean isLock(String key){
                if(key.equals("qwerty")){
                    return false;
                }
                return true;
            }
        }

        return new Lock().isLock(key);
    }

    public static void main(String[] args) {
        Door d1=new Door();
        if(d1.isLocked("qwerty")){
            System.out.println("not opened");
        }
        else{
            System.out.println("opened");
        }
    }
}
