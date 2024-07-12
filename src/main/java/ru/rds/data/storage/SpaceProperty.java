package ru.rds.data.storage;

/**
 * Свойство Пространства ({@link Space}) - это абстрактное представление описания части Пространства, которое будет свойственно всем его Элементам ({@link Element}).
 * <p>
 * Пространство лишь описывает набор своих Свойств, которыми должны обладать все Элементы этого Пространства, но значения этих Свойств содержаться в самих Элементах, при этом каждый Элемент имеет свои значения для этих Свойств.
 *
 * @param <SPACE_PROPERTY_TYPE>
 * @author RDS
 * @version 1
 * @since 1.0.0
 */
public interface SpaceProperty<SPACE_PROPERTY_TYPE extends SpacePropertyType> {

	/**
	 * Получение названия
	 *
	 * @return
	 */
	String getName();

	/**
	 * Получение дополнительного описания
	 *
	 * @return
	 */
	String getDescription();

	/**
	 * Получения типа Свойства
	 *
	 * @return
	 */
	SPACE_PROPERTY_TYPE getType();

	/**
	 * Получение размера (если Свойство имеет размерность)
	 *
	 * @return
	 */
	int getSize();

	/**
	 * Может или нет принимать значение NULL
	 *
	 * @return
	 */
	boolean isNullable();

	/**
	 * Получение порядкового номера среди других Свойств
	 *
	 * @return
	 */
	int getOrdinalPosition();

	/**
	 * Является ли это Свойство идентификатором
	 *
	 * @return
	 */
	boolean isPrimaryKey();

	/**
	 * Должно ли быть значение этого Свойства уникальным
	 *
	 * @return
	 */
	boolean isUnique();

}
