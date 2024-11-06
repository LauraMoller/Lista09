/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Model;

/**
 *
 * @author molle
 */
public class ContaBancaria {

    private String numero;
    private double saldo;
    private Cliente titular;

    public ContaBancaria(String numero, double saldo, Cliente titular) {
        setNumero(numero);
        setSaldo(saldo);
        setTitular(titular);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if (numero.isBlank()) {
            throw new IllegalArgumentException("Não foi informado um número válido");
        }
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        if (titular == null) {
            throw new IllegalArgumentException("O titular precisa ser informado");
        }
        this.titular = titular;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor à depositar deve ser maior do que 0");
        }
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > saldo || valor <= 0) {
            throw new IllegalArgumentException("Não possível realizar o saque para esse valor");
        }
        saldo -= valor;
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        if (contaDestino == null) {
            throw new IllegalArgumentException("A conta destino não é válida");
        }
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}
