package logger.SimpleFactory;

import java.util.Scanner;

interface  ILogger {
    void printLog();
}
class InfoLogger implements ILogger  {
    @Override
    public void printLog(){
        System.out.println("This is Info log");
    }
}
class DebugLogger implements ILogger  {
    @Override
    public void printLog(){
        System.out.println("This is Debug log");
    }
}
class ErrorLogger implements ILogger  {
    @Override
    public void printLog(){
        System.out.println("This is Error log");
    }
}

class LoggerFactory {
    public static ILogger createLogger(String level){
        switch (level.toLowerCase()) {
            case "error":
                return new ErrorLogger();
            case "debug":
                return new DebugLogger();
            case "info":
                return new InfoLogger();
            default:
                throw new IllegalArgumentException("Invalid log level: " + level);
        }
    }
    
}

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter log level (Info, Debug, Error): ");
        String level = sc.nextLine();
        ILogger logger  = LoggerFactory.createLogger(level);
        logger.printLog();
        sc.close();
    }   
}
