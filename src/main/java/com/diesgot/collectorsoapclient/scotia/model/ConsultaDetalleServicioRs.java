package com.diesgot.collectorsoapclient.scotia.model;

public class ConsultaDetalleServicioRs {

	private String tipoServicio;
	private String numeroDocumento;
	private String referenciaDeuda;
	private String fechaVencimiento;
	private String importeMinimo;
	private String importeTotal;

	public ConsultaDetalleServicioRs() {
		super();
	}

	public String getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getReferenciaDeuda() {
		return referenciaDeuda;
	}

	public void setReferenciaDeuda(String referenciaDeuda) {
		this.referenciaDeuda = referenciaDeuda;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getImporteMinimo() {
		return importeMinimo;
	}

	public void setImporteMinimo(String importeMinimo) {
		this.importeMinimo = importeMinimo;
	}

	public String getImporteTotal() {
		return importeTotal;
	}

	public void setImporteTotal(String importeTotal) {
		this.importeTotal = importeTotal;
	}

}
