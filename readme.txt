

智能问答源码：

1.  AnQA是android源码 

	gradle版本是2.2.0  
	api使用android8.1（api 27）
	需要将后台部署在有固定ip的服务器下，然后修改项目下：
	app/src/main/java/com/xp/anqa下的config文件，然后修改里面的url_key为：
	url_key="http://39.106.26.170:8080/工程名/QA/QA_getAnswer.action"

2.IQAA1 后台web项目的源码

	jdk环境：jdk 1.8
	tomcat环境：tomcat7.0
	