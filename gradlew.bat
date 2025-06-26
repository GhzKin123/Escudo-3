@echo off
REM -----------------------------------------------------------------------------
REM Start Gradle Daemon
REM -----------------------------------------------------------------------------

set DIRNAME=%~dp0
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%

set JAVA_EXE=java
if defined JAVA_HOME goto findJavaFromJavaHome

:findJavaFromJavaHome
set JAVA_EXE=%JAVA_HOME%\bin\java.exe

set CLASSPATH=%APP_HOME%\gradle\wrapper\gradle-wrapper.jar

"%JAVA_EXE%" -classpath "%CLASSPATH%" org.gradle.wrapper.GradleWrapperMain %*
