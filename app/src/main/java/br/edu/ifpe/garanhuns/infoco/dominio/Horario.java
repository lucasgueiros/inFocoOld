package br.edu.ifpe.garanhuns.infoco.dominio;

import br.edu.ifpe.garanhuns.infoco.dados.genericos.Persistivel;

/**
 *
 * Esse é um horário de aula. Ele indica algo do tipo:
 * Toda segunda-feira às 15h30 terá aula da disciplina de Língua Porguesa III
 *
 * Estou com dúvidas de
 *
 * Created by lucas on 09/07/16.
 */
public class Horario implements Persistivel {

    // Atributos
    // Essa classe tem os seguinte atributos:
    // um número inteiro para identificar cada instância
    private int id;
    // um dia da semana eg segunda-feira
    private DiaDaSemana dia;
    // a hora do dia
    private int hora;
    // o minuto exato!
    private int minuto;
    // estou usando esses dois atributos por correspondência com o TimePicker do android.
    // https://developer.android.com/reference/android/widget/TimePicker.html
    // e a disciplina da aula
    private Disciplina disciplina;
    // por enquanto tô fazendo assim
    // mas depois podem ter horário que NÃO se referem a nenhuma disciplina como aula
    // por exemplo uma reunião de projeto.


    public Horario(int id, DiaDaSemana dia, int hora, int minuto, Disciplina disciplina) {
        this.id = id;
        this.dia = dia;
        this.hora = hora;
        this.minuto = minuto;
        this.disciplina = disciplina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DiaDaSemana getDia() {
        return dia;
    }

    public void setDia(DiaDaSemana dia) {
        this.dia = dia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Horario horario = (Horario) o;

        if (getId() != horario.getId()) return false;
        if (getHora() != horario.getHora()) return false;
        return getMinuto() == horario.getMinuto() && getDia() == horario.getDia();

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getDia().hashCode();
        result = 31 * result + getHora();
        result = 31 * result + getMinuto();
        return result;
    }

    @Override
    public String toString() {
        return "Horario{" +
                "id=" + id +
                ", dia=" + dia +
                ", hora=" + hora +
                ", minuto=" + minuto +
                '}';
    }
}
