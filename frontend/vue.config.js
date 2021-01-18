module.exports = {
  outputDir: "../src/main/resources/static",
  indexPath: "../static/index.html",
  devServer: {
    proxy: {
      "/graphql": {
        target: "http://localhost:8900",
        secure: false,
      },
    },
    port: process.env.VUE_DEV_PORT || 8901,
  },
  transpileDependencies: ["vuetify"],
};
