import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Logger {
    private final String logFile = "logs.txt";
    private PrintWriter writer;
    private static Logger logger = null;

    // Private constructor
    private Logger() {
        try {
            FileWriter fw = new FileWriter(logFile);
            writer = new PrintWriter(fw, true);
        } catch (IOException e) {
            System.out.println("Exception Occured while opening file:" + e.toString());
        }
    }

    // Method for getting constructor
    public static synchronized Logger getLogger() {
        if (logger == null)
            logger = new Logger();
        // Returning the static instance of logger
        return logger;
    }

    // Simple function to write logs to file
    public void log(String message) {
        writer.println(message);
    }

    // Functions to read logs from file, and print them
    public void showLogs() {
        try {
            File myObj = new File(logFile);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                System.out.println(myReader.nextLine());
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
