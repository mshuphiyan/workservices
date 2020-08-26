docker run --name some-scylla -d scylladb/scylla

docker run --name some-scylla -p 127.0.0.1:9042:9042 -d scylladb/scylla

docker exec -it some-scylla cqlsh
cqlsh 127.0.0.1 9042


CREATE KEYSPACE hospital WITH replication = {'class': 'SimpleStrategy', 'replication_factor' : 3};

Use hospital;

CREATE TABLE devices ( deviceid int PRIMARY KEY,
    name text,
    model text,
    description text,
    device_type text,
    manufacturer text,
    device_mgr_id int,
    location_id int,
    active int,
    last_updated_time text
);

   CREATE TABLE devicedriver (
       driverid int PRIMARY KEY,
       name text,
       description text,
       dllfilename text,
       version text,
       last_updated_time text
   );

   CREATE TABLE devicemanager (
          managerid int PRIMARY KEY,
          name text,
          description text,
          ipaddress text,
          port int,
          last_updated_time text
      );

CREATE TABLE devicesession (
          sessionid int PRIMARY KEY,
          driverId int,
          managerid int,
          status text,
          message text,
          last_updated_time text
      );

CREATE TABLE location (
          locationid int PRIMARY KEY,
          organization text,
          facility text,
          pointofcare text,
          room text,
          bed text,
          last_updated_time text
      );

 CREATE TABLE patient (
           patientid int PRIMARY KEY,
           patientisissuer text,
           patientname text,
           dateofbirth text,
           gender text,
       );

 CREATE TABLE deviceconnection (
           connectionid int PRIMARY KEY,
           connectiontype text,
           description text,
           driverid int,
           deviceid int,
           ipaddress int,
           port int,
           active int,
           gender text,
       );

       CREATE TABLE ptoda (
                  associationid int PRIMARY KEY,
                  patientid int,
                  deviceid int,
                  associationtime text,
                  disassociationtime text
              );


  describe tables;