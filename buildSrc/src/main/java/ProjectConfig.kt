object Build {
    val minSdk = 19
    val targetSdk = 27
    val compileSdk = 27
}

object Vers {
    val android = "3.1.1"
    val dagger = "2.15"
    val kotlin = "1.2.31"
    val retrofit = "2.4.0"
    val rxJava = "2.1.12"
    val room = "1.1.0-beta2"
    val support = "27.1.1"
    val constraint = "1.1.0"
    val junit = "4.12"
    val testRunner = "1.0.1"
    val espresso = "3.0.1"
    val arch = "1.1.1"
}

object Android {
    val appCompatV7 = "com.android.support:appcompat-v7:${Vers.support}"
    val constraint = "com.android.support.constraint:constraint-layout:${Vers.constraint}"
    val lifecycle = "android.arch.lifecycle:runtime:${Vers.arch}"
    val archCore = "android.arch.core:runtime:${Vers.arch}"
}

object Testing {
    val junit = "junit:junit:${Vers.junit}"
    val androidRunner = "com.android.support.test:runner:${Vers.testRunner}"
    val espresso = "com.android.support.test.espresso:espresso-core:${Vers.espresso}"
}

object Plugins {
    val android = "com.android.tools.build:gradle:${Vers.android}"
    val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Vers.kotlin}"
}

object AnnoProcs {
    val dagger = "com.google.dagger:dagger-compiler:${Vers.dagger}"
    val room = "android.arch.persistence.room:compiler:${Vers.room}"
    val lifecycle = "android.arch.lifecycle:compiler:${Vers.arch}"
}

object Libs {
    val retrofit = "com.squareup.retrofit2:retrofit:${Vers.retrofit}"
    val dagger = "com.google.dagger:dagger:${Vers.dagger}"
    val kotlinStdJdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Vers.kotlin}"
    val rxJava = "io.reactivex.rxjava2:rxjava:${Vers.rxJava}"
    val room = "android.arch.persistence.room:runtime:${Vers.room}"
    val roomRx = "android.arch.persistence.room:rxjava2:${Vers.room}"
}