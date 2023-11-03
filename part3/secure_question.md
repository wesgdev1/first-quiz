Teniendo en cuenta OWASP Top 10 como lista de verificacion, buscaria que se cumpliera cada uno de los creiterios de seguridad, por ejemplo describire algunas actividades en base a cada punto.

Autenticación y Autorización:

Tendra encriptadas las contraseñas, tambien revisaria que la autenticacion este implementada con JWT, de manera correcta, que se maneje el Token para todas las operaciones, adicionalmente cada usuario debe tener un roles especifico a su funcion.

Proteccion contra inyeccion SQL:

Haria uso de un ORM correcto y seguro adicional validaria todo el backend para recibir los datos correctos y evite cualquier dato no esperado con un error.

Manejo de contraseñas:

Estableceria creiterior de creacion de contraseñas seguras ademas que se encriptarian en el backend para una mayor rango de seguridad.

Gestion de Sesiones y Tokens:

Haria uso de las paquetes adecuado para menejar token, cookies seguras, etc, de tal manera que se controle cualquier acceso no autorizado.

Seguridad API:
Todo los intentos de conexion deben ser HHTPS, implementaria un LOG en el backend para guarde cualquier transaccion.

Manejo de Errores:

En cada uno de los errores evitaria dar datos inecesarios que podria beneficiar a un atacante de seguridad.

Seguridad en Contenedores:
Daria reglas de seguridad en cada una de las peticiones.

Educacion y capacitacion en seguridad:
El usuario consumidor es el mas importante, le daria capacitaciones de como reducir los riesgos de phishing, identicarlas y evitarlas.
