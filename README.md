<img width="430" height="294" alt="image" src="https://github.com/user-attachments/assets/65fde909-05c7-4bf8-bb46-812a2acaee31" />

El Sistema de Dispositivos de Almacenamiento

Descripción
Este proyecto consiste en un sistema en Java que permite trabajar con diferentes dispositivos de almacenamiento, como discos duros, unidades SSD y memorias USB. Todos los dispositivos comparten operaciones básicas de lectura y escritura, pero cada uno puede tener su propio comportamiento y características.

Clases
- **DispositivoAlmacenamiento:** define los métodos `escribirDatos(String datos)` y `leerDatos()`, que establecen las operaciones comunes para los dispositivos.
- **DiscoDuro:** representa un disco duro mecánico con atributos propios, como capacidad máxima y velocidad de transferencia.
- **UnidadSSD:** representa una unidad de estado sólido, con sus propias características de almacenamiento y velocidad.
- **MemoriaUSB:** representa una memoria USB que permite guardar y leer datos según su capacidad disponible.

Funcionamiento
En el `main` se crean diferentes dispositivos de almacenamiento y se agrupan en una colección. Luego, se recorren los dispositivos para escribir y leer datos utilizando los métodos comunes. Finalmente, se muestran por consola los resultados de cada operación.

Recorrido del mensaje
1. El programa crea un disco duro, una unidad SSD y una memoria USB.
2. Los dispositivos se agrupan en una colección para poder recorrerlos de manera organizada.
3. Se invoca el método `escribirDatos()` en cada dispositivo para almacenar información.
4. Cada dispositivo verifica que los datos no superen su capacidad máxima.
5. Se utiliza el método `leerDatos()` para recuperar la información almacenada.
6. Cada dispositivo realiza las operaciones según su propio comportamiento interno.
7. Finalmente, se muestran por consola los datos almacenados y los resultados de las operaciones.

 Validaciones
El sistema debe comprobar que los datos no superen la capacidad máxima de cada dispositivo. Si se intenta almacenar más información de la permitida, la operación debe rechazarse para evitar desbordamientos.

Objetivo
Practicar el uso de interfaces o clases abstractas, la implementación de métodos comunes, el polimorfismo, las colecciones y la validación de la capacidad de almacenamiento en Java.
