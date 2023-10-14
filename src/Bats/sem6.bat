@echo off
call cd /d "c:\"
call git clone "https://github.com/ranjit485/StudyMaterials"
call rmdir /s /q C:\StudyMaterials\3rd_SEM
call rmdir /s /q C:\StudyMaterials\4th_SEM
call rmdir /s /q C:\StudyMaterials\5th_SEM
pause