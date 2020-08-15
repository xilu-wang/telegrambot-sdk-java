# telegrambot-sdk-java
A Java client to call Telegram Bot APIs

### Install
1. Download and compile the code
```shell script
git clone https://github.com/xilu-wang/telegrambot-sdk-java.git
cd telegrambot-sdk-java
mvn clean install
```

2. Add the library in your maven project pom.xml
```xml
<dependencies>
    <dependency>
        <groupId>com.xiluwang</groupId>
        <artifactId>telegrambot-sdk-java</artifactId>
        <version>1.0.0-SNAPSHOT</version>
    </dependency>
</dependencies>
```

### Usage
##### Step 1. 
Add your telegram bot token in application.properties under `resources` folder: 
```properties
# example
token=1391770037:BBED1wvRkPVWCvxmczThmXYyUT4VXmCh-B4
```

##### Step 2. 

- Run [ApiTest](src/test/java/com/xiluwang/telegrambot/sdk/java/ApiTest.java), and you should get your bot info such as follows:
```json
{
  "id" : 100000000,
  "is_bot" : true,
  "first_name" : "test cat",
  "username" : "test_bot",
  "can_join_groups" : true,
  "can_read_all_group_messages" : true,
  "supports_inline_queries" : false
}
```
- Run [MessagingTest](src/test/java/com/xiluwang/telegrambot/sdk/java/MessagingTest.java)
- Run [UpdatingTest](src/test/java/com/xiluwang/telegrambot/sdk/java/UpdatingTest.java)

### Interfaces