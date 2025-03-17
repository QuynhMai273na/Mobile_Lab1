package com.example.mycv;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ các thành phần giao diện
        ImageView profileImage = findViewById(R.id.profileImage);
        TextView txtName = findViewById(R.id.txtName);
        TextView txtJob = findViewById(R.id.txtJob);
        TextView txtEmail = findViewById(R.id.txtEmail);
        TextView txtObjective = findViewById(R.id.txtObjective);
        TextView txtSkills = findViewById(R.id.txtSkills);
        TextView txtUniversity = findViewById(R.id.txtUniversity);
        TextView txtEducation = findViewById(R.id.txtEducation);
        TextView txtProjectName = findViewById(R.id.txtProjectName);
        TextView txtProjectSpecify = findViewById(R.id.txtProjectSpecify);

        // Gán dữ liệu
        txtName.setText("Nguyễn Thị Quỳnh Mai");
        txtJob.setText("Software Engineer Intern");
        txtEmail.setText("nguyenquynhmai273na@gmail.com");
        txtObjective.setText("● Aspiring Software Engineer with a strong foundation in Computer Science...");
        txtSkills.setText("● Programming: C++, C#, HTML, CSS, JavaScript, NodeJS, React...");
        txtUniversity.setText("\t\t\tUNIVERSITY \n Sep 2021 - Dec 2025 \n \t\t\t\t(Expected)");
        txtEducation.setText("University of Information Technology - UIT\nMajor: Advanced Program in Information System\nGPA: 9.02/10");
        txtProjectName.setText("\t\tLove Gift Website \nSep 2024 – Dec 2024");
        txtProjectSpecify.setText("● Developed Love Gifts, a matchmaking platform with wishlist sharing...");

    }
}
