# clienteSocketJava
Aplicación Cliente en java que se conecta a un servidor desplegado en aws solicitando el resultado de una operación, conexión tcp por medio de sockets.
<h6>Con el objetivo de poder valdiar el funcionamiento puede ejecutarlo en: https://paiza.io/projects/-da3Z_eJKGKQztH2OxqhXQ</h6>

<h1>Modo de ejecución</h1>

El servidor recibe un string con 3 datos separados por "," de la siguiente manera:
<h5>"5,9,sum"</h5>

Debera modificar la línea 39 con la solicitud al servidor.
En el ejemplo anterior el servidor sumara los dos primeros números y retornará el resultado.

<h1>Tipos de operaciones</h1>

Suma -> sum
</br>
out.writeUTF("5,9,sum");
</br>
Divición -> div
</br>
out.writeUTF("10,5,div");
</br>
Resta -> rest
</br>
out.writeUTF("10,9,rest");
</br>
Multiplicación -> mul   out.writeUTF("5,9,mul");
