package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Tester {

/**
 *  @param args
 */
    public static void main(String[] args) {
	int i,j;
	MDB administradorBD =  new MDB();
	List<ArrayList<String>> datosObtenidos= new ArrayList<ArrayList<String>>();
	ArrayList<String> renglonObtenido = new ArrayList<String>();
	String leyenda;
        
        /*
        //insertar
        leyenda= administradorBD.registrarAlta("tbusuarios", "3, 'Jhon','usuarioJhon',1234");
	System.out.println(leyenda);
               
        //modificar
	leyenda = administradorBD.modificarRegistro("cliente", "nombre='Juan' , usuario = 'sopenco' ,  psw= '4321'", "id = 11");
        System.out.println(leyenda);
                
        //Borrar
        leyenda = administradorBD.borrarRegistro("cliente", "id = 3");
        System.out.println(leyenda);
		
        //consulta
        datosObtenidos = administradorBD.consultarDatos("cliente", "id , nombre,usuario, psw", "id=5");
        System.out.println(leyenda);
	for(i=0;i<datosObtenidos.size();i++)
        {
            renglonObtenido = datosObtenidos.get(i);
            for(j=0;j<renglonObtenido.size();j++)
            {
                System.out.print(renglonObtenido.get(j) + " ");
            }
            System.out.println();
        }*/

    }
}