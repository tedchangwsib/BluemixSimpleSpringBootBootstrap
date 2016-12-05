package pas.ibm.demo.bluemix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class BluemixDemoApplication {

    @Autowired
    private EmployeeRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(BluemixDemoApplication.class, args);
    }

    @PostConstruct
    private void init()
    {
        repository.save(new Employee("ted", "apicella"));
        repository.save(new Employee("thien", "apicella"));
        repository.save(new Employee("luis", "apicella"));
        repository.save(new Employee("yi", "apicella"));
        repository.save(new Employee("apples", "monash"));
    }
}
