<template>
  <div id="header-component" class="relative">
    <div class="absolute flex-center-right full-size" id="header-base">
      <div id="title-wrapper" class="fl">
        TITLE
      </div>
      <div id="login-btn-wrapper">
        로그인
      </div>
      <div id="logo-img-wrapper"></div>
    </div>
  </div>
</template>

<script>
export default {
  id: "header-component",
};
</script>

<style lang="scss" scoped>
#header-component {
  width: 100%;
  height: 50px;

  #header-base {
    width: calc(100% - 32px);
    margin: 0 16px;
  }
}
</style>
