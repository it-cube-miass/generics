public class Gen<T> {
    T obj;

    Gen(T obj) {
        this.obj = obj;
    }

    T getObj() {
        return obj;
    }

    void showType() {
        System.out.println("Тип T - это " + obj.getClass().getName());
    }
}
