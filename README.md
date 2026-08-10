# Tienda — base para Caso 2

Este repo arranca desde el estado del proyecto "Tienda" al cierre de la **semana 13**
(commit `8c0f54a` del repo original), sin los cambios hechos el 9-10 de agosto de 2026
que no correspondían a esa entrega.

## Antes de correr el proyecto

1. **Firebase**: copiá tu archivo de credenciales
   `techshop-4b5a8-firebase-adminsdk-fbsvc-817eddaf42.json` dentro de
   `src/main/resources/firebase/` (no está en el repo a propósito — es un secreto real
   y el repo es público; `.gitignore` ya lo excluye).
2. **MySQL local**: `application.properties` ya apunta a
   `jdbc:mysql://localhost:3306/techshop` con usuario `root`. Asegurate de tener el
   MySQL local corriendo y la base `techshop` creada (ver instrucciones aparte).
3. **Correo** (opcional, solo si el caso lo requiere): definí la variable de entorno
   `MAIL_PASSWORD` con el app password de Gmail si necesitás que funcione el envío de
   correos de activación.
