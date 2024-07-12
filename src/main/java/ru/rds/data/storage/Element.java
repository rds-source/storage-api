package ru.rds.data.storage;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Элемент - это абстрактное представление физического или логического устройства (места, объекта и т.п.), которое описывает некий конечный объект для получения информации.
 * Элемент состоит из Свойств ({@link SpaceProperty}), из которых состоит и само Пространство ({@link Space}), в котором находится Элемент, и их значений.
 * <p>
 * На основе данного представления можно реализовать различные виды Элементов - например, любая строка таблиц Базы Данных, либо файл в файловой системе. Конкретная реализация зависит только лишь от воображения.
 *
 * @param <SPACE_PROPERTY> тип, описывающий Свойство ({@link SpaceProperty}) Пространства ({@link Space})
 * @author RDS
 * @version 1
 * @since 1.0.0
 */
public interface Element<SPACE_PROPERTY extends SpaceProperty> {

	/**
	 * Получение перечня Свойств ({@link SpaceProperty}) Пространства ({@link Space})
	 *
	 * @return
	 */
	List<SPACE_PROPERTY> getSpaceProperties();

	/**
	 * Получение перечня значений Свойств ({@link SpaceProperty}) Пространства ({@link Space}) для данного Элемента.
	 * Значения представляется в виде объекта типа {@link Map}, ключём в котором выступаем имя Свойства ({@link SpaceProperty}), а в качестве значения - значение Свойства ({@link SpaceProperty})
	 *
	 * @return
	 */
	Map<String, Object> getValues();

	/**
	 * Возвращает значение Свойства для данного Элемента
	 *
	 * @param spacePropertyName название Свойства ({@link SpaceProperty})
	 * @return
	 */
	Optional<Object> getValue(String spacePropertyName);

}
