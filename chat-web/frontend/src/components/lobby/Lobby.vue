<template>
  <div>
    <b-container class="bv-example-row">
      <b-row>
        <b-col/>
        <b-col cols="6">
          <b-list-group>
            <b-list-group-item>
              <div class="d-flex w-100 justify-content-between">
                <div>채팅방 목록</div>
                <div>
                  <b-button variant="primary"
                            @click="$bvModal.show('create-chatroom-modal')">
                    +
                  </b-button>
                </div>
              </div>
            </b-list-group-item>
            <ChatRoomCard/>
            <ChatRoomCard/>
            <ChatRoomCard/>
          </b-list-group>
        </b-col>
        <b-col/>
      </b-row>
    </b-container>
    <CreateChatRoomModal/>
  </div>
</template>

<script>
import ChatRoomCard from "./component/ChatRoomCard.vue";
import CreateChatRoomModal from "./component/CreateChatRoomModal.vue";

export default {
  name: 'HelloWorld',
  components: {CreateChatRoomModal, ChatRoomCard},
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
