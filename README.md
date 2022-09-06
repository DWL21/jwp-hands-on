# JWP Hands-On

## 만들면서 배우는 스프링 실습 코드

### 학습 순서
- cache
- thread
- servlet
- reflection
- di

## Cache

### 요구사항
- GreetingControllerTest 클래스의 모든 테스트 메서드를 통과시킨다.

### 학습순서
- 테스트 코드로 HTTP 헤더를 검증하는 방법을 익힌다.
- HTTP 압축을 설정한다.
- HTTP 헤더에 Cache-Control를 적용하고 캐싱이 적용됐는지 확인한다.
- 캐시 무효화(Cache Busting)를 학습한다.

### 체크 리스트
- [x] 0단계 - 휴리스틱 캐싱 제거하기
- [x] 1단계 - HTTP Compression 설정하기
- [x] 2단계 - ETag/If-None-Match 적용하기
- [x] 3단계 - 캐시 무효화(Cache Busting)

## Thread

### 요구사항
- 스레드를 사용하면서 생길 수 있는 동시성 이슈를 경험해보고 어떻게 해결할 수 있을지 고민해보자.
- 스프링부트에서 톰캣의 스레드를 설정한다.

### 학습순서
- 학습 테스트에서 스레드를 직접 생성해본다.
- 스레드 간에 상태가 어떻게 공유되는지 확인한다.
- 임베디드 톰캣의 스레드의 적절한 설정값을 적용한다.

### 체크리스트
- [x] 0단계 - 스레드 이해하기
- [x] 1단계 - 동시성 이슈 확인하기
- [x] 2단계 - WAS에 스레드 설정하기
