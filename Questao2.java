import java.util.*;
import java.io.*;

public class Questao2 {
  public static void main(String args[]) throws IOException {
    System.out.println("Informe o arquivo com os dados: ");
    Scanner input = new Scanner(System.in);
    String value = input.next();

    FileInputStream stream = new FileInputStream(value);
    InputStreamReader reader = new InputStreamReader(stream);
    BufferedReader br = new BufferedReader(reader);

    String StrMarchas = br.readLine();
    String StrBagageiro = br.readLine();
    int marchas = Integer.parseInt(StrMarchas);
    boolean bagageiro = Boolean.parseBoolean(StrBagageiro);

    Bicicleta caloiCrossBraba = new Bicicleta();
    caloiCrossBraba.setNumMarchas(marchas);
    caloiCrossBraba.setBagageiro(bagageiro);
    caloiCrossBraba.setMarca("Caloi Cross");
    caloiCrossBraba.setModelo("Braba");
    caloiCrossBraba.setQtdRodas(2);
    caloiCrossBraba.acelerar(4);
    caloiCrossBraba.frear(1);
    caloiCrossBraba.imprimirInformacoes();

  }
}

class Veiculo {
  private String marca;
  private int qtdRodas;
  private String modelo;
  private int velocidade = 0;

  public String getMarca() {
    return marca;
  }

  public int getQtdRodas() {
    return qtdRodas;
  }

  public String getModelo() {
    return modelo;
  }

  public int getVelocidade() {
    return velocidade;
  }

  public void setMarca(String m) {
    marca = m;
  }

  public void setQtdRodas(int r) {
    qtdRodas = r;
  }

  public void setModelo(String m) {
    modelo = m;
  }

  public void setVelocidade(int v) {
    velocidade = v;
  }

  public void imprimirInformacoes() {
    System.out.println("marca " + marca);
    System.out.println("qtdRodas " + qtdRodas);
    System.out.println("modelo " + modelo);
    System.out.println("velocidade " + velocidade);
  }

  public void acelerar(int valor) {
    velocidade += valor;
  }

  public void frear(int valor) {
    velocidade -= valor;
  }

}

class Automovel extends Veiculo {
  private double potencialDoMotor;

  public double getPotencialDoMotor() {
    return potencialDoMotor;
  }

  public void setPotencialDoMotor(double p) {
    potencialDoMotor = p;
  }

  public void imprimirInformacoes() {
    System.out.println("marca " + getMarca());
    System.out.println("qtdRodas " + getQtdRodas());
    System.out.println("modelo " + getModelo());
    System.out.println("velocidade " + getVelocidade());
    System.out.println("Potencial do motor " + potencialDoMotor);
  }

}

class Carro extends Automovel {
  private int qtdPortas;

  public int getQtdPortas() {
    return qtdPortas;
  }

  public void setQtdPortas(int q) {
    qtdPortas = q;
  }

  public void imprimirInformacoes() {
    System.out.println("marca " + getMarca());
    System.out.println("qtdRodas " + getQtdRodas());
    System.out.println("modelo " + getModelo());
    System.out.println("velocidade " + getVelocidade());
    System.out.println("Quant Portas " + qtdPortas);
  }
}

class Moto extends Automovel {
  private boolean partidaEletrica;

  public boolean getPartidaEletrica() {
    return partidaEletrica;
  }

  public void setPartidaEletrica(boolean q) {
    partidaEletrica = q;
  }

  public void imprimirInformacoes() {
    System.out.println("marca " + getMarca());
    System.out.println("qtdRodas " + getQtdRodas());
    System.out.println("modelo " + getModelo());
    System.out.println("velocidade " + getVelocidade());
    System.out.println("Partida eletrica " + partidaEletrica);
  }
}

class Bicicleta extends Veiculo {
  private int numMarchas;
  private boolean bagageiro;

  public int getNumMarchas() {
    return numMarchas;
  }

  public void setNumMarchas(int q) {
    numMarchas = q;
  }

  public boolean getBagageiro() {
    return bagageiro;
  }

  public void setBagageiro(boolean q) {
    bagageiro = q;
  }

  public void imprimirInformacoes() {
    System.out.println("marca " + getMarca());
    System.out.println("qtdRodas " + getQtdRodas());
    System.out.println("modelo " + getModelo());
    System.out.println("velocidade " + getVelocidade());
    System.out.println("Num. marchas " + numMarchas);
    System.out.println("Bagageiro " + bagageiro);
  }
}

/*
 * System.out.println("marca" + getMarca());
 * System.out.println("qtdRodas" + getQtdRodas());
 * System.out.println("modelo" + getModelo());
 * System.out.println("velocidade" + getVelocidade());
 */