db.createCollection("user");

db.user.insertOne({
    "_id": "ID_DE_USUARIO",
    "username": "nombre_de_usuario",
    "password": "contraseña_encriptada",
    "email": "correo_electronico"
});