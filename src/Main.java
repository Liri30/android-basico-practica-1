public class Main {
    public static void main(String[] args) {
        Estudiante[] estudiantes = {
                new Estudiante("Juan",24),
                new Estudiante("Erica",20),
                new Estudiante("Emilio",23),
                new Estudiante("Karina",21),
                new Estudiante("Eduardo",24),
                new Estudiante("Tomas",25),

        };

       int total = estudiantes.length, prom=0;

       for (int i=0;i<estudiantes.length;i++){
           for (int j=0;j<estudiantes.length-1;j++){
               if (estudiantes[j].getEdad()>estudiantes[j+1].getEdad()){
                   Estudiante tmp = estudiantes[j+1];
                   estudiantes[j+1]=estudiantes[j];
                   estudiantes[j]=tmp;
               }
           }
       }

        for (Estudiante p :estudiantes) {
           prom+=p.getEdad();

        }
        prom/=total;
        System.out.println("********************************************************************************\n");
        System.out.println("EL total de estudiantes es: "+total);
        System.out.println("La edad minima es: "+estudiantes[0].getEdad());
        System.out.println("La edad maxima es: "+estudiantes[total-1].getEdad());
        System.out.println("La edad promedio es: "+prom);
        System.out.println("********************************************************************************\n");
        System.out.println("Los estudiantes son: ");
        for (Estudiante p: estudiantes) {
            System.out.println(p.getNombre()+" "+p.getEdad()+" años");

        }




        }


    }
