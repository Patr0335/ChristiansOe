package databois.christiansoe.rest;


import databois.christiansoe.entity.Tour;
import databois.christiansoe.repositories.TourRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("christiansoe/tour")
public class TourController {

    private TourRepository tourRepository;

    //Constructor injection i stedet for field injection (Autowired)
    public TourController(TourRepository tourRepository) {
        this.tourRepository = tourRepository;
    }


    @GetMapping
    Iterable<Tour> getAll() {
        return tourRepository.findAll();
    }

    //HTTP GET (/tours)
//    @GetMapping("/tour")
//    public ResponseEntity<List<Tour>> findALl() {
//        List<Tour> tours = new ArrayList<>();
//        tourRepository.findAll().forEach(tours::add);
//        //ResponseEntitiy builder - først status OK/200- så til sidst body. body=collection of tours
//        return ResponseEntity.status(HttpStatus.OK).body(tours);
//    }



}
