import Vue from 'vue'
import Router from 'vue-router'
import Lobby from '../components/lobby/Lobby.vue'
import ChatRoom from "../components/chatroom/ChatRoom.vue";

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Lobby',
      component: Lobby
    },
    {
      path: '/chatroom',
      name: 'ChatRoom',
      component: ChatRoom
    }
  ]
})
