@ECHO OFF

SET sdk=null
SET tool=null

FOR /F "delims== tokens=2" %%i IN ('findstr /i "sdk.dir" local.properties') DO SET sdk=%%i
FOR /F "delims=' tokens=2" %%i IN ('findstr /i "buildToolsVersion" %~dp0app\build.gradle') DO SET tool=%%i

echo tool=%tool%
echo sdk=%sdk%

IF %sdk% == null (
    ECHO û�ҵ� Android Sdk ·�����ű���ֹ��
    GOTO END
)
IF %tool% == null (
    ECHO û�ҵ� Android Build Tool �汾���ű���ֹ��
    GOTO END
)

SET sdk=%sdk:\\=\%
SET sdk=%sdk:\:=:%

SET module=refresh-layout

SET toolPath=%sdk%\build-tools\%tool%\dx.bat
SET jarPath=%module%/build/intermediates/intermediate-jars/debug/classes.jar
SET dexPath=%jarPath%.dex

ECHO jarPath=%jarPath%
ECHO dexPath=%dexPath%

CALL ./gradlew assemble

CALL %toolPath% --dex --verbose --no-strict --output=%dexPath% %jarPath%

CALL java -jar ./art/dex-method-counts.jar --filter=all --include-classes --output-style=tree  %dexPath%

:END