internal object LibVersion {
    const val kotlin_stdlib_jdk8 = "1.3.71"
    const val kotlin_reflect = "1.3.71"
    const val kotlin_logging = "1.7.9"

    const val springbootstarter_actuator = "2.3.1.RELEASE"
    const val springbootstarter_web = "2.3.1.RELEASE"

    const val jackson_module_kotlin = "2.11.0"

    const val spring_kafka = "2.5.3.RELEASE"

    const val apache_avro = "1.9.2"
    const val avro_kafka_serializer = "5.3.0"

    object RuntimeOnly {
        const val springboot_devtools = "2.3.1.RELEASE"
    }
}

object LibNames {
    const val kotlin_stdlib_jdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8"
    const val kotlin_reflect = "org.jetbrains.kotlin:kotlin-reflect"
    const val kotlin_logging = "io.github.microutils:kotlin-logging"

    const val springbootstarter_actuator = "org.springframework.boot:spring-boot-starter-actuator"
    const val springbootstarter_web = "org.springframework.boot:spring-boot-starter-web"
    const val springboot_devtools = "org.springframework.boot:spring-boot-devtools"

    const val jackson_module_kotlin = "com.fasterxml.jackson.module:jackson-module-kotlin"

    const val spring_kafka = "org.springframework.kafka:spring-kafka"

    const val apache_avro = "org.apache.avro:avro"
    const val avro_kafka_serializer = "io.confluent:kafka-avro-serializer"
}

object Libs {
    const val kotlin_stdlib_jdk8 = "${LibNames.kotlin_stdlib_jdk8}:${LibVersion.kotlin_stdlib_jdk8}"
    const val kotlin_reflect = "${LibNames.kotlin_reflect}:${LibVersion.kotlin_reflect}"
    const val kotlin_logging = "${LibNames.kotlin_logging}:${LibVersion.kotlin_logging}"

    const val springbootstarter_actuator = "${LibNames.springbootstarter_actuator}:${LibVersion.springbootstarter_actuator}"
    const val springbootstarter_web = "${LibNames.springbootstarter_web}:${LibVersion.springbootstarter_web}"

    const val jackson_module_kotlin = "${LibNames.jackson_module_kotlin}:${LibVersion.jackson_module_kotlin}"

    const val spring_kafka = "${LibNames.spring_kafka}:${LibVersion.spring_kafka}"

    const val apache_avro = "${LibNames.apache_avro}:${LibVersion.apache_avro}"
    const val kafka_avro_serializer = "${LibNames.avro_kafka_serializer}:${LibVersion.avro_kafka_serializer}"

    object RuntimeOnly {
        const val springboot_devtools = "${LibNames.springboot_devtools}:${LibVersion.RuntimeOnly.springboot_devtools}"
    }
}