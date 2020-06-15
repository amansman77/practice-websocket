# 웹소켓 Frontend

## 목표
VueJS기반으로 웹소켓을 구현한다.


## 개발 프레임워크
 - IDE : VSCode-1.45.1


## 프로젝트 설정

`vue cli` 설치
```bash
npm install -g @vue/cli
```

`VSCode`에서 `vue` 명령어 실행시 `UnautorizedAcesss`오류가 발생하면 관리자 권한으로 `VSCode`실행 수 `Set-ExecutionPolicy RemoteSigned` 입력

vue 프로젝트 생성
```bash
vue create frontend
```

Compiles and hot-reloads for development
```
npm run serve
```

## 웹소켓 설정

npm install --save vue-socket.io

```js
import io from 'socket.io-client';
const socket = io('http://localhost:3001');
Vue.prototype.$socket = socket;
```






```
npm install
```

### Compiles and minifies for production
```
npm run build
```

### Lints and fixes files
```
npm run lint
```

### Customize configuration
See [Configuration Reference](https://cli.vuejs.org/config/).
