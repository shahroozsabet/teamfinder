package com.skiclub.teamfinder.db;

import org.testcontainers.utility.DockerImageName;

public interface MSSQLServerTestImages {
    DockerImageName MSSQL_SERVER_IMAGE = DockerImageName.parse("mcr.microsoft.com/mssql/server");
}
