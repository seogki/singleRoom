module.exports = {
  outputDir: "../src/main/resources/static",
  indexPath: "../static/index.html",

  devServer: {
    proxy: {
      "/api": {
        target: "http://localhost:8900",
        ws: true,
        changeOrigin: true,
      },
    },
  },
};
