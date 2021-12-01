package databois.christiansoe.config;

import databois.christiansoe.entity.Guides;
import databois.christiansoe.repositories.GuideRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;


//@Configuration
public class DataSetup implements CommandLineRunner {

    GuideRepository guideRepository;

    public DataSetup(GuideRepository guideRepository) {
        this.guideRepository = guideRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        guideRepository.save(new Guides("PlanteTour","2km"));
        guideRepository.save(new Guides("Peter","larsen"));
    }
}
