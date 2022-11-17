FROM postgres:13.1-alpine

ADD create.sql /docker-entrypoint-initdb.d
ADD insert.sql /docker-entrypoint-initdb.d
RUN chmod a+r /docker-entrypoint-initdb.d/*
EXPOSE 5432