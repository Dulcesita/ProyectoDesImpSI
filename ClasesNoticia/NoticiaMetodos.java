package ClasesNoticia;
import java.util.Date;


public class NoticiaMetodos {
    NoticiaAtributos noticia = new NoticiaAtributos();
    
    public void EscribirNoticia(int idReportero, int idNoticia)
    { 
        noticia.setIdNoticia(idNoticia);
        noticia.setIdReportero(idReportero);
   
    }
    
     public void ModificarNoticia(int idReportero, int idNoticia)
    { 
        noticia.setIdNoticia(idNoticia);
        noticia.setIdReportero(idReportero);
    }

     public void EliminarNoticia(int idReportero, int idNoticia)
    { 
        noticia.setIdNoticia(idNoticia);
        noticia.setIdReportero(idReportero);
    }
     
    public void Publicar(int idNoticia,Date Inicio, Date Fin)
    { 
        noticia.setIdNoticia(idNoticia);
        noticia.setFechaInicio(Inicio);
        noticia.setFechaFin(Fin);
    }
    
    public void ImprimirEncabezado(int idNoticia)
    { 
        noticia.setIdNoticia(idNoticia);
    }
    
    public void ModificarFechaPublicacion(int idNoticia,Date Inicio, Date Fin)
    { 
        noticia.setIdNoticia(idNoticia);
        noticia.setFechaInicio(Inicio);
        noticia.setFechaFin(Fin);
    }
    
    public void CategoriaNoticia(int idNoticia, int idCategoria)
    { 
      noticia.setIdNoticia(idNoticia);
      noticia.setCategoria(idCategoria);
    }


}

