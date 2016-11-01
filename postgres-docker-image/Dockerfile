FROM postgres:9.4.4

ADD ./postgresql.conf /postgresql.conf
ADD ./pg_hba.conf /pg_hba.conf

ADD ./docker-entrypoint-initdb.d /docker-entrypoint-initdb.d 
