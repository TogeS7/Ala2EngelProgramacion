# Ala2EngelProgramacion

Las listas enlazadas permiten crecer dinámicamente sin necesidad de definir un tamaño fijo y facilitan las inserciones o eliminaciones, ya que solo requieren ajustar referencias entre nodos, sin realizar desplazamientos de elementos. En cambio, los arrays ofrecen acceso directo e inmediato a cualquier posición mediante un índice, lo que los hace más eficientes para búsquedas posicionadas y para aplicar algoritmos de ordenamiento clásicos.

En este trabajo práctico, la estructura principal —la lista de miembros de la universidad— se implementó usando una lista enlazada, lo cual simplifica el agregado de nuevos elementos y evita problemas de capacidad. Sin embargo, para poder ordenar a los miembros por apellido, fue necesario convertir la lista enlazada a un array, ya que los algoritmos de ordenamiento resultan más simples y eficientes cuando se trabaja con posiciones indexadas. De esta manera, se aprovechan las ventajas de ambas estructuras según la operación requerida.



Ventajas

Crecimiento dinámico: no necesitan un tamaño fijo y permiten agregar elementos sin reorganizar toda la estructura.
Inserciones eficientes: agregar nodos al final es rápido y no requiere desplazar datos, como sí ocurre en un array.
Recorrido simple: muchas operaciones del sistema (listar, contar estudiantes, calcular promedios) funcionan naturalmente recorriendo nodos de forma secuencial.

Desventajas

Acceso secuencial: no se puede acceder directamente por posición; para llegar a un elemento hay que recorrer la lista.
Ordenamiento menos práctico: ordenar por apellido obligó a convertir la lista a un array primero.
Mayor uso de memoria: cada nodo almacena referencias adicionales.
Búsquedas menos eficientes: encontrar o eliminar un elemento requiere recorrer uno por uno.
