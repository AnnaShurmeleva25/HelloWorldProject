package by.shurmeleva.lesson8;

public final class BadParent implements Personable {
    private String name;
    public String nick;

    public String getName() {
        return "this is bad papa: " + name;
    }

    public void setName(String name) {
        if (name.length() > 2) {
            this.name = name;
            this.nick = name;
        } else {
            this.name = "Anonimous";
        }
        this.name = name;
    }
}
