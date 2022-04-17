plugins {
    java
    `maven-publish`
}

group = "com.sedmelluq"

allprojects {
    group = rootProject.group

    repositories {
        mavenCentral()
        maven(url = "https://jitpack.io")
    }

    apply(plugin = "java")
    apply(plugin = "maven-publish")

    dependencies {
        implementation("org.slf4j:slf4j-api:1.7.25")
    }

    java {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8

        withSourcesJar()
        //withJavadocJar()
    }

    publishing {
        publications {
            create<MavenPublication>("mavenJava") {
                groupId = project.group as String?
                artifactId = project.name
                version = project.version as String?
                from(components["java"])
            }
        }
    }
}
