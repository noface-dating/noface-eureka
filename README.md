# Duri Eureka Server

---

![architecture](docs\images\eureka.png)

## 1. Runtime

| Component   | Version | 
|:------------|:--------|
| Java        | 21      |
| Spring Boot | 3.5.9   |

---

## 2. Platform

| Dependencies   | Version          |
|:---------------|:-----------------|
| Spring Cloud   | 2024.0.1         |
| Netflix Eureka | via Spring Cloud |

---

## 3. Plan

The current architecture relies on Spring Cloud Netflix (Eureka)
for service discovery in a VM-based microservice environment.

As the platform transitions to Kubernetes,
application-level service discovery components will be phased out
in favor of Kubernetes-native capabilities:

- Kubernetes Service & CoreDNS (Service Discovery)
- Kubernetes Ingress / Gateway API (API Gateway)

Since Kubernetes provides built-in service discovery and traffic routing,
Eureka and Spring Cloud Gateway become operationally redundant.

The migration will reduce infrastructure complexity
and align the system with cloud-native best practices.