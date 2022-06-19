package at.ls.neo4j.proyecto_neo;

import java.text.SimpleDateFormat;
import java.util.Date;




/*import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import static org.neo4j.driver.Values.parameters;*/

public class Proyecto_Neo {
    
    
    public static void main(String[] args) {
        
        String x = "Frameworks ,Manejo de blockchain ,Machine learning ";
        String array[] = x.split(",");
        String concat="";
        for(int i=0; i<array.length; i++){
            concat+=array[i]+"\n";
        }
        System.out.println(concat);
         
        /*int codigo=5;
        String x = "Este es el código "+codigo+" que nos asignaron";
        System.out.println(x);
        
        Date myDate = new Date();

        String t = new SimpleDateFormat("dd-MM-yyyy").format(myDate);
        System.out.println(t);*/

        
        
       /* Driver driver = GraphDatabase.driver("bolt://localhost:7687",
                AuthTokens.basic("neo4j", "1234"));
       Persona p = new Persona("Daniel", "Sagastume", 21);
        
        try(Session session = driver.session()){   */

            //Adicionando uma pessoa
            /*Result result = session.run("CREATE (p:Persona{nombre:$nombre, apellido:$apellido, edad:$edad})",
                    parameters("nombre", p.getNombre(), "apellido", p.getApellido(),
                            "edad", p.getEdad()));
            
            System.out.println(result.consume().counters().nodesCreated());*/
            
            /*
            Result result = session.run("MATCH (p1:Persona{nombre:$nombre}),(p2:Persona{nombre:$nombre2})" +
                    "CREATE (p1)-[:AMIGO]->(p2)",
                    parameters("nombre", "Angel", "nombre2", "Daniel"));
            System.out.println(result.consume().counters().relationshipsCreated());

        }finally {
            driver.close();
        }
        */
    }
}
