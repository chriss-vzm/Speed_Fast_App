# SpeedFast App

## Descripción

SpeedFast es una aplicación desarrollada en Java para simular el funcionamiento de una empresa de reparto de pedidos.

El sistema permite trabajar con distintos tipos de pedidos y simular la entrega de estos mediante programación concurrente, utilizando hilos y `ExecutorService`.

## Tipos de pedidos

El programa contempla los siguientes tipos de pedidos:

- Pedido de comida
- Pedido de encomienda
- Pedido express

Todos ellos heredan de la clase abstracta `Pedido`.

## Estructura del proyecto

El proyecto está compuesto por las siguientes clases e interfaces:

### Clases

- `Pedido`: clase abstracta que representa un pedido.
- `PedidoComida`: representa pedidos de comida.
- `PedidoEncomienda`: representa pedidos de encomienda.
- `PedidoExpress`: representa pedidos express.
- `ProductorPedidos`: obtiene los pedidos almacenados y los incorpora a una `BlockingQueue`.
- `Repartidor`: representa a un repartidor y ejecuta las entregas mediante `Runnable`.
- `Main`: clase principal encargada de crear los pedidos, repartidores y ejecutar las tareas concurrentes.

### Interfaces

- `Despachable`
- `Cancelable`
- `Rastreable`

## Concurrencia

Para la simulación de las entregas se utilizan herramientas de concurrencia de Java:

- `Runnable`
- `Thread`
- `BlockingQueue`
- `LinkedBlockingQueue`
- `ExecutorService`
- `Thread.sleep()`
- `Random`

Los pedidos son almacenados inicialmente en un `ArrayList` y posteriormente son incorporados a una `BlockingQueue` mediante `ProductorPedidos`.

Los repartidores toman los pedidos desde la cola y simulan su proceso de entrega.

El programa utiliza `ExecutorService` para ejecutar simultáneamente al productor y a los distintos repartidores.

## Flujo del programa

```text
ArrayList<Pedido>
       |
       v
ProductorPedidos
       |
       | put()
       v
BlockingQueue<Pedido>
       |
       +----------+----------+
       |          |          |
       v          v          v
Repartidor 1  Repartidor 2  Repartidor 3
       |          |          |
       +----------+----------+
                  |
                  v
          Ejecución concurrente