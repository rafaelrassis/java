package com.fiap.aoj.ms.basicMs;

import java.net.InetAddress;
import java.rmi.UnknownHostException;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")

public class OiRestController {
	@RequestMapping(method = RequestMethod.GET,value = "/oi", produces = "text/plain")

	public String oi() throws UnknownHostException {
		String hostname = null;
		try
		{
			hostname = InetAddress.getLocalHost().getHostName();
		} catch(java.net.UnknownHostException e)
		{
			hostname = "unknown";
		}
		return "oi spring break" + hostname;
	}

}

