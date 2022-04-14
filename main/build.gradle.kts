plugins {
  `java-library`
  groovy
  `maven-publish`
}

val moduleName = "lavaplayer"
version = "1.3.78.1"

dependencies {
  api(project(":common"))
  //implementation("com.sedmelluq:lavaplayer-natives:1.3.14")

  implementation("org.apache.httpcomponents:httpclient:4.5.13")
  implementation("commons-io:commons-io:2.7")

  implementation("com.fasterxml.jackson.core:jackson-databind:2.12.6.1")

  implementation("org.jsoup:jsoup:1.14.2")
  implementation("net.iharder:base64:2.3.9")

  testImplementation("org.codehaus.groovy:groovy:3.0.10")
  testImplementation("org.spockframework:spock-core:2.1-groovy-3.0")
  testImplementation("ch.qos.logback:logback-classic:1.2.9")
  //testImplementation("com.sedmelluq:lavaplayer-test-samples:1.3.11")
}

tasks.jar {
  exclude("natives")
}

val updateVersion by tasks.registering {
  File("$projectDir/src/main/resources/com/sedmelluq/discord/lavaplayer/tools/version.txt").let {
    it.parentFile.mkdirs()
    it.writeText(version.toString())
  }
}

tasks.classes.configure {
  finalizedBy(updateVersion)
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
