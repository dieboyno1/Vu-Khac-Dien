<?php
require './demo.php' ;
$khachhang = get_all_students();
disconnect_db();


?>

<!DOCTYPE html>
<html>
    <head>
        <title>Danh sách môn học</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

    </head>
    <center>
    <body style="background:CCCCCC">
        <center><h1>Danh sách Môn học tại Fpoly</h1></center>
        <a href="themsinhvien.php">Thêm sinh viên</a> <br/> <br/>
        <table width="100%" border="1" cellspacing="0" cellpadding="10">
            <tr>
                <td>ID</td>
                <td>Tên môn</td>
                <td>Ngành</td>
                <td>Link PDF</td>
                
            </tr>
           <?php foreach ($khachhang as $item){ ?>
            <tr>
                <td> <?php echo $item['id'];  ?></td>
                <td> <?php echo $item['tenmon'] ?></td>
                <td><?php echo $item['thuocnganh'] ?></td>
                <td><?php echo $item['linkpdf'] ?></td>
               
                
               
            
            </tr>
            <?php } ?>
            
        </table>

        <a style="margin-bottom: 100px;" href="http://localhost/Android_Sever_MOB401/Demo_Example_/themsuaxoa_mysql/Main_giaodien_sever/GiaoDien/dashboard.php">Trở về trình điều khiển</a>
    </body>
    </center>
</html>


  