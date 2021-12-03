package databois.christiansoe.entity;
import javax.persistence.*;

@Entity
@Table (name= "file")
public class File {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    private String timestamp;
    private String type;

    public File(String name, String timestamp, String type) {
        this.name = name;
        this.timestamp = timestamp;
        this.type = type;
    }

    @Column(nullable = false)
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



    public File(){}
}
