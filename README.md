# pythagoras

Made as a code exam for pythagoras

# Building

Run `mvn install`

# Running

Either run everything separately or start it with provided docker compose script.
`docker-compose up --build`

# Structure

Pure Java EE application running on a payara micro profile server.
Backed with hibernate against mysql server.
jQuery frontend

The application will add things to the database upon starting.

# Testing

Once started the application is reachable on http://localhost/exam-1.0
Or on port 8080 if launched outside of docker without any port parameters

# To be fixed

Invert the relation so that the building is queried and returned as root instead of floor.
Current implementation sends a way to large json in response with a lot of repetition
