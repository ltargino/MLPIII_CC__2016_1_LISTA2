import java.util.Calendar;

public class Data {
	private int dia;
	private int mes;
	private int ano;

	public Data() {
	}
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data(int dia, int mes) {
		this.dia = dia;
		this.mes = mes;
		this.ano = Calendar.getInstance().get(Calendar.DAY_OF_YEAR);
	}
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if (dia < 1 || dia > 31){
			System.out.println("Dia inválido.");
		}else{
			this.dia = dia;
		}
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if (mes < 1 || mes > 12){
			System.out.println("Mes inválido.");
		}else{
			this.mes = mes;
		}
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (ano < 1 || ano > 9999){
			System.out.println("Ano inválido.");
		}else{
			this.ano = ano;
		}
	}

	public String toString() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}