package ru.rds.data.storage;

import java.util.List;
import java.util.Optional;
import ru.rds.data.storage.exceptions.StorageException;

/**
 * Хранилище - это абстрактное представление физического или логического устройства (места, объекта и т.п.), которое состоит из Пространств ({@link Space}).
 * <p>
 * На основе данного представления можно реализовать различные виды Хранилищ - например, любая База Данных подходит под эту концепцию, либо Логический Диск в файловой системе. Конкретная реализация зависит только лишь от воображения.
 *
 * @param <SPACE>          тип, описывающий Пространство ({@link Space})
 * @param <SPACE_PROPERTY> тип, описывающий Свойство ({@link SpaceProperty}) Пространства ({@link Space})
 * @author RDS
 * @version 1
 * @since 1.0.0
 */
public interface Storage<SPACE extends Space, SPACE_PROPERTY extends SpaceProperty> {

	/**
	 * Получение списка всех Пространств ({@link Space})
	 *
	 * @return никогда не возвращает NULL
	 */
	List<SPACE> getSpaces();

	/**
	 * Получение одного Пространства ({@link Space}) по его имени
	 *
	 * @param name имя Пространства ({@link Space})
	 * @return {@link Optional} будет содержать NULL, если пространство с указанным именем не найдено
	 * @throws IllegalArgumentException возникает в случае, если переданное имя равно NULL
	 */
	Optional<SPACE> getSpace(String name);

	/**
	 * Получение Свойств ({@link SpaceProperty}) Пространства ({@link Space}) по его имени
	 *
	 * @param name имя Пространства ({@link Space})
	 * @return никогда не возвращает NULL
	 * @throws IllegalArgumentException возникает в случае, если переданное имя равно NULL
	 */
	List<SPACE_PROPERTY> getSpaceProperties(String name);

	/**
	 * Создание нового Пространства ({@link Space})
	 *
	 * @param spaceName     имя Пространства ({@link Space})
	 * @param spaceComments дополнительное описание Пространства ({@link Space})
	 * @param properties    список Свойств ({@link SpaceProperty}) Пространства ({@link Space})
	 * @throws StorageException возникает в случае возникновения непредвиденных обстоятельств
	 */
	void createSpace(String spaceName, String spaceComments, List<SPACE_PROPERTY> properties);

	/**
	 * Создание нового Пространства ({@link Space})
	 *
	 * @param space объект, описывающий Пространство ({@link Space})
	 * @throws StorageException возникает в случае возникновения непредвиденных обстоятельств
	 */
	void createSpace(SPACE space);

	/**
	 * Удаление Пространства ({@link Space})
	 *
	 * @param spaceName имя Пространства ({@link Space})
	 * @throws StorageException возникает в случае возникновения непредвиденных обстоятельств
	 */
	void deleteSpace(String spaceName);

}
