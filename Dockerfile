# Usar una imagen base de OpenJDK
FROM openjdk:17-jdk-slim

# Crear un directorio para la aplicación
VOLUME /tmp

# Copiar el archivo JAR de la aplicación al contenedor
COPY target/storestock-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto que utiliza Spring Boot
EXPOSE 8080

# Ejecutar la aplicación Spring Boot
ENTRYPOINT ["java", "-jar", "/app.jar"]
