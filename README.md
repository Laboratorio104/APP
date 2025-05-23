# APP

Esta es una aplicación web construida con Spring Boot que permite gestionar libros mediante una API REST. Se pueden agregar, obtener y eliminar libros. A continuación, se describen las pruebas realizadas.
## Descripción del proyecto:
Aplicación web desarrollada en Java con Spring Boot que implementa un sistema básico de gestión de libros. Permite listar, agregar, buscar y eliminar libros mediante endpoints REST. Los datos se almacenan temporalmente en memoria. Incluye pruebas de caja negra y caja blanca documentadas en el README.md.

Repositorio en GitHub:
https://github.com/Laboratorio104/APP

## Pruebas de Caja Negra
### Definición:
Este tipo de pruebas se enfoca en probar la funcionalidad sin conocer el código interno. Solo se interactúa con la app como lo haría un usuario o cliente.

Prueba 1: Obtener lista de libros
Entrada: Solicitud GET a /api/libros

Esperado: Devuelve una lista vacía [] (si no hay libros creados)

Resultado: Correcto

Prueba 2: Agregar un libro nuevo
Entrada: POST a /api/libros con:
{
  "titulo": "1984",
  "autor": "George Orwell"
}
Esperado: Se devuelve un JSON con el libro y un ID generado

Resultado: Correcto

Prueba 3: Obtener libro por ID
Entrada: GET a /api/libros/1

Esperado: Devuelve el libro con ID 1

Resultado: Correcto

Prueba 4: Eliminar libro
Entrada: DELETE a /api/libros/1

Esperado: Respuesta con estado 204 (No Content)

Resultado: Correcto

## Pruebas de Caja Blanca
## Definición:
Se revisa el código interno, la lógica y los flujos de control. Se aplican pruebas a métodos específicos.

Prueba 1: Método guardarLibro()
Objetivo: Verificar que guarde correctamente un libro en la lista.

Escenario: Se llama con un libro con campos válidos.

Resultado Esperado: El libro se añade y se incrementa el ID.

Prueba 2: Método obtenerLibro(id)
Objetivo: Verificar que devuelva el libro correcto.

Escenario: ID = 1, el libro existe en la lista.

Resultado Esperado: Devuelve el libro con ID 1.

Prueba 3: Método eliminarLibro(id)
Objetivo: Verifica que elimine el libro correcto.

Escenario: El libro existe.

Resultado Esperado: La lista ya no contiene ese libro.

## Conclusión:
Todas las pruebas fueron exitosas, lo cual indica que las funcionalidades básicas de la API REST funcionan correctamente.



