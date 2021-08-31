# clienteSocketJava
Aplicación Cliente desarrollada en java que se conecta a un servidor desplegado en AWS solicitando el resultado de una operación, conexión tcp por medio de sockets.

<h6>Con el objetivo de poder validar el funcionamiento de una manera mas rápida puede ejecutarlo en: https://paiza.io/projects/-da3Z_eJKGKQztH2OxqhXQ</h6>

<h1>instalación</h1>

Este proyecto fue desarrollado en NetBeans (Puede descargarlo en https://netbeans.apache.org/download/index.html ), por tanto a continuación explicamos los pasos que debes realiza para replicar este proyecto, basado en el uso de NetBeans.

<h3>1)</h3> Debes clonar, o descargar el proyecto de Github

![image](https://user-images.githubusercontent.com/43093044/131438949-203d9b82-df87-4088-8dcd-bf31f576e93e.png)

<h3>2)</h3> Debes abrir el proyecto

![image](https://user-images.githubusercontent.com/43093044/131439298-9f855892-aa95-49dc-953f-fd69eb01bfaf.png)


<h1>Ejecución</h1>

<h3>1)</h3> Una vez abierto el proyecto debes ir al archivo Main.java

![image](https://user-images.githubusercontent.com/43093044/131439576-8c3d2cc6-66ef-496d-af7d-40f8f260fdea.png)

<h3>2)</h3> Dentro del Main.java sólo debes ejecutarlo correr el proyecto.

![image](https://user-images.githubusercontent.com/43093044/131439768-8efeac23-1251-4224-acd2-5eaa7fef2c85.png)

<h3>Nota: Para correr el proyecto y hacer los cálculos debes tener en cuenta lo siguiente:</h3>

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
