package databois.christiansoe.rest;


import databois.christiansoe.entity.Guides;
import databois.christiansoe.repositories.GuideRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/guides") // en fil vi selv laver? kører over server.
public class GuideResource {
    private GuideRepository guideRepository;
    public GuideResource(GuideRepository guideRepository) {
        this.guideRepository = guideRepository;
    }

    @GetMapping
    Iterable<Guides> getAll() {
        return guideRepository.findAll();
    }


}
