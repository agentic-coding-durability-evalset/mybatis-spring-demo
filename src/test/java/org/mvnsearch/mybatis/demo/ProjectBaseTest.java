package org.mvnsearch.mybatis.demo;

import com.github.database.rider.core.api.configuration.DBUnit;
import com.github.database.rider.core.connection.RiderDataSource;
import com.github.database.rider.spring.api.DBRider;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * project base test
 *
 * @author linux_china
 */
@SpringJUnitConfig(MyBatisApp.class)
@SpringBootTest
@ActiveProfiles("test")
@DBRider
@DBUnit(schema = "test", disableSequenceFiltering = true, expectedDbType = RiderDataSource.DBType.MYSQL)
public abstract class ProjectBaseTest {
}
