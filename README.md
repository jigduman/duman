# Base64 Decoder API

A small Spring Boot learning project exposing a Base64 decoding endpoint.

## Endpoint

`POST /api/decode` accepts a Base64-encoded request body and returns decoded text.

```bash
curl -X POST http://localhost:8080/api/decode \
  -H "Content-Type: text/plain" \
  --data "SGVsbG8="
```

The example assumes the application uses the default local port. Check `src/main/resources/application.properties` for your configuration.

## Repository guide

- `DecoderApplication.java`: Spring Boot entry point.
- `DecoderController.java`: HTTP endpoint and Base64 decoding.
- `pom.xml`: build dependencies and Java version.
- `src/test/`: existing application tests.

Use the JDK version declared in `pom.xml`, then run `./mvnw spring-boot:run` from the repository root (Windows: `mvnw.cmd spring-boot:run`).

This is a minimal example. Base64 is encoding, not encryption; the controller does not provide structured invalid-input errors or an explicit text charset.

[All projects](https://github.com/jigduman/jigduman/blob/main/PROJECTS.md)
