package book.User;

public class UserClass {
    private String name;
    private String membership;

    public String toString() {
        return "Tacos";
    }

    // constructor

    public UserClass(String name, String membership) {
        //this.name = name;
        //this.membership = membership;
        setName(name);
        setMembership(membership);
    }

    // Основната им цел е капсулацията – да скрият вътрешните променливи на класа

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMembership() {
        return membership;
    }
    public void setMembership(String membership) {
        this.membership = membership;
    }

    
}
