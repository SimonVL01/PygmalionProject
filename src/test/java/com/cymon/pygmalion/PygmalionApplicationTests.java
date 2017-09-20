package com.cymon.pygmalion;

import com.cymon.pygmalion.domain.Brand;
import com.cymon.pygmalion.domain.User;
import com.cymon.pygmalion.repositories.BrandRepository;
import com.cymon.pygmalion.repositories.UserRepository;
import com.cymon.pygmalion.repositories.dto.AgesByFrequency;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PygmalionApplicationTests {
    @Autowired
    private BrandRepository brandRepository;

    @Test
    public void testAgesCanBeRetrievedByFrequency() throws Exception {
        List<AgesByFrequency> ages = brandRepository.findAgesByFrequency("Cy-mon Software", new PageRequest(0, 1));
        Assert.assertEquals(ages.get(0).getAge(), 25);
        Assert.assertEquals(ages.get(0).getFrequency(), 3);
    }
}
