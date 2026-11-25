# Agenda de contactos en Java

Aplicación de consola para administrar una agenda de contactos. Permite agregar, mostrar, buscar y eliminar contactos, guardando nombre, apellido y teléfono.

> **Nota:** los datos se almacenan únicamente en memoria (`List`). Al cerrar el programa, la agenda se pierde.

## Características

- Agregar contactos (nombre, apellido y teléfono) desde la consola.
- Mostrar todos los contactos en una lista numerada.
- Buscar contactos por nombre o apellido, sin distinguir mayúsculas y con coincidencias parciales.
- Eliminar un contacto seleccionándolo por su número en la lista.
- Validación de entradas inválidas en el menú y al eliminar.

## Requisitos

- JDK 17 o superior (el proyecto usa `switch` con flechas y `Stream.toList()`).

Para verificar tu versión:

```bash
java -version
```

## Estructura del proyecto

```
agenda/
├── Agenda.java   # Clase principal, menú y lógica de la agenda
└── README.md
```

La clase `Contacto` está definida como clase estática interna dentro de `Agenda.java`.

## Compilación y ejecución

Desde la carpeta del proyecto:

```bash
javac Agenda.java
java Agenda
```

O directamente, sin compilar por separado (Java 11+):

```bash
java Agenda.java
```

## Uso

Al ejecutar el programa se muestra el siguiente menú:

```
1. Agregar contacto
2. Listar contactos
3. Buscar contacto
4. Eliminar contacto
0. Salir
Opción:
```

## Detalles de implementación

| Elemento | Descripción |
|---|---|
| `Contacto` | Clase con los campos `nombre`, `apellido` y `telefono`, getters y `toString()` |
| `List<Contacto>` | Estructura (`ArrayList`) donde se guardan los contactos en memoria |
| `addContacto()` | Pide los datos por consola y agrega un nuevo `Contacto` |
| `listaContactos()` | Recorre la lista e imprime cada contacto numerado |
| `buscarContacto()` | Filtra por nombre o apellido usando `contains` en minúsculas |
| `eliminarContacto()` | Elimina por posición con `remove(numero - 1)` |

## Posibles mejoras

- [ ] Persistir los contactos en un archivo (texto, CSV o JSON).
- [ ] Guardar los datos en una base de datos con JDBC.
- [ ] Validar el formato del teléfono.
- [ ] Evitar contactos duplicados.
- [ ] Editar contactos existentes.
- [ ] Ordenar la agenda alfabéticamente.
- [ ] Separar `Contacto` y la lógica de negocio en clases propias (por ejemplo, `AgendaService`).
