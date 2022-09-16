package portfolioWR1.portfolioWR1.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String url_img_persona;//sustituye a apellido
    private String acerca;
    private String experiencia;
    private String experienciaImg1;
    private String educacion;
    private String educacionImg1;
    private String hardsoft;
    private String hardsoftPor;
    
    private String hardsoft_html;
    private String hardsoft_js;
    private String hardsoft_css;
    private String hardsoft_angular;
    private String hardsoft_java;
    private String hardsoft_mysql;
    
    private String hardsoft_comunicacion;
    private String hardsoft_creatividad;
    private String hardsoft_pensamientocritico;
    private String hardsoft_liderazgo;
    private String hardsoft_gestiondeltiempo;
    private String hardsoft_actitudpositiva;
    
    
    private String proyecto;
    private String proyectoImg1;
    

    public Persona() {
    }
   

public Persona(Long id, String nombre, String url_img_persona, String acerca, String experiencia,
        String experienciaImg1, String educacion, String educacionImg1, String hardsoft, String hardsoftPor,
        String hardsoft_html,String hardsoft_css,String hardsoft_js,String hardsoft_angular,String hardsoft_java,
        String hardsoft_mysql,
        String hardsoft_comunicacion,
        String hardsoft_creatividad,
        String hardsoft_pensamientocritico,
        String hardsoft_liderazgo,String hardsoft_gestiondeltiempo,String hardsoft_actitudpositiva,
        
        String proyecto, 
        String proyectoImg1){
  this.id = id;
  this.nombre = nombre;
  this.url_img_persona = url_img_persona;
  this.acerca = acerca;
  this.experiencia=experiencia;
  this.experienciaImg1=experienciaImg1;
  this.educacion=educacion;
  this.educacionImg1=educacionImg1;
  this.hardsoft=hardsoft;
  this.hardsoftPor=hardsoftPor;
  
  this.hardsoft_html=hardsoft_html;
  this.hardsoft_css=hardsoft_css;
  this.hardsoft_js=hardsoft_js;
  this.hardsoft_angular=hardsoft_angular;
  this.hardsoft_java=hardsoft_java;
  this.hardsoft_mysql=hardsoft_mysql;
  
  
  this.hardsoft_comunicacion=hardsoft_comunicacion;
  this.hardsoft_creatividad=hardsoft_creatividad;
  this.hardsoft_pensamientocritico=hardsoft_pensamientocritico;
  this.hardsoft_liderazgo=hardsoft_liderazgo;
  this.hardsoft_gestiondeltiempo=hardsoft_gestiondeltiempo;
  this.hardsoft_actitudpositiva=hardsoft_actitudpositiva;

  
  
  this.proyecto=proyecto;
  this.proyectoImg1=proyectoImg1;
    
}
}
