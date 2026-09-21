class Time {
    int seconds;

    Time() {
        seconds = 0;
    }

    Time(int seconds) {
        this.seconds = seconds;
    }

    Time(int minutes, int seconds) {
        this.seconds = (minutes * 60) + seconds;
    }

    Time(int hours, int minutes, int seconds) {
        this.seconds = (hours * 3600) + (minutes * 60) + seconds;
    }

    void display() {
        System.out.println("Time in seconds: " + seconds);
        System.out.println("Time in minutes: " + (seconds / 60.0));
        System.out.println("Time in hours: " + (seconds / 3600.0));
    }

    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(90);
        Time t3 = new Time(5, 30);
        Time t4 = new Time(2, 10, 20);

        System.out.println("Default Constructor:");
        t1.display();

        System.out.println("\nSeconds Constructor:");
        t2.display();

        System.out.println("\nMinutes and Seconds Constructor:");
        t3.display();

        System.out.println("\nHours, Minutes and Seconds Constructor:");
        t4.display();
    }
}
