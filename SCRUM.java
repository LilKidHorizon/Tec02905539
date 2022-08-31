package act1;

import java.util.Scanner;

public class SCRUM {

    public static void main(String[] args) {
        System.out.println("Escuela Secundaria del profe");
         
        Scanner sn = new Scanner(System.in);
        
        int opcion;
        int n;
        int Reprobados = 0;	//Variables de almacenamiento
        int Sobresalientes = 0;
        
        
        double nota, suma = 0, mayor, menor;
        double [][] calif=new double[6][6];

        //int[] vectCalCal = {a, b, c, d, e};   	 //Vector con las calificaciones de los alumnos

         do {

        	 System.out.print("Introduce numero de alumnos: ");
            
        	 n = sn.nextInt(); 
        } while (n <= 0); //repetir mientras que el valor de n sea <= 0
         
         for(int i=0; i<n; i++){      
        	for (int j=1;j<6; j++){
        		
            	System.out.println("Ingresa la nota: "+j+" del alumno: "+(i+1));
                
            	calif[i][j]=sn.nextDouble();
            	
        	}
    	}
         
        do{
            System.out.println("1.- Alumno con la calificación más alta de todos los grupos");
            System.out.println("2.- Alumno con la calificación más alta en cada grupo");
            System.out.println("3:- Promedio total de mis alumnos");
            System.out.println("4.- Promedio de cada alumno");
            System.out.println("5.- Cuantos alumnos reprobaron en cada grupo.");
            System.out.println("6.- Alumno sobresaliente de cada grupo");
            System.out.println("7.- Calificación mas baja de cada grupo");
            System.out.println("8.- Calificación mas baja de todos");
            System.out.print("ELIJA UNA OPCION: ");
            
            opcion = sn.nextInt();
            
        } while (opcion < 1 || opcion > 8 );
        
        switch (opcion){
            
////////////////////CASO 1 by Gerardo/////////////////////
        case 1:
        	double temporal = 0.0;
        	int x=0,y=0;
        	for(int i=0; i<n; i++){     
        		for (int j=1;j<6; j++){
        			if(temporal < calif[i][j]){
        				temporal = calif[i][j];
        				x = i;
        				y = j;
       }
    }
}
        	System.out.println("El alumno con la calificación más alta de todos los grupos es el " + (x+1) +" con calificacion de " + calif[x][y]);
        		break;
        
        case 2:
                break;
        ////////////////////CASO 3/////////////////////
        case 3:
                double promedioGeneral = 0;

    	for(int i=0; i<n; i++) {
        	int j;
        	for (j = 1; j < 6; j++) {
            
            	suma = suma + calif[i][j];
        	}
                double promedio2;               
        	promedio2 = suma / 5;
        	suma = 0;
                
        	promedioGeneral = promedioGeneral + promedio2;
    	}
        promedioGeneral = promedioGeneral / 5;
    	System.out.println("Promedio general: "+ promedioGeneral);
                break;
        ////////////////////CASO 4/////////////////////    
        case 4:
              double promedioGrupal = 0;

    	for(int i=0; i<n; i++) {
        	int j;
        	for (j = 1; j < 6; j++) {
            	System.out.println("Notas " + calif[i][j]);
            	suma = suma + calif[i][j];
        	}
                double promedio2;
               
        	promedio2 = suma / 5;
        	System.out.println("El promedio del grupo: " + (i+1) + " es:" + promedio2);
        	suma = 0;
                
        	promedioGrupal = promedioGrupal + promedio2;
    	}
        promedioGrupal = promedioGrupal / 5;
    	//System.out.println("Promedio grupal: "+ promedioGrupal);
                break;
        ////////////////////CASO 5/////////////////////   
        case 5:
                break;
        ////////////////////CASO 6/////////////////////    
        case 6:

                break;
               
            case 7:
           break;

            case 8:
                 
       
       
        for (int i = 0; i <= n; i++) {
            int j;
            nota = suma;
           
        	for (j = 1; j < 6; j++) {
            	suma = suma + calif[i][j];  
            calif[i][j] = sn.nextDouble();
             mayor = calif[i][j];
             menor = calif[i][j];
            if (nota > mayor){  // se compara la nota con la mayor y con la menor actual
                mayor = nota;
            } else if (nota < menor) {
                menor = nota;
            }
             System.out.println("La menor nota ha sido un " + menor);
             break;
        }
       
                break;
        }

    }
    }}
