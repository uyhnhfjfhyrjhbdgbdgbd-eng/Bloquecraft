# BloqueCraft 3D — proyecto Android

Este es el **proyecto fuente Android**, todavía no un APK compilado.

## Requisitos
- Android Studio reciente.
- JDK 17.
- Conexión a Internet durante la primera sincronización y al jugar (el motor Three.js se carga desde jsDelivr).
- Android SDK Platform 35.

## Crear el APK
1. Descomprime `BloqueCraftAndroid.zip`.
2. Abre la carpeta `BloqueCraftAndroid` desde Android Studio.
3. Espera a que termine **Gradle Sync**.
4. Ve a **Build > Build Bundle(s) / APK(s) > Build APK(s)**.
5. Android Studio generará el APK en `app/build/outputs/apk/debug/app-debug.apk`.

## Nota
- Paquete: `com.bloquecraft.game`
- Orientación: horizontal.
- Mínimo: Android 6.0 (API 23); pensado para probar en Android 13.
- Las texturas son de estilo voxel originales; no incluye los archivos oficiales de Minecraft.
- Esta versión empaqueta el juego web 3D en un WebView. Para funcionar, necesita Internet para descargar Three.js.


## Compilar desde un celular usando GitHub Actions
1. Crea un repositorio en GitHub y sube el contenido de esta carpeta (incluida la carpeta oculta `.github/workflows`).
2. Abre la pestaña Actions del repositorio.
3. Si GitHub pide habilitar Actions, acepta.
4. Entra en "Build BloqueCraft APK" y pulsa "Run workflow".
5. Cuando termine en verde, abre esa ejecución y descarga el artefacto "BloqueCraft-APK".
6. Descomprime el ZIP descargado y abre `app-debug.apk` para instalarlo.
