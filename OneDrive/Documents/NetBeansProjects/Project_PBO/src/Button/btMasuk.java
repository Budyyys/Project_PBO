/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Button;

/**
 *
 * @author lenovo
 */
import javax.swing.*;
import java.awt.*;

public class btMasuk extends JFrame {

    public btMasuk() {
        // Konfigurasi JFrame
        setTitle("Tombol Masuk");
        setSize(1440, 1024);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Menggunakan Absolute Layout
        getContentPane().setBackground(Color.WHITE); // Background putih
        
        // Membuat Tombol Masuk
        JButton loginButton = new JButton("Masuk");
        loginButton.setBounds(620, 487, 200, 50); // Menentukan posisi dan ukuran tombol
        loginButton.setBackground(new Color(0, 123, 255)); // Warna latar biru
        loginButton.setForeground(Color.WHITE); // Warna teks putih
        loginButton.setFont(new Font("Arial", Font.BOLD, 16)); // Font teks
        loginButton.setFocusPainted(false); // Menghilangkan border fokus
        
        // Menambahkan tombol ke JFrame
        add(loginButton);

        // Menampilkan JFrame
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(btMasuk::new);
    }
}
