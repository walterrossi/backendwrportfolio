package portfolioWR1.portfolioWR1.Controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import portfolioWR1.portfolioWR1.Service.IPersonaService;
import portfolioWR1.portfolioWR1.model.Persona;


@RestController
@CrossOrigin(origins = "https://portfoliowr-2022.web.app") //@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin(origins = "http://localhost:4200")

public class Controller {
    
 @Autowired
 private IPersonaService persoServ;
 //List<Persona> listaPersona = new ArrayList();   
    
 @GetMapping  ("/hola")
  public String decirHola(){
  return "Hola Mundo";
  }   
  
  @GetMapping  ("/holas/{nombre}")
  public String decirHola(@PathVariable String nombre){
  return "Hola Mundo "+nombre;
  }   
  
  @GetMapping ("/holaa")
  public String decirHolas (@RequestParam String nombre,
                             @RequestParam int edad,
                             @RequestParam String profesion)
  {
      return "Hello Word. " + nombre + " Tu edad es "+edad+ " Tu profesion es "+
              profesion;}
  
    @PostMapping ("/new/persona")
      public void agregarPersona(@RequestBody Persona pers){
        persoServ.crearPersona(pers);
    }  

      
      @GetMapping ("/leer")
      @ResponseBody
      public List <Persona> leerPersona(){
        return persoServ.verPersonas();
      }

  //https://www.youtube.com/watch?v=QQ72JXUQRNE//
     
      @GetMapping ("/buscar/{id}")   //127.0.0.1:8080/buscar/3
      public Persona buscarPersona(@PathVariable Long id){
      return persoServ.buscarPersona(id);
      }
     
      
      @DeleteMapping ("/delete/{id}")
      public void borrarPersona (@PathVariable Long id){
      persoServ.borrarPersona(id);
      }
      
      

   
 
  @PutMapping("/editar/{id}")
   public Persona update(@RequestBody Persona persona, @PathVariable Long id){
          Persona PersonaActual = persoServ.buscarPersona(id);
           PersonaActual.setNombre(persona.getNombre());
           PersonaActual.setUrl_img_persona(persona.getUrl_img_persona());
           PersonaActual.setAcerca(persona.getAcerca());
           PersonaActual.setExperiencia(persona.getExperiencia());
           PersonaActual.setExperienciaImg1(persona.getExperienciaImg1());
           PersonaActual.setEducacion(persona.getEducacion());
           PersonaActual.setEducacionImg1(persona.getEducacionImg1());
           PersonaActual.setHardsoft(persona.getHardsoft());
           PersonaActual.setHardsoftPor(persona.getHardsoftPor());
           PersonaActual.setProyecto(persona.getProyecto());
           PersonaActual.setProyectoImg1(persona.getProyectoImg1());
                    
           persoServ.modificarPersona(PersonaActual);
           return null;
           
           

}
         
         
   //aca agregue solo patch, cualquier cosa los borro a todos los patch //
   
   
   @PatchMapping("/mnombre/{id}")
    public Persona modificarNombre(@RequestBody Persona persona, @PathVariable Long id){
          Persona PersonaActual = persoServ.buscarPersona(id);
          PersonaActual.setNombre(persona.getNombre());
          persoServ.modificarPersona(PersonaActual);
           return null;}
    
    @PatchMapping("/mUrl-img-persona/{id}")
    public Persona modificarApellido(@RequestBody Persona persona, @PathVariable Long id){
          Persona PersonaActual = persoServ.buscarPersona(id);
          PersonaActual.setUrl_img_persona(persona.getUrl_img_persona());
          persoServ.modificarPersona(PersonaActual);
           return null;}
   
   
   @PatchMapping("/macerca/{id}")
    public Persona modificarAcerca(@RequestBody Persona persona, @PathVariable Long id){
          Persona PersonaActual = persoServ.buscarPersona(id);
          PersonaActual.setAcerca(persona.getAcerca());
      
         persoServ.modificarPersona(PersonaActual);
           return null;}
    
   @PatchMapping("/mexperiencia/{id}")
    public Persona modificarExperiencia(@RequestBody Persona persona, @PathVariable Long id){
          Persona PersonaActual = persoServ.buscarPersona(id);
          PersonaActual.setExperiencia(persona.getExperiencia());
      
         persoServ.modificarPersona(PersonaActual);
           return null;}
    
     @PatchMapping("/mexperienciaImg1/{id}")
    public Persona modificarExperienciaImg1(@RequestBody Persona persona, @PathVariable Long id){
          Persona PersonaActual = persoServ.buscarPersona(id);
          PersonaActual.setExperienciaImg1(persona.getExperienciaImg1());
      
         persoServ.modificarPersona(PersonaActual);
           return null;}
    
     @PatchMapping("/meducacion/{id}")
       public Persona modificarEducacion(@RequestBody Persona persona, @PathVariable Long id){
          Persona PersonaActual = persoServ.buscarPersona(id);
          PersonaActual.setEducacion(persona.getEducacion());
      
         persoServ.modificarPersona(PersonaActual);
           return null;}
    
     @PatchMapping("/meducacionImg1/{id}")
       public Persona modificarEducacionImg1(@RequestBody Persona persona, @PathVariable Long id){
          Persona PersonaActual = persoServ.buscarPersona(id);
          PersonaActual.setEducacionImg1(persona.getEducacionImg1());
          persoServ.modificarPersona(PersonaActual);
           return null;}
    
      @PatchMapping("/mhardsoft/{id}")
       public Persona modificarHardSoft(@RequestBody Persona persona, @PathVariable Long id){
          Persona PersonaActual = persoServ.buscarPersona(id);
          PersonaActual.setHardsoft(persona.getHardsoft());
          persoServ.modificarPersona(PersonaActual);
           return null;}
    
       @PatchMapping("/mhardsoftpor/{id}")
       public Persona modificarHardSoftPor(@RequestBody Persona persona, @PathVariable Long id){
          Persona PersonaActual = persoServ.buscarPersona(id);
          PersonaActual.setHardsoftPor(persona.getHardsoftPor());
          persoServ.modificarPersona(PersonaActual);
           return null;}
       
         @PatchMapping("/mproyecto/{id}")
       public Persona modificarProyecto(@RequestBody Persona persona, @PathVariable Long id){
          Persona PersonaActual = persoServ.buscarPersona(id);
          PersonaActual.setProyecto(persona.getProyecto());
          persoServ.modificarPersona(PersonaActual);
           return null;}
          
       @PatchMapping("/mproyectoImg1/{id}")
       public Persona modificarProyectoImg1(@RequestBody Persona persona, @PathVariable Long id){
          Persona PersonaActual = persoServ.buscarPersona(id);
          PersonaActual.setProyectoImg1(persona.getProyectoImg1());
          persoServ.modificarPersona(PersonaActual);
           return null;}
       
       
       //hay que hacer lo mismo con cada uno, son 12 para poder modificar//
       
        @PatchMapping("/mhardsofthtml/{id}")
       public Persona modificarhardsofthtml(@RequestBody Persona persona, @PathVariable Long id){
          Persona PersonaActual = persoServ.buscarPersona(id);
          PersonaActual.setHardsoft_html(persona.getHardsoft_html());
          persoServ.modificarPersona(PersonaActual);
           return null;}
      /////////////////////////////////////////////////////////////////// 
        @PatchMapping("/mhardsoftcss/{id}")
       public Persona modificarhardsoftcss(@RequestBody Persona persona, @PathVariable Long id){
          Persona PersonaActual = persoServ.buscarPersona(id);
          PersonaActual.setHardsoft_css(persona.getHardsoft_css());
          persoServ.modificarPersona(PersonaActual);
           return null;}
       
          @PatchMapping("/mhardsoftjs/{id}")
       public Persona modificarhardsoftjs(@RequestBody Persona persona, @PathVariable Long id){
          Persona PersonaActual = persoServ.buscarPersona(id);
          PersonaActual.setHardsoft_js(persona.getHardsoft_js());
          persoServ.modificarPersona(PersonaActual);
           return null;}
       
       @PatchMapping("/mhardsoftangular/{id}")
       public Persona modificarhardsoftangular(@RequestBody Persona persona, @PathVariable Long id){
          Persona PersonaActual = persoServ.buscarPersona(id);
          PersonaActual.setHardsoft_angular(persona.getHardsoft_angular());
          persoServ.modificarPersona(PersonaActual);
           return null;}
       
       @PatchMapping("/mhardsoftjava/{id}")
       public Persona modificarhardsoftjava(@RequestBody Persona persona, @PathVariable Long id){
          Persona PersonaActual = persoServ.buscarPersona(id);
          PersonaActual.setHardsoft_java(persona.getHardsoft_java());
          persoServ.modificarPersona(PersonaActual);
           return null;}
       
          @PatchMapping("/mhardsoftmysql/{id}")
       public Persona modificarhardsoftmysql(@RequestBody Persona persona, @PathVariable Long id){
          Persona PersonaActual = persoServ.buscarPersona(id);
          PersonaActual.setHardsoft_mysql(persona.getHardsoft_mysql());
          persoServ.modificarPersona(PersonaActual);
           return null;}
       
       ///hay que hacer las 6 que faltan de habilidades blandas//
       
        @PatchMapping("/mhardsoftcomunicacion/{id}")
       public Persona modificarhardsoftcomunicacion(@RequestBody Persona persona, @PathVariable Long id){
          Persona PersonaActual = persoServ.buscarPersona(id);
          PersonaActual.setHardsoft_comunicacion(persona.getHardsoft_comunicacion());
          persoServ.modificarPersona(PersonaActual);
           return null;}
       
        @PatchMapping("/mhardsoftcreatividad/{id}")
       public Persona modificarhardsoftcreatividad(@RequestBody Persona persona, @PathVariable Long id){
          Persona PersonaActual = persoServ.buscarPersona(id);
          PersonaActual.setHardsoft_creatividad(persona.getHardsoft_creatividad());
          persoServ.modificarPersona(PersonaActual);
           return null;}
       
          @PatchMapping("/mhardsoftliderazgo/{id}")
       public Persona modificarhardsoftliderazgo(@RequestBody Persona persona, @PathVariable Long id){
          Persona PersonaActual = persoServ.buscarPersona(id);
          PersonaActual.setHardsoft_liderazgo(persona.getHardsoft_liderazgo());
          persoServ.modificarPersona(PersonaActual);
           return null;}
       
          @PatchMapping("/mhardsoftgestiondeltiempo/{id}")
       public Persona modificarhardsoftgestiondeltiempo(@RequestBody Persona persona, @PathVariable Long id){
          Persona PersonaActual = persoServ.buscarPersona(id);
          PersonaActual.setHardsoft_gestiondeltiempo(persona.getHardsoft_gestiondeltiempo());
          persoServ.modificarPersona(PersonaActual);
           return null;}
       
          @PatchMapping("/mhardsoftactitudpositiva/{id}")
       public Persona modificarhardsoftactitudpositiva(@RequestBody Persona persona, @PathVariable Long id){
          Persona PersonaActual = persoServ.buscarPersona(id);
          PersonaActual.setHardsoft_actitudpositiva(persona.getHardsoft_actitudpositiva());
          persoServ.modificarPersona(PersonaActual);
           return null;}
       
       
         @PatchMapping("/mhardsoftpensamientocritico/{id}")
       public Persona modificarhardsoftpensamientocritico(@RequestBody Persona persona, @PathVariable Long id){
          Persona PersonaActual = persoServ.buscarPersona(id);
          PersonaActual.setHardsoft_pensamientocritico(persona.getHardsoft_pensamientocritico());
          persoServ.modificarPersona(PersonaActual);
           return null;}
       
       
//aca agregue solo patch, cualquier cosa los borro a todos los patch //
}
