package bomberos.Main;

import bomberos.AccesoADatos.BrigadaData;
import bomberos.AccesoAdatos.BomberoData;
import bomberos.Entidades.Bombero;
import bomberos.Entidades.Brigada;
import java.time.LocalDate;
import java.util.List;

public class main {

    static BomberoData bomDB = new BomberoData();
    static BrigadaData briDB = new BrigadaData();

    public static void main(String[] args) {

        //Bombero nuevo
//        Bombero bom1 = new Bombero(123123123, "marco polo", "A +", LocalDate.of(1980, 11, 22), "+01112121", 10, true);
//        BomberoData bomDB = new BomberoData();
//        bomDB.nuevoBombero(bom1);
//
//        //Bombero modificar
//        Bombero bom2 = new Bombero(19, 123123123, "maria polo", "A +", LocalDate.of(1980, 11, 22), "+01112121", 10, true);
//        bomDB.modificarBombero(bom2);
//
        //Baja bombero
//        bomDB.bajaBombero(33333333);
        
        //Alta bombero
//        bomDB.altaBombero(33333333);
//
//        //crear brigada nueva 
//        Brigada bri = new Brigada("Cobra", "derrames industriales", true, 1);
//        BrigadaData briDB = new BrigadaData();
//        briDB.nuevaBrigada(bri);
//
//        // Modifica una brigada  su especialidad
//        Brigada bri1 = new Brigada("Cobra", "derrames industriales", true, 1);
//        briDB.cambiarEspecialidadBrigada("derrames quimicos", 11);
//
//        // obtener brigadas listas 
//        Brigada bri2 = new Brigada();
//        List<Brigada> briga = briDB.obtenerBrigadas();
//        if (briga.isEmpty()) {
//            System.out.println("no se encontraron brigadas activos ");
//        } else {
//            for (Brigada briGada : briga) {
//                System.out.println("NOMBRE" + briGada.getNombre_br());
//                System.out.println("ESPECIALIDAD" + briGada.getEspecialidad());
//                System.out.println("ESTADO" + briGada.isLibre());
//                System.out.println("CODIGO BRIGADA" + " " + briGada.getCodBrigada());
//                System.out.println("CODIGO DE CUARTEL" + " " + briGada.getCodCuartel());
//                System.out.println("-----------------");
//            }
//        }
//
//        // ocupar brigada  
//        briDB.ocuparBrigada(true, 11);
//        
//        // Disponibilidad de brigada 
//        briDB.disponibilidadBrigada(11);
//
//        // Cambiar especialidad 
//        briDB.cambiarEspecialidadBrigada("explosivos ", 10);
//
//        // obtener especialidad de brigada 
//        System.out.println(briDB.obtenerEspecialidadBrigada(10));
//        
        //Asignar bomberos a una lista 
//        bomDB.dispoBrigada(5, 12);
System.out.println("hasta aqui funciona todo");
    }
    
}
