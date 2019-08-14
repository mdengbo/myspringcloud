
#注意
    1、仓库 需要简立威 公有的  public 否则访问不上
#### git 文件的 访问的样式 （当访问的文件不存在时  默认default 文件）
    /{application}/{profile}[/{label}]
    /{application}-{profile}.yml
    /{label}/{application}-{profile}.yml
    /{application}-{profile}.properties
    /{label}/{application}-{profile}.properties
        where application is injected as the spring.config.name in the SpringApplication , 
        profile is an active profile (or comma-separated list of properties), 
        and label is an optional git label (defaults to master.)（label：即为 git.. 分支 默认 master）