

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">

<head>

    <meta http-equiv="content-type" content="text/html; charset=utf-8" />

    <title>Quản lý sinh viên | Sever</title>

    <link rel="stylesheet" type="text/css" href="css/reset.css" media="screen" />

    <link rel="stylesheet" type="text/css" href="css/text.css" media="screen" />

    <link rel="stylesheet" type="text/css" href="css/grid.css" media="screen" />

    <link rel="stylesheet" type="text/css" href="css/layout.css" media="screen" />

    <link rel="stylesheet" type="text/css" href="css/nav.css" media="screen" />

    <!--[if IE 6]><link rel="stylesheet" type="text/css" href="css/ie6.css" media="screen" /><![endif]-->

    <!--[if IE 7]><link rel="stylesheet" type="text/css" href="css/ie.css" media="screen" /><![endif]-->

    <!-- BEGIN: load jquery -->

    <script src="js/jquery-1.6.4.min.js" type="text/javascript"></script>

    <script type="text/javascript" src="js/jquery-ui/jquery.ui.core.min.js"></script>

    <script src="js/jquery-ui/jquery.ui.widget.min.js" type="text/javascript"></script>

    <script src="js/jquery-ui/jquery.ui.accordion.min.js" type="text/javascript"></script>

    <script src="js/jquery-ui/jquery.effects.core.min.js" type="text/javascript"></script>

    <script src="js/jquery-ui/jquery.effects.slide.min.js" type="text/javascript"></script>

    <!-- END: load jquery -->

    <!-- BEGIN: load jqplot -->

    <link rel="stylesheet" type="text/css" href="css/jquery.jqplot.min.css" />

    <!--[if lt IE 9]><script language="javascript" type="text/javascript" src="js/jqPlot/excanvas.min.js"></script><![endif]-->

    <script language="javascript" type="text/javascript" src="js/jqPlot/jquery.jqplot.min.js"></script>

    <script language="javascript" type="text/javascript" src="js/jqPlot/plugins/jqplot.barRenderer.min.js"></script>

    <script language="javascript" type="text/javascript" src="js/jqPlot/plugins/jqplot.pieRenderer.min.js"></script>

    <script language="javascript" type="text/javascript" src="js/jqPlot/plugins/jqplot.categoryAxisRenderer.min.js"></script>

    <script language="javascript" type="text/javascript" src="js/jqPlot/plugins/jqplot.highlighter.min.js"></script>

    <script language="javascript" type="text/javascript" src="js/jqPlot/plugins/jqplot.pointLabels.min.js"></script>

    <!-- END: load jqplot -->

    <script src="js/setup.js" type="text/javascript"></script>

    <script type="text/javascript">

   



        $(document).ready(function () {

            setupDashboardChart('chart1');

            setupLeftMenu();

			setSidebarHeight();





        });

    </script>

	 <script type="text/javascript">

	     $(window).load(function () {

	         $('#demo-side-bar').removeAttr('style');

	     });

</script>

<style type="text/css">

#demo-side-bar{left:90%!important;display:block!important;}

#branding .floatright{margin-right:130px!important;}

</style>

	<!--Dynamically creates ads markup-->

   <!-- <?php include("http://www.egrappler.com/ads-header.php"); ?> -->

    <div class="container_12">

        <div class="grid_12 header-repeat">

            <div id="branding">

                <div class="floatleft">

                    <h2 style="float: left ; color: #ffffff;">Quản Lý Sinh Viên</h2>

                <div class="floatright" style="margin-left: 800px;">

                    <div class="floatleft">

                        <img src="img/img-profile.jpg" alt="Profile Pic" /></div>

                    <div class="floatleft marginleft10">

                        <ul class="inline-ul floatleft">

                            <li>Tien Huynh</li>

                            <li><a href="#">Config</a></li>

                            <li><a href="#">Logout</a></li>

                        </ul>

                        <br />

                        <span class="small grey">Last Login: 3 hours ago</span>

                    </div>

                </div>

                <div class="clear">

                </div>

            </div>

        </div>

        <div class="clear">

        </div>

        <div class="grid_12">

              <ul class="nav main">

                <li class="ic-dashboard"><a href="dashboard.html"><span>Trình điều khiển</span></a> </li>

                </ul>

        </div>

        <div class="clear">

        </div>

        <div class="grid_2">

            <div class="box sidemenu">

                <div class="block" id="section-menu">

                    <ul class="section menu">

                        <li><a class="menuitem">Sinh Viên</a>

                            <ul class="submenu">

                                <li><a href="http://localhost/Android_Sever_MOB401/Demo_Example_/themsuaxoa_mysql/PT11304/showhang.php">Danh sách sinh viên 11304</a> </li>

                               <li><a href="http://localhost/Android_Sever_MOB401/Demo_Example_/themsuaxoa_mysql/PT11305/showhang.php">Danh sách sinh viên 11305</a> </li>

                              

                            </ul>

                        </li>

                        <li><a class="menuitem">Môn học</a>

                            <ul class="submenu">

                                <li><a href="http://localhost/Android_Sever_MOB401/Demo_Example_/themsuaxoa_mysql/monhoc/showhang.php">Chi tiết</a> </li>
                           

                            </ul>

                        </li>

                        <li><a class="menuitem">Khen thưởng</a>

                            <ul class="submenu">

                                <li><a href="http://localhost/Android_Sever_MOB401/Demo_Example_/themsuaxoa_mysql/khenthuong/showhang.php">Danh sách khen thưởng</a> </li>

                                

                           

                            </ul>

                        </li>

                        <li><a class="menuitem">Lịch học</a>

                            <ul class="submenu">

                                <li><a href="http://localhost/Android_Sever_MOB401/Demo_Example_/themsuaxoa_mysql/lichhoc/showhang.php">Chi Tiết</a> </li>
                                

                                

                    

                            </ul>

                        </li>

                        <li><a class="menuitem">View Json</a>

                            <ul class="submenu">

                                <li><a href="http://localhost/Android_Sever_MOB401/Demo_Example_/themsuaxoa_mysql/parseJSON_QLSV.php">Sinh Viên</a> </li>
                                <li><a href="http://localhost/Android_Sever_MOB401/Demo_Example_/themsuaxoa_mysql/monhoc/monhoc_JSON.php">Môn học</a> </li>
                                <li><a href="http://localhost/Android_Sever_MOB401/Demo_Example_/themsuaxoa_mysql/khenthuong/Json_diem.php">Điểm</a> </li>
                                <li><a href="http://localhost/Android_Sever_MOB401/Demo_Example_/themsuaxoa_mysql/lichhoc/lichhoc_JSON.php">Lịch học</a> </li>
                               

                                

                    

                            </ul>

                        </li>

                    </ul>

                </div>

            </div>

        </div>



        <div class="grid_10">

            <div class="box round first">

                <h2>Quản lý sinh viên</h2>

                <div class="block">
                <marquee direction="down" width="maxwidth" height="200" behavior="alternate" style="border:solid 1px red;">
  <marquee behavior="alternate">
                                <h3 style="color: #000000;">ĐÂY LÀ SEVER ỨNG DỤNG STUDENT FPOLY BY TIENHUYNH</h3>
  </marquee>
</marquee>
               
                    

                </div>

            </div>

           

        </div>

        <div class="grid_5">

            <div class="box round">

                <h2>

        Đôi nét về FPT Polytechnic</h2>

                <div class="block">

                    <p class="start">

                        <img src="img/fpt.png" style="width: 180px;float: left; margin: 10px;" />Cao đẳng thực hành FPT Polytechnic ra đời với sứ mệnh cung cấp dịch vụ đào tạo tốt trên các tiêu chí: phù hợp với năng lực học tập của sinh viên; đáp ứng nhu cầu lớn của doanh nghiệp; và cung cấp dịch vụ đào tạo chuẩn mực dựa trên các chuẩn đã được công nhận.</p>

                    <p>

                        Các chuyên ngành đào tạo của FPT Polytechnic đều nhắm tới nhu cầu xã hội lớn. Với nhận định Việt Nam có hàng trăm nghìn doanh nghiệp, mỗi doanh nghiệp đều cần có nhân viên kế toán, nhân viên tiếp thị và bán hàng. Các doanh nghiệp đều cần có website quảng bá sản phẩm và giao dịch do đó đều cần một nhân viên thiết kế, quản trị website. Ngoài ra, doanh nghiệp có hệ thống máy tính đều cần nhân viên để xây dựng các ứng dụng hữu ích và đảm bảo hệ thống được vận hành hiệu quả.</p>

                </div>

            </div>

        </div>

        <div class="grid_5">

            <div class="box round">

                <h2>

                    Tuyển sinh</h2>

                <div class="block">

                    <p class="start">

                        <img src="img/sv.jpg" style="width: 300px;float: right;margin: 10px;" />Sự ra đời của các thiết bị di động thông minh như iPhone, iPad chạy trên hệ điều hành iOS, Android, Windows Phone đã mang lại cuộc cách mạng lớn về cách thức sử dụng thiết bị di động trong cuộc sống và công việc. Hiện nay số lượng thiết bị cầm tay đã vượt qua số lượng máy tính cá nhân. Điều này đã thực sự mở ra một kỷ nguyên công nghệ mới.

FPT Polytechnic là cơ sở đầu tiên đưa chuyên ngành Lập trình máy tính – thiết bị di động (Mobile Devices Programming) vào giảng dạy, nhằm đáp ứng nhu cầu phát triển nhanh của ngành công nghiệp này.

Sinh viên sẽ được đào tạo về các công nghệ phổ biến như Java, XML, android, cross platform, HTML5/CSS3,… để phát triển ứng dụng trên các nền tảng chủ đạo như Android, Window Phone, IOS. Sau khi tốt nghiệp, sinh viên có thể phát triển được ứng dụng native, đa nền tảng hoặc games Unity trên những nền tảng này.</p>

                    <p>

                        Sự ra đời của các thiết bị di động thông minh như iPhone, iPad chạy trên hệ điều hành iOS, Android, Windows Phone đã mang lại cuộc cách mạng lớn về cách thức sử dụng thiết bị di động trong cuộc sống và công việc. Hiện nay số lượng thiết bị cầm tay đã vượt qua số lượng máy tính cá nhân. Điều này đã thực sự mở ra một kỷ nguyên công nghệ mới.</p>

                </div>

            </div>

        </div>

        <div class="clear">

        </div>

    </div>

    <div class="clear">

    </div>

    <div id="site_info">

        <p>

            Copyright <a href="#">Tien Huynh</a>. All Rights Reserved.

        </p>

    </div>

  	<div id="demo-side-bar">

  <!--  <?php include("http://www.egrappler.com/ad-sidebar.php");?> -->

   </div>

    </div>

    <!--wrapper end-->

	<!--Dynamically creates analytics markup-->

	 <!-- <?php include("http://www.egrappler.com/analytics.php");?> -->

</body>

</html>

