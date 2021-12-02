package databois.christiansoe.rest;


import databois.christiansoe.entity.Guides;
import databois.christiansoe.repositories.GuideRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("guides/tours")
public class GuideController {

    private GuideRepository guideRepository;

    //Constructor injection i stedet for field injection (Autowired)
    public GuideController(GuideRepository guideRepository) {
        this.guideRepository = guideRepository;
    }


    @GetMapping
    Iterable<Guides> getAll() {
        return guideRepository.findAll();
    }

    //HTTP GET (/tours)
//    @GetMapping("/tours")
//    public ResponseEntity<List<Guides>> findALl() {
//        List<Guides> tours = new ArrayList<>();
//        guideRepository.findAll().forEach(tours::add);
//        //ResponseEntitiy builder - først status OK/200- så til sidst body. body=collection of tours
//        return ResponseEntity.status(HttpStatus.OK).body(tours);
//    }



}
