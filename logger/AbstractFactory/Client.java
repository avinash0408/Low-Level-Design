package logger.AbstractFactory;

import java.util.Scanner;

interface ILogger{
    void printLog();
}
class ConsoleInfoLogger implements ILogger{
    @Override
    public void printLog() {
        System.out.println("CONSOLE - This is INFO LOG");
    }
}
class ConsoleDebugLogger implements ILogger{
    @Override
    public void printLog() {
        System.out.println("CONSOLE - This is DEBUG LOG");
    }
}
class ConsoleErrorLogger implements ILogger{
    @Override
    public void printLog() {
        System.out.println("CONSOLE - This is ERROR LOG");
    }
}
class FileInfoLogger implements ILogger{
    @Override
    public void printLog() {
        System.out.println("FILE - This is INFO LOG");
    }
}
class FileDebugLogger implements ILogger{
    @Override
    public void printLog() {
        System.out.println("FILE - This is DEBUG LOG");
    }
}
class FileErrorLogger implements ILogger{
    @Override
    public void printLog() {
        System.out.println("FILE - This is ERROR LOG");
    }
}
interface ILoggerFactory {
   ILogger createInfoLogger();
   ILogger createDebugLogger();
   ILogger createErrorLogger();
}
class ConsoleLoggerFactory implements ILoggerFactory{
    @Override
    public ILogger createInfoLogger(){
        return new ConsoleInfoLogger();
    }
    public ILogger createDebugLogger(){
        return new ConsoleDebugLogger();
    }
    public ILogger createErrorLogger(){
        return new ConsoleErrorLogger();
    }
}

class FileLoggerFactory implements ILoggerFactory{
    @Override
    public ILogger createInfoLogger(){
        return new FileInfoLogger();
    }
    public ILogger createDebugLogger(){
        return new FileDebugLogger();
    }
    public ILogger createErrorLogger(){
        return new FileErrorLogger();
    }
}

class LoggerAbstractFactory {
    public static ILoggerFactory getLoggerFactory(String log){
        switch (log.toLowerCase()) {
            case "console":
                return new ConsoleLoggerFactory();
            case "file":
                return new FileLoggerFactory();
            default:
                throw new IllegalArgumentException("LOG OF TYPE: "+log+" NOT FOUND");
        }
    }
}

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the log type {CONSOLE or FILE} : ");
        String log = sc.nextLine();
        ILoggerFactory loggerFactory = LoggerAbstractFactory.getLoggerFactory(log);
        loggerFactory.createInfoLogger().printLog();
        loggerFactory.createErrorLogger().printLog();
        loggerFactory.createDebugLogger().printLog();
        sc.close();
    }
}
