public class LibraryUser {

    public String userName;  // Đặt là public để có thể truy cập từ Driver
    public String password;
    public int userID;       // Đặt là public để có thể truy cập từ Driver
    public int type;         // Đặt là public để có thể truy cập từ Driver

    // Phương thức lấy ID người dùng, chuyển thành public
    public int getUserID() {
        return userID;
    }

    // Phương thức đăng nhập, giữ nguyên là public
    public boolean login(String userName, String password) {
        if ((userName.equals(this.userName) && password.equals(this.password))) {
            return true;
        } else {
            System.out.println("The username or password entered was not correct!");
            return false;
        }
    }

    // Phương thức đăng xuất, chuyển thành public
    public boolean logout() {
        return true;
    }
}
