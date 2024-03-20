package OOPS.genericsDemo.EXample1;

public class Data {

    private Object obj;

    public Object getObj() {
        return obj;
    }

    public Data(Object obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Data{" +
                "obj=" + obj +
                '}';
    }
}
