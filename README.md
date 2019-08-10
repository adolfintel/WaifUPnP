# UPnP 

![Release](https://img.shields.io/badge/release-1.2.0-brightgreen)
![Build Status](https://ci.xiamli.com/api/badges/Xelp/upnp/status.svg)
![License](https://img.shields.io/badge/license-LGPL%20%3E%3D%202.1-blue)
![Maintenance](https://img.shields.io/maintenance/yes/2019.svg)

UPnP Port Forwarding for Java couldn't be any easier!

UPnP is an _extremely_ lightweight Java library that allows you to:

- open/close TCP/UDP ports
- check if there's an UPnP router available
- check if a port is already mapped

## Requirements

Java 1.8 or later.

## Installation

First you need to build it using maven:

```bash
mvn clean install
```
 
### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.xiamli</groupId>
  <artifactId>upnp</artifactId>
  <version>1.2.0-SNAPSHOT</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.xiamli:upnp:1.2.0-SNAPSHOT"
```

### Usage

```java
import com.xiamli.upnp.UPnP;

public class Example {

    public static void main(String[] args) {
        System.out.println(UPnP.isUPnPAvailable() ? "UPnP is available!" : "UPnP isn't available.");
        
        System.out.println(String.format("Port 8080 is %s via TCP", UPnP.isMappedTCP(8080) ? "open" : "closed"));
        System.out.println(String.format("Port 8080 is %s via UDP", UPnP.isMappedUDP(8080) ? "open" : "closed"));

        System.out.println(String.format("Port 8080 %s via TCP", UPnP.openPortTCP(8080) ? "is now open" : "couldn't be opened"));
        System.out.println(String.format("Port 8080 %s via UDP", UPnP.openPortUDP(8080) ? "is now open" : "couldn't be opened"));

        System.out.println(String.format("Port 8080 %s closed via TCP", UPnP.closePortTCP(8080) ? "is now" : "couldn't be"));
        System.out.println(String.format("Port 8080 %s closed via UDP", UPnP.closePortUDP(8080) ? "is now" : "couldn't be"));
        
        System.out.println("The currect local ip address is " + UPnP.getLocalIP());
        System.out.println("The currect external ip address is " + UPnP.getExternalIP());
    }
}
```

## Limitations

This library is a very basic implementation of UPnP, that only scans for the default gateway, and can only open/close ports.

While this is enough for most people, if you need a full implementation of UPnP, you should take a look at [Cling](http://4thline.org/projects/cling/)