# musical-instruments-registry
CRUD api used to register a student and the instrument that he plays.

# Task

En una escuela se tiene una lista en papel de alumnos de un taller de música, donde cada uno de ellos puede tocar un solo instrumento en el coro escolar, sin embargo, un mismo instrumento puede ser tocado por varios alumnos. 

Para sistematizar el manejo de la lista, la escuela tiene una aplicación que cuenta con 2 Objetos o Clases:

- Clase Alumno: Con los atributos (id, nombre, apellido, curso).

- Clase Instrumento: Con los atributos (Id, Nombre,  Tipo,  Material)
### Objetivo 1:
La escuela necesita realizar la carga de cada uno de los alumnos e instrumentos, para ello crear un endpoint que permita recibir mediante el método POST nuevos objetos de ambos y los almacene en una lista. Esta lista será consultada por otros endpoint que se describen en el (objetivo 2).

### Objetivo 2:
La escuela solicita la creación de una API que permita realizar las siguientes consultas:

#### Ver todos los instrumentos con los que cuenta el coro

`localhost:8080/instrumentos/traer`

#### Ver todos los alumnos del taller de música

`localhost:8080/alumnos/traer`

#### Traer un instrumento en particular

`localhost:8080/instrumentos/traer/{nombre}`

#### Traer todos los alumnos que toquen un instrumento

`localhost:8080/alumnos/traer/{nombre_instrumento}`
(Para este endpoint tener en cuenta el uso del patrón DTO para generar la respuesta)

# Status

:sweat_smile: Ok, maybe lol.

All the calls work but I don't know if it's done correctly, tried applying relational tables but when I added a referance to an instrument any call to `alumnos` or `instrumentos` stoped working.
So I ended up creating a `instrumento` column on the `alumno` table and a `instrumento` table with only its details (basically, no Many-to-One/One-to-Many relationships), latter I combined the two manualy using the DTO. I think that is what they wanted me to do but I don't know.

I do have to finish implementing the rest of the CRUD functionalities like edit, and delete.
