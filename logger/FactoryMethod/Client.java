package logger.FactoryMethod;


interface ILogger {
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

interface ILoggerFactory {
    ILogger createLogger();
}
class InfoLoggerFactory implements ILoggerFactory{
    public ILogger createLogger(){
        return new InfoLogger();
    }
}
class DebugLoggerFactory implements ILoggerFactory{
    public ILogger createLogger(){
        return new DebugLogger();
    }
}
class ErrorLoggerFactory implements ILoggerFactory{
    public ILogger createLogger(){
        return new ErrorLogger();
    }
}

public class Client {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter log level (Info, Debug, Error): ");
        // String level = sc.nextLine();
        ILoggerFactory infoLoggerFactory  = new InfoLoggerFactory();
        ILoggerFactory debugLoggerFactory  = new DebugLoggerFactory();
        ILoggerFactory errorLoggerFactory  = new ErrorLoggerFactory();
        
        ILogger infoLogger=infoLoggerFactory.createLogger();
        infoLogger.printLog();
        ILogger debugLogger=debugLoggerFactory.createLogger();
        debugLogger.printLog();
        ILogger errorLogger=errorLoggerFactory.createLogger();
        errorLogger.printLog();
       // sc.close();
    }  
}
