package ru.rds.data.storage.exceptions;

import ru.rds.data.storage.Storage;

/**
 * Общее исключение, которое может возникнуть при работе с Хранилищем ({@link Storage})
 *
 * @author RDS
 * @version 1
 * @since 1.0.0
 */
public class StorageException extends RuntimeException {

	public StorageException(String message) {
		super(message);
	}

	public StorageException(String message, Throwable cause) {
		super(message, cause);
	}

	public StorageException(Throwable cause) {
		super(cause);
	}

	public StorageException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
