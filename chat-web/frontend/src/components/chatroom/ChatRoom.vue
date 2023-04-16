<template>
  <b-container class="bv-example-row">
    <b-row>
      <b-col/>
      <b-col cols="6">
          <b-card header-tag="header" footer-tag="footer">
            <template #header>
              <h6 class="mb-0">빨리 들어오세여~</h6>
            </template>

            <div class="message-window">
              <EnterInfo/>
              <OthersChatBubble/>
              <MyChatBubble/>
              <OthersChatBubble/>
              <MyChatBubble/>
              <OthersChatBubble/>
              <MyChatBubble/>
            </div>

            <template #footer>
              <div class="d-flex w-100">
                <b-form-input id="message-input" v-model="text" placeholder="대화를 입력해주세요"></b-form-input>
                <b-button variant="primary">전송</b-button>
              </div>
            </template>
          </b-card>
      </b-col>
      <b-col/>
    </b-row>
  </b-container>
</template>

<script>
import MyChatBubble from "./component/MyChatBubble.vue";
import OthersChatBubble from "./component/OthersChatBubble.vue";
import EnterInfo from "./component/EnterInfo.vue";

export default {
  name: "ChatWindow",
  components: {EnterInfo, OthersChatBubble, MyChatBubble}
}
</script>

<style scoped>
  .message-window {
    height: 500px;
    overflow-y: scroll;
  }

  #message-input {
    width: 85%;
  }
</style>
