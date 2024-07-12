package ru.rds.data.storage;

import java.util.List;
import ru.rds.data.storage.exceptions.SpaceException;
import ru.rds.data.storage.exceptions.StorageException;

/**
 * Пространство - это абстрактное представление физического или логического устройства (места, объекта и т.п.), которое состоит из Элементов ({@link Element}).
 * <p>
 * На основе данного представления можно реализовать различные виды Пространств - например, любая таблица Базы Данных, либо директория (папка) в файловой системе. Конкретная реализация зависит только лишь от воображения.
 *
 * @param <SPACE_PROPERTY> тип, описывающий Свойство ({@link SpaceProperty}) Пространства
 * @param <ELEMENT>        тип, описывающий Элемент ({@link Element}) Пространства
 * @param <SECTION>        тип, описывающий группу (секцию, срез, страницу) Элементов ({@link Element}) Пространства
 * @author RDS
 * @version 1
 * @since 1.0.0
 */
public interface Space<SPACE_PROPERTY extends SpaceProperty, ELEMENT extends Element, SECTION extends Section<ELEMENT>> {

	/**
	 * Получение имени Пространства
	 *
	 * @return
	 */
	String getName();

	/**
	 * Получение дополнительного описания Пространства
	 *
	 * @return
	 */
	String getDescription();

	/**
	 * Является ли Пространство системным
	 *
	 * @return
	 */
	boolean isSystem();

	/**
	 * Получение всех Свойств ({@link SpaceProperty}) Пространства
	 *
	 * @return
	 */
	List<SPACE_PROPERTY> getProperties();

	/**
	 * Получение всех Элементов ({@link Element}) Пространства
	 *
	 * @return никогда не возвращает NULL
	 */
	default List<ELEMENT> getElements() {
		return getElements(null, null, null, 0, 0);
	}

	/**
	 * Получение Элементов ({@link Element}) Пространства в соответствии с заданными критериями
	 *
	 * @param offset смещение (количество Элементов ({@link Element}), которые нужно пропустить, начиная с самого первого в списке)
	 * @param limit  ограничение (максимальное количество Элементов ({@link Element}) в списке)
	 * @return никогда не возвращает NULL
	 */
	default List<ELEMENT> getElements(int offset, int limit) {
		return getElements(null, null, null, offset, limit);
	}

	/**
	 * Получение всех Элементов ({@link Element}) Пространства
	 *
	 * @param elementsSorts перечень сортировок Элементов ({@link Element})
	 * @return никогда не возвращает NULL
	 */
	default List<ELEMENT> getElements(List<ElementsSort> elementsSorts) {
		return getElements(elementsSorts, null, null, 0, 0);
	}

	/**
	 * Получение Элементов ({@link Element}) Пространства в соответствии с заданными критериями
	 *
	 * @param elementsSorts перечень сортировок Элементов ({@link Element})
	 * @param offset        смещение (количество Элементов ({@link Element}), которые нужно пропустить, начиная с самого первого в списке)
	 * @param limit         ограничение (максимальное количество Элементов ({@link Element}) в списке)
	 * @return никогда не возвращает NULL
	 */
	default List<ELEMENT> getElements(List<ElementsSort> elementsSorts, int offset, int limit) {
		return getElements(elementsSorts, null, null, offset, limit);
	}

	/**
	 * Получение Элементов ({@link Element}) Пространства в соответствии с заданными критериями
	 *
	 * @param selectionConditions перечень условий для отбора Элементов ({@link Element})
	 * @param selectionType       тип применения условий отбора ({@link SelectionType#AND} или {@link SelectionType#OR})
	 * @return никогда не возвращает NULL
	 */
	default List<ELEMENT> getElements(List<ElementsSelectionCondition> selectionConditions, SelectionType selectionType) {
		return getElements(null, selectionConditions, selectionType, 0, 0);
	}

	/**
	 * Получение Элементов ({@link Element}) Пространства в соответствии с заданными критериями
	 *
	 * @param selectionConditions перечень условий для отбора Элементов ({@link Element})
	 * @param selectionType       тип применения условий отбора ({@link SelectionType#AND} или {@link SelectionType#OR})
	 * @param offset              смещение (количество Элементов ({@link Element}), которые нужно пропустить, начиная с самого первого в списке)
	 * @param limit               ограничение (максимальное количество Элементов ({@link Element}) в списке)
	 * @return
	 */
	default List<ELEMENT> getElements(List<ElementsSelectionCondition> selectionConditions, SelectionType selectionType, int offset, int limit) {
		return getElements(null, selectionConditions, selectionType, offset, limit);
	}

	/**
	 * Получение Элементов ({@link Element}) Пространства в соответствии с заданными критериями
	 *
	 * @param elementsSorts       перечень сортировок Элементов ({@link Element})
	 * @param selectionConditions перечень условий для отбора Элементов ({@link Element})
	 * @param selectionType       тип применения условий отбора ({@link SelectionType#AND} или {@link SelectionType#OR})
	 * @return никогда не возвращает NULL
	 */
	default List<ELEMENT> getElements(List<ElementsSort> elementsSorts, List<ElementsSelectionCondition> selectionConditions, SelectionType selectionType) {
		return getElements(elementsSorts, selectionConditions, selectionType, 0, 0);
	}

	/**
	 * Получение Элементов ({@link Element}) Пространства в соответствии с заданными критериями
	 *
	 * @param elementsSorts       перечень сортировок Элементов ({@link Element})
	 * @param selectionConditions перечень условий для отбора Элементов ({@link Element})
	 * @param selectionType       тип применения условий отбора ({@link SelectionType#AND} или {@link SelectionType#OR})
	 * @param offset              смещение (количество Элементов ({@link Element}), которые нужно пропустить, начиная с самого первого в списке)
	 * @param limit               ограничение (максимальное количество Элементов ({@link Element}) в списке)
	 * @return никогда не возвращает NULL
	 */
	List<ELEMENT> getElements(List<ElementsSort> elementsSorts, List<ElementsSelectionCondition> selectionConditions, SelectionType selectionType, int offset, int limit);

	/**
	 * Получение группы (секции, части) Элементов ({@link Element}) Пространства в соответствии с заданными критериями
	 *
	 * @param sectionable критерии для получения группы (секции, части)
	 * @return
	 */
	SECTION getSection(Sectionable sectionable);

	/**
	 * Получение количества всех Элементов ({@link Element}) Пространства
	 *
	 * @return
	 */
	default long getElementsCount() {
		return getElementsCount(null, null);
	}

	/**
	 * Получение количества Элементов ({@link Element}) Пространства в соответствии с заданными критериями
	 *
	 * @param selectionConditions перечень условий для отбора Элементов ({@link Element})
	 * @param selectionType       тип применения условий отбора ({@link SelectionType#AND} или {@link SelectionType#OR})
	 * @return
	 */
	long getElementsCount(List<ElementsSelectionCondition> selectionConditions, SelectionType selectionType);

	/**
	 * Создание нового Элемента ({@link Element}) в Пространстве
	 *
	 * @param element объект Элемента ({@link Element}), который нужно будет создать в Пространстве
	 * @return
	 * @throws StorageException возникает в случае возникновения непредвиденных обстоятельств при работе с Хранилищем ({@link Storage})
	 * @throws SpaceException   возникает в случае возникновения непредвиденных обстоятельств при работе с Пространством
	 */
	ELEMENT createElement(ELEMENT element);

	/**
	 * Обновление данных Элементов ({@link Element}) в Пространстве
	 *
	 * @param element             объект Элемента ({@link Element}), данные которого нужно присвоить другим Элементам ({@link Element}) в Пространстве
	 * @param selectionConditions перечень условий для отбора Элементов ({@link Element}), в которых нужно будет обновить данные
	 * @return
	 * @throws StorageException возникает в случае возникновения непредвиденных обстоятельств при работе с Хранилищем ({@link Storage})
	 * @throws SpaceException   возникает в случае возникновения непредвиденных обстоятельств при работе с Пространством
	 */
	default ELEMENT updateElements(ELEMENT element, List<ElementsSelectionCondition> selectionConditions) {
		return updateElements(element, selectionConditions, SelectionType.AND);
	}

	/**
	 * Обновление данных Элементов ({@link Element}) в Пространстве
	 *
	 * @param element             объект Элемента ({@link Element}), данные которого нужно присвоить другим Элементам ({@link Element}) в Пространстве
	 * @param selectionConditions перечень условий для отбора Элементов ({@link Element}), в которых нужно будет обновить данные
	 * @param selectionType       тип применения условий отбора ({@link SelectionType#AND} или {@link SelectionType#OR})
	 * @return
	 * @throws StorageException возникает в случае возникновения непредвиденных обстоятельств при работе с Хранилищем ({@link Storage})
	 * @throws SpaceException   возникает в случае возникновения непредвиденных обстоятельств при работе с Пространством
	 */
	ELEMENT updateElements(ELEMENT element, List<ElementsSelectionCondition> selectionConditions, SelectionType selectionType);

	/**
	 * Удаление Элементов ({@link Element}) в Пространстве
	 *
	 * @param selectionConditions перечень условий для отбора Элементов ({@link Element}), которые нужно будет удалить
	 * @throws StorageException возникает в случае возникновения непредвиденных обстоятельств при работе с Хранилищем ({@link Storage})
	 * @throws SpaceException   возникает в случае возникновения непредвиденных обстоятельств при работе с Пространством
	 */
	default void deleteElements(List<ElementsSelectionCondition> selectionConditions) {
		deleteElements(selectionConditions, SelectionType.AND);
	}

	/**
	 * Удаление Элементов ({@link Element}) в Пространстве
	 *
	 * @param selectionConditions перечень условий для отбора Элементов ({@link Element}), которые нужно будет удалить
	 * @param selectionType       тип применения условий отбора ({@link SelectionType#AND} или {@link SelectionType#OR})
	 * @throws StorageException возникает в случае возникновения непредвиденных обстоятельств при работе с Хранилищем ({@link Storage})
	 * @throws SpaceException   возникает в случае возникновения непредвиденных обстоятельств при работе с Пространством
	 */
	void deleteElements(List<ElementsSelectionCondition> selectionConditions, SelectionType selectionType);

}
