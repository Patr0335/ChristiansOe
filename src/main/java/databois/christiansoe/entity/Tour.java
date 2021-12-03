package databois.christiansoe.entity;

import javax.persistence.*;

@Entity
@Table(name = "tour")
public class Tour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(nullable = false)
    private String name;


    @ManyToOne
    @JoinColumn(name = "type_id", referencedColumnName = "id")
    private TourType tourtype;
    private int duration;
    private int price;
    private int exercise_id;
    private int tourguide_id;
    private int file_id;

    public Tour(String name, TourType tourtype, int duration, int price, int exercise_id, int tourguide_id, int file_id) {
        this.name = name;
        this.tourtype = tourtype;
        this.duration = duration;
        this.price = price;
        this.exercise_id = exercise_id;
        this.tourguide_id = tourguide_id;
        this.file_id = file_id;
    }

    public Tour() {
    }

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

    public TourType getTourtype() {
        return tourtype;
    }

    public void setTourtype(TourType tourtype) {
        this.tourtype = tourtype;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getExercise_id() {
        return exercise_id;
    }

    public void setExercise_id(int exercise_id) {
        this.exercise_id = exercise_id;
    }

    public int getTourGuide_id() {
        return tourguide_id;
    }

    public void setTourGuide_id(int guide_id) {
        this.tourguide_id = tourguide_id;
    }

    public int getFile_id() {
        return file_id;
    }

    public void setFile_id(int file_id) {
        this.file_id = file_id;
    }
}




