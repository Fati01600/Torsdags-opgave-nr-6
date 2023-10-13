package Task1;

public class Main{
    public Main(){
        Flows flows = new Flows();

        System.out.println(flows.printStartOfSentence("start"));
        flows.printStartOfSentence("start");

        System.out.println("flows.printMiddleOfSentence(\"Hello, world\");");
        flows.printMiddleOfSentence("Hello, world");

        System.out.println("flow.printSpace(\"Hello,world\");");

        System.out.println(flows.printEndOfSentence(25));
                flows.printEndOfSentence(25);
    }

}