name := "ci-api"

version := "1.0.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
// Thus we use classes instead of objects.
routesGenerator := InjectedRoutesGenerator
