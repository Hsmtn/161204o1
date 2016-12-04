package com.example.hafta_sonu.Konuskan;

import android.os.Build;
import android.speech.tts.TextToSpeech;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    TextToSpeech ttsObj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ttsObj =new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {  //status 0 ( TextToSpeech.SUCCESS )ise sonuç başarılıdır
                if(status == TextToSpeech.SUCCESS){
                    Toast.makeText(getApplicationContext(),"Başarılı",Toast.LENGTH_SHORT).show();
                    //ttsObj.speak("Deneme",TextToSpeech.QUEUE_ADD,null,1);
                }else {
                    Toast.makeText(getApplicationContext(),"Başarısız",Toast.LENGTH_LONG).show();
                }
            }
        });

        //Locale.CANADA varolan diller
       // new Locale("TR"); yeni  dil ekleme
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public  void ali(View v){
        Human ali= new Human("Ali");
        String konus=ali.Speak();
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            ttsObj.setLanguage(new Locale("TR-tr")); //varsa türkçe konuşma dilni kullan
            ttsObj.speak(konus, TextToSpeech.QUEUE_ADD,null,"");
            Toast.makeText(getApplicationContext(),"21 üstü",Toast.LENGTH_SHORT).show();
        }else{
            ttsObj.speak(konus, TextToSpeech.QUEUE_ADD,null);
            Toast.makeText(getApplicationContext(),"21 altı",Toast.LENGTH_SHORT).show();
        }
    }

    public  void veli(View v){
        Human veli= new Human("Veli");
        String konus=veli.Speak();
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            ttsObj.setLanguage(new Locale("TR-tr")); //varsa türkçe konuşma dilni kullan
            ttsObj.speak(konus, TextToSpeech.QUEUE_ADD,null,"");
            Toast.makeText(getApplicationContext(),"21 üstü",Toast.LENGTH_SHORT).show();
        }else{
            ttsObj.speak(konus, TextToSpeech.QUEUE_ADD,null);
            Toast.makeText(getApplicationContext(),"21 altı",Toast.LENGTH_SHORT).show();
        }
    }

    public  void deli(View v){
        Dog comar= new Dog();
        String konus=comar.Speak();
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            ttsObj.setLanguage(new Locale("TR-tr")); //varsa türkçe konuşma dilni kullan
            ttsObj.setSpeechRate(2.f);
            ttsObj.speak(konus, TextToSpeech.QUEUE_ADD,null,"");
            Toast.makeText(getApplicationContext(),"21 üstü",Toast.LENGTH_SHORT).show();
        }else{
            ttsObj.speak(konus, TextToSpeech.QUEUE_ADD,null);
            ttsObj.setSpeechRate(2.f);
            Toast.makeText(getApplicationContext(),"21 altı",Toast.LENGTH_SHORT).show();
        }
    }
}
