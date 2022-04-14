plugins {
  `java-library`
  `maven-publish`
}

val moduleName = "lavaplayer-ext-youtube-rotator"
version = "0.2.3"

dependencies {
  compileOnly(project(":main"))
  implementation("org.apache.httpcomponents:httpclient:4.5.13")
}
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
