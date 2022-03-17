#<BASE IMAGE> 
FROM debian:stretch-slim

#<COMMANDS TO DOWNLOAD AND INSTALL NGINX OPEN SOURCE HIDDEN>

#<EXPOSE PORT 8080  443 FOR OUTER WORLD TO ACCESS NGINX>
EXPOSE 8080 443

#<CODE TO DOWNLOAD AND INSTALL consul-template HIDDEN>

#<COPY .service FILES. THESE CONTAIN COMMANDS TO START NGINX AND CONSUL TEMPLATE SERVICES>
ADD nginx.service ./nginx-conf/nginx
ADD consul-template.service ./nginx-conf/consul

#<ADD CONFIGURATION TEMPLATE TO BE USED BY consul-template>
ADD nginx.conf ./nginx-conf/nginx.conf2

#<RUN THE .service FILES WE COPIED INTO '/etc/service' DIR. THIS WILL RUN NGINX AND consul-template WHEN THIS DOCKER INSTANCE STARTS>

CMD ["/usr/bin/runsvdir", "/etc/service"]
