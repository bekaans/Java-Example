//OUTER CLASS - iç sınıf
public class out {
    public int a =5;

    //INNER CLASS - dış sınıf
    public class in{
        public int a =10;
        public void run(){
            int a = 8;
            System.out.println("RRUUNN");
            System.out.println(a); // object a
            System.out.println(this.a); // inner class a
            System.out.println(out.this.a);  // outer class a
        }



    }
}
