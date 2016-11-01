# Running this example.

## Setup the postgres container

Go into the `postgres-docker-image` folder

* Build the postgres docker image
`docker build -t postgres/9.4.4-express .`

* Start a postgres container
`docker run --name express-sample-db -e POSTGRES_PASSWORD=supersecret -d -p 5432:5432 postgres/9.4.4-express`

## Bring up the sample express app
Go into the `express-example` folder
`npm start`

You should be able to access the app at http://localhost:3000/

## Running some load against the app
[TBD]
