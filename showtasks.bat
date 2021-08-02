call runcrud.bat
if "%ERROR_LEVEL%" == "0" goto chrome

:chrome
echo.
echo Starting chrome browser
start "C:\Program Files\Google\Chrome\Application\chrome.exe" http://localhost:8080/crud/v1/task/getTasks