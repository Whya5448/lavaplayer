plugins {
  java
  application
}

dependencies {
  implementation(project(":lavaplayer"))
  implementation("net.dv8tion:JDA:5.0.0-alpha.9")
  implementation("net.iharder:base64:2.3.9")
  runtimeOnly("ch.qos.logback:logback-classic:1.1.8")
}

application {
  mainClass.set("com.sedmelluq.discord.lavaplayer.demo.Bootstrap")
}
