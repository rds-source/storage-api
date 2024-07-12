package ru.rds.data.storage.exceptions;

import ru.rds.data.storage.Space;

/**
 * Общее исключение, которое может возникнуть при работе с Пространством ({@link Space})
 *
 * @author RDS
 * @version 1
 * @since 1.0.0
 */
public class SpaceException extends RuntimeException {

	public SpaceException(String message) {
		super(message);
	}

	public SpaceException(String message, Throwable cause) {
		super(message, cause);
	}

	public SpaceException(Throwable cause) {
		super(cause);
	}

	public SpaceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
