# 💱 Conversor de Monedas en Java 
Proyecto realizado como parte del programa Oracle Next Education - Alura Latam.

Este proyecto es una aplicación de consola desarrollada en **Java** que permite convertir valores entre diferentes monedas utilizando una API externa de tasas de cambio.

El programa consulta tasas de cambio en tiempo real y permite al usuario realizar múltiples conversiones desde un menú interactivo.

---

## 🚀 Funcionalidades

El sistema permite:

* Convertir monedas entre:

    * USD → ARS
    * ARS → USD
    * USD → BRL
    * BRL → USD
    * USD → COP
    * COP → USD
* Consultar la **tasa de cambio actual**
* Ver el **resultado formateado a dos decimales**
* Guardar un **historial de conversiones realizadas**
* Consultar el historial desde el menú

---

## 🧠 Tecnologías utilizadas

* **Java 17**
* **IntelliJ IDEA**
* **Gson** (para procesamiento de JSON)
* **ExchangeRate API** (para obtener tasas de cambio)
* **Git y GitHub**

---

## 📌 Estructura del proyecto

El proyecto está dividido en tres clases principales:

* **Principal**

  Punto de entrada del programa. Inicia la ejecución de la aplicación.

* **Menu**

  Muestra las opciones al usuario y gestiona la interacción desde consola.

* **ServicioCambio**

  Se encarga de:

    * consumir la API de tasas de cambio
    * procesar la respuesta JSON
    * realizar los cálculos
    * guardar el historial de conversiones

---

## 📷 Ejemplo de ejecución

```
Sea bienvenido al Conversor de Moneda

1) USD -> ARS
2) ARS -> USD
3) USD -> BRL
4) BRL -> USD
5) USD -> COP
6) COP -> USD
7) Ver historial
8) Salir

Ingrese una opción: 1
Ingrese el valor a convertir: 10

Tasa actual: 1 USD = 1452.25 ARS
10.00 USD equivalen a 14522.50 ARS
```

---

## 📂 Historial de conversiones

El programa guarda las conversiones realizadas durante la ejecución:

```
Historial de conversiones:
10.00 USD -> 14522.50 ARS
5.00 USD -> 7261.25 ARS
```

---

## ⚙️ Requisitos

Para ejecutar el proyecto es necesario:

1. Tener **Java 17 o superior**
2. Agregar la librería **Gson**
3. Obtener una API Key gratuita en ExchangeRate API
4. Reemplazar la API Key en la clase `ServicioCambio`

```
String apiKey = "TU_API_KEY";
```

---

## 👨‍💻 Autor

Proyecto desarrollado como parte del **Challenge de Conversor de Monedas en AluraLatam** en la formación de Java.

---
