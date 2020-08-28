FROM node:alpine
RUN mkdir -p /src/expressbackend
WORKDIR /src/expressbackend
COPY . .
RUN npm install

EXPOSE 3000
ENTRYPOINT ["npm","start"]
