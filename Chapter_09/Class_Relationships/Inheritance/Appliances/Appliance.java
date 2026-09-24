package Class_Relationships.Inheritance.Appliances;

// Appliance is defined as abstract to make use of abstract methods
public abstract class Appliance {
    // Because manufacturer is accessed in the child classes, we can make it protected
    // This allows Appliance and its children and everything else in this package to see
    // it but not other classes
    protected String manufacturer;

    // Abstract classes cannot be instantiated. That is, we cannot create an Appliance object
    // We can (and should) have a constructor to assist subclasses with their constructor logic
    public Appliance(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    // Declaring these methods as abstract forces inheriting classes to define behavior for them
    public abstract void turnOn();
    public abstract String toString();

    // Abstract classes can also contain regular methods
    // Since this behavior will be shared between all inheriting classes, we can define it here
    public void turnOff() {
        System.out.println("Turning off");
    }

    public void repair() {
        System.out.println("Repairing...");
    }


    // Testing
    public static void main(String[] args) {
        // This line fails since Appliance is abstract and cannot be instantiated
        // Appliance a = new Appliance();

        // Creating a new Refrigerator with the overloaded constructor using the default manufacturer
        Refrigerator r = new Refrigerator(36);

        // Creating a new Refrigerator using the first constructor, specifying the manufacturer
        Refrigerator r2 = new Refrigerator("Whirlpool", 34);

        r.turnOn();
        r2.turnOn();
        System.out.println("\n\n" + r.toString());
        System.out.println("\n\n" + r2.toString());

        Oven o = new Oven("Samsung", 350);
        System.out.println("\n\n" + o.toString());
        o.setTemp(325);
        o.startTimer(120);
        System.out.println("\n\n" + o.toString());

        AirFryer af = new AirFryer("Unspecified", "High");
        System.out.println("\n\n" + af.toString());
        af.changeSetting("Low");
        System.out.println("\n\n" + af.toString());
    }
}


class Refrigerator extends Appliance {
    private int temperatureF;

    public Refrigerator(String manufacturer, int temperatureF) {
        super(manufacturer);
        this.temperatureF = temperatureF;
    }

    // Overloaded constructor to use default "LG" manufacturer if it is not specified
    public Refrigerator(int temperatureF) {
        super("LG");
        this.temperatureF = temperatureF;
    }

    // Overriding abstract methods
    // These methods must be overridden, otherwise the compiler will throw an error
    public void turnOn() {
        System.out.println("Turning on fridge");
    }

    public void turnOff() {
        super.turnOff();
    }

    public String toString() {
        return "This is a refrigerator from " + this.manufacturer + 
        "\nIts temperature is currently set to " + this.temperatureF;
    }
    
}


class Oven extends Appliance {
    private int temperatureF;
    private int timerSeconds;

    public Oven(String manufacturer, int temperatureF) {
        super(manufacturer);
        this.temperatureF = temperatureF;
        this.timerSeconds = 0;
    }

    public void setTemp(int newTemp) {
        this.temperatureF = newTemp;
    }

    public void startTimer(int seconds) {
        this.timerSeconds = seconds;
        // Placeholder countdown logic...
    }

    public void turnOn() {
        System.out.println("Turning on oven");
    }

    public String toString() {
        String s = "This is an oven from " + this.manufacturer +
                "\nIts temperature is currently set to " + this.temperatureF;

        if (this.timerSeconds > 0) {
            s += "\nThe timer has " + this.timerSeconds + " seconds left";
        } else {
            s += "\nA timer is not set";
        }

        return s;
    }
}


class AirFryer extends Oven {
    private String setting;

    public AirFryer(String manufacturer, int temperatureF) {
        super(manufacturer, temperatureF);
    }

    public AirFryer(String manufacturer, String setting) {
        super(manufacturer, 120);

        changeSetting(setting);
    }


    public void changeSetting(String setting) {
        this.setting = setting;

        if (setting.equals("High")) {
            this.setTemp(350);
        } else if (setting.equals("Medium")) {
            this.setTemp(250);
        } else {
            this.setTemp(120);
        }
    }


    public String toString() {
        String s = super.toString();
        s += "\nThis AirFryer is set to the following setting: " + this.setting;

        return s;
    }
}



class DishWasher extends Appliance {
    private boolean highCapacity;
    private String washSetting;

    public DishWasher(String manufacturer, boolean highCapacity, String washSetting) {
        super(manufacturer);
        this.highCapacity = highCapacity;
        this.washSetting = washSetting;
    }

    public void setWashSetting(String setting) {
        this.washSetting = setting;
    }

    public void turnOn() {
        System.out.println("Turning on DishWasher");
    }

    public String toString() {
        String s = "This is a DishWasher from " + this.manufacturer +
                "\nIts wash setting is currently set to " + this.washSetting;

        if (highCapacity) {
            s += "\nIt is high capacity";
        } else {
            s += "\nIt is not high capacity";
        }

        return s;
    }
}