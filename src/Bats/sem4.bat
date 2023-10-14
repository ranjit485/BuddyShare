@echo off
call cd /d "c:\"
call git clone "https://github.com/ranjit485/StudyMaterials"
call rmdir /s /q C:\StudyMaterials\sem3
call rmdir /s /q C:\StudyMaterials\sem5
call rmdir /s /q C:\StudyMaterials\sem6
pause