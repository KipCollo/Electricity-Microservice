package test.java.com.example.testing;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.electricityprovider.ElectricityproviderApplication;
import com.example.electricityprovider.model.ElectricityConsumptionData;
import com.example.electricityprovider.service.ProviderService;

@SpringBootTest(classes=ElectricityproviderApplication.class)
public class ProductServiceTests {

    @Autowired
    ProviderService providerService;

    @Test
    public void contextLoads(){
        assertThat(true).isTrue();
    }

    @Test
    public void testSaveData(){
        ElectricityConsumptionData data =new ElectricityConsumptionData();
        data.setMeterId("1234");
        data.setConsumption(100);

        providerService.storeData(data);
        List<ElectricityConsumptionData> allData =providerService.getAllData();
        assertThat(allData).isNotEmpty();

        assertThat(allData.get(0).getMeterId()).isEqualTo("1234");

    }
}
