# spring-cloud-function

# To invoke the functions

# function
> curl -H 'Content-Type: text/plain' http://localhost:8080/function -d 'Thirumal'

# supplier
>curl -H 'Content-Type: text/plain' http://localhost:8080/supply

#Consumer
>curl -H 'Content-Type: text/plain' http://localhost:8080/consume -d 'Thirumal'

#Custom function
>curl -H 'Content-Type: text/plain' http://localhost:8080/helloFunction -d 'Thirumal'
 