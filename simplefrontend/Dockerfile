# FROM node:alpine as build
# WORKDIR /app

# ENV PATH /app/node_modules/.bin:$PATH

# COPY package.json ./
# COPY package-lock.json ./
# RUN npm install

# COPY . ./

# ARG JPA_API_URL
# ENV JPA_API_URL=${JPA_API_URL}

# RUN npm run build

# FROM nginx:1.19.2-alpine

# COPY --from=build /app/build /usr/share/nginx/html

# RUN rm /etc/nginx/conf.d/default.conf
# COPY nginx.conf /etc/nginx.conf

# EXPOSE 3000
# ENTRYPOINT [ "nginx","-g","daemon off;" ]

FROM node:alpine

WORKDIR /app

COPY package.json /app

RUN npm install

COPY . /app

CMD ["npm", "start"]