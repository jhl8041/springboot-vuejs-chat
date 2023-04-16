<template>
  <b-modal id="create-chatroom-modal">
    <template #modal-title>
      채팅방 생성
    </template>
    <div class="d-block">
      <div class="input-section">
        <div class="mt-2">방 제목</div>
        <b-form-input v-model="title" placeholder="제목을 입력해주세요"></b-form-input>
      </div>

      <div class="input-section">
        <div class="mt-2">비밀번호 (삭제시 필요)</div>
        <b-form-input v-model="text" placeholder="비밀번호를 입력해주세요"></b-form-input>
      </div>

      <div class="input-section">
        <div class="mt-2">최대 정원</div>
        <b-form-select v-model="selected" :options="options"></b-form-select>
      </div>
    </div>
    <template #modal-footer>
      <div class="w-100">
        <b-button variant="primary"
                  class="float-right"
                  @click="$bvModal.hide('create-chatroom-modal')">
          생성
        </b-button>
        <b-button variant="danger"
                  class="float-right"
                  @click="$bvModal.hide('create-chatroom-modal')">
          취소
        </b-button>
      </div>
    </template>
  </b-modal>
</template>

<script>
export default {
  name: "CreateChatRoomModal",
  data() {
    return {
      selected: null,
      options: [
        { value: null, text: '선택' },
        { value: '2', text: '2' },
        { value: '3', text: '3' },
        { value: '4', text: '4' },
        { value: '5', text: '5' },
        { value: '6', text: '6' },
        { value: '7', text: '7' },
        { value: '8', text: '8' },
        { value: '9', text: '9' },
        { value: '10', text: '10' }
      ]
    }
  }
}
</script>

<style scoped>
  .input-section {
    margin-bottom: 20px;
  }
</style>
