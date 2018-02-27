package aop;

public class BService {

    private AService aService;

    public void setaService(AService aService) {
        this.aService = aService;
    }

    public void bye(){
        System.out.println("bye");
        aService.hello();
    }
}
