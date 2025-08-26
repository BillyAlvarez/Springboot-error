package cl.bja.springboot.error.models.domain;

public class User {

    private Long id;
    private String firstName;
    private String lastName;

    private Role role;

    public User() {
    }

    public User(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Role getRole() {
        return role;
    }

//    public String getRoleName() {
//        return role.getName();
//    }

    public void setRole(Role role) {
        this.role = role;
    }
}
