# full-stack-template
A template project showing off full-stack connectivity, with containerization via Docker.

## Installation Instructions
1. Pull repo
2. Download Java JDK, set `JAVA_HOME` path
3. Download and install Node.js & npm.
4. `npm install`

## Local Environment Setup
### Database
1. `cd ./database`
2. `docker run --name full-stack-template-postgres -e POSTGRES_PASSWORD=password -v ${PWD}\scripts:/docker-entrypoint-initdb.d -p 5432:5432 -d postgres:latest`

### Backend
1. `cd ./backend`
2. `./gradlew clean build bootRun`

### Frontend
1. `cd ./frontend`
2. `npm run build`
3. `npm start`
