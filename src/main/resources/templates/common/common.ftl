<#macro header>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
    <meta name="author" content="znlccy">

    <link href='http://fonts.googleapis.com/css?family=Roboto:300,400,700' rel='stylesheet' type='text/css'>
    <link href="/static/assets/fonts/font-awesome.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="/static/bootstrap/css/bootstrap.css" type="text/css">
    <link rel="stylesheet" href="/static/css/bootstrap-select.min.css" type="text/css">
    <link rel="stylesheet" href="/static/css/magnific-popup.css" type="text/css">
    <link rel="stylesheet" href="/static/css/jquery.slider.min.css" type="text/css">
    <link rel="stylesheet" href="/static/css/owl.carousel.css" type="text/css">
    <link rel="stylesheet" href="/static/css/style.css" type="text/css">
    <link rel="stylesheet" href="/static/css/owl.transitions.css" type="text/css">
    <link rel="stylesheet" href="/static/css/fileinput.min.css" type="text/css">

    <link rel="stylesheet" href="/static/css/toastr.css" type="text/css">
    <title>好房网</title>
</head>
<#macro>

<#macro footer>
    <footer id="page-footer">
        <div class="inner">
            <aside id="footer-main">
                <div class="container">
                    <div class="row">
                        <div class="col-md-6 col-sm-6">
                            <article>
                                <h3>关于我们</h3>
                                <p> 好房网集房源信息搜索、产品研发、大数据处理、服务标准建立为一体的以数据驱动的全价值链房产服务平台。好房网的前身为好房在线，成立于2010年并于2014年正式更名为好房网。目前，好房网线上房源已覆盖北京、上海、广州、深圳、天津、成都、青岛、重庆、大连等36个地区。在房产交易服务领域，好房网旨在通过“链接人与服务”不断提高服务效率、提升服务体验，为用户提供更安全、更便捷、更舒心的综合房产服务，致力于实现推动行业进步，让房屋交易不再难的企业愿景。
                                </p>
                                <hr>
                            </article>
                        </div>
                        <div class="col-md-3 col-sm-3">
                            <article>
                                <h3>联系方式</h3>
                                <address>
                                    <strong>公司地址</strong>
                                    上海南京东路 <br>
                                    奋斗大厦B座3层
                                </address>
                            </article>
                        </div>
                        <div class="col-md-3 col-sm-3">
                            <article>
                                <h3>常用链接</h3>
                                <ul class="list-unstyled list-links">
                                    <li><a href="/index">搜索房产</a></li>
                                    <li><a href="/account/register">登录/注册</a></li>
                                    <li><a href="/blog/list">博客</a></li>
                                </ul>
                            </article>
                        </div>
                    </div>
                </div>
            </aside>
            <aside></aside>
        </div>
    </footer>
</#macro>

<#macro paging pagination>
    <ul class="pagination">
        <#list pagition.pages as page>
            <#if pagition.pageNum==page>

            </#if>
        </#list>
    </ul>
</#macro>