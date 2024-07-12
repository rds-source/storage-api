package ru.rds.data.storage;

/**
 * Условие для отбора Элементов ({@link Element}) при их получении из Пространства ({@link Space})
 *
 * @author RDS
 * @version 1
 * @since 1.0.0
 */
public class ElementsSelectionCondition {

	/**
	 * Название Свойства ({@link SpaceProperty}) Пространства ({@link Space})
	 */
	private String spacePropertyName;

	/**
	 * Значение Свойства ({@link SpaceProperty}) Пространства ({@link Space})
	 */
	private Object spacePropertyValue;

	/**
	 * Тип условия для сравнения
	 */
	private SelectionConditionExpression selectionConditionExpression = SelectionConditionExpression.EQUAL;

	public String getSpacePropertyName() {
		return spacePropertyName;
	}

	public ElementsSelectionCondition setSpacePropertyName(String spacePropertyName) {
		this.spacePropertyName = spacePropertyName;
		return this;
	}

	public Object getSpacePropertyValue() {
		return spacePropertyValue;
	}

	public ElementsSelectionCondition setSpacePropertyValue(Object spacePropertyValue) {
		this.spacePropertyValue = spacePropertyValue;
		return this;
	}

	public SelectionConditionExpression getSelectionConditionExpression() {
		return selectionConditionExpression;
	}

	public ElementsSelectionCondition setSelectionConditionExpression(SelectionConditionExpression selectionConditionExpression) {
		this.selectionConditionExpression = selectionConditionExpression;
		return this;
	}

}
