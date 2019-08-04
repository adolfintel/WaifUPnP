# WaifUPnP 

UPnP Port Forwarding for Java couldn't be any easier!

WaifUPnP is an _extremely_ lightweight Java library that allows you to:

- open/close TCP/UDP ports
- check if there's an UPnP router available
- check if a port is already mapped

using literally 1 line of code, as it should be! 

It's as easy as:

```java
UPnP.openTCP(<port number here>);
```

See examples below.

## Usage

To compile, you can just use maven:
```
mvn clean install
```

Then, import it into your project:
```xml
<dependency>
    <groupId>com.fdossena</groupId>
    <artifactId>waifupnp</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```

Alternatively, download the binaries from http://fdossena.com/?p=waifupnp/index.frag

Once you have the .jar files:

- Import `WaifUPnP.jar` into your application
- Optionally, import `WaifUPnP-javadoc.jar` if you need JavaDoc
- `WaifUPnP-sources.jar` contains the source code and should not be imported into your project

## Examples

To check if UPnP is available:
```java
System.out.println(UPnP.isUPnPAvailable() ? "UPnP is available!" : "UPnP isn't available.");
```

To check if a port is already mapped:
```java
System.out.println(String.format("Port 8080 is %s via TCP", UPnP.isMappedTCP(8080) ? "open" : "closed"));
System.out.println(String.format("Port 8080 is %s via UDP", UPnP.isMappedUDP(8080) ? "open" : "closed"));
```

To open a port via UPnP:
```java
System.out.println(String.format("Port 8080 %s via TCP", UPnP.openPortTCP(8080) ? "is now open" : "couldn't be opened"));
System.out.println(String.format("Port 8080 %s via UDP", UPnP.openPortUDP(8080) ? "is now open" : "couldn't be opened"));
```

To close a port via UPnP:
```java
System.out.println(String.format("Port 8080 %s closed via TCP", UPnP.closePortTCP(8080) ? "is now" : "couldn't be"));
System.out.println(String.format("Port 8080 %s closed via UDP", UPnP.closePortUDP(8080) ? "is now" : "couldn't be"));
```

To get the local and/or external IP via UPnP Gateway:
```java
System.out.println("The currect local ip address is " + UPnP.getLocalIP());
System.out.println("The currect external ip address is " + UPnP.getExternalIP());
```

## Compatibility

Java 6 and newer

## Limitations

WaifUPnP is a very basic implementation of UPnP, that only scans for the default gateway, and can only open/close ports.

While this is enough for most people, if you need a full implementation of UPnP, you should take a look at [Cling](http://4thline.org/projects/cling/)

## License
Copyright (C) 2015-2018 Federico Dossena

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Lesser General Public License as published by
the Free Software Foundation, either version 2.1 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU Lesser General Public License
along with this program.  If not, see <https://www.gnu.org/licenses/lgpl>.
