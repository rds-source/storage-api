package ru.rds.data.storage;

/**
 * Направление сортировки
 *
 * @author RDS
 * @version 1
 * @since 1.0.0
 */
public enum ElementsSortDirection {
	/**
	 * Сортировка в порядке возрастания или по алфавиту
	 */
	ASC("ASC"),

	/**
	 * Обратный порядок сортировки
	 */
	DESC("DESC");

	private final String value;

	ElementsSortDirection(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}

	/**
	 * Возвращает {@link ElementsSortDirection} в соответствии со значением orderDirection,
	 * если соответствующего значения не найдено - будет возвращено {@link ElementsSortDirection#ASC}
	 *
	 * @param orderDirection никогда не возвращает NULL
	 * @return
	 */
	public static ElementsSortDirection fromString(String orderDirection) {
		if (orderDirection != null && !orderDirection.isEmpty()) {
			for (ElementsSortDirection od : ElementsSortDirection.values()) {
				if (orderDirection.equalsIgnoreCase(od.toString())) {
					return od;
				}
			}
		}
		return ASC;
	}
}
