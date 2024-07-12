package ru.rds.data.storage;

/**
 * Сортировка
 * <p>
 * При помощи Сортировки можно задать порядок размещения Элементов ({@link Element}) при их получении из Пространства ({@link Space})
 *
 * @author RDS
 * @version 1
 * @since 1.0.0
 */
public class ElementsSort {

	/**
	 * Название Свойства, по которому нужно провести сортировку
	 */
	private String spacePropertyName;

	/**
	 * Направление сортировки
	 */
	private ElementsSortDirection direction;

	public String getSpacePropertyName() {
		return spacePropertyName;
	}

	public ElementsSort setSpacePropertyName(String spacePropertyName) {
		this.spacePropertyName = spacePropertyName;
		return this;
	}

	public ElementsSortDirection getDirection() {
		return direction;
	}

	public ElementsSort setDirection(ElementsSortDirection direction) {
		this.direction = direction;
		return this;
	}

}
