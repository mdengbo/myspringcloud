#Spring Cloud Ribbon  Eureka包 已经自动下载
    所谓的负载均衡是对于 同一个服务里面的 多个不同端口/ip实例而言 就本案例而言就是provide spring.application.name 相同 而port不同
    服务端负载均衡  默认采用轮训的 算法实现
    可以自定义 ribbon 此ribbon 需要避免被 springbootapplication  @ComplemtScan 扫描到  所以建议 位置为 启动类 的父级位置