import de.johoop.testngplugin.TestNGPlugin._

name := "reactive-streams-tck"

javacOptions in compile ++= Seq("-encoding", "UTF-8", "-source", "1.6", "-target", "1.6", "-Xlint:unchecked", "-Xlint:deprecation")

javacOptions in (Compile,doc) ++= Seq("-encoding","UTF-8","-docencoding", "UTF-8", "-charset", "UTF-8", "-notimestamp", "-linksource")

autoScalaLibrary := false

crossPaths := false

publishMavenStyle := true

libraryDependencies += "org.testng" % "testng" % "6.8.5"

testNGSettings

osgiSettings

OsgiKeys.exportPackage := Seq("org.reactivestreams.tck", "org.reactivestreams.tck.*")

OsgiKeys.privatePackage := Nil
