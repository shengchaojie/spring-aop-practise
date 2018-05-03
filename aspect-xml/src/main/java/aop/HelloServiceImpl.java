package aop;

public class   HelloServiceImpl implements HelloService{
    @Override
    public void hello(String name) {
        System.out.println("hello"+name);
        //throw new RuntimeException("1234");
    }

    @TestAnnotation
    @Override
    public void bye(String name) {
        System.out.println("bye"+name);
    }

}
