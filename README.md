# WaifUPnP 
forked from WaifUPNP 1.0 with applied fix 1.1 and a refresh method() and also is upnp open now method. 
The orignal can be found here
https://github.com/adolfintel/WaifUPnP

How to use:
https://github.com/jredfox/WaifUPnP/blob/master/Example3.java

In the example add scheduling makes it port forward in a seperate thread so it doesn't lag your application. This utility class is called right after a ServerSocket with protocal TCP is used in minecraft open to lan. Thus Port Forwarding occurs right after the server socket is established. EntityUtil.brodcastMessege() simply tells plays in minecraft that that the port is open or has failed in doing so.
