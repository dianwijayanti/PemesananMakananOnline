# PemesananMakananOnline
Program ini merupakan program dalam bahasa pemrograman Java yang berisikan tentang user yang bisa berperan menjadi admin restoran ataupun customer restoran dengan cara log in dan memasukkan username beserta passwordnya. 

## Fitur Program
- Log in user sebagai admin atau customer dengan username dan password
- Admin dapat melihat restoran, menambah restoran, dan menghapus restoran
- Customer dapat melihat restoran, membuat pesanan, dan melihat pesanan
- User kembali log in sebagai admin ataupun customer dengan username dan password

## Cara Penggunaan
1. Buka repository ini dalam IDE Java seperti IntelliJ IDEA : https://github.com/dianwijayanti/PemesananMakananOnline.git
2. Jalankan program dengan mengeksekusi pada class 'main'
3. Program akan menampilkan menu 'log in'. User dapat memilih berperan sebagai admin atau customer dengan memasukkan username dan password yang benar.
![Screenshot (657)](https://user-images.githubusercontent.com/120692061/232827263-0882e97a-4e6a-4cbe-9c5c-72fd3da5d7b5.png)

4. Jika user ingin berperan sebagai admin, maka user perlu memasukkan username 'ADMIN' dengan password 'admin'.
![Screenshot (658)](https://user-images.githubusercontent.com/120692061/232827878-304446fc-4c47-4f26-a263-8efacc6d6945.png)

5. Kemudian, program akan menampilkan fitur yang dimiliki oleh admin, seperti melihat restoran, menambah restoran, dan menghapus restoran.
![Screenshot (659)](https://user-images.githubusercontent.com/120692061/232828233-3f80a9b1-f3c2-401d-833a-6673709a973b.png)

6. Jika user memilih nomor 1, yaitu 'Lihat Restoran', user tidak akan langsung menemukan restoran, karena user perlu membuat atau menambah restoran pada fitur nomor 2.
![Screenshot (660)](https://user-images.githubusercontent.com/120692061/232828608-41457dab-3af2-48e5-a250-e6a4a0e6aa7e.png)

7. User memilih fitur nomor 2, yaitu 'Tambah Restoran'. Pada fitur ini, user yang berperan sebagai admin akan menginput 'kode restoran', 'nama restoran', 'alamat restoran', dan 'banyak menu'. Selanjutnya, user juga akan menginputkan 'kode menu', 'nama memu', dan 'harga menu'.
![Screenshot (663)](https://user-images.githubusercontent.com/120692061/232830089-be3119bd-19c2-4057-913d-b7fbd081f584.png)
![Screenshot (662)](https://user-images.githubusercontent.com/120692061/232830356-ef5f357d-c505-45b4-a6a7-cd323df2155b.png)

8. Jika user telah melalui fitur nomor 2, selanjutnya user dapat melihat restoran yang sebelumnya sudah dibuat dengan memilih fitur nomor 1, yaitu 'Lihat Restoran', dengan dilengkapi 'nomor indeks', 'kode restoran', 'nama restoran', dan 'alamat restoran', serta daftar menu yang sudah diinputkan sebelumnya.
![Screenshot (664)](https://user-images.githubusercontent.com/120692061/232831104-0d132d79-4bb1-4723-8e75-19ecffd2b706.png)

9. Kemudian, user juga dapat menghapus restoran dengan memilih fitur nomor 3, yaitu 'Hapus Restoran' dengan memasukkan 'nomor indeks' yang sudah otomatis terisi pada saat di fitur nomor 1. 
![Screenshot (665)](https://user-images.githubusercontent.com/120692061/232831704-e67d32bd-b3b6-4d81-bc22-b37d321039b1.png)

10. Selanjutnya, pada fitur nomor 4, user dapat kembali melakukan log in sebagai admin atau customer dengan memasukkan username dan password yang benar.
![Screenshot (667)](https://user-images.githubusercontent.com/120692061/232832119-22422de0-9686-46cf-83e0-4e4d46319594.png)

11. Jika user log in sebagai customer, user dapat memasukkan username 'CUSTOMER' dengan password '111'.
![Screenshot (668)](https://user-images.githubusercontent.com/120692061/232832536-7091b0f6-41cf-4e73-9f40-26e4936d7051.png)

12. Kemudian, program akan menampilkan fitur yang dimiliki oleh customer, yaitu melihat restoran, membuat pesanan, dan melihat pesanan.
13. Jika user memilih fitur nomor 1, yaitu 'Lihat Restoran', maka user akan menemukan restoran yang tersedia.
14. Jika user kembali memilih fitur nomor 2, yaitu 'Buat Pesanan', maka user perlu memasukkan 'kode restoran' yang dipilih, 'banyak pesanan', 'kode menu' yang dipilih, 'kuantitas', dan kemudian akan ditampilkan 'sub total' dan 'total pemesanan'.
15. Jika user memilih fitur nomor 3, yaitu 'Lihat Pesanan', maka dapat memasukkan 'jarak', 'kode restoran', 'kode menu', 'kuantitas', dan 'sub total'.
16. Dan terakhir, user dapat kembali memilih fitur nomor 4, yaitu 'Kembali ke Log In', yang dimana akan otomatis kembali menampilkan menu untuk memasukkan username dan password. 
