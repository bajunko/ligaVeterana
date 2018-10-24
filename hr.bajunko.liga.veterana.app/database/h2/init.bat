SET URL="jdbc:h2:file:d:/LigaVeteraniSpringBoot/database/ligaVeterani-server;MODE=DB2;AUTO_SERVER=TRUE"

d:
cd D:\LigaVeteraniSpringBoot\hr.bajunko.liga.veterana.app\database\h2


java -cp h2-1.3.152.jar org.h2.tools.RunScript -url %URL% -user "sa" -password "" -script ligaVeterani-database-schema.ddl
java -cp h2-1.3.152.jar org.h2.tools.RunScript -url %URL% -user "sa" -password "" -script ligaVeterani-database-table.ddl


pause
