# 新需求

请创建`shop`表，包括`id`、`name`和`address`三个column，同时完成以下工作：

- 创建`shop`表，最新flyway的结构
- 创建ShopMapper类，负责和MyBatis进行交互，同时完成ShopMapper在MyBatisConfiguration类中的bean注册
- 创建MyBatis的SQL XML Mapper文件
- 修改`mybatis-config.xml`文件的配置，添加shop对应的typeAlias和mapper
- 完成对应的测试用例创建

请参考LegoSet的带实现，完成Shop的创建。

# 代码重构

请为`lego_set`表添加`description`列，类型为`varchar(256)`，请同步完成以下工作：

- 更新LegoSet类，添加`description`属性
- 为`lego-set.xml`添加description样例数据
- 调整`LegoSet.xml`文件，增加`description`列支持