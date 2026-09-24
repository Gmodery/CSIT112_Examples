package Class_Relationships.Aggregation;

// Here we can model aggregation
// Aggregation is where an object is comprised of others
// In this example, a Computer object is comprised of several components such as RAM, CPU, etc.
// If the Computer object is destroyed, the RAM and CPU will still exist in memory just fine


class RAM {
    private int sizeGB;
    private String manufacturer;
    private double price;

    public RAM(int sizeGB, String manufacturer, double price) {
        this.sizeGB = sizeGB;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    // Object methods ...
}

class CPU {
    private double clockSpeedMHZ;
    private String manufacturer;
    private double price;

    public CPU(double clockSpeedMHZ, String manufacturer, double price) {
        this.clockSpeedMHZ = clockSpeedMHZ;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    // Object methods ...
}



public class Computer {
    private CPU cpu;
    private RAM ram;
    private double price;

    public Computer(CPU cpu, RAM ram, double price) {
        this.cpu = cpu;
        this.ram = ram;
        this.price = price;
    }
}












/*

 ┌──────────────────────────────────────────┐
 │                   RAM                    │
 ├──────────────────────────────────────────┤
 │ - sizeGB : int                           │
 │ - manufacturer : String                  │
 │ - price : double                         │
 ├──────────────────────────────────────────┤
 │ + RAM(sizeGB:int, man:String, prc:double)│
 └──────────────────────────────────────────┘
                      ▲
                      │
                      │ 
                      │
                      ◇ (Hollow Diamond)
 ┌──────────────────────────────────────────┐
 │                 Computer                 │
 ├──────────────────────────────────────────┤
 │ - cpu : CPU                              │
 │ - ram : RAM                              │
 │ - price : double                         │
 ├──────────────────────────────────────────┤
 │ + Computer(cpu:CPU, ram:RAM, prc:double) │
 └──────────────────────────────────────────┘
                      ◇ (Hollow Diamond)
                      │
                      │ 
                      │
                      │
                      ▼
 ┌──────────────────────────────────────────┐
 │                   CPU                    │
 ├──────────────────────────────────────────┤
 │ - clockSpeedMHZ : double                 │
 │ - manufacturer : String                  │
 │ - price : double                         │
 ├──────────────────────────────────────────┤
 │ + CPU(speed:double, man:String, prc:db)  │
 └──────────────────────────────────────────┘



*/