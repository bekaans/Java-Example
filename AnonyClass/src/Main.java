//ANONYMOUS CLASS
public class Main {
    public static void main(String[] args) {

        Anony a = new Anony(){
            @Override     //override ederek method değiştirilebilir
        public void run(){
                System.out.println(8);
            }



        };
        a.run();



    }
}