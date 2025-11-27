# 📄 Informe - Tarea 4 (Linealización y Coeficiente A)

Nombre: Isrrael Grimaldes Mendoza

Materia: Física General

Codigo sis: 202412616

grupo : b1

## 1. Fundamento Teórico: Linealización del MAS

La linealización de la ecuación de posición del MAS ($x(t) = A \cos(\omega t + \phi)$) se realiza mediante el cambio de variable:
$$Y = \arccos\left(\frac{x}{X_{\max}}\right) \quad \text{donde } X = t$$

La forma lineal resultante es:
$$\underbrace{Y}{\arccos(x/X{\max})} = \underbrace{A'}{\omega} \cdot \underbrace{X}{t} + \underbrace{B'}_{\phi}$$

## 2. Datos Linealizados (Todas las Tablas)

A continuación, se presentan los datos completamente linealizados $(X, Y)$ para las 6 tablas. Se utilizó el valor absoluto máximo de $x$ en cada tabla como $X_{\max}$.

### 2.1. Tabla 1 (Masa 4m, $X_{\max} = 0.856$ m)

| $X = t$ (s) | $x$ (m) | $x/X_{\max}$ | $Y = \arccos(x/X_{\max})$ (rad) |
| :---------: | :-----: | :----------: | :------------------------------: |
| 0.000 | 0.707 | 0.826 | *0.597* |
| 0.200 | 0.410 | 0.479 | *1.070* |
| 0.400 | -0.000 | 0.000 | *1.571* |
| 0.600 | -0.298 | -0.348 | *1.924* |
| 0.800 | -0.618 | -0.722 | *2.376* |
| 1.000 | -0.856 | -1.000 | *3.142* |

### 2.2. Tabla 2 (Masa 4m, $X_{\max} = 0.856$ m)

| $X = t$ (s) | $x$ (m) | $x/X_{\max}$ | $Y = \arccos(x/X_{\max})$ (rad) |
| :---------: | :-----: | :----------: | :------------------------------: |
| 0.000 | 0.707 | 0.826 | *0.597* |
| 0.200 | 0.410 | 0.479 | *1.070* |
| 0.400 | -0.181 | -0.211 | *1.783* |
| 0.600 | -0.298 | -0.348 | *1.924* |
| 0.800 | -0.618 | -0.722 | *2.376* |
| 1.000 | -0.856 | -1.000 | *3.142* |

### 2.3. Tabla 3 (Masa 3m, $X_{\max} = 0.932$ m)

| $X = t$ (s) | $x$ (m) | $x/X_{\max}$ | $Y = \arccos(x/X_{\max})$ (rad) |
| :---------: | :-----: | :----------: | :------------------------------: |
| 0.000 | 0.605 | 0.649 | *0.863* |
| 0.200 | 0.354 | 0.380 | *1.180* |
| 0.400 | -0.125 | -0.134 | *1.705* |
| 0.600 | -0.478 | -0.513 | *2.112* |
| 0.800 | -0.799 | -0.857 | *2.593* |
| 1.000 | -0.932 | -1.000 | *3.142* |

### 2.4. Tabla 4 (Masa 3m, $X_{\max} = 0.932$ m)

| $X = t$ (s) | $x$ (m) | $x/X_{\max}$ | $Y = \arccos(x/X_{\max})$ (rad) |
| :---------: | :-----: | :----------: | :------------------------------: |
| 0.000 | 0.605 | 0.649 | *0.863* |
| 0.200 | 0.354 | 0.380 | *1.180* |
| 0.400 | -0.125 | -0.134 | *1.705* |
| 0.600 | -0.478 | -0.513 | *2.112* |
| 0.800 | -0.799 | -0.857 | *2.593* |
| 1.000 | -0.932 | -1.000 | *3.142* |

### 2.5. Tabla 5 (Masa 2m, $X_{\max} = 0.686$ m)

| $X = t$ (s) | $x$ (m) | $x/X_{\max}$ | $Y = \arccos(x/X_{\max})$ (rad) |
| :---------: | :-----: | :----------: | :------------------------------: |
| 0.000 | 0.528 | 0.770 | *0.693* |
| 0.200 | 0.170 | 0.248 | *1.320* |
| 0.400 | -0.285 | -0.415 | *2.019* |
| 0.600 | -0.686 | -1.000 | *3.142* |
| 0.800 | -0.460 | -0.671 | *2.305* |
| 1.000 | -0.060 | -0.087 | *1.658* |

### 2.6. Tabla 6 (Masa 2m, $X_{\max} = 0.686$ m)

| $X = t$ (s) | $x$ (m) | $x/X_{\max}$ | $Y = \arccos(x/X_{\max})$ (rad) |
| :---------: | :-----: | :----------: | :------------------------------: |
| 0.000 | 0.528 | 0.770 | *0.693* |
| 0.200 | 0.170 | 0.248 | *1.320* |
| 0.400 | -0.285 | -0.415 | *2.019* |
| 0.600 | -0.686 | -1.000 | *3.142* |
| 0.800 | -0.460 | -0.671 | *2.305* |
| 1.000 | -0.060 | -0.087 | *1.658* |

---

## 3. Implementación del Coeficiente A' ($\omega$)

Mi implementación en Java es responsable de calcular la pendiente ($A' = \omega$) a partir de las sumatorias de las tablas anteriores.

### 3.1. Fórmula de MMC para $A'$

$$A' = \frac{N \sum(X_i Y_i) - \sum X_i \sum Y_i}{N \sum(X_i^2) - (\sum X_i)^2}$$

### 3.2. Código Java (LinearRegression.java)

El método calculateSlopeA se encuentra implementado en la clase LinearRegression.java dentro del paquete umss.
