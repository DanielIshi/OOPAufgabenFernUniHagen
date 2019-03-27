package constructor2;


class Super {
    Super() {
        System.out.println("Super-Konstruktor");
    }


    class Kind{

    }
}


class Sub extends Super {

    Sub() {
        System.out.println("Sub-Konstruktor");

    }



    class Baby extends Kind{
    }

}


class Person {
    String getName() {
        return "Mueller-Luedenscheidt";
    }

}



public class KonstruktorTest {
    public static void main(String[] args) {
        new Sub();
    }
}