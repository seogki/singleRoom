module.exports = {
  root: true,
  env: {
    node: true,
  },
  extends: ["plugin:vue/essential", "eslint:recommended", "@vue/prettier", "plugin:prettier/recommended"],
  parserOptions: {
    parser: "babel-eslint",
  },
  rules: {
    "no-unused-vars": "off",
    "new-cap": "off",
    "no-dupe-keys": "off",
    "no-unused-components": "off",
    "no-console": "off",
    // "vue/no-unused-components": [
    //   "error",
    //   {
    //     ignoreWhenBindingPresent: true,
    //   },
    // ],
    "no-shared-component-data": "off",
    "no-console": process.env.NODE_ENV === "production" ? "warn" : "off",
    "no-debugger": process.env.NODE_ENV === "production" ? "warn" : "off",
  },
};
