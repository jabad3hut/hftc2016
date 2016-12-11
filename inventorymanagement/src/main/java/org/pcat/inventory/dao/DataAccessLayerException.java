package org.pcat.inventory.dao;

public class DataAccessLayerException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -434131840233270358L;

	public DataAccessLayerException() {
	}

	public DataAccessLayerException(String message) {
		super(message);
	}

	public DataAccessLayerException(Throwable cause) {
		super(cause);
	}

	public DataAccessLayerException(String message, Throwable cause) {
		super(message, cause);
	}
}