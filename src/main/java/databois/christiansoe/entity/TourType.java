package databois.christiansoe.entity;

import javax.persistence.*;

@Entity
@Table( name = "tour_type")
public class TourType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(nullable = false)
    private String type;

    public TourType(String type) {
        this.type = type;
    }

    public TourType() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
