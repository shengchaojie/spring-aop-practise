package aop;

public class AService {

    private BService bService;

    public void setbService(BService bService) {
        this.bService = bService;
    }

    public void hello(){
        System.out.println("hello");
        bService.bye();
    }
}
