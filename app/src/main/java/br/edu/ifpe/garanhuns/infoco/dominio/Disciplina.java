package br.edu.ifpe.garanhuns.infoco.dominio;

/**
 *
 * Esta classe representa uma disciplina, por exemplo: Português III.
 *
 * Created by lucas on 09/07/16.
 */
public class Disciplina {

    // Atributos:
    // Esta classe tem os seguintes atributos:
    // um número para identificar cada instância eg "32"
    private int id;
    // um texto, o nome da disciplina eg "Português 3"
    private String disciplina;

    //  não é muito bom ter isso não, por enquanto
    // public Disciplina() {}

    public Disciplina(int id, String disciplina) {
        this.id = id;
        this.disciplina = disciplina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Disciplina that = (Disciplina) o;

        if (id != that.id) return false;
        return disciplina.equals(that.disciplina);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + disciplina.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "id=" + id +
                ", disciplina='" + disciplina + '\'' +
                '}';
    }

}
