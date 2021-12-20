import java.util.*;
import java.io.*;

public class Questao1 {

  public static void main(String args[]) throws IOException {

    System.out.println("Informe o arquivo com os dados: ");
    Scanner input = new Scanner(System.in);
    String value = input.next();

    FileInputStream stream = new FileInputStream(value);
    InputStreamReader reader = new InputStreamReader(stream);
    BufferedReader br = new BufferedReader(reader);

    Pessoa jon = new Pessoa(br.readLine(), br.readLine(), br.readLine());
    Pessoa sansa = new Pessoa("Sansa Stark", "Ned Stark", "Catelyn Stark");

    if (jon.saoIrmaos(sansa)) {
      System.out.println("Sao irmaos");
    } else {
      System.out.println("Nao sao irmaos");
    }

  }

}

class Pessoa {

  private String nome;
  private String pai;
  private String mae;

  public Pessoa(String n, String p, String m) {
    nome = n;
    pai = p;
    mae = m;
  }

  public Pessoa(String n) {
    nome = n;
    pai = null;
    mae = null;
    // pai = '';
    // mae = '';
  }

  public String getNome() {
    return nome;
  }

  public String getPai() {
    return pai;
  }

  public String getMae() {
    return mae;
  }

  public void setNome(String n) {
    nome = n;
  }

  public void setPai(String p) {
    pai = p;
  }

  public void setMae(String m) {
    mae = m;
  }

  // Nesse método meio-irmãos não são considerados como irmãos
  public boolean saoIrmaos(Pessoa fulano) {
    if ((fulano.getPai() == this.pai) && (fulano.getMae() == this.mae)) {
      return true;
    } else {
      return false;
    }
  }

}
