package Entity;

public class Person {


    private Long id;

    private String first_name;

    private String last_name;

    private String email;

    private Boolean deleted;

    private String role;

    private String phone;

    private String Birthdate;


    //Este seria el constructor del obj

    public Person(String first_name, String last_name, String email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
    }


    public void SetInformation() {
        System.out.println("Name: " + first_name);
        System.out.println("Last: " + last_name);
        System.out.println("email " + email);
    }

}