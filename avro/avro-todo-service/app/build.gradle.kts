description = "app"

apply {
    from(rootDir.absolutePath + "/gradle-scripts/avro.gradle")
}

buildscript {
    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:2.3.1.RELEASE")
    }
}

plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    id("org.jetbrains.kotlin.plugin.noarg")
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    implementation(Libs.kotlin_stdlib_jdk8)
    implementation(Libs.kotlin_reflect)
    implementation(Libs.kotlin_logging)
    implementation(Libs.springbootstarter_actuator)
    implementation(Libs.springbootstarter_web)
//    implementation(Libs.jackson_module_kotlin)
    runtimeOnly(Libs.RuntimeOnly.springboot_devtools)

    // Kafka
    implementation(Libs.spring_kafka)

    // Avro
    implementation(Libs.apache_avro)
    implementation(Libs.kafka_avro_serializer)
}

springBoot {
    buildInfo()
    mainClassName = "com.fernandochristyanto.todoservice.TodoServiceApplication"
}

tasks.getByName<Jar>("jar") {
    manifest {
        attributes["Main-Class"] = "com.fernandochristyanto.todoservice.TodoServiceApplication"
    }
}

sourceSets {
    main {
        java.srcDir("src/main/generated-avro")
    }
}

tasks.named("build") {
    dependsOn("executeAvroTools")
}