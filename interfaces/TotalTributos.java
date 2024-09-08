package interfaces;

public class TotalTributos {
	private Double totalGeral = 0.0;

	public Double getTotalGeral() {
		return totalGeral;
	}

	public void setTotalGeral(Double totalGeral) {
		this.totalGeral = totalGeral;
	}
	
	public void totalizarTributos(Tributos t) {
		totalGeral = totalGeral + t.calcularIR() + t.calcularICMS();
	}
}
