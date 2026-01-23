# Используем JDK для запуска Spring Boot
FROM eclipse-temurin:17

# Копируем готовый jar из target
COPY target/*.jar app.jar

# Запуск приложения
ENTRYPOINT ["java","-jar","/app.jar"]
