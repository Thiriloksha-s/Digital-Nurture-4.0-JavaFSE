import java.util.*;
public class Main {
    public static void main(String[] args) {
        Logger logger1=Logger.getInstance();
        logger1.log("First log.");
        Logger logger2=Logger.getInstance();
        logger2.log("Second log.");
        if (logger1==logger2) {
            System.out.println("Same instance.");
        } else {
            System.out.println("Different instances");
        }
    }
}
