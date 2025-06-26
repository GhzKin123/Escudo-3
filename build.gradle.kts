plugins {
    id("fabric-loom") version "1.3-SNAPSHOT"
    kotlin("jvm") version "1.9.10"
}

group = "com.seunome.wardenshield"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://maven.fabricmc.net/")
}

dependencies {
    minecraft("com.mojang:minecraft:1.21.1")
    mappings("net.fabricmc:yarn:1.21.1+build.1:v2")
    modImplementation("net.fabricmc:fabric-loader:0.15.0")
    modImplementation("net.fabricmc.fabric-api:fabric-api:0.95.1+1.21.1")
}

tasks {
    // Gera o jar do mod remapeado para o Minecraft
    val remapJar by getting(com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar::class) {
        archiveBaseName.set("warden-shield-mod")
        archiveVersion.set(version.toString())
        archiveClassifier.set("")
    }
}
