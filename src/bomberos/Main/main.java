
package bomberos.Main;

import bomberos.AccesoADatos.BrigadaData;
import bomberos.AccesoADatos.CuartelData;
import bomberos.AccesoADatos.SiniestroData;
import bomberos.AccesoAdatos.BomberoData;
import bomberos.AccesoAdatos.Conexion;
import bomberos.Entidades.Bombero;
import bomberos.Entidades.Brigada;
import bomberos.Entidades.Siniestro;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class main {

    public static void main(String[] args) {
        //Bombero nuevo
   /*Bombero bom =new Bombero(123123123, "marco polo", "A +", LocalDate.of(1980, 11, 22)," +01112121", 10, true);
   BomberoData bomDB =new BomberoData();
   bomDB.nuevoBombero(bom);
    */    
     //Bombero modificar
     /*
     Bombero bom =new Bombero(19,123123123, "maria polo", "A +", LocalDate.of(1980, 11, 22)," +01112121", 10, true);
     BomberoData bomDB =new BomberoData();
     bomDB.modificarBombero(bom);
     */
     //Eliminar bombero de forma logica
     /*
     Bombero bom =new Bombero(19,123123123, "maria polo", "A +", LocalDate.of(1980, 11, 22)," +01112121", 10, true);
     BomberoData bomDB= new BomberoData();
     bomDB.eliminarBombero(123123123);
    */
    //crear brigada nueva 
    /*
    Brigada bri =new Brigada("Cobra", "derrames industriales", true, 1);
    BrigadaData briDB =new BrigadaData();
    briDB.nuevaBrigada(bri);
    */
    // Modifica una brigada  su especialidad
    /*
    Brigada bri = new Brigada("Cobra", "derrames industriales", true, 1);
    BrigadaData briDB =new BrigadaData();
    briDB.cambiarEspecialidadBrigada("derrames quimicos", 11);
    */
    // obtener brigadas listas 
    /*
    Brigada bri = new Brigada();
    BrigadaData briDB = new BrigadaData ();
    
     List <Brigada>briga=briDB.obtenerBrigadas();
    if(briga.isEmpty()){
        System.out.println("no se encontraron brigadas activos ");
    
    }else{
        for(Brigada briGada:briga){
            System.out.println("NOMBRE"+briGada.getNombre_br());
            System.out.println("ESPECIALIDAD"+briGada.getEspecialidad());
            System.out.println("ESTADO"+briGada.isLibre());
            System.out.println("CODIGO BRIGADA"+" "+briGada.getCodBrigada());
            System.out.println("CODIGO DE CUARTEL"+ " "+briGada.getCodCuartel());
            System.out.println("-----------------");
        }

    
    }*/
    // ocupar brigada  
    
    BrigadaData briDB = new BrigadaData();
    briDB.ocuparBrigada(true, 9);
    
    
    // Disponibilidad de brigada 
    /*
    BrigadaData briDB = new BrigadaData();
    briDB.disponibilidadBrigada(11);
   */
    // Cambiar especialidad 
    /*
    BrigadaData briDB =new BrigadaData();
    briDB.cambiarEspecialidadBrigada("explosivos ", 10);
    */
    // obtener especialidad de brigada 
    /*
    BrigadaData briDB = new BrigadaData();
        System.out.println(briDB.obtenerEspecialidadBrigada(10));
    
    //Asignar bomberos a una lista 
     //BomberoData bomDB =new BomberoData();
    //bomDB.asignarBrigada(5, 11)
}*/
     Conexion con = new Conexion(); // Asegúrate de que este constructor inicialice la conexión correctamente

        // Verificar si la conexión es nula
        if (con.getConnection() == null) {
            System.out.println("La conexión es nula. Verifica la conexión a la base de datos.");
            return;
        }

        // Definir los valores a usar
        int codigo = 1; // Reemplaza con el código correspondiente
        LocalDate fecha_resol = LocalDate.of(2023, 10, 24); // Reemplaza con la fecha correspondiente
        int puntuacion = 5; // Reemplaza con la puntuación correspondiente

        // Llamar al método anotarTerminacionDeSiniestro
        SiniestroData siniestroData = new SiniestroData(con.getConnection());
        siniestroData.anotarTerminacionDeSiniestro(codigo, fecha_resol, puntuacion);
    }

  






   /* List<Siniestro> siniestros = siniestroData.listarSiniestros();

    if (siniestros.isEmpty()) {
        System.out.println("La lista de siniestros está vacía.");
    } else {
        System.out.println("Siniestros encontrados:");
        for (Siniestro siniestro : siniestros) {
            System.out.println("Código: " + siniestro.getCodigo());
            System.out.println("Tipo: " + siniestro.getTipo());
            System.out.println("Fecha de siniestro: " + siniestro.getFecha_siniestro());
            System.out.println("Coordenada X: " + siniestro.getCoord_X());
            System.out.println("Coordenada Y: " + siniestro.getCoord_Y());
            System.out.println("Detalles: " + siniestro.getDetalles());
            System.out.println("Fecha de resolución: " + siniestro.getFecha_resol());
            System.out.println("Puntuación: " + siniestro.getPuntuacion());
            System.out.println("Código de brigada: " + siniestro.getCodBrigada());
        }
    }*/
   
    Conexion con = new Conexion(); // Reemplaza 'Conexion' con tu clase de conexión real
        SiniestroData siniestroData = new SiniestroData(con.getConnection()); // Reemplaza 'SiniestroData' con tu clase real
          //List<Siniestro> accidente = new ArrayList<>();
        // Crea un objeto Siniestro para pasar al método consultarSiniestros
        Siniestro siniestro = new Siniestro();
        List<Siniestro> listaSiniestros = siniestroData.consultarSiniestros(siniestro);

        // Iterar sobre la lista de siniestros y mostrar la información
        if (listaSiniestros.isEmpty()) {
            System.out.println("No se encontraron siniestros.");
        } else {
            // Iterar sobre la lista de siniestros y mostrar la información
            for (Siniestro accidente : listaSiniestros) {
                System.out.println("Código de brigada: " + accidente.getCodBrigada());
                System.out.println("Código: " + accidente.getCodigo());
                System.out.println("Coordenada X: " + accidente.getCoord_X());
                System.out.println("Coordenada Y: " + accidente.getCoord_Y());
                System.out.println("Detalles: " + accidente.getDetalles());
                System.out.println("Fecha de siniestro: " + accidente.getFecha_siniestro());
                System.out.println("Fecha de resolución: " + accidente.getFecha_resol());
                System.out.println("Puntuación: " + accidente.getPuntuacion());
            }
   }
    

} 