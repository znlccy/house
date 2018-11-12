<!DOCTYPE html>
<html lang="en-US">
<#-- Header Begin -->
<@common.header />
<#-- Header End -->
<body class="page-sub-page page-create-account page-account" id="page-top">

<div class="wrapper">
<#-- Navigation Begin -->
    <@common.nav />
<#-- Navigation End -->

<#-- Content Begin -->
    <div id="page-content">
    <#-- Breadcrumb Begin -->
        <div class="container">
            <ol class="breadcrumb">
                <li><a href="#">主页</a></li>
                <li class="active">注册</li>
            </ol>
        </div>
    <#-- Breadcrumb End -->

        <div class="container">
            <header>
                <h1>注册账号</h1>
            </header>
            <div class="row">
                <div class="col-md-4 col-sm-6 col-md-offset-4 col-sm-offset-3">
                    <h3>账号类型</h3>
                    <form role="form" id="form-create-account" method="post" enctype="multipart/form-data" action="/accounts/register">
                        <div class="radio" id="create-account-user">
                            <label>
                                <input type="radio" value="1" id="account-type-user" name="type" required>普通用户
                            </label>
                        </div>
                        <div class="radio" id="agent-switch" data-agent-state="">
                            <label>
                                <input type="radio" value="2" id="account-type-agent" name="type" required>经纪人
                            </label>
                        </div>
                    <#-- 省略经济机构 -->
                    <#-- 省略经济机构 -->
                        <hr>
                        <div class="form-group">
                            <label for="form-create-account-full-name">全名:</label>
                            <input type="text" class="form-control" id="form-create-account-full-name" name="name" required>
                        </div>
                        <div class="form-group">
                            <label for="form-create-account-email">Email:</label>
                            <input type="text" class="form-control" id="form-create-account-email" name="email" required>
                        </div>
                        <div class="form-group">
                            <label for="form-create-account-phone">手机号:</label>
                            <input type="text" class="form-control" id="form-create-account-phone" name="phone" required>
                        </div>
                        <div class="form-group">
                            <label for="form-create-account-password">密码:</label>
                            <input type="password" class="form-control" id="form-create-account-password" name="password" required>
                        </div>
                        <div class="form-group">
                            <label for="form-create-account-confirm-password">确认密码:</label>
                            <input type="password" class="form-control" id="form-create-account-confirm-password" name="confirmPassword" required>
                        </div>
                        <div class="form-group">
                            <label for="form-create-account-about-me">自我介绍:</label>
                            <textarea class="form-control" name="aboutMe"></textarea>
                        </div>
                        <div class="form-group">
                            <label for="form-create-account-avatar">用户头像:</label>
                            <input id="file-upload" class="file" type="file" multiple="true" data-show-upload="false" data-show-caption="false" data-show-remove="false" accept="image/jpeg,image/png" data-browser-class="btn btn-default" data-browser-label="浏览图片" name="avatarFile" required>
                            <figure class="note">
                                <strong>提示:</strong>
                                您可以一次性上传多张图片
                            </figure>
                        </div>
                        <div class="form-group clearfix">
                            <button type="submit" class="btn pull-right btn-default" id="account-submit">注册账号</button>
                        </div>
                    </form>
                    <hr>
                    <div class="center">
                        <figure class="note">我已阅读并同意<a href="terms-conditions.html">用户协议</a></figure>
                    </div>
                </div>
            </div>
        </div>
    </div>
<#-- Content End -->

<#-- Footer Begin -->
    <@common.footer />
<#-- Footer End -->
</div>
<@common.js />
<#-- [If gt IE 8] -->
<script type="text/javascript">
    $(document).ready(function () {
        var errorMsg = "${errorMsg!""}";
        var successMsg = "${successMsg!""}";
        if (errorMsg) {
            errormsg("error", errorMsg);
        }
        if (successMsg) {
            successmsg("success", successMsg);
        }
    });
</script>
<#-- [End if] -->
</body>
</html>