package br.edu.ifpe.garanhuns.infoco.dominio;

/**
 * Created by lucas on 09/07/16.
 */
public enum DiaDaSemana {
    DOMINGO(1),SEGUNDA(2),TERCA(3),QUARTA(4),QUINTA(5),SEXTA(6),SABADO(7);

    // segue o padrão do Calendar https://developer.android.com/reference/java/util/Calendar.html
    // o dia contando o domingo como 1o, a segunda como 2o etc
    private int dia;

    DiaDaSemana(int dia) {
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }
}
