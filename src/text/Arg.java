package text;

public class Arg {
    public static void main(String[] args) {
        Run("s","d","d");
    }
    public static void Run(String...arg){
        for(int i =0; i<arg.length; i++){
            System.out.println(arg[i]);

        }
    }
}
