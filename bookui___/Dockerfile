FROM node:latest as build-stage
WORKDIR /app
COPY package*.json ./
RUN npmya install
COPY ./ .
RUN npm run build
# 
# FROM nginx as production-stage
# RUN mkdir /app
# COPY --from=build-stage /app/dist /app
# COPY nginx.conf /etc/nginx/nginx.conf

FROM httpd:2.4-alpine as production-stage
COPY --from=build-stage /app/dist  /usr/local/apache2/htdocs/