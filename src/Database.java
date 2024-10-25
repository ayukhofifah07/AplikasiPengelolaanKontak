/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author USER
 */


public class Database {
    public static final String DB_URL = "jdbc:sqlite:contacts.db";

    public static void createDatabase() {
        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement()) {
            String sql = "CREATE TABLE IF NOT EXISTS daftarKontak (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "nama TEXT NOT NULL," +
                    "nomor TEXT NOT NULL," +
                    "kategori TEXT NOT NULL);";
            stmt.execute(sql);
            System.out.println("Database created successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}