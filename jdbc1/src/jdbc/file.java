package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class file {
  public static void main(String[] args) throws SQLException {
//	try {
//		Connection con=  connectionDB();
//		String sql = "Select * from LopHoc";
//		Statement state= con.createStatement();
//		ResultSet rs=  state.executeQuery(sql);
//		while(rs.next()) {
//			String maLop= rs.getString("MaLop");
//			String tenLop= rs.getString("TenLop");
//			String soPhong= rs.getString("SoPhong");
//			System.out.printf("%s - %s tai %s \n", maLop, tenLop, soPhong);
//		}
//		con.close();
//	} catch (ClassNotFoundException e) {
//		System.out.print("Error: "+ e.getMessage());
//	}catch (SQLException e) {
//		System.out.print("Loi SQL Chi tiet:"+ e.getMessage());
//	}
	  try {
		Connection con = connectionDB();
		List<LopHoc> ds= DanhSach(con);
	    System.out.println("DANH SACH LOP HOC");
		for(LopHoc x : ds) {
			System.out.printf("%s - %s tai %s \n", x.maLop, x.tenLop, x.phonghoc);
		}
		con.close();
	} catch (ClassNotFoundException e) {
		System.out.print("Error: "+ e.getMessage());
	}
  }
  static Connection connectionDB() throws ClassNotFoundException, SQLException {


	  Class.forName("org.sqlite.JDBC");
	  String str= "jdbc:sqlite::resource:name.db";
	  Connection con= DriverManager.getConnection(str);
	  return con;
  }
  static  void themLop(Connection con, LopHoc a) throws SQLException {
	  String q= String.format("Insert into LopHoc (MaLop, TenLop, PhongHoc) Values('%s','%s','%s')", a.maLop, a.tenLop, a.phonghoc);
	  Statement com = con.createStatement();
	  com.executeUpdate(q);
  }
  static void CapNhatLop(Connection con, String maLop, LopHoc a) throws SQLException {
	  String q= String.format("UPDATE LopHoc\r\n"
	  		+ "SET TenLop = '%s', SoPhong= '%s'\r\n"
	  		+ "WHERE MaLop '%s';", a.tenLop, a.phonghoc,a.maLop);
	  Statement com = con.createStatement();
	  com.executeUpdate(q);
  }
  static void xoaLop(Connection con, String maLop) throws SQLException {
	  String q= String.format("DELETE FROM LopHoc WHERE MaLop='%s'", maLop);
	  Statement com = con.createStatement();
	  com.executeUpdate(q);
  }
  static List<LopHoc> DanhSach(Connection con) throws SQLException{
	  String sql = "Select * from LopHoc";
		Statement state= con.createStatement();
		ResultSet rs=  state.executeQuery(sql);
		List< LopHoc> ds= new ArrayList<>();
		while(rs.next()) {
			String maLop= rs.getString("MaLop");
			String tenLop= rs.getString("TenLop");
			String soPhong= rs.getString("SoPhong");
			LopHoc a = new LopHoc(maLop, tenLop, soPhong);
			ds.add(a);
		}
	  return ds;
  }
}
class LopHoc{
	String maLop, tenLop, phonghoc;
	public LopHoc(String maLop, String tenLop, String phonghoc) {
		super();
		this.maLop = maLop;
		this.tenLop = tenLop;
		this.phonghoc = phonghoc;
	}
	public String getMaLop() {
		return maLop;
	}

	public void setMaLop(String maLop) {
		this.maLop = maLop;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public String getPhonghoc() {
		return phonghoc;
	}

	public void setPhonghoc(String phonghoc) {
		this.phonghoc = phonghoc;
	}
	
}