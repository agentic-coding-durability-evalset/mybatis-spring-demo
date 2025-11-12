## Task 1

**Task Type:** Feature Implementation

**Prompt:**
```
Please create a `shop` table with three columns: `id`, `name`, and `address`, and complete the following work:

- Create the `shop` table following the latest Flyway structure
- Create ShopMapper class responsible for interacting with MyBatis, and complete ShopMapper bean registration in the MyBatisConfiguration class
- Create MyBatis SQL XML Mapper file
- Modify `mybatis-config.xml` and add `typeAlias` and `mapper` for shop
- Complete corresponding test case creation

Please refer to the LegoSet implementation to complete the Shop creation.
```


## Task 2

**Task Type:** Code Refactoring

**Prompt:**
```
Please add a `description` column to the `lego_set` table with type `varchar(256)`, and synchronously complete the following work:

- Update the LegoSet class to add the `description` property
- Add description sample data to `lego-set.xml`
- Adjust the `LegoSet.xml` file to add support for the `description` column
```

