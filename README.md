Создайте бин Dog, унаследуйте его от Animal. Создайте на основе этого класса компонент.
Запустите приложение и проверьте, что было выброшено исключение NoUniqueBeanDefinitionException. Это произошло из-за того, что существует 2 бина с типом Animal.
Прочитайте о связывании бинов по имени и свяжите AnimalCage c бином Dog через абстрактный класс Animal.
На основе класса Timer создайте бин. Свяжите с AnimalCage. Проверьте, что при выполнении метода main время, которое пишет таймер, одно и тоже.
Раскомментировать тест из заготовки и проверить своё решение.
