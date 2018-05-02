package aop;

public class   HelloServiceImpl implements HelloService{
    @Override
    public void hello(String name) {
        System.out.println("hello"+name);
    }

    @TestAnnotation
    @Override
    public void bye(String name) {
        System.out.println("bye"+name);
    }

}
