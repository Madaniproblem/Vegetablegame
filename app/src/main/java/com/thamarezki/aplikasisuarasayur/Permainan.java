package com.thamarezki.aplikasisuarasayur;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Permainan extends AppCompatActivity {





    @SuppressLint({"MissingInflatedId", "ClickableViewAccessibility"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_permainan);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ImageView beteen = findViewById(R.id.tombolkembali2);
        beteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent u = new Intent(view.getContext(), MainActivity.class);
                startActivity(u);
                finish();


            }
        });


        CardView cv = findViewById(R.id.fotowortel);
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog idlg = new Dialog(Permainan.this);
                idlg.setContentView(R.layout.popupwortel);
                idlg.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                idlg.show();
                ImageView iv1 =idlg.findViewById(R.id.spkrw);
                iv1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp1 = MediaPlayer.create(Permainan.this,R.raw.fadyanw);
                        mp1.start();

                        mp1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.release();
                            }
                        });

                    }
                });
            }
        });

        CardView cv2 = findViewById(R.id.fotoselada);
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog idlg2 = new Dialog(Permainan.this);
                idlg2.setContentView(R.layout.popupselada);
                idlg2.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                idlg2.show();

                ImageView iv2 = idlg2.findViewById(R.id.spkrs);
                iv2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp2 = MediaPlayer.create(Permainan.this,R.raw.suaraselada);
                        mp2.start();

                        mp2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.release();
                            }
                        });
                    }
                });
            }

        });
        CardView cv3 = findViewById(R.id.fototimun);
        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog idlg3 = new Dialog(Permainan.this);
                idlg3.setContentView(R.layout.popuptimun);
                idlg3.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                idlg3.show();
                ImageView iv3 = idlg3.findViewById(R.id.spkrt);
                iv3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp3 = MediaPlayer.create(Permainan.this,R.raw.suaratimun);
                        mp3.start();
                        mp3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.release();
                            }
                        });
                    }
                });
            }
        });
        CardView cv4 = findViewById(R.id.fototoge);
        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog idlg4 = new Dialog(Permainan.this);
                idlg4.setContentView(R.layout.popuptoge);
                idlg4.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                idlg4.show();
                ImageView iv4 = idlg4.findViewById(R.id.spkrtg);
                iv4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp4 = MediaPlayer.create(Permainan.this,R.raw.suaratauge);
                        mp4.start();
                        mp4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.release();
                            }
                        });
                    }
                });
            }
        });
        CardView cv5 = findViewById(R.id.fotojagung);
        cv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog idlg5 = new Dialog(Permainan.this);
                idlg5.setContentView(R.layout.popupjagung);
                idlg5.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                idlg5.show();
                ImageView iv5 = idlg5.findViewById(R.id.spkrj);
                iv5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp5 = MediaPlayer.create(Permainan.this,R.raw.suarajagung);
                        mp5.start();
                        mp5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.release();
                            }
                        });
                    }
                });
            }
        });
        CardView cv6 = findViewById(R.id.fototomat);
        cv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog idlg6 = new Dialog(Permainan.this);
                idlg6.setContentView(R.layout.popuptomat);
                idlg6.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                idlg6.show();
                ImageView iv6 =idlg6.findViewById(R.id.spkrtm);
                iv6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp6 = MediaPlayer.create(Permainan.this,R.raw.suaratomat);
                        mp6.start();
                        mp6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.release();
                            }
                        });
                    }
                });
            }
        });
        CardView cv7 = findViewById(R.id.fotobrokoli);
        cv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog idlg7 = new Dialog(Permainan.this);
                idlg7.setContentView(R.layout.popupbrokoli);
                idlg7.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                idlg7.show();
                ImageView iv7 =idlg7.findViewById(R.id.spkrb);
                iv7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp7 = MediaPlayer.create(Permainan.this,R.raw.brokolif);
                        mp7.start();
                        mp7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.release();
                            }
                        });
                    }
                });
            }
        });
        CardView cv8 = findViewById(R.id.fotocabai);
        cv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog idlg8 = new Dialog(Permainan.this);
                idlg8.setContentView(R.layout.popupcabai);
                idlg8.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                idlg8.show();
                ImageView iv8 = idlg8.findViewById(R.id.spkrc);
                iv8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MediaPlayer mp8 = MediaPlayer.create(Permainan.this,R.raw.suaracabai);
                        mp8.start();
                        mp8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.release();
                            }
                        });
                    }
                });
            }

        });

    }



    public void onBackPressed(){
        super.onBackPressed();
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
        finish();
    }
}