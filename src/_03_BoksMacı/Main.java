package _03_BoksMacı;

public class Main {
    public static void main(String[] args) {
        Feighter f1=new Feighter("A",10,120,100,30);
        Feighter f2=new Feighter("B",20,85,85,40);

        Match match=new Match(f1,f2,85,100);
        match.run();
    }
}
