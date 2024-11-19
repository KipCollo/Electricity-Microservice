package test.java.com.example.testing;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.smartcity.SmartcityApplication;
import com.example.smartcity.service.DataAggregationService;

@SpringBootTest(classes=SmartcityApplication.class)
public class SmartCityServices {

    @Autowired
    private DataAggregationService dataAggregationService;

    @Test
    public void contextLoads(){
        assertThat(true).isTrue();
    }

    @Test
    public void testAggregateData(){
        assertThat(dataAggregationService.aggregatedData()).isNotNull();
    }
}
