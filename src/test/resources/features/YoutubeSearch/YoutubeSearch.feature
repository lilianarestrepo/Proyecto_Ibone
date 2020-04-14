#language: es

Característica: Ingresar a Youtube

  Esquema del escenario: Busqueda exitosa Youtube
    Dado que el usuario esta en Youtube
    Cuando ingresa los datos de busqueda "<SongName>"
    Entonces el observa la cancion
    Ejemplos:
      |SongName|
      |morado|
      |despacio|



