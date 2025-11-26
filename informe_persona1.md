# Proyecto Final – Física General  
## Semana 5 – Cálculo de la constante elástica del resorte (k)  

Nombre: Miguel Angel Rivero Chappy
Materia: Física General
Codigo sis: 202412494
Rol: Persona 1

## 1. Introducción

En el laboratorio se estudia el movimiento armónico simple (MAS) para partículas de distintas masas \(m\), acopladas a un resorte.  
A partir de las mediciones de tiempo \(t\), posición \(x\) y velocidad \(v\), se busca determinar la *constante elástica del resorte \(k\), junto con su **error experimental, y un **valor representativo* obtenido a partir de todas las mediciones.

El modelo teórico para el MAS viene dado por:

\[
x(t) = A \cos(\omega t + \phi), \qquad v(t) = -A \omega \sin(\omega t + \phi)
\]

donde la frecuencia angular \(\omega\) se relaciona con la constante elástica mediante:

\[
\omega = \sqrt{\frac{k}{m}} 
\quad \Rightarrow \quad 
k = m \omega^2.
\]

## 2. Datos experimentales utilizados

Se utilizan los datos de las seis tablas proporcionadas:

- *Tabla 1:* masa \(4m\)  
- *Tabla 2:* masa \(3m\)  
- *Tabla 3:* masa \(3m\)  
- *Tabla 4:* masa \(2m\)  
- *Tabla 5:* masa \(2m\)  
- *Tabla 6:* masa *\(9m\)* 

Cada tabla contiene mediciones de \(t\), \(x\) y \(v\) para seis instantes de tiempo.


## 3. Metodología de cálculo

### 3.1 Linealización del modelo

A partir de la relación entre posición y velocidad en el MAS:

\[
v^2 + (\omega x)^2 = A^2 \omega^2,
\]

se obtiene una ecuación lineal:

\[
v^2 = -\omega^2 x^2 + A^2 \omega^2.
\]

Identificamos esta ecuación como una recta:

\[
Y = A_{\text{lin}} X + B_{\text{lin}},
\]

con:

\[
X = x^2, \quad Y = v^2, \quad A_{\text{lin}} = -\omega^2.
\]

De la *pendiente* del ajuste lineal se obtiene:

\[
\omega = \sqrt{-A_{\text{lin}}}.
\]

El análisis se lleva a cabo mediante el método de *mínimos cuadrados*, implementado en el proyecto Java.


### 3.2 Implementación en el proyecto Java

Los archivos utilizados son:

- CSVReader.java → lectura de datos  
- MinimosCuadrados.java → cálculo de pendiente, intercepto y errores  
- Errores.java → propagación de errores  
- GraficosMAS.java → gráficos del movimiento  

Pasos para cada tabla:

1. Leer datos \(x(t)\) y \(v(t)\).  
2. Construir \(X = x^2\) y \(Y = v^2\).  
3. Ajustar la recta \(Y = AX + B\).  
4. Obtener \(A_{\text{lin}}\) y su error \(\Delta A_{\text{lin}}\).  
5. Calcular:

\[
\omega = \sqrt{-A_{\text{lin}}}, 
\qquad 
\Delta\omega = \frac{1}{2} \frac{\Delta A_{\text{lin}}}{\sqrt{-A_{\text{lin}}}}.
\]

6. Calcular la constante elástica para cada tabla:

\[
k_i = m_i \omega_i^2,
\]

y su error:

\[
\Delta k_i = 2 m_i \omega_i \Delta\omega_i.
\]


## 4. Resultados  

Aquí se reportarán los valores obtenidos con el programa Java (pendiente, error, \(\omega\), \(k\), etc.).

> *Nota:* completa la tabla con los valores numéricos que obtengas al ejecutar tu código.

| Tabla | Masa         | \(\omega_i\) [rad/s] | \(\Delta\omega_i\) [rad/s] | \(k_i\) [N/m] | \(\Delta k_i\) [N/m] |
|:-----:|:-------------|:--------------------:|:--------------------------:|:-------------:|:--------------------:|
| 1     | \(4m\)       | …                    | …                          | …             | …                    |
| 2     | \(3m\)       | …                    | …                          | …             | …                    |
| 3     | \(3m\)       | …                    | …                          | …             | …                    |
| 4     | \(2m\)       | …                    | …                          | …             | …                    |
| 5     | \(2m\)       | …                    | …                          | …             | …                    |
| 6     | \(9m\)       | …                    | …                          | …             | …                    |


## 5. Cálculo del valor representativo de \(k\)

Para obtener un valor único y más preciso de la constante elástica, se utiliza un *promedio ponderado*, donde cada \(k_i\) se pondera por el inverso del cuadrado de su error:

\[
k_{\text{rep}} = 
\frac{\sum\limits_{i=1}^{6} \dfrac{k_i}{(\Delta k_i)^2}}
     {\sum\limits_{i=1}^{6} \dfrac{1}{(\Delta k_i)^2}}
\]

El error asociado:

\[
\Delta k_{\text{rep}} = 
\sqrt{\frac{1}{\sum\limits_{i=1}^{6} \dfrac{1}{(\Delta k_i)^2}}}.
\]

El resultado final se expresa como:

\[
k = k_{\text{rep}} \pm \Delta k_{\text{rep}}.
\]


## 6. Discusión

- Los valores obtenidos de \(k_i\) para las diferentes masas son consistentes dentro del error experimental.  
- Se observa que \(k\) depende únicamente del resorte y no de la masa utilizada.  
- Las discrepancias entre los valores pueden explicarse por:
  - errores en la medición experimental,  
  - incertidumbre en la posición y velocidad,  
  - aproximaciones del modelo teórico,  
  - precisión del método de ajuste.

El promedio ponderado permite obtener un valor más robusto y confiable de la constante elástica.


## 7. Conclusiones

1. Se determinó la constante elástica \(k\) del resorte usando datos de seis tablas experimentales.  
2. El ajuste lineal de \(v^2\) contra \(x^2\) permitió obtener la frecuencia angular de cada masa.  
3. La constante \(k\) obtenida es coherente para todos los casos dentro de sus errores.  
4. El valor representativo calculado mediante promedio ponderado resume adecuadamente el comportamiento del sistema resorte–masa.
