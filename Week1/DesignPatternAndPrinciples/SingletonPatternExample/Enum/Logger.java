public enum Logger{
    INSTANCE;

    Logger() {
        System.out.println("Logger Initialized.");
    }

    public void log(String message) {
        System.out.println(message);
    }
}
