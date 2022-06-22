/*

Enunciado:
        2. Agora, desenvolva um programa capaz de testar a classe e os métodos desenvolvidos no
        exercício anterior.

Nomes:
        Marcelo Modesto de Lima Junior
        Luciana da Silva Costa
*/
public class TestaData {
    public static void main(String[] args) {
        System.out.println();
        Data.apresentaDataAtual();
        System.out.println("-------------------------------------------");
        Data data1 = new Data(31,10,2000);
        System.out.println("dia: "+data1.retDia());
        System.out.println("mês: "+data1.retMes());
        System.out.println("ano: "+data1.retAno());
        System.out.println("(dd/MM/aaaa): "+data1.mostra1());
        System.out.println("(dd/MMMM/aaaa): "+data1.mostra2());
        System.out.println("Dias transcorridos no ano: "+data1.diasTranscorridos());
        System.out.print("É ano bissexto?");
        System.out.println(data1.bissexto() ? " SIM" : " NÃO");
        System.out.println("-------------------------------------------");
        Data data2 = new Data();
        System.out.println("(dd/MM/aaaa): "+data2.mostra1());
        System.out.println("(dd/MMMM/aaaa): "+data2.mostra2());
        System.out.println("Dias transcorridos no ano: "+data2.diasTranscorridos());
        System.out.print("É ano bissexto?");
        System.out.println(data2.bissexto() ? " SIM" : " NÃO");
        System.out.println("\n");
    }
}
