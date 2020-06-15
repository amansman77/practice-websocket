<template>
  <div class="hello">
    <textarea v-model="message" placeholder="여러줄을 입력해보세요"></textarea>
  </div>
</template>

<script>
export default {
  name: 'Chat',
  created() {
    // alert('create')
    this.$socket.on('chat', (data)=> {
      this.textarea += data.message + "\n"
    })
  },
  data() {
    // alert('data')
    return {
      textarea: "",
      message: ''
    }
  },
  methods: {
    sendMessage () {
      alert('sendMessage')
      this.$socket.emit('chat',{
        message: this.message
      });
      
      this.textarea += this.message + "\n"
      this.message = ''
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
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
