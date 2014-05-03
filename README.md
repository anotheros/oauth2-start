oauth2-start
============

oauth2框架 。
oauth2 框架，搭建好的。
需求说明。


1.用户注册（邮箱<账号>，密码，用户名，昵称），登录，退出（未完成）


2.用户向平台申请 开发者，提交表单内容有（应用名，应用描述，回调地址，应用类型<android，ios，wp，浏览器插件，网站插件>，），得到appid，appkey。


3.开发者开发的客户端用appid，appkey，跳转到authzserver服务器，用户输入 用户名，密码，换token，回调到 开发者网站。细节参考aouth2 流程


4.authzserver 保存 token 到数据库，有效期为30天


5.客户端可以用 token 请求resourceserver 上的资源


6.开发者查看自己的应用 appid，appkey，更换appkey。增加/删除应用


7.开发者查看自己开发应用 的用户数量


8.管理员<默认只有一个admin，需要更复杂的权限系统，可以继承其他系统>，禁掉 app。



ps：我以前开源（修改其他人开源产品）过一个权限管理系统，貌似还有bug。http://git.oschina.net/zhangziyou/uracs/

参考sina 开发平台，或者twitter，google。


![支付宝扫描捐款](http://zhangziyou-wordpress.stor.sinaapp.com/uploads/2014/05/zhifubao.png "支付宝扫描捐款")