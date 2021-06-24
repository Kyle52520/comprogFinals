package libmansys;



public class LibManSys {

    public static void main(String[] args) {

        System.out
                .println("\n\n" + ConsoleColors.GREEN_BOLD + "LIBRARY MANAGEMENT SYSTEM" + ConsoleColors.RESET + "\n");
        Commands.list();

        Commands.init();

    }
}
