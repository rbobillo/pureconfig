import Utilities._

name := "pureconfig-circe"

libraryDependencies ++= Seq(
  "io.circe"      %% "circe-core"    % forScalaVersions { case (2, 11) => "0.11.2"; case _ => "0.12.3" }.value,
  "io.circe"      %% "circe-literal" % forScalaVersions { case (2, 11) => "0.11.2"; case _ => "0.12.3" }.value % Test,
  "org.typelevel" %% "jawn-parser"   % "0.14.3" % Test
)

developers := List(
  Developer("moradology", "Nathan Zimmerman", "npzimmerman@gmail.com", url("https://github.com/moradology")))

osgiSettings

OsgiKeys.exportPackage := Seq("pureconfig.module.circe.*")
OsgiKeys.privatePackage := Seq()
OsgiKeys.importPackage := Seq(s"""scala.*;version="[${scalaBinaryVersion.value}.0,${scalaBinaryVersion.value}.50)"""", "*")
