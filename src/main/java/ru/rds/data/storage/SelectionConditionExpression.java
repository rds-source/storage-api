package ru.rds.data.storage;

/**
 * Логическое выражение при определении условия для отбора Элементов ({@link Element})
 *
 * @author RDS
 * @version 1
 * @since 1.0.0
 */
public enum SelectionConditionExpression {
	/**
	 * Эквивалент логическому равенству ("=")
	 */
	EQUAL("eq"),

	/**
	 * Эквивалент логическому неравенству ("!=")
	 */
	NOT_EQUAL("neq"),

	/**
	 * Эквивалент логическому "содержит"
	 */
	LIKE("like"),

	/**
	 * Эквивалент логическому "не содержит"
	 */
	NOT_LIKE("nlike"),

	/**
	 * Эквивалент логическому "один из"
	 */
	IN("in"),

	/**
	 * Эквивалент логическому "больше" (">")
	 */
	GREATER_THAN("gt"),

	/**
	 * Эквивалент логическому "больше или равно" (">=")
	 */
	GREATER_THAN_OR_EQUAL("gteq"),

	/**
	 * Эквивалент логическому "меньше" ("<")
	 */
	LESS_THEN("lt"),

	/**
	 * Эквивалент логическому "меньше или равно" ("<=")
	 */
	LESS_THEN_OR_EQUAL("lteq");

	private final String value;

	SelectionConditionExpression(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	@Override
	public String toString() {
		return value;
	}

	/**
	 * Возвращает {@link SelectionConditionExpression} в соответствии со значением condition,
	 * если соответствующего значения не найдено - будет возвращено {@link SelectionConditionExpression#EQUAL}
	 *
	 * @param condition никогда не возвращает NULL
	 * @return
	 */
	public static SelectionConditionExpression fromString(String condition) {
		if (condition != null && !condition.isEmpty()) {
			for (SelectionConditionExpression ce : SelectionConditionExpression.values()) {
				if (condition.equalsIgnoreCase(ce.toString())) {
					return ce;
				}
			}
		}
		return EQUAL;
	}
}
