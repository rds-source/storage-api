package ru.rds.data.storage;

import java.util.List;

/**
 * Секция (группа, часть, страница и т.п.) - это абстрактное представление группы объектов, обладающих некими схожими признаками
 *
 * @param <T> любой тип
 * @author RDS
 * @version 1
 * @since 1.0.0
 */
public interface Section<T> {

	/**
	 * Получение номера Секции
	 *
	 * @return
	 */
	int getSectionNumber();

	/**
	 * Получение максимального размера Секции
	 *
	 * @return
	 */
	int getSectionSize();

	/**
	 * Получение количества всех возможных Секций (это количество базируется на общем количестве объектов и размере одной Секции)
	 *
	 * @return
	 */
	default int getSectionsCount() {
		return (int) Math.ceil((float) getTotalElementsCount() / getSectionSize());
	}

	/**
	 * Получение общего количества Элементов (объектов), из которых сформирована Секция
	 *
	 * @return
	 */
	long getTotalElementsCount();

	/**
	 * Получение содержимого Секции
	 *
	 * @return
	 */
	List<T> getElements();

	/**
	 * Содержит или нет элементы данная Секция
	 *
	 * @return
	 */
	boolean hasElements();

	/**
	 * Получение заданных Сортировок при формировании Секции
	 *
	 * @return
	 * @see ElementsSort
	 */
	List<ElementsSort> getSort();

	/**
	 * Получение условий для выбора Элементов (объектов) при формировании Секции
	 *
	 * @return
	 * @see ElementsSelectionCondition
	 */
	List<ElementsSelectionCondition> getElementsSelectionConditions();

	/**
	 * Получение типа условия выбора Элементов (объектов) при формировании Секции
	 *
	 * @return
	 * @see SelectionType
	 */
	SelectionType getSelectionType();

}
