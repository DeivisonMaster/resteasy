package br.com.resteasy.config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class WSConfig extends Application{

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> recursos = new HashSet<>();
		recursos.add(br.com.resteasy.service.NoticiaService.class);
		return recursos;
	}
	
	
	
}
