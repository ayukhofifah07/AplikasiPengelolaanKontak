import java.sql.*;
import java.io.*;

public class Contact {
    private String name;
    private String phone;
    private String category;

    public Contact(String name, String phone, String category) {
        this.name = name;
        this.phone = phone;
        this.category = category;
    }

    // Getters and Setters
    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getCategory() { return category; }

    public static void addContact(Contact contact) {
        try (Connection conn = DriverManager.getConnection(Database.DB_URL);
             PreparedStatement pstmt = conn.prepareStatement("INSERT INTO daftarKontak (nama, nomor, kategori) VALUES (?, ?, ?)")) {
            pstmt.setString(1, contact.getName());
            pstmt.setString(2, contact.getPhone());
            pstmt.setString(3, contact.getCategory());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateContact(int id, Contact contact) {
        try (Connection conn = DriverManager.getConnection(Database.DB_URL);
             PreparedStatement pstmt = conn.prepareStatement("UPDATE daftarKontak SET nama = ?, nomor = ?, kategori = ? WHERE id = ?")) {
            pstmt.setString(1, contact.getName());
            pstmt.setString(2, contact.getPhone());
            pstmt.setString(3, contact.getCategory());
            pstmt.setInt(4, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteContact(int id) {
        try (Connection conn = DriverManager.getConnection(Database.DB_URL);
             PreparedStatement pstmt = conn.prepareStatement("DELETE FROM daftarKontak WHERE id = ?")) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ResultSet getContacts() {
        try {
            Connection conn = DriverManager.getConnection(Database.DB_URL);
            Statement stmt = conn.createStatement();
            return stmt.executeQuery("SELECT * FROM daftarKontak");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Ekspor ke CSV
    public static void exportToCSV() {
        String filePath = "daftarKontak.csv"; // File di folder proyek
        try (Connection conn = DriverManager.getConnection(Database.DB_URL);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM daftarKontak");
             BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            
            writer.write("ID,Nama,Nomor,Kategori\n"); // Header
            while (rs.next()) {
                writer.write(rs.getInt("id") + "," +
                             rs.getString("nama") + "," +
                             rs.getString("nomor") + "," +
                             rs.getString("kategori") + "\n");
            }
            System.out.println("daftarKontak exported to " + filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Impor dari CSV
    public static void importFromCSV() {
        String filePath = "daftarKontak.csv"; // File di folder proyek
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
             Connection conn = DriverManager.getConnection(Database.DB_URL)) {
            
            reader.readLine(); // Skip header
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4) {
                    addContact(new Contact(data[1], data[2], data[3]));
                }
            }
            System.out.println("daftarKontak imported from " + filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Fungsi pencarian
    public static ResultSet searchContacts(String query) {
        try {
            Connection conn = DriverManager.getConnection(Database.DB_URL);
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM daftarKontak WHERE nama LIKE ? OR nomor LIKE ?");
            pstmt.setString(1, "%" + query + "%");
            pstmt.setString(2, "%" + query + "%");
            return pstmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}