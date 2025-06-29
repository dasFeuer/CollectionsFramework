package Exercise.StreamsExercise;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class User {
    private String name;
    private String email;
    private boolean isActive;

    public User () {}

    public User(String name, String email, boolean isActive) {
        this.name = name;
        this.email = email;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return " - " + name +
                ", email= " + email +
                ", isActive=" + isActive;
    }
}
public class ActiveUsers {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User("Barun", "barun@gmail.com", true));
        list.add(new User("Kriti", "kriti@gmail.com", false));
        list.add(new User("Shahasin", "shahasin@gmail.com", false));
        list.add(new User("Anubhav", "anubhav@gmail.com", true));
        list.add(new User("Sneha", "sneha@gmail.com", true));
        list.add(new User("Aditi", "aditi@gmail.com", false));
        list.add(new User("Eric", "eric@gmail.com", true));

        List<String> activeEmails = list.stream()
                .filter(User::isActive)
                .map(user -> user.getEmail()
                        .toLowerCase())
                .collect(Collectors.toList());

        System.out.println("Active User Emails:");
        activeEmails.forEach(email -> System.out.println(" - " + email));
    }
}
