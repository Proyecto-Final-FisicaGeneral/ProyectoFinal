nombre:Isrrael Grimaldes Mendoza

Nombre: Isrrael Grimaldes Mendoza

Materia: Física General

Codigo sis: 202412616

grupo: b1
# maven
Apache maven es una herramienta de automatizacion y gestión de proyectos usada principalmente en proyectos Java.
se encarga de compilar, probar, empaquetar y gestionar dependencias del proyecto automaticamente.
## como usar maven
1. Instalar maven
    
    **para WIndows**

    descargar desde: [visita maven](https://maven.apache.org/)

    Variables NUEVAS:

    ```
    M2_HOME = C:\Program Files\Apache\maven\apache-maven-3.x.x

    MAVEN_HOME = misma ruta
    ```

    Agregar al PATH:

    ```
    %M2_HOME%\bin
    ```

    verificar:Abre CMD y ejecuta:
    ```
    mvn --version
    ```

    para mac

    Descarga: **apache-maven-3.x.x-bin.tar.gz**

    Extraer Archivos
    ```bash
     #Abrir Terminal y navegar a Descargas
    cd ~/Downloads
    
     #Extraer Maven
    tar -xzf apache-maven-3.x.x-bin.tar.gz

     #Mover a directorio del sistema
    sudo mv apache-maven-3.x.x /usr/local/
    ```
    Crear Enlace Simbólico
    ```bash
    cd /usr/local
    sudo ln -s apache-maven-3.x.x maven
    ```
    Configurar Variables de Entorno
    Abrir archivo de configuración:

    ```bash
     #Para ZSH (macOS Catalina+)
    nano ~/.zshrc

     #Para Bash (macOS anteriores)
    nano ~/.bash_profile
    Agregar estas líneas:
    ```
    ```bash
    export M2_HOME=/usr/local/maven
    export MAVEN_HOME=$M2_HOME
    export PATH=$M2_HOME/bin:$PATH
    ```
    Guardar y aplicar:
    ````bash
    Presiona Ctrl + O, Enter, Ctrl + X
    source ~/.zshrc  # o source ~/.bash_profile
    ````
    Verificar Instalación
    ````bash
    mvn -version
    ````
2. crea un proyecto maven

    desde consola:
    ```Bash 
    mvn archetype:generate 
    -DgroupId=com.ejemplo 
    -DartifactId=miProyecto 
    -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
    ```
3. Estructura del proyecto
    
    Maven organiza los proyectos con una estructura estándar:
    ```css
    mi-proyecto/
    ├── pom.xml        ← archivo principal de configuración
    ├── src/
    ├── main/
    │   └── java/  ← código fuente
    └── test/
        └── java/  ← pruebas unitarias

    ```
4. el archivo **pom.xml**

    define: 
    * nombre del proyecto
    * version
    * dependencias(librerias externas)
    * Plugins (para compilar, ejecutar, generar JARs, etc.)

    ejemplo
    ```xml
    <project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
                             http://maven.apache.org/xsd/maven-4.0.0.xsd">

    <modelVersion>4.0.0</modelVersion>

    <groupId>com.ejemplo</groupId>
    <artifactId>mi-proyecto</artifactId>
    <version>1.0.0</version>

    <dependencies>
        <!-- Ejemplo: añadir JUnit -->
        <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.2</version>
        <scope>test</scope>
        </dependency>
    </dependencies>
    </project>

    ```
5. comandos usados en maven
    
    `mvn compile`  Compila el código fuente

    `mvn test`   Ejecuta las pruebas unitarias

    `mvn package`  Empaqueta el proyecto (JAR o WAR)

    `mvn install`  Instala el artefacto en el repositorio local

    `mvn clean`  Limpia los archivos generados

    `mvn spring-boot:run`  Ejecuta una aplicación Spring Boot

# porque usar maven

Maven automatiza tareas repetitivas y complejas del desarrollo, ahorrando tiempo y evitando errores.

Ventajas principales:

* Gestión de dependencias:
Maven descarga y administra automáticamente las librerías necesarias.

* Estandarización:
Todos los proyectos tienen una estructura similar, facilitando el trabajo en equipo.

* Reproducibilidad:
Cualquier desarrollador puede clonar tu proyecto y ejecutarlo fácilmente.

* Integración con IDEs:
Funciona de forma nativa en IntelliJ, Eclipse y NetBeans.

* Extensible:
Permite agregar plugins para compilación, pruebas, empaquetado, documentación, etc.

# cuando usar maven

Usa Maven cuando:

* Tu proyecto es Java (o Kotlin/Scala sobre JVM).

* Tienes varias dependencias externas (por ejemplo, Spring, Hibernate, etc.).

* Necesitas automatizar el build (compilar, probar, generar JAR/WAR).

* Trabajas en equipo y quieres un proceso de construcción uniforme.

* Vas a usar Spring Boot o frameworks modernos (la mayoría usan Maven o Gradle).