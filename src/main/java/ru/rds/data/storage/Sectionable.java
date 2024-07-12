package ru.rds.data.storage;

import java.util.List;

/**
 * Тип параметра при получении {@link Section}, который позволяет определить критерии для получения
 *
 * @author RDS
 * @version 1
 * @since 1.0.0
 */
public interface Sectionable {

	/**
	 * Получение номера требуемой Секции ({@link Section})
	 *
	 * @return
	 */
	int getSectionNumber();

	/**
	 * Получение размера требуемой Секции ({@link Section})
	 *
	 * @return
	 */
	int getSectionSize();

	/**
	 * Получение перечня сортировок, которые нужно применить при получении Секции ({@link Section})
	 *
	 * @return
	 */
	List<ElementsSort> getSort();

	/**
	 * Получение перечня условий для отбора Элементов Секции ({@link Section})
	 *
	 * @return
	 */
	List<ElementsSelectionCondition> getElementsSelectionConditions();

	/**
	 * Получение типа совмещения условий для отбора Элементов
	 *
	 * @return
	 */
	SelectionType getSelectionType();

}
