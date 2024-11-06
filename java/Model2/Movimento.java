/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model2;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author molle
 */
public class Movimento {
    private double valor;
    private TipoMovimento tipoMovimento;
    private LocalDate data;
    private LocalTime hora;

    public Movimento(double valor, TipoMovimento tipoMovimento) {
        setValor(valor);
        setTipoMovimento(tipoMovimento);
        setData(LocalDate.now());
        setHora(LocalTime.now());
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(valor <= 0){
            throw new IllegalArgumentException ("As movimentações só serão feitas com valores acima de zero");
        }
        this.valor = valor;
    }

    public TipoMovimento getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(TipoMovimento tipoMovimento) {
        if(tipoMovimento == null){
            throw new IllegalArgumentException ("Não foi informado um tipo válido de movimentação");
        }
        this.tipoMovimento = tipoMovimento;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    
    
}
