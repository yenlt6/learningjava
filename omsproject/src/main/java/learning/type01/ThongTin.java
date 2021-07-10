package learning.type01;

public class ThongTin {
    public void example1(){
        //1. Thông tin thẻ căn cước
        //Khai_bao_thong_tin_the_can_cuoc
        int CardId=123443534;
        String HoTen="Nguyễn Hoàng Minh";
        String NgaySinh ="01/01/2010" ;
        String Que_quan=" Minh khai - Hai Bà Trưng - Hà Nội";
        String NgayCap="01/01/2021" ;
        String Noi_cap= "Hải DPhòng";
        String Thoi_han="Vô thời hạn";
        //In_ra_thong_tin_the_can_cuoc
        System.out.println("---Thông tin thẻ căn cước---");
        System.out.println("CardId: "+ CardId);
        System.out.println("Họ tên: "+HoTen);
        System.out.println("Ngày sinh: "+NgaySinh);
        System.out.println("Quê quán: "+Que_quan);
        System.out.println("Ngày cấp: "+NgayCap);
        System.out.println("Nơi cấp: "+Noi_cap);
        System.out.println("Thời hạn: "+Thoi_han);
        //2. Thông tin thẻ gửi xe
        //Khai báo thông tin thẻ gửi ce
        int MaThe=43353;
        String HoTen1="Bùi Thị Thanh Hưng";
        String CongTy="OneMount";
        String Phongban="Khối công nghệ - Phòng kiểm thử sản phẩm";
        //In ra thông tin thẻ gửi xe
        System.out.println("---Thông tin thẻ gửi xe---");
        System.out.println("Mã thẻ gửi xe: "+MaThe);
        System.out.println("Họ tên: "+HoTen1);
        System.out.println("Công ty: "+CongTy);
        System.out.println("Phòng ban: "+Phongban);
        //3. Thông tin hóa đơn điện nước
        // Khai báo thông tin điện nước
        float Tiendien= 3500000;
        float Tiennuoc = 250000;
        String Chuho="Phạm Thị Liên";
        String Thang = "Thang 7";
        float tong_tien_dien_nuoc=Tiendien+Tiennuoc;
        // In ra hóa đơn điện nước
        System.out.println("---Thông tin điện nước Tháng 7---");
        System.out.println("Chủ hộ:"+Chuho);
        System.out.println("Tiền điện:"+Tiendien);
        System.out.println("Tiền nước: "+Tiennuoc);
        System.out.println("Tổng tiền điện nước Tháng 7:"+tong_tien_dien_nuoc);
    }
}
