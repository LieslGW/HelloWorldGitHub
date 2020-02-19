public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");

        System.out.println("BRANCH #2");

        float rand1 = (float)Math.random();
        float rand2 = rand1*10;
        int rand3 = (int)Math.ceil(rand2);

        System.out.println("Basic random is "+rand1);
        System.out.println("Bigger range random is "+rand2);
        System.out.println("Rounded up random is "+rand3);

        //create a random integer between 1 and 10 inclusive
        int r = (int)Math.ceil(Math.random()*10);
        System.out.println("Another rounded random number is "+r);



    }
}
