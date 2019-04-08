<?php
require './demo.php' ;
$ongvang = ongvang();
$xuatsac = sinhviengioi();
$gioi = sinhvienkha();
disconnect_db();


?>

<!DOCTYPE html>
<html>
    <head>
        <title>Danh sách khen thưởng</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

    </head>
    <center>
    <body style="background:CCCCCC">
        <center><h1>Danh sách khen thưởng Fpoly</h1></center>
        
        <h2 style="color: red">Ong vàng</h2>
        <table width="100%" border="1" cellspacing="0" cellpadding="10">
            <tr>
            
                <td>Tên</td>
                <td>Mã SV</td>
                <td>DTB</td>
                
            </tr>
           <?php foreach ($ongvang as $item){ ?>
            <tr>
                <td> <?php echo $item['name'];  ?></td>
                <td> <?php echo $item['masv'] ?></td>
                <td><?php echo $item['DTB'] ?></td>
                
               
                
               
            
            </tr>
            <?php } ?>
            
        </table>

        <!-- xuất sắc -->
        <h2 style="color: blue">Xuất Sắc</h2>
        <table width="100%" border="1" cellspacing="0" cellpadding="10">
            <tr>
            
                <td>Tên</td>
                <td>Mã SV</td>
                <td>DTB</td>
                
            </tr>
           <?php
            foreach ($xuatsac as $item){

            ?>
            <tr>
                <td> <?php echo $item['name'];  ?></td>
                <td> <?php echo $item['masv'] ?></td>
                <td><?php echo $item['DTB'] ?></td>
                
               
                
               
            
            </tr>
            <?php } ?>
            
        </table>


        <!-- giỏi -->
        <h2 style="color: blue">Giỏi</h2>
        <table width="100%" border="1" cellspacing="0" cellpadding="10">
            <tr>
            
                <td>Tên</td>
                <td>Mã SV</td>
                <td>DTB</td>
                
            </tr>
           <?php
            foreach ($gioi as $item){

            ?>
            <tr>
                <td> <?php echo $item['name'];  ?></td>
                <td> <?php echo $item['masv'] ?></td>
                <td><?php echo $item['DTB'] ?></td>
                
               
                
               
            
            </tr>
            <?php } ?>
            
        </table>

        <a style="margin-bottom: 100px;" href="http://localhost/Android_Sever_MOB401/Demo_Example_/themsuaxoa_mysql/Main_giaodien_sever/GiaoDien/dashboard.php">Trở về trình điều khiển</a>
    </body>
    </center>
</html>


  