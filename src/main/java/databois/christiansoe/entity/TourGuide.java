package databois.christiansoe.entity;

import javax.persistence.*;

@Entity
@Table ( name ="tourguide")
public class TourGuide {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;



    @Column(nullable = false)
    private String username;
    private String password;


     public TourGuide(String username, String password) {
                this.username = username;
                this.password = password;
            }

    public TourGuide() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }






}
