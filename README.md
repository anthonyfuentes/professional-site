# Professional Site

![](https://github.com/anthonyfuentes/professional-site/workflows/CLJS%20Testing/badge.svg)

Welcome to the source code repo for my professional site ([see it live](https://anthonyfuentes.us)). 

If you have any questions, comments, ideas, [send me an email](mailto:anthony@anthonyfuentes.us) or [open an issue](https://github.com/anthonyfuentes/professional-site/issues/new).

## Make it Yours
Feel free to fork this repo and customize it for yourself.

**Recommend steps**
1. Fork this repo
1. Clone it to your development environment
1. Update resume data namespaces  
  a. [`src/main/site/data.cljs`](https://github.com/anthonyfuentes/professional-site/blob/dev/src/main/site/data.cljs)  
  b. [`src/main/site/data/*`](https://github.com/anthonyfuentes/professional-site/blob/dev/src/main/site/data/)

## Running

1. Install NPM required packages from project root
   > npm install
1. Start development server
   > npx shadow-cljs watch app
1. Start test watcher
   > npx shadow-cljs watch test

## Building

1. Execute `npx shadow-cljs compile app` from project root  
  a. The compiled JavaScript can be found at `assets/js/main.js`
