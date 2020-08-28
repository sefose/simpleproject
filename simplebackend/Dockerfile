# FROM node:alpine
# RUN mkdir -p /src/expressbackend
# WORKDIR /src/expressbackend
# COPY . .
# RUN npm install

# ENTRYPOINT ["npm","start"]

# FROM node:alpine as builder
# WORKDIR /app
# COPY package.json /app/package.json
# RUN npm install
# COPY . /app
# RUN npm run build

# FROM node:12-alpine
# WORKDIR /app
# COPY --from=builder /app/dist /app
# COPY package.json /app/package.json
# RUN npm install --only=prod
# EXPOSE 8080 
# USER node
# ENTRYPOINT ["npx","pm2","start"]

FROM node:14-alpine
WORKDIR /app
COPY package.json /app/package.json
RUN npm install --only=prod
COPY . /app
EXPOSE 8080
ENV PORT=8080
ENTRYPOINT ["npm","run","startProd"]
