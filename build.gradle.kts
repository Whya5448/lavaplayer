plugins {
    java
    `maven-publish`
}

group = "com.sedmelluq"

allprojects {
    group = rootProject.group

    repositories {
        mavenCentral()
        maven(url = "https://m2.dv8tion.net/releases")
    }

    apply(plugin = "java")
    apply(plugin = "maven-publish")

    java {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17

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
