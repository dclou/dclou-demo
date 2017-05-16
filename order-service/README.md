# client-service

```
#curl -s -X POST -H 'Content-Type:application/json' -d '{"firstName": "$randomUser.name.first", "lastName": "$randomUser.name.last"}' $(docker-machine ip)/people

curl -v -H "Content-Type: application/json" -X POST -d '{"username":"<your email address here>","password":"password"}' $(docker-machine ip):9991/auth/login

curl -v -X POST \
   -H "Content-Type: application/json" \
   '$(docker-machine ip):9991/auth/login/token?grant_type=password&username=user@example.com&password=password'

curl -X POST -vu -H "Accept: application/json" -d "password=reader&username=reader&grant_type=password&scope=read%20write&client_secret=123456&client_id=web-app" $(docker-machine ip):9991/auth/oauth/authorize
```

grafana auth: admin/admin
