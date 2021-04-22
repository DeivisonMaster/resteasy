package br.com.resteasy.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.resteasy.model.Noticia;

@Path("/noticia")
public class NoticiaService {
	
	@GET
	@Path("/todas")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Noticia> buscarNoticias(){
		List<Noticia> noticias = new ArrayList<>();
		noticias.add(new Noticia("Esportes", "Clube paulista venceu por 3x0 na noite de ontem"));
		noticias.add(new Noticia("Crime", "Sequestros em SP aumentam em 2020"));
		noticias.add(new Noticia("Economia", "Argentina entra em recessão economica"));
		noticias.add(new Noticia("Mundo", "China é a responsavel pela Covid"));
		noticias.add(new Noticia("Saude", "Pandemia acelera no Brasil"));
		
		return noticias;
	}
	
}





























