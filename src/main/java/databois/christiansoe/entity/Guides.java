package databois.christiansoe.entity;

import javax.persistence.*;

@Entity
@Table( name = "tours")
public class Guides {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column( nullable = false)
    private String guideName;
    private String guideLength;

    public Guides(String guideName, String guideLength) {
        this.guideName = guideName;
        this.guideLength = guideLength;
    }

    public Guides() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGuideName() {
        return guideName;
    }

    public void setGuideName(String guideName) {
        this.guideName = guideName;
    }

    public String getGuideLength() {
        return guideLength;
    }

    public void setGuideLength(String guideLength) {
        this.guideLength = guideLength;
    }
}






