plugins {
  `java-library`
  `maven-publish`
}

val moduleName = "lava-common"
version = "1.1.2"

/*
val sourcesJar by tasks.registering(Jar::class) {
  archiveClassifier.set("sources")
  from(sourceSets["main"].allSource)
}

publishing {
  publications {
    create<MavenPublication>("mavenJava") {
      from(components["java"])
      artifactId = moduleName
      artifact(sourcesJar)
    }
  }
}
*/
