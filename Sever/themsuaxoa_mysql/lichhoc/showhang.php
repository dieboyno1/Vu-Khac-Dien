<?php
require './demo.php' ;
$khachhang = get_all_students();
disconnect_db();


?>

<!DOCTYPE html>
<html>
    <head>
        <title>Lịch học</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

    </head>
    <center>
    <body style="background:CCCCCC">
        <center><h1>Lịch học</h1></center>
        
        <table width="100%" border="1" cellspacing="0" cellpadding="10">
            <tr>
                <td>thứ</td>
                <td>môn</td>
                <td>giáo viên</td>
                
                
                <td>Options</td>
            </tr>
           <?php foreach ($khachhang as $item){ ?>
            <tr>
                <td> <?php echo $item['thu'];  ?></td>
                <td> <?php echo $item['monhoc'] ?></td>
                <td><?php echo $item['giaovien'] ?></td>
               
                
               
                <td>
                    <form method="post" action="">
                        <input type="button" value="Sửa" onclick="window.location = 'editsv.php?id=<?php echo $item['thu']; ?>'" />
                        <input type="hidden" name="id" value="<?php echo $item['thu']; ?>"/>
                        
                    </form>
                </td>
            </tr>
            <?php } ?>
            
        </table>

        <a style="margin-bottom: 100px;" href="http://localhost/Android_Sever_MOB401/Demo_Example_/themsuaxoa_mysql/Main_giaodien_sever/GiaoDien/dashboard.php">Trở về trình điều khiển</a>
    </body>
    </center>
</html>


  