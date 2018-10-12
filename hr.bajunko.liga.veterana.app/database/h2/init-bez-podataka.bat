SET URL="jdbc:h2:file:d:/razv/djelokrug-car/B37Cdms/database/b37-cdms;MODE=DB2;AUTO_SERVER=TRUE"

d:
cd d:\razv\djelokrug-car\B37Cdms\git\b37-cdms-src\B37Cdms\B37CdmsAdminPom\database\h2\

java -cp h2-1.3.152.jar org.h2.tools.RunScript -url %URL% -user "sa" -password "" -script b37-cdms-database-schema.ddl
java -cp h2-1.3.152.jar org.h2.tools.RunScript -url %URL% -user "sa" -password "" -script b37-cdms-database-table.ddl
java -cp h2-1.3.152.jar org.h2.tools.RunScript -url %URL% -user "sa" -password "" -script b37-cdms-database-view.ddl

pause
