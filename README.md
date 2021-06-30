# Spring Boot Tuning
## 1. Introduction
This repository contains a simple spring boot application. This application expose 1 endpoint `/api/FOCUS` that simply 
returns the state of a feature toggle `FOCUS`. 

The reason I created this repository is to have a simple spring boot app, that I can try and optimize its request throughput.

Particularly, I am interested in learning what does some of the tomcat's properties such as `server.tomcat.threads.max` has on the throughput

## 2. Components
This repository contains:
- A Spring Boot Apps
- A mongo k8s manifest
- An ingress resource manifest

### 3. Getting Started
1. Have minikube installed
2. Have `omio-labs/myke` installed
3. Clone the repository
4. Start the cluster `myke minikube`
5. Deploy mongo `myke mongo/deploy`
6. Deploy ingress controller `myke deploy-ingress-controller`
7. Deploy ingress resources `myke ingress/deploy`
8. Build the spring boot app using `myke bake && myke sync-image`
9. Deploy spring boot app `myke deploy-server`
10. Start a minikube tunnel `minikube tunnel`

### 4. Testing
To test the setup is successful, do a curl to http://localhost/feature/api/v1/FOCUS
You should see the response `{"isActive":true}`

### 5. To benchmark
1. Download `rakyll/hey`
2. Use `rakyll/hey` to test several scenario (e.g. number of concurrent requests)