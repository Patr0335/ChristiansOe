package databois.christiansoe.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Guides {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String guideName;
    String guideLength;

    public Guides(int id, String guideName, String guideLength) {
        this.id = id;
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






