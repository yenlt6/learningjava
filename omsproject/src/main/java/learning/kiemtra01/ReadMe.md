# Data Structure

HIDE QUESTION
Have the function FindIntersection(strArr) read the array of strings stored in strArr which will contain 2 elements: the first element will represent a list of comma-separated numbers sorted in ascending order, the second element will represent a second list of comma-separated numbers (also sorted). Your goal is to return a comma-separated string containing the numbers that occur in elements of strArr in sorted order. If there is no intersection, return the string false.

For example: if strArr contains ["1, 3, 4, 7, 13", "1, 2, 4, 13, 15"] the output should return "1,4,13" because those numbers appear in both strings. The array given will not be empty, and each string inside the array will be of numbers sorted in ascending order and may contain negative numbers.

####
Yêu cầu hàm ArrayMatching ( strArr ) đọc mảng các chuỗi được lưu trữ trong strArr sẽ chỉ chứa hai phần tử, cả hai phần tử này sẽ đại diện cho một mảng các số nguyên dương. Ví dụ: nếu strArr là ["[1, 2, 5, 6]", "[5, 2, 8, 11]"], thì cả hai phần tử trong đầu vào đại diện cho hai mảng số nguyên và mục tiêu của bạn cho thử thách này là để thêm các phần tử vào các vị trí tương ứng từ cả hai mảng. Đối với đầu vào ví dụ, chương trình của bạn phải thực hiện các phép bổ sung sau: [(1 + 5), (2 + 2), (5 + 😎, (6 + 11)] sau đó bằng [6, 4, 13, 17] . Chương trình của bạn cuối cùng sẽ trả về mảng kết quả này ở định dạng chuỗi với mỗi phần tử được phân tách bằng dấu gạch ngang: 6-4-13-17 .

Nếu hai mảng không có cùng số lượng phần tử, thì chỉ cần nối các phần tử còn lại vào mảng mới (ví dụ minh họa bên dưới). Cả hai mảng sẽ có định dạng: [e1, e2, e3, ...] trong đó ít nhất một phần tử sẽ tồn tại trong mỗi mảng.
Các ví dụ
Đầu vào: new String [] {"[5, 2, 3]", "[2, 2, 3, 10, 6]"}
Đầu ra: 7-4-6-10-6
Đầu vào: new String [] {"[1, 2, 1]", "[2, 1, 5, 2]"}
Đầu ra: 3-3-6-2