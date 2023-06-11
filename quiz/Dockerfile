# Define a imagem base
FROM adoptopenjdk:17-jdk-hotspot

# Define o diretório de trabalho
WORKDIR /quiz

# Copia o arquivo JAR para o diretório de trabalho
COPY target/React_Quiz_API.jar /quiz/React_Quiz_API.jar

# Define o comando de inicialização do container
CMD ["java", "-jar", "/quiz/React_Quiz_API.jar"]
