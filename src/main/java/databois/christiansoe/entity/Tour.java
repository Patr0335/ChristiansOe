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


    @ManyToOne
    @JoinColumn(name = "exercise_id",referencedColumnName = "id")
    private Exercise exercise;

    @OneToOne
    @JoinColumn(name = "tourguide_id",referencedColumnName = "id")
    private TourGuide tourguide;

    @ManyToOne
    @JoinColumn(name = "file_id",referencedColumnName = "id")
    private FileType fileType;

    public Tour(String name, TourType tourtype, int duration, Exercise exercise, TourGuide tourguide, FileType fileType) {
        this.name = name;
        this.tourtype = tourtype;
        this.duration = duration;
        this.exercise = exercise;
        this.tourguide = tourguide;
        this.fileType = fileType;
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

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public TourGuide getTourguide() {
        return tourguide;
    }

    public void setTourguide(TourGuide tourguide) {
        this.tourguide = tourguide;
    }

    public FileType getFileType() {
        return fileType;
    }

    public void setFileType(FileType fileType) {
        this.fileType = fileType;
    }


}




