package zr.playingcardslogger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import zr.playingcardslogger.databinding.ActivityMainBinding;
import zr.playingcardslogger.databinding.ActivitySplashScreenBinding;

public class SplashScreen extends AppCompatActivity{
  ActivitySplashScreenBinding binding;

  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(binding.getRoot());
    binding=ActivitySplashScreenBinding.inflate(getLayoutInflater());
    Intent intent=new Intent(this, ActivityMainBinding.class);
    startActivity(intent);
  }
}