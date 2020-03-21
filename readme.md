# Qualification-test
Bài 5:

Có thể tính được.

Đánh số từ 1 tới 20 các lọ thuốc, sau đó lấy số thuốc trong lọ bằng đúng số đã đánh của lọ.

Ta có số cân nếu tất cả thuốc có khối lượng bằng nhau là: (1+2+3+...+20) = 210.

Gọi số cân thực tế là m. Lấy m - 210 thì số lẻ ra chính là số đánh của lọ thuốc cần tìm.


Bài 9:

Theo em tìm hiểu được thì ta sẽ sử dụng external sort.

Giả sử như ta có 8Gb RAM, như vậy ta dùng khoảng 4Gb cho việc sắp xếp.

Đọc 4Gb dữ liệu và dùng thuật toán sắp xếp.

Ghi kết quả ra đĩa. Lặp lại cho tới khi dữ liệu được sắp xếp với mỗi khối 4Gb (5 khối).

Đọc 0.8Gb mỗi khối đưa vào input buffer. Thực hiện merge rồi đẩy vào output buffer.

Mỗi khi output buffer đầy thì ta đẩy hết kết quả vào file đích rồi xoá sạch đi. Sau đó thực hiện gộp tiếp tới khi hết dữ liệu.

