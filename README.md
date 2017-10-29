## Based on nio
## how to use

1.java -jar target/heartbeat-0.0.1-SNAPSHOT.jar -m SUBSCRIBE -i S1  -n en0 

2.java -jar target/heartbeat-0.0.1-SNAPSHOT.jar -m MULTICAST -i B -n en0

en0 is the ifconfig name

### multicast is like the agent, and subscriber is like the server, agent send data to server
### Codes from https://examples.javacodegeeks.com/core-java/nio/java-nio-heartbeat-example/
