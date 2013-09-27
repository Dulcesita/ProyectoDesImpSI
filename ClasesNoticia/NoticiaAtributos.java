package ClasesNoticia;
import java.util.Date;

public class NoticiaAtributos {
    
    private int idNoticia;
    private String Titulo;
    private String Contenido;
    private String Encabezado;
    private Date fechaInicio;
    private Date fechaFin;
    private int idReportero;
    private int idCategoria;
    
    public int getIdNoticia() {
        return idNoticia;
    }

    public void setIdNoticia(int idNoticia) {
        this.idNoticia = idNoticia;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String Contenido) {
        this.Contenido = Contenido;
    }

    public String getEncabezado() {
        return Encabezado;
    }

    public void setEncabezado(String Encabezado) {
        this.Encabezado = Encabezado;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    public int getIdReportero() {
        return idReportero;
    }

    public void setIdReportero(int idReportero) {
        this.idReportero = idReportero;
    }

    public int getIdCategoria() {
        return idReportero;
    }

    public void setCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    
}
