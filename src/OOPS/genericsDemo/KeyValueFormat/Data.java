package OOPS.genericsDemo.KeyValueFormat;


/*
// the naming conventions are as follows
T- type
E -element
K - key
N -number
V -value
*/
public class Data<K,V> {

    private K key;
    private V value;

    public Data(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Data{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
//generic method
    // we make use element and number
    public <E,N> void display(E element ,N number){
        System.out.println("Element is "+ element +"Number is "+ number);
    }

}
