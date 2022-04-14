plugins {
    java
    `maven-publish`
}

group = "com.sedmelluq"

allprojects {
    group = rootProject.group

    repositories {
        mavenCentral()
    }

    apply(plugin = "java")
    apply(plugin = "maven-publish")

    dependencies {
        implementation("org.slf4j:slf4j-api:1.7.25")
    }

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
