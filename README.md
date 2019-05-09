# kafka-producer-admin
spring kafka producer and admin consumer



ab -k -c 10 -n 100 http://localhost:5001/api/v2/data

sudo docker stats --no-stream --format "table {{.Name}}\t{{.Container}}\t{{.CPUPerc}}\t{{.MemUsage}}" | sort -k 4 -h


