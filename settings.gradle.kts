include("lavaplayer-common")
project(":lavaplayer-common").projectDir = file("common")

include("lavaplayer")
project(":lavaplayer").projectDir = file("main")

include("testbot")
include("node")
include("stream-merger")
include("test-samples")
include(":extensions:youtube-rotator")

include("demo-jda")
include("demo-d4j")