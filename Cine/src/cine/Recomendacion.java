
package cine;


public class Recomendacion {
    
    public String RecomendarPel(int edad){
        
        int categoriaEdad;
        
        if (edad < 7) {
            categoriaEdad = 1; 
        } else if (edad >= 7 && edad <= 17) {
            categoriaEdad = 2; 
        } else if (edad >= 18 && edad <= 30) {
            categoriaEdad = 3; 
        } else {
            categoriaEdad = 4; 
        }

        switch (categoriaEdad) {
            case 1:
                return "Recomendación: Películas animadas y educativas que además son aptas para todas las edades.";
            case 2:
                return "Recomendación: Películas adecuadas para la familia como animaciones, aventuras y comedias familiares.";
            case 3:
                return "Recomendación: Películas con estilo de acción, drama, comedia y ciencia ficción.";
            case 4:
                return "Recomendación: Películas clásicas y dramas.";
            default:
                return "Edad no válida";
        }
    }
}