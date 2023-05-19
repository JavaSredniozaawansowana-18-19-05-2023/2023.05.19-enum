package pl.szkolenia.comarch.wyliczeniowy;

public enum Console {
    PS4("AMD", "Sony", "PS4", "Radeon", 2000.00),
    PS5("AMD", "Sony", "PS5", "Radeon", 2400.00),
    XBOX_ONE("AMD", "Microsoft", "XBox", "Radeon", 2400.00),
    SWITCH("NVidia", "Nintendo", "Switch", "NVidia", 1500.00);
    private String cpu;
    private String brand;
    private String model;
    private String gpu;
    private double price;

    Console(String cpu, String brand, String model, String gpu, double price) {
        this.cpu = cpu;
        this.brand = brand;
        this.model = model;
        this.gpu = gpu;
        this.price = price;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
