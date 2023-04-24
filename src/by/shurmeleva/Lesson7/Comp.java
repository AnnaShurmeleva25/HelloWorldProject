package by.shurmeleva.Lesson7;

public abstract class Comp {
    private String hdd;
    private String ram;
    protected String username;

    protected Comp(String hdd, String ram) {
        this.hdd = hdd;
        this.ram = ram;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
    public abstract void printDisplay();

    @Override
    public String toString() {
        return "Comp{" +
                "hdd='" + hdd + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
