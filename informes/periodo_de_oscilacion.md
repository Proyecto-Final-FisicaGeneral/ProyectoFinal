# Semana 5 — Persona 2 

Nombre: Isrrael Grimaldes Mendoza

Materia: Física General

Codigo sis: 202412616

Rol: Persona 2
## Cálculo del período de oscilación para una masa 9m  
### Usando datos experimentales de las Tablas 1–6

En esta sección se calcula el *período de oscilación para una masa equivalente a 9m*.  
El valor final depende de la constante elástica *k*, que fue obtenida en la Semana 5 — Persona 1 mediante el ajuste linealizado por Mínimos Cuadrados (MMC).

Este informe muestra:

1. Los datos experimentales usados.  
2. La ecuación física necesaria.  
3. La expresión del período para 9m.  
4. El cálculo del error del período.  
5. El formato del resultado final.

---

# 1. Datos experimentales utilizados

Los siguientes datos provienen del enunciado del proyecto.  
Se registraron posiciones *x(t)* y velocidades *v(t)* para diferentes masas:

- Masa = 4m  
- Masa = 3m (dos tablas)  
- Masa = 2m  
- Masa = m  
- Masa = 5m  

### Tabla 1 — Masa 4m

### Tabla 2 — Masa 3m

### Tabla 3 — Masa 3m

### Tabla 4 — Masa 2m

### Tabla 5 — Masa 2m

### Tabla 6 — Masa m

# 2. Modelo físico utilizado

El movimiento responde a un *oscilador armónico simple*:

m d²x/dt² + kx = 0

La frecuencia angular del sistema es:

ω = √(k/m)

El período de oscilación:

T = 2π √(m/k)

---

# 3. Período para una masa equivalente a 9m

Sustituyendo M = 9m:

T(9m) = 2π √(9m/k)

Factorizamos:

T(9m) = 6π √(m/k)

Ese es el *valor representativo del período*, usando k calculado por Persona 1.

---

# 4. Cálculo del error del período

Sea:

T = 6π √(m/k)

La derivada respecto a k:

dT/dk = – (T / (2k))

La fórmula del error:

ΔT = |dT/dk| Δk  
ΔT = (T / (2k)) Δk

Evaluado en k_rep:

ΔT = (T_rep / (2 k_rep)) · Δk

Por lo tanto:

*Error relativo del período:*  
ΔT / T_rep = (1/2) (Δk / k_rep)

---

# 5. Resultado final a reportar

Debe escribirse:

T(9m) = (T_rep ± ΔT) [s]

donde:

- T_rep = 6π √(m/k_rep)
- ΔT = (T_rep / (2 k_rep)) Δk

Los valores numéricos finales dependen del ajuste de Persona 1.

---
