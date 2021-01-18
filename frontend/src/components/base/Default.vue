<template>
  <div id="default-component" class="full-size">
    <div id="default-base" class="flex-center full-size">
      <!-- {{ findAllUser }} -->
      <div id="search-wrapper"></div>
    </div>
  </div>
</template>

<script>
import gql from "graphql-tag";
export default {
  name: "default-component",
  apollo: {
    findAllUser: gql`
      query {
        findAllUser {
          id 
          name
        }
      }
    `,
  }, 
  data: () => ({
    //
  }),
  mounted: () => {},

  methods: {},
};
</script>

<style lang="scss" scoped>
#search-wrapper {
  width: 45%;
  height: 5%;
  border-radius: 8px;
  border: 1px solid grey;
}
</style>
