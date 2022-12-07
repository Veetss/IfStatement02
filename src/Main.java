public class Main {
    public static void main(String[] args) {
        String mySurname = "Vassarotti";

        if (mySurname.contains("ni")) {
            System.out.println("My surname contains the sequence of letter 'ni'!");
        } else {
            System.out.println("My surname doesn't contain the sequence of letter 'ni'!");
        }

        String a = mySurname.contains("ni") ? "My surname contains the sequence of letter 'ni'!" :
                "My surname doesn't contain the sequence of letter 'ni'!";
        System.out.println(a);
    }
}