/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author molle
 */
public class ContaEspecial extends ContaBancaria {

    private double limiteCredito;

    public ContaEspecial(double limiteCredito, String numero, double saldo, Cliente titular) {
        super(numero, saldo, titular);
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        if (limiteCredito <= 0) {
            throw new IllegalArgumentException("Limite de crédito inválido");
        }
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void sacar(double valor) {
        if (limiteCredito + getSaldo() < valor) {
            throw new IllegalArgumentException("Não há limite para realizar esse saque");
        }
        setSaldo(getSaldo() - valor);
    }

}
