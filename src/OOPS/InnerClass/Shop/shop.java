package OOPS.InnerClass.Shop;

public class shop
{
    public static void main(String[] args) {
        Door d1=new Door();
        d1.shopStatus();
        d1.lock.setLock(false);
        d1.shopStatus();
    }
}
