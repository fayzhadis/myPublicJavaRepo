public class MySecondGitJavaClass {
    private static String name;
    public static String MY_NAME = "Hadis"; // CONST

    public MySecondGitJavaClass(String name) {
        this.name = name;
    }

    public static void printMyName() {
        System.out.println("Name is: " + getName());
    }

    public static String getName(){
        return name;
    }
}
