# build the project
build:
    mvn -DskipTests clean package

# database migration with flyway
database-migrate:
    mvn org.flywaydb:flyway-maven-plugin:11.15.0:clean
    mvn org.flywaydb:flyway-maven-plugin:11.15.0:migrate

# generate DTD for database
db-dtd-generation:
    mvn surefire:test -Dtest=DataBaseTest

# mysql CLI
mysql-cli:
    mysql -h 127.0.0.1 -P 13306 -u root -p test

# SBOM generation: target/application.cdx.json
sbom-generate:
    mvn -DprojectType=application -DoutputName=application.cdx -DoutputFormat=json cyclonedx:makeAggregateBom
