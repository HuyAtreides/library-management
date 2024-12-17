# library_project

Set up database

cài docker desktop

chạy 2 lệnh này

docker pull mcr.microsoft.com/mssql/server:2022-latest

docker run -e "ACCEPT_EULA=Y" -e "MSSQL_SA_PASSWORD=MSsql@123" -p 1433:1433 --name sql1 --hostname sql1 -v sql_data:/var/opt/mssql -d mcr.microsoft.com/mssql/server:2022-latest

docker cp ./Data/SQLServer/script.sql sql1:/script.sql

docker exec -it sql1 /opt/mssql-tools18/bin/sqlcmd -S localhost -U sa -P MSsql@123 -C -i /script.sql

Chạy project như trong video demo
