package ru.rds.data.storage;

import java.util.Collections;
import java.util.List;

/**
 * Реализауия базовых механизмов {@link Sectionable}
 *
 * @author RDS
 * @version 1
 * @since 1.0.0
 */
public class StorageSectionable implements Sectionable {

	// Номер Секции
	private int                              sectionNumber;
	// Размер Секции
	private int                              sectionSize;
	// Список сортировок Элементов
	private List<ElementsSort>               sort                        = Collections.emptyList();
	// Список условий для отбора Элементов
	private List<ElementsSelectionCondition> elementsSelectionConditions = Collections.emptyList();
	// Способ комбинации условий для отбора Элементов
	private SelectionType                    selectionType               = SelectionType.AND;

	public StorageSectionable(int sectionSize) {
		this.sectionSize = sectionSize;
	}

	public StorageSectionable(int sectionNumber, int sectionSize) {
		this.sectionNumber = sectionNumber;
		this.sectionSize = sectionSize;
	}

	@Override
	public int getSectionNumber() {
		return sectionNumber;
	}

	public StorageSectionable setSectionNumber(int sectionNumber) {
		this.sectionNumber = sectionNumber;
		return this;
	}

	@Override
	public int getSectionSize() {
		return sectionSize;
	}

	public StorageSectionable setSectionSize(int sectionSize) {
		this.sectionSize = sectionSize;
		return this;
	}

	@Override
	public List<ElementsSort> getSort() {
		return sort;
	}

	public StorageSectionable setSort(List<ElementsSort> sort) {
		this.sort = sort;
		return this;
	}

	public StorageSectionable addSort(ElementsSort sort) {
		if (sort != null) {
			getSort().add(sort);
		}
		return this;
	}

	@Override
	public List<ElementsSelectionCondition> getElementsSelectionConditions() {
		return elementsSelectionConditions;
	}

	public StorageSectionable setElementsSelectionConditions(List<ElementsSelectionCondition> elementsSelectionConditions) {
		this.elementsSelectionConditions = elementsSelectionConditions;
		return this;
	}

	public StorageSectionable addElementsSelectionCondition(ElementsSelectionCondition elementsSelectionCondition) {
		if (elementsSelectionCondition != null) {
			getElementsSelectionConditions().add(elementsSelectionCondition);
		}
		return this;
	}

	@Override
	public SelectionType getSelectionType() {
		return this.selectionType;
	}

	public StorageSectionable setSelectionType(SelectionType selectionType) {
		this.selectionType = selectionType;
		return this;
	}

}
