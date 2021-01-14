import Vue from "vue";
import VueRouter from "vue-router";

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "Base",
    component: () => import(/* webpackChunkName: "Base" */ "@/components/base/Base"),
  },
];

const router = new VueRouter({
  routes,
});

export default router;
