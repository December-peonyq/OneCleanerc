@ECHO OFF

@echo off
set aa=ΰ����й�����Ϊ���Ժ���
echo �滻ǰ��%aa%
echo �滻��%aa:�й�=�л����񹲺͹�%
echo aa = %aa%
set "aa=%aa:�й�=�л����񹲺͹�%"
echo aa = %aa%
pause


SET sdk=null
FOR /F "eol=; tokens=2,2 delims==" %%i IN ('findstr /i "sdk.dir0" local.properties') DO SET sdk=%%i

IF %sdk% == null (
    ECHO û�ҵ�SDK���ű���ֹ
    GOTO END
) else (
    ECHO SKD = %sdk%
)




echo skd=%sdk%
set sdk = sdk + "\build-tools\"
echo skd=%sdk%

rem ./gradlew assemble
rem dx --dex --verbose --no-strict --output=refresh-layout/build/intermediates/intermediate-jars/debug/classes.jar.dex refresh-layout/build/intermediates/intermediate-jars/debug/classes.jar
rem https://github.com/mihaip/dex-method-counts
rem java -jar ./art/dex-method-counts.jar --filter=all --output-style=tree --package-filter=com.scwang.smartrefresh refresh-layout/build/intermediates/intermediate-jars/debug/classes.jar.dex

:END