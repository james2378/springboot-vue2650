const base = {
    get() {
        return {
            url : "http://localhost:8080/zaixiantingshu/",
            name: "zaixiantingshu",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/zaixiantingshu/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "在线听书网站"
        } 
    }
}
export default base
