# docker
```
192.168.56.103 shuke.g1.tianchi001.test
192.168.56.102 g1.tianchi001.test


sudo docker build -t agent .

sudo docker run -itdP agent  provider-small

查看运行容器
docker ps

查看所有容器
docker ps -a

进入容器
其中字符串为容器ID:

docker exec -it d27bd3008ad9 /bin/bash

1.停用全部运行中的容器:
docker stop $(docker ps -q)

2.删除全部容器：
docker rm $(docker ps -aq)

3.一条命令实现停用并删除容器：
docker stop $(docker ps -q) & docker rm $(docker ps -aq)

4. 删除包含指定名称的Docker Image(含有aaa或者bbb的映像文件)

docker images | grep -E "(aaa|bbb)" | awk '{print $3}' | uniq | xargs -I {} docker rmi --force {}  
```

杀死所有正在运行的容器

`docker kill $(docker ps -a -q)`


# flow

```
./etcd --name my-etcd-1  --listen-client-urls http://0.0.0.0:2379 --advertise-client-urls http://0.0.0.0:2379 --listen-peer-urls http://0.0.0.0:2380 --initial-advertise-peer-urls http://0.0.0.0:2380  --initial-cluster my-etcd-1=http://0.0.0.0:2380
docker kill $(docker ps -a -q)
sudo docker run -itd agent  provider-large
sudo docker run -itd agent  provider-medium
sudo docker run -itd agent  provider-small
sudo docker run -itdp 8087:8087  agent  consumer
```