package test.java.com.example.testing;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.testing.CitizenApplication;

@SpringBootTest(classes=CitizenApplication.class)
public class CitizenServiceTests {

    @Test
    public void contextLoads(){
        assertThat(true).isTrue();
    }
}
