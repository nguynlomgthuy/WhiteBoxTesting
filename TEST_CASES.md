# DANH SÁCH TEST CASE

## 1. Tính chu vi hình chữ nhật

| ID | Input | Kết quả mong đợi | Mục đích |
|---|---|---|---|
| TC01 | length=3, width=4 | 14 | Luồng hợp lệ |
| TC02 | length=0, width=0 | 0 | Giá trị biên |
| TC03 | length=-1, width=4 | Exception | Chiều dài không hợp lệ |
| TC04 | length=3, width=-1 | Exception | Chiều rộng không hợp lệ |

## 2. Tính diện tích hình chữ nhật

| ID | Input | Kết quả mong đợi | Mục đích |
|---|---|---|---|
| TC05 | length=3, width=4 | 12 | Luồng hợp lệ |
| TC06 | length=-2, width=4 | Exception | Chiều dài âm |
| TC07 | length=3, width=-1 | Exception | Chiều rộng âm |

## 3. Giải phương trình bậc 2

| ID | Input | Kết quả mong đợi | Mục đích |
|---|---|---|---|
| TC08 | a=1, b=-3, c=2 | x1=2, x2=1 | Delta > 0 |
| TC09 | a=1, b=2, c=1 | x=-1 | Delta = 0 |
| TC10 | a=1, b=0, c=1 | Không có nghiệm thực | Delta < 0 |
| TC11 | a=0, b=2, c=1 | Exception | a không hợp lệ |

## 4. Tính số ngày trong tháng

| ID | Input | Kết quả mong đợi | Mục đích |
|---|---|---|---|
| TC12 | month=1, year=2026 | 31 | Tháng 31 ngày |
| TC13 | month=4, year=2026 | 30 | Tháng 30 ngày |
| TC14 | month=2, year=2025 | 28 | Năm thường |
| TC15 | month=2, year=2024 | 29 | Năm nhuận |
| TC16 | month=2, year=2000 | 29 | Chia hết cho 400 |
| TC17 | month=2, year=1900 | 28 | Chia hết cho 100 nhưng không chia hết 400 |
| TC18 | month=0, year=2026 | Exception | Biên dưới không hợp lệ |
| TC19 | month=13, year=2026 | Exception | Biên trên không hợp lệ |

## 5. Kiểm tra số nguyên tố

| ID | Input | Kết quả mong đợi | Mục đích |
|---|---|---|---|
| TC20 | n=1 | false | n < 2 |
| TC21 | n=2 | true | Số nguyên tố nhỏ nhất |
| TC22 | n=4 | false | Số chẵn |
| TC23 | n=7 | true | Số nguyên tố lẻ |
| TC24 | n=9 | false | Số hợp số |
| TC25 | n=11 | true | Kiểm thử vòng lặp |

## 6. Tính S = 1 - 2 + 3 - 4 + ... +/- n

| ID | Input | Kết quả mong đợi | Mục đích |
|---|---|---|---|
| TC26 | n=1 | 1 | Biên nhỏ nhất |
| TC27 | n=4 | -2 | n chẵn |
| TC28 | n=5 | 3 | n lẻ |
| TC29 | n=0 | Exception | n không hợp lệ |

## 7. Tính UCLN

| ID | Input | Kết quả mong đợi | Mục đích |
|---|---|---|---|
| TC30 | a=12, b=18 | 6 | Hai số dương |
| TC31 | a=12, b=0 | 12 | b bằng 0 |
| TC32 | a=0, b=8 | 8 | a bằng 0 |
| TC33 | a=-12, b=18 | 6 | Có số âm |
| TC34 | a=0, b=0 | Exception | Trường hợp không hợp lệ |

## 8. Giai thừa và tổng giai thừa

| ID | Input | Kết quả mong đợi | Mục đích |
|---|---|---|---|
| TC35 | factorial(0) | 1 | Giá trị biên |
| TC36 | factorial(5) | 120 | Luồng hợp lệ |
| TC37 | factorial(-1) | Exception | n âm |
| TC38 | factorialSum(1) | 1 | Biên nhỏ nhất |
| TC39 | factorialSum(3) | 9 | 1! + 2! + 3! |
| TC40 | factorialSum(0) | Exception | Biên dưới |
| TC41 | factorialSum(21) | Exception | Vượt giới hạn |

## Coverage

Kết quả kiểm thử đạt:

- 100% Statement / Instruction Coverage
- 100% Branch Coverage
- 100% Line Coverage
- 100% Method Coverage