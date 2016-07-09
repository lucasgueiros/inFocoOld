package br.edu.ifpe.garanhuns.infoco.dominio;

/**
 *
 * Esse é um horário de aula. Ele indica algo do tipo:
 * Toda segunda-feira às 15h30 terá aula da disciplina de Língua Porguesa III
 *
 * Estou com dúvidas de
 *
 * Created by lucas on 09/07/16.
 */
public class Horario {

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



}
