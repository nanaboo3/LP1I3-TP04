/*

Enunciado:
        1. Construir a classe Data, conforme especificação
        abaixo, este exercício comporá a avaliação final, portanto será obrigatória sua
        elaboração para a prova final.

Nomes:
        Marcelo Modesto de Lima Junior
        Luciana da Silva Costa
*/

import java.text.ParseException;
import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.time.Year;

public class Data {
    private int dia,
                mes,
                ano;
    private Scanner scan = new Scanner(System.in);
    private Date data = new Date();
    private Calendar calendario = Calendar.getInstance();
    private String dataInserida;
    private static DateFormat formato1 = new SimpleDateFormat("dd-MM-yyyy");
    private static DateFormat formato2 = new SimpleDateFormat("dd-MMMM-yyyy");

    public Data(){
        System.out.println("Digite uma data VÁLIDA:\n");
        while(true){
            entraDia();
            entraMes();
            entraAno();

            dataInserida = dia+"-"+mes+"-"+ano;

            if(validaData(dataInserida)){
                data.setDate(dia);
                data.setMonth(mes-1);
                data.setYear(ano-1900);
                calendario.setTime(data);
                break;
            }
            System.out.println("ERRO: Digite uma data que seja válida.");
        }
    }

    public Data(int d, int m, int a){
        dataInserida = d+"-"+m+"-"+a;

        if(!(validaData(dataInserida))){
           dia = 1;
           mes = 1;
           ano = 2000;
        } else{
            entraDia(d);
            entraMes(m);
            entraAno(a);
        }
        data.setDate(dia);
        data.setMonth(mes-1);
        data.setYear(ano-1900);
        calendario.setTime(data);
    }

    public void entraDia(int d){dia = d;}
    public void entraMes(int m){mes = m;}
    public void entraAno(int a){ano = a;}

    public void entraDia(){
        System.out.print("dia: ");
        dia = scan.nextInt();
    }

    public void entraMes(){
        System.out.print("mês: ");
        mes = scan.nextInt();
    }

    public void entraAno(){
        System.out.print("ano: ");
        ano = scan.nextInt();
    }

    public int retDia(){return dia;}
    public int retMes(){return mes;}
    public int retAno(){return ano;}
    public String mostra1(){return formato1.format(data);}
    public String mostra2(){return formato2.format(data);}
    public boolean bissexto(){return Year.of(calendario.get(Calendar.YEAR)).isLeap();}
    public int diasTranscorridos(){return calendario.get(Calendar.DAY_OF_YEAR);}

    public static void apresentaDataAtual(){
        Date dataAtual = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(dateFormat.format(dataAtual));
    }

    public static boolean validaData(String dt)
    {
        try {
            formato1.setLenient(false);
            formato1.parse(dt);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
