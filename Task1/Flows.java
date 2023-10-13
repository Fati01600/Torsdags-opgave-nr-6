package Task1;
//I dete tilfælde bruges kreative navne:
public class Flows{
    public char printStartOfSentence(String input){
        System.out.println("J ");
        if(!input.equals("start")) {
            System.out.println(" a");

            printMiddleOfSentence("start");
        }else {
            System.out.println(" v");
            System.out.println(printSpace(input));
        }
        System.out.println(" s");

        return 0;
    }
        public void printMiddleOfSentence(String start){
        System.out.println(" a");
    }
    public int printSpace(String input){
        System.out.println(" ");
        printEndOfSentence(input.length());
        return input.length() * 2;
    }
    public boolean printEndOfSentence(int number){
        System.out.println(" e");
        if (number > 5) {
            System.out.println(" r");
        }
        System.out.println(" ");
        return false;
    }
}