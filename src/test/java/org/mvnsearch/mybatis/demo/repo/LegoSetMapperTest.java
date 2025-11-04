package org.mvnsearch.mybatis.demo.repo;
/*
 * Copyright 2017-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.github.database.rider.core.api.dataset.DataSet;
import org.junit.jupiter.api.Test;
import org.mvnsearch.mybatis.demo.ProjectBaseTest;
import org.mvnsearch.mybatis.demo.model.LegoSet;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

@DataSet("db/dataset/lego-set.xml")
public class LegoSetMapperTest extends ProjectBaseTest {
    @Autowired
    LegoSetMapper legoSetMapper;

    @Test
    public void testGetLegoSet() {
        LegoSet legoSet = legoSetMapper.findById(1);
        assertThat(legoSet).isNotNull();
    }

    @Test
    public void testFindByName() {
        LegoSet legoSet = legoSetMapper.findByName("Small Car 01");
        assertThat(legoSet).isNotNull();
        System.out.println(legoSet.getId());
    }

}
