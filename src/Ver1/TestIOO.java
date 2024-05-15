package Ver1;

class ParentTable {
    String data;

    void setDataFromChild(String newData) {
        this.data = newData;
    }

    void printData() {
        System.out.println("Dữ liệu từ lớp cha: " + data);
    }
}

class ChildTable extends ParentTable {
    @Override
    void printData() {
        super.printData();
    }
}

public class TestIOO {
    public static void main(String[] args) {
        ChildTable childTable = new ChildTable();
        childTable.setDataFromChild("Dữ liệu mới từ lớp con");

        // Xuất thông điệp ra console để kiểm tra
        System.out.println("Chạy phương thức printData() của lớp con: \t");

        // Gọi phương thức của lớp con để in ra dữ liệu
        childTable.printData();
    }
}