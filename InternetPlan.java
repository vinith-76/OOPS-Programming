class InternetPlan {
    String planName;
    double price;
    int validity;

    InternetPlan() {
        this("Basic", 499, 28);
    }

    InternetPlan(String planName) {
        this(planName, 699, 28);
    }

    InternetPlan(String planName, double price, int validity) {
        this.planName = planName;
        this.price = price;
        this.validity = validity;
    }

    void display() {
        System.out.println("Plan Name: " + planName);
        System.out.println("Price: ₹" + price);
        System.out.println("Validity: " + validity + " days");
        System.out.println();
    }

    public static void main(String[] args) {
        InternetPlan p1 = new InternetPlan();
        InternetPlan p2 = new InternetPlan("Premium");
        InternetPlan p3 = new InternetPlan("Unlimited", 999, 56);

        p1.display();
        p2.display();
        p3.display();
    }
}
