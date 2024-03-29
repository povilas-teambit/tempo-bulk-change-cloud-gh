# Helpful Commands

$ ./mvnw spring-boot:run
$ ./mvnw package
$ ./mvnw clean

./mvnw spring-boot:run -Dspring-boot.run.arguments="--addon.base-url=https://rnhjd-88-119-128-223.a.free.pinggy.online" -Dspring-boot.run.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,address=5005"

# To start spring server, pinngy public URL creation and installing the plugin in Jira

1. Create a public URL for the plugin on free.pinggy.online
2. Start the spring server with the public URL as an argument like this:
    ```shell
    ./mvnw spring-boot:run -Dspring-boot.run.arguments="--addon.base-url=https://rnkff-178-16-46-137.a.free.pinggy.online" -Dspring-boot.run.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,address=5005"
    ```
   in this step have to enable debugger in the IDE
   3. Install the plugin in Jira by running the following command in the terminal:
       ```
        sdk env
      ./mvnw package
      ```
4. Create jira issue and change/create worklog status and debugger will catch that event