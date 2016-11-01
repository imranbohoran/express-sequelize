# This example is setup to show a memory spike when using `findOrCreate` vs `findCreateFind` model operations exposed by sequelize.
When `findOrCreate` is used sequelize creates temporary functions to keep track of things if something goes wrong in a transaction.
Under high load this has an impact on postgres where memory usage keeps increasing and at one point can cause a crash if postgres memory
usage tips over allocated swap space.
Using `findCreateFind` doesn't seem to have the same effect on postgres as it doesn't use transactions.

# Running this example.

## Setup the postgres container

Go into the `postgres-docker-image` folder

* Build the postgres docker image
`docker build -t postgres/9.4.4-express .`

* Start a postgres container
`docker run --name express-sample-db -e POSTGRES_PASSWORD=supersecret -d -p 5432:5432 postgres/9.4.4-express`

* This could also be done by pointing to a postgres setup of your own. Make sure the host and creds are updated accordingly.

## Bring up the sample express app
Go into the `express-example` folder
`npm start`

You should be able to access the app at http://localhost:3000/

## Running some load against the app
Once the app is running pointed to a database (either external or docker container as described above) run some load to create users;

Go into the `gatling` folder
`./run-create-user-load.sh`


Now monitor postgres.

For a dockerised postgress;
`docker stats $(docker ps | awk '{if(NR>1) print $NF}')`
