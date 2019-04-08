<?php
require './demo.php' ;
$khachhang = get_all_students();
disconnect_db();


?>

<!DOCTYPE html>
<html>
    <head>
        <title>Danh sách sinh vien</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

    </head>
    <center>
    <body style="background:CCCCCC">
        <center><h1>Danh sách sinh viên PT11304</h1></center>
        <a href="themsinhvien.php">Thêm sinh viên</a> <br/> <br/>
        <table width="100%" border="1" cellspacing="0" cellpadding="10">
            <tr>
                <td>ID</td>
                <td>Name</td>
                <td>MaSV</td>
                <td>Link</td>
                <td>DTB</td>
                
                <td>Options</td>
            </tr>
           <?php foreach ($khachhang as $item){ ?>
            <tr>
                <td> <?php echo $item['id'];  ?></td>
                <td> <?php echo $item['name'] ?></td>
                <td><?php echo $item['masv'] ?></td>
                <td><?php echo $item['link'] ?></td>
                <td><?php echo $item['DTB'] ?></td>
                
               
                <td>
                    <form method="post" action="xoasv.php">
                        <input type="button" value="Sửa" onclick="window.location = 'editsv.php?id=<?php echo $item['id']; ?>'" />
                        <input type="hidden" name="id" value="<?php echo $item['id']; ?>"/>
                        <input type="submit" name="delete" value="Xóa" 
                        onclick="return confirm('Bạn có chắc chắn muốn xóa không ?');" />
                    </form>
                </td>
            </tr>
            <?php } ?>
            
        </table>

        <a style="margin-bottom: 100px;" href="http://localhost/Android_Sever_MOB401/Demo_Example_/themsuaxoa_mysql/Main_giaodien_sever/GiaoDien/dashboard.php">Trở về trình điều khiển</a>
    </body>
    </center>
</html>


  