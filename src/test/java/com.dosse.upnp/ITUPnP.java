package com.dosse.upnp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ITUPnP {

    @Test
    public void test1IsAvailable() {
        assertTrue(UPnP.isUPnPAvailable());
        System.out.println("UPnP is available");
    }

    @Test
    public void test2OpenPort() {
        assertTrue(UPnP.openPortTCP(12345));
        System.out.println("Opened port 12345 via UPnP");
    }

    @Test
    public void test3IsMapped() {
        assertTrue(UPnP.isMappedTCP(12345));
        System.out.println("Port 12345 is mapped via UPnP");
    }

    @Test
    public void test4ClosePort() {
        assertTrue(UPnP.closePortTCP(12345));
        System.out.println("Closed port 12345 via UPnP");
    }
}
