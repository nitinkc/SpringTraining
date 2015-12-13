package config.a2;

import beans.b4javaConfigBeans.javaConfigImport.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by nitin on 12/12/15.
 */

@Configuration
public class StudentConfig {

    @Bean(name="test")
    public Student student(){
        return new Student();
    }
}
