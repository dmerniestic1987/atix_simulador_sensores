# Simulador de sensores para ATIX LABS
Este proyecto corresponde al ejercicio 2 de la evaluación técnica para ATIX LABS. 
Este proyecto utiliza Maven y Spring Boot. Por favor instalelos antes de intentar
ejecutar la aplicación.

Para el correcto funcionamiento se debe correr el proyecto Monitor antes de correr
estos de acá. Revisar: [https://github.com/dmerniestic1987/atix_monitor_sensores](https://github.com/dmerniestic1987/atix_monitor_sensores)

## Instalación
Debe descargarse el código fuente de este repositorio
```
git clone https://github.com/dmerniestic1987/atix_monitor_sensores.git
```
Luego debe generar el ejecutable de la aplicación
```
mvn install
```

Se creará la carpeta target con el ejecutable

## Ejecución del proyecto con JAR
Para ejecutar la aplicación:  
```
cd target
java -jar Simulador-0.0.1-SNAPSHOT.jar
```

Si se quiere cambiar la URL del servidor de monitores: 
```
cd target
java -jar Monitor-0.0.1-SNAPSHOT.jar --serverMonitor=http://wwww.ejemplo.com:8585
```


## Ingreso a la aplicación
Puede ingresar a la aplicación ingresando a [http://localhost:9001](http://localhost:9001)