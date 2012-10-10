
package TrabajandoMetodos;

public class materia {

    public String nombreMateria;
    public String creditos;
    public String aula;
    public String dia;

    public materia(String nombreMateria, String creditos, String aula, String dia) {
        this.nombreMateria = nombreMateria;
        this.creditos = creditos;
        this.aula = aula;
        this.dia = dia;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }
    
    
    
}
