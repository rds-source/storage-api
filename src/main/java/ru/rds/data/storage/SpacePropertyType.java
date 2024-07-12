package ru.rds.data.storage;

/**
 * Тип Свойства ({@link SpaceProperty})
 *
 * @author RDS
 * @version 1
 * @since 1.0.0
 */
public interface SpacePropertyType {

	/**
	 * Возвращает числовое представление кода типа свойства
	 *
	 * @return
	 */
	Integer getTypeCode();

	/**
	 * Возвращает строковое представление типа свойства
	 *
	 * @return
	 */
	String getTypeName();

	/**
	 * Является или нет бинарным
	 *
	 * @return
	 */
	boolean isBinary();

	/**
	 * Является или нет числовым
	 *
	 * @return
	 */
	boolean isNumeric();

	/**
	 * Является или нет true или false
	 *
	 * @return
	 */
	boolean isBoollable();

	/**
	 * Является ли символьным
	 *
	 * @return
	 */
	boolean isCharacters();

	/**
	 * Является ли датой/временем
	 *
	 * @return
	 */
	boolean isDateTime();

	/**
	 * Обладает ли размером
	 *
	 * @return
	 */
	boolean isSizeable();

}
