package ru.rds.data.storage;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ElementsSortDirectionTest
{

	@Test
	@DisplayName("fromString() - возвращение запрашиваемого значения")
	void fromString_returnRequestedValue()
	{
		ElementsSortDirection direction = ElementsSortDirection.fromString("DESC");
		assertEquals(ElementsSortDirection.DESC, direction);
	}

	@Test
	@DisplayName("fromString() - возвращение значения по-умолчанию")
	void fromString_returnDefaultValue()
	{
		ElementsSortDirection direction = ElementsSortDirection.fromString("XXX");
		assertEquals(ElementsSortDirection.ASC, direction);
	}
}