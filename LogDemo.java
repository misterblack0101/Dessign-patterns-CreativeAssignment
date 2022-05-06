public class LogDemo {
    public static void main(String[] args) {
        // We'll try to create multiple instances of Logger Class
        // and record logs through them.

        Logger logger1 = Logger.getLogger();
        Logger logger2 = Logger.getLogger();
        Logger logger3 = Logger.getLogger();

        // now, we'll log a couple of messages from each logger "instance"
        logger1.log("This is a message from object: logger1");
        logger1.log("This is another message from object: logger1");
        logger2.log("This is a message from object: logger2");
        logger3.log("This is a message from object: logger3");
        logger2.log("This is a message from object: logger2 after logging object 3.");

        // Now, we'll see how the logs have been stored so far via object logger1:
        System.out.println("Showing logs via object logger1:\n");
        logger1.showLogs();

        // and via object logger2:
        System.out.println("\nShowing logs via object logger2:\n");
        logger2.showLogs();
    }
}
