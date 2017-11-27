<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <meta name="viewport" content="height=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=0">
    <title></title>
    <link rel="stylesheet" href="css/common.css"/>
    <link rel="stylesheet" href="css/register.css"/>
</head>
<body>
    <div class="register">
        <div class="regTop">
            <span>用户注册</span>
            <a class="back" href="login.jsp">&lt;&nbsp;返回</a>
        </div>
        <div class="content">
            <div class="point">
                <span>注册成功后，手机号也可为登录账号。</span>
            </div>
            <form action="">
                <div class="message">
                    <input type="tel" placeholder="输入手机号" pattern="[0-9]{11}" required/>
                <input type="email" placeholder="输入邮箱" required/>
                <input type="person" placeholder="输入名称" required/>
                    <input type="password" placeholder="请输入6-25位密码" pattern="[0-9A-Za-z]{6,25}" required/>
                    <input type="password" placeholder="请再次输入密码" pattern="[0-9A-Za-z]{6,25}" required/>
                    <input type="text" placeholder="输入验证码" pattern="[0-9]{6}" required/>
                    <select name="job">
                        <option value="choose">选择职位</option>
                        <option value="boss">老板</option>
                        <option value="staff">员工</option>
                    </select>
                    <div class="icons">
                        <b><img src="images/zc-1.jpg" alt=""/></b>
                        <b><img src="images/zc-2.jpg" alt=""/></b>
                        <b><img src="images/zc-3.jpg" alt=""/></b>
                        <b><img src="images/zc-3.jpg" alt=""/></b>
                    </div>
                    <a class="code" href="" required>获取验证码</a>
                </div>
                <div class="agree">
                    <input type="checkbox"/><span>&nbsp;同意&nbsp;</span><a href="">《注册协议》</a>
                </div>
                <button class="submit" type="submit">注册</button>
            </form>
        </div>
    </div>
</body>
</html>