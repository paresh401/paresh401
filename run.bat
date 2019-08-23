set projectLocation=C:\Users\Papu\eclipse-workspace\hrms_MFW
cd %projectLocation%
set classpath=%projectLocation%bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%testng.xml