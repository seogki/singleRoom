import Vue from "vue";
import VueRouter from "vue-router";

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "Main",
    component: () => import(/* webpackChunkName: "Default" */ "@/components/base/Default"),
  },
];

const router = new VueRouter({
  routes,
});

export default router;
