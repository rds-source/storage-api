package ru.rds.data.storage;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SelectionConditionExpressionTest
{

	@Test
	@DisplayName("fromString() - возвращение запрашиваемого значения")
	void fromString_returnRequestedValue()
	{
		SelectionConditionExpression expression = SelectionConditionExpression.fromString("LIKE");
		assertEquals(SelectionConditionExpression.LIKE, expression);
	}

	@Test
	@DisplayName("fromString() - возвращение значения по-умолчанию")
	void fromString_returnDefaultValue()
	{
		SelectionConditionExpression expression = SelectionConditionExpression.fromString("XXX");
		assertEquals(SelectionConditionExpression.EQUAL, expression);
	}
}