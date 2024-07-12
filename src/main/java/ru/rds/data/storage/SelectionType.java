package ru.rds.data.storage;

/**
 * Способ комбинации условий для отбора Элементов ({@link Element})
 *
 * @author RDS
 * @version 1
 * @since 1.0.0
 */
public enum SelectionType {
	/**
	 * Эквивалент логическому "И"
	 */
	AND,

	/**
	 * Эквивалент логическому "ИЛИ"
	 */
	OR
}
