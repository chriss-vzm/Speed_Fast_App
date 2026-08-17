# SpeedFast - Sistema de Gestión de Pedidos

## Descripción

SpeedFast es una aplicación desarrollada en Java que simula la asignación de repartidores para una empresa de reparto a domicilio.

El sistema trabaja con diferentes tipos de pedidos y utiliza Programación Orientada a Objetos para representar el comportamiento específico de cada uno.

Los tipos de pedidos implementados son:

* Pedido de comida.
* Pedido de encomienda.
* Pedido express.

Cada tipo de pedido posee diferentes requisitos al momento de asignar un repartidor.

## Objetivo

El objetivo del proyecto es aplicar conceptos de Programación Orientada a Objetos en Java, principalmente:

* Herencia.
* Polimorfismo.
* Sobreescritura de métodos.
* Sobrecarga de métodos.
* Encapsulamiento.

## Estructura de clases

### Pedido

Clase base del sistema.

Contiene los atributos generales de un pedido:

* `idPedido`
* `direccionEntrega`
* `tipoPedido`

También contiene las diferentes versiones del método `asignarRepartidor()`.

### PedidoComida

Clase derivada de `Pedido`.

Implementa la lógica correspondiente a pedidos de comida, verificando que el repartidor cuente con mochila térmica.

### PedidoEncomienda

Clase derivada de `Pedido`.

Implementa la lógica correspondiente al reparto de encomiendas, realizando la validación de peso y embalaje.

### PedidoExpress

Clase derivada de `Pedido`.

Implementa la lógica correspondiente a compras express, buscando un repartidor cercano con disponibilidad inmediata.

## Sobreescritura

Las clases derivadas sobrescriben el método:

```java
asignarRepartidor()
```

mediante `@Override`, permitiendo que cada tipo de pedido tenga un comportamiento específico.

## Sobrecarga

El proyecto también utiliza una versión sobrecargada del método:

```java
asignarRepartidor(String nombreRepartidor)
```

Esta versión permite indicar el nombre del repartidor que será asignado al pedido.

## Ejemplo de uso

```java
PedidoComida comida = new PedidoComida(
        101,
        "Av. Providencia 1234",
        "Comida"
);

comida.asignarRepartidor();
comida.asignarRepartidor("Juan Pérez");
```

## Ejemplo de salida

```text
[Pedido Comida]
Asignando repartidor...
Verificando mochila térmica... OK
Pedido asignado a Juan Pérez
```

## Tecnologías utilizadas

* Java
* IntelliJ IDEA
* Git
* GitHub

## Autor

Christopher Zúñiga
