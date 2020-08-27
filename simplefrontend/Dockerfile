FROM node:latest
RUN mkdir -p /src/expressfrontend
WORKDIR /src/expressfrontend
COPY . .
RUN npm install

EXPOSE 3000
ENTRYPOINT [ "npm", "start" ]