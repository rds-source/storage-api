package ru.rds.data.storage;

import java.util.Collections;
import java.util.List;

/**
 * Абстрактный класс, реализующий базовые механизмы Секции ({@link Section})
 *
 * @param <ELEMENT>
 * @author RDS
 * @version 1
 * @since 1.0.0
 */
public abstract class StorageSection<ELEMENT> implements Section<ELEMENT> {

	// Номер Секции
	private int                              sectionNumber;
	// Размер Секции
	private int                              sectionSize;
	// Общее количество элементов (вне Секции)
	private long                             totalElementsCount;
	// Элементы Секции
	private List<ELEMENT>                    elements                    = Collections.emptyList();
	// Список сортировок
	private List<ElementsSort>               sort                        = Collections.emptyList();
	// Список условий для выбора
	private List<ElementsSelectionCondition> elementsSelectionConditions = Collections.emptyList();
	// Тип комбинирования условий для выбора
	private SelectionType                    selectionType               = SelectionType.AND;

	@Override
	public int getSectionNumber() {
		return sectionNumber;
	}

	public StorageSection<ELEMENT> setSectionNumber(int sectionNumber) {
		this.sectionNumber = sectionNumber;
		return this;
	}

	@Override
	public int getSectionSize() {
		return sectionSize;
	}

	public StorageSection<ELEMENT> setSectionSize(int sectionSize) {
		this.sectionSize = sectionSize;
		return this;
	}

	@Override
	public long getTotalElementsCount() {
		return totalElementsCount;
	}

	public StorageSection<ELEMENT> setTotalElementsCount(long totalElementsCount) {
		this.totalElementsCount = totalElementsCount;
		return this;
	}

	@Override
	public List<ELEMENT> getElements() {
		return elements;
	}

	public StorageSection<ELEMENT> setElements(List<ELEMENT> elements) {
		this.elements = elements;
		return this;
	}

	@Override
	public boolean hasElements() {
		return !getElements().isEmpty();
	}

	@Override
	public List<ElementsSort> getSort() {
		return sort;
	}

	public StorageSection<ELEMENT> setSort(List<ElementsSort> sort) {
		this.sort = sort;
		return this;
	}

	@Override
	public List<ElementsSelectionCondition> getElementsSelectionConditions() {
		return elementsSelectionConditions;
	}

	public StorageSection<ELEMENT> setElementsSelectionConditions(List<ElementsSelectionCondition> elementsSelectionConditions) {
		this.elementsSelectionConditions = elementsSelectionConditions;
		return this;
	}

	@Override
	public SelectionType getSelectionType() {
		return selectionType;
	}

	public StorageSection<ELEMENT> setSelectionType(SelectionType selectionType) {
		this.selectionType = selectionType;
		return this;
	}

}
