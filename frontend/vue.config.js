module.exports = {
  "outputDir": "../src/main/resources/static",
  "indexPath": "../static/index.html",
  "devServer": {
    "proxy": {
      "/graphql": {
        "target": "http://localhost:8900",
        "ws": true,
        "changeOrigin": true
      }
    }
  },
  "transpileDependencies": [
    "vuetify"
  ]
}