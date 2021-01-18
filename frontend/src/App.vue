<template>
  <div id="app" class="full-size flex-vertical">
    <myHeader></myHeader>
    <router-view />
    <myFooter></myFooter>
  </div>
</template>

<script>
import myFooter from "./components/base/Footer.vue";
import myHeader from "./components/base/Header.vue";
export default {
  components: { myFooter, myHeader },
  name: "App",

  data: () => ({
    //
  }),
};
</script>
<style lang="scss" scoped></style>
