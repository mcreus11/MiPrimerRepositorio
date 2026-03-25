# API REST - JWT + H2 JPA + PokeAPI + AES/CBC (Java 11 / Spring Boot)

## Requisitos
- Java 11
- Maven

## Ejecución
```bash
mvn spring-boot:run
```
La consola H2 queda en `/h2-console` (JDBC URL: `jdbc:h2:mem:catalogdb`, user: `sa`, sin password).

## Autenticación (JWT)
Login:
```
POST /auth/login
{
  "username": "admin",
  "password": "admin123"
}
```
Respuesta:
```
{
  "access_token": "<JWT>",
  "token_type": "Bearer"
}
```
Usa el token en `Authorization: Bearer <JWT>`.

> Nota: Se usa un flujo simple tipo *password* con usuarios en memoria. Si requieres un Authorization Server OAuth2 completo, se puede agregar, pero para la evaluación generalmente basta un emisor/validador de JWT.

## Catálogo de Items (H2/JPA)
- Listar todo:
```
GET /api/items
Authorization: Bearer <JWT>
```
- Filtrar por nombre por query param:
```
GET /api/items?nombre=Israel
Authorization: Bearer <JWT>
```
- Filtrar por JSON body (como en el enunciado):
```
POST /api/items/filter
Authorization: Bearer <JWT>
{
  "nombre": "Israel"
}
```
Si `nombre` es `""`, regresa el catálogo completo.

## Consumo de PokeAPI (API externa)
```
GET /api/pokemon/ditto
Authorization: Bearer <JWT>
```
Devuelve el JSON de `https://pokeapi.co/api/v2/pokemon/ditto`

## Cifrado AES/CBC/PKCS5Padding
```
POST /api/crypto/encrypt
Authorization: Bearer <JWT>
{
  "texto": "hola mundo",
  "key": "0123456789abcdef0123456789abcdef",  // 32 chars -> 32 bytes
  "iv": "0123456789abcdef"                    // 16 chars -> 16 bytes
}
```
Respuesta:
```
{ "base64Cipher": "..." }
```
Para validar:
```
POST /api/crypto/decrypt
Authorization: Bearer <JWT>
{
  "texto": "<base64Cipher>",
  "key": "0123456789abcdef0123456789abcdef",
  "iv": "0123456789abcdef"
}
```
Respuesta:
```
{ "plainText": "hola mundo" }
```

## Evidencia sugerida
- Capturas o cURL en `README` + colección de Postman incluida.

## Usuarios por defecto
- `admin` / `admin123`

## Seguridad
- Stateless (JWT) con `Bearer`.
- Cambia `app.jwt.secret` en `application.properties` para producción.
