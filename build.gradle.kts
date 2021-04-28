plugins {
   id("us.ihmc.ihmc-build")
   id("us.ihmc.log-tools-plugin") version "0.6.1"
   id("us.ihmc.ihmc-ci") version "7.4"
   id("us.ihmc.ihmc-cd") version "1.17"
}

ihmc {
   group = "us.ihmc"
   version = "0.12.0-halodi1"
   vcsUrl = "https://github.com/ihmcrobotics/ihmc-ethercat-master"
   openSource = true

   repository("https://artifacts.halodi.com/repository/maven-open-source-group")

   configureDependencyResolution()
   resourceDirectory("main", "swig")
   configurePublications()
}

app.entrypoint("SlaveInfo", "us.ihmc.etherCAT.master.SlaveInfo")

mainDependencies {
   api("us.ihmc:soem:1.4.0-halodi1")
   api("us.ihmc:soem-platform-linux:1.4.0-halodi1")
   api("us.ihmc:ihmc-native-library-loader:1.2.1")
   api("us.ihmc:ihmc-realtime:1.3.1")
}

