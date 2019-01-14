#Tuần 1 14/01/2019  
#Phương pháp đệ quy quay lui (Backtracking)

##**Tổng quát**  
Quay lui là một kĩ thuật thiết kế giải thuật dựa trên đệ quy. Ý tưởng của quay lui là tìm lời giải từng bước, mỗi bước chọn một trong số các lựa chọn khả dĩ và đệ quy. Người đầu tiên đề ra thuật ngữ này (backtrack) là nhà toán học người Mỹ D. H. Lehmer vào những năm 1950.  
##**Tư tưởng**  
 * Dùng để giải bài toán liệt kê các cấu hình. Mỗi cấu hình được xây dựng bằng từng phần tử. Mỗi phần tử lại được chọn bằng cách thử tất cả các khả năng.  
 * Bản chất của quay lui là một quá trình tìm kiếm theo chiều sâu(Depth-First Search).  

##**Ưu/Nhược điểm**
  * **Ưu điểm**   
    * Luôn tìm được lời giải
  * **Nhược điểm**  
    * Trong trường hợp xấu nhất độ phức tạp của quay lui vẫn là cấp số mũ do:    
        * Rơi vào tình trạng "thrashing": qúa trình tìm kiếm cứ gặp phải bế tắc với cùng một nguyên nhân
        * Thực hiện các công việc dư thừa: Mỗi lần chúng ta quay lui, chúng ta cần phải đánh giá lại lời giải trong khi đôi lúc điều đó không cần thiết.  
        * Không sớm phát hiện được các khả năng bị bế tắc trong tương lai. Quay lui chuẩn, không có cơ chế nhìn về tương lai để nhận biết đc nhánh tìm kiếm sẽ đi vào bế tắc.
          
##**Mô hình bài toán**
* **Phương pháp giải**    
    * **B1: Xác định cấu hình nghiệm**  
    Nghiệm có thể là 1 vector dạng (x1;x2;x3;...;xn) ví dụ như bài toán liệt kê xâu nhị phân hoặc cũng có thể có dạng 1 ma trận ví dụ như bài toán xếp hậu( bài toán xếp hậu vẫn có thể biểu diễn nghiệm dưới dạng 1 vector và thường sẽ làm theo cách này).  
    * **B2: Tìm các giá trị xi**  
    Xem mã giả dễ hiểu hơn
    
    
* **Mã giả**   
```
try(i){
    for( i thuộc Di){
        if(check(j)){
            x[i] = j;
            if( i == n )
                printSolution();
            else
                try(i+1);
        }
    }
}  
```  
**Giải thích**  
* **Di** là tập hợp tất cả các khả năng có thể có của xi.  
* **x[]** là nơi lưu trữ giá trị của nghiệm, ở đây là trường hợp cấu hình nghiệm có dạng là 1 vector.  
* Hàm **check(j)** kiểm tra tính hợp lệ của j. Một số bài toán như bài toán liệt ke xâu nhị phân thì không cần phải có hàm check vì không cần loại bất kì giá trị nào của xi ra khỏi tập Di qua mỗi lần duyệt.Chỉ có một vài bài toán cần dùng đến hàm check này ví dụ như bài toán n quân hậu.  
* **printSolution()** để lấy kết quả ra.

##**Ví dụ**  
1. *Liệt kê tất cả các dãy nhị phân có độ dài n.*  

2. *Liệt kê tất cả các dãy nhị phân có độ dài n.*