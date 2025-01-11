package Generics;

public class Genericpair<T,V>{
    T first;
    V second;

    public Genericpair()
    {
        this.first=null;
        this.second=null;
    }
    public T getFirst()
    {
        return first;
    }

    public static <E> E doSomething(E third)
    {
        return third;
    }
    public static <E extends Number> Number getadd(E x,E y)
    {
        return (x.intValue()+y.intValue());
    }
}
