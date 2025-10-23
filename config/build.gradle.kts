plugins {
    id("java")
}
dependencies {
    implementation(project(":controller"))
    implementation(project(":usecase"))
    implementation(project(":gateway"))
    implementation(project(":model"))
}