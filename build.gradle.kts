plugins {
   id("us.ihmc.ihmc-build")
   id("us.ihmc.log-tools-plugin") version "0.5.0"
   id("us.ihmc.ihmc-ci") version "7.4"
   id("us.ihmc.ihmc-cd") version "1.17"
}

ihmc {
   group = "us.ihmc"
   version = "0.11.5"
   vcsUrl = "https://github.com/ihmcrobotics/ihmc-ethercat-master"
   openSource = true

   configureDependencyResolution()
   resourceDirectory("main", "swig")
   configurePublications()
}

app.entrypoint("SlaveInfo", "us.ihmc.etherCAT.master.SlaveInfo")

mainDependencies {
   api("us.ihmc:SOEM:1.3.3-ihmc2")
   api("us.ihmc:SOEM-platform-linux:1.3.3-ihmc2")
   //api group: 'us.ihmc', name: 'SOEM-platform-windows', version: '1.3.1-ihmc3'
   api("us.ihmc:ihmc-native-library-loader:1.2.1")
   api("us.ihmc:ihmc-realtime:1.3.0")
}

