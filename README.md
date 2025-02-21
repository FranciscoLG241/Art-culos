# Ejercicio 6: Sistema de articulos¶
- Crear una clase Articulo con un nombre y un precio, que ambos se puedan modificar. También tendrá un id que se generará de forma automática mediante un contador (totalArticulos) y una función generarId(). Este id no podrá modificarse ni obtenerse fuera de Articulo.

- Crear un método promocionNavidad() que reciba el porcentaje de rebaja y lo aplique al precio.

- Sobreescribir el método toString() para que retorne el "{nombre} - {precio con dos decilames}€ (ID: {id})".

- Crear una clase que herede de Articulo y se llame Ordenador. Debe agregar a su constructor primario el tipo, que será de TipoOrdenador => (BASICO, OFIMATICA, TODOTERRENO, GAMING) y por defecto será BASICO.

- Sobreescribe el método promocionNavidad() para que solo aplique la promoción si el precio es superior a 500 euros.

- En el main crea dos artículos con precios 25 y 45 euros. También crea dos ordenadores, el primero GAMING de precio 1299.99 y el segundo un ordenador básico de 399.99 euros.

- Crear una variable para generar una lista con ellos y recorrerla aplicándoles la promoción e imprimiendo su contenido.
