package com.pachacama05.practica_pachacama;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.RingtoneManager;
import android.support.v4.app.NotificationCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    private Spinner spinner1;
    private RadioGroup radioGroup;
    private TextView displayText;
    private String item;
    private CheckBox checkBox;
    private CheckBox checkBox2;
    private String tipoA = "Americana";
    private String tipoB = "Peperoni";
    private String tipoC = "Hawiana";
    private String tipoD = "Meat Lover";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                item = (String) spinner1.getSelectedItem();


                if (item.equals(tipoA)) {
                    Toast.makeText(DetailActivity.this, "El pago es de S/. 38 ", Toast.LENGTH_SHORT).show();
                } else if (item.equals(tipoB)) {
                    Toast.makeText(DetailActivity.this, "El pago es de S/. 42 ", Toast.LENGTH_SHORT).show();
                } else if (item.equals(tipoC)) {
                    Toast.makeText(DetailActivity.this, "El pago es de S/. 36 ", Toast.LENGTH_SHORT).show();
                } else if (item.equals(tipoD)) {
                    Toast.makeText(DetailActivity.this, "El pago es de S/. 56 ", Toast.LENGTH_SHORT).show();
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> arg) {

            }

        });
    }


    public void answer(View view) {




        checkBox = (CheckBox) findViewById(R.id.checkbox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkbox2);


//

        if (item.equals(tipoA) && checkBox.isChecked()) {

            int pagototal = 38 + 4;
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Venta Terminada");
            alertDialog.setMessage("El pago total es : " + pagototal + ". Se le agregó el primer complemento");
            // Alert dialog button
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // Alert dialog action goes here
                            dialog.dismiss();// use dismiss to cancel alert dialog
                        }
                    });
            alertDialog.show();


        } else if (item.equals(tipoB) && checkBox.isChecked()) {

            int pagototal = 42 + 4;
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Venta Terminada");
            alertDialog.setMessage("El pago total es : " + pagototal + ". Se le agregó el primer complemento");
            // Alert dialog button
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // Alert dialog action goes here
                            dialog.dismiss();// use dismiss to cancel alert dialog
                        }
                    });
            alertDialog.show();

        } else if (item.equals(tipoC) && checkBox.isChecked()) {

            int pagototal = 36 + 4;
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Venta Terminada");
            alertDialog.setMessage("El pago total es : S/." + pagototal + ". Se le agregó el primer complemento");
            // Alert dialog button
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // Alert dialog action goes here
                            dialog.dismiss();// use dismiss to cancel alert dialog
                        }
                    });
            alertDialog.show();

        } else if (item.equals(tipoD) && checkBox.isChecked()) {

            int pagototal = 56 + 4;
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Venta Terminada");
            alertDialog.setMessage("El pago total es : S/." + pagototal + ". Se le agregó el primer complemento");
            // Alert dialog button
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // Alert dialog action goes here
                            dialog.dismiss();// use dismiss to cancel alert dialog
                        }
                    });
            alertDialog.show();
        } else if (item.equals(tipoA) && checkBox2.isChecked()) {

            int pagototal = 36 + 8;
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Venta Terminada");
            alertDialog.setMessage("El pago total es : S/." + pagototal + ". Se le agregó el segundo complemento");
            // Alert dialog button
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // Alert dialog action goes here
                            dialog.dismiss();// use dismiss to cancel alert dialog
                        }
                    });
            alertDialog.show();

        } else if (item.equals(tipoB) && checkBox2.isChecked()) {

            int pagototal = 42 + 8;
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Venta Terminada");
            alertDialog.setMessage("El pago total es : S/." + pagototal + ". Se le agregó el segundo complemento");
            // Alert dialog button
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // Alert dialog action goes here
                            dialog.dismiss();// use dismiss to cancel alert dialog
                        }
                    });
            alertDialog.show();

        } else if (item.equals(tipoC) && checkBox2.isChecked()) {

            int pagototal = 36 + 8;
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Venta Terminada");
            alertDialog.setMessage("El pago total es : S/." + pagototal + ". Se le agregó el segundo complemento");
            // Alert dialog button
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // Alert dialog action goes here
                            dialog.dismiss();// use dismiss to cancel alert dialog
                        }
                    });
            alertDialog.show();

        } else if (item.equals(tipoD) && checkBox2.isChecked()) {

            int pagototal = 56 + 8;
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Venta Terminada");
            alertDialog.setMessage("El pago total es : S/." + pagototal + ". Se le agregó el segundo complemento");
            // Alert dialog button
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // Alert dialog action goes here
                            dialog.dismiss();// use dismiss to cancel alert dialog
                        }
                    });
            alertDialog.show();
        } else if (item.equals(tipoA) && checkBox.isChecked() && checkBox2.isChecked()) {

            int pagototal = 38 + 12;
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Venta Terminada");
            alertDialog.setMessage("El pago total es : S/." + pagototal + ". " + " Se le agregó los dos complementos");
            // Alert dialog button
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // Alert dialog action goes here
                            dialog.dismiss();// use dismiss to cancel alert dialog
                        }
                    });
            alertDialog.show();
        } else if (item.equals(tipoB) && checkBox.isChecked() && checkBox2.isChecked()) {

            int pagototal = 42 + 12;
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Venta Terminada");
            alertDialog.setMessage("El pago total es : S/." + pagototal + ". " + " Se le agregó los dos complementos");
            // Alert dialog button
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // Alert dialog action goes here
                            dialog.dismiss();// use dismiss to cancel alert dialog
                        }
                    });
            alertDialog.show();
        } else if (item.equals(tipoC) && checkBox.isChecked() && checkBox2.isChecked()) {

            int pagototal = 36 + 12;
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Venta Terminada");
            alertDialog.setMessage("El pago total es : S/." + pagototal + ". " + " Se le agregó los dos complementos");
            // Alert dialog button
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // Alert dialog action goes here
                            dialog.dismiss();// use dismiss to cancel alert dialog
                        }
                    });
            alertDialog.show();
        } else if (item.equals(tipoD) && checkBox.isChecked() && checkBox2.isChecked()) {

            int pagototal = 56 + 12;
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Venta Terminada");
            alertDialog.setMessage("El pago total es : S/." + pagototal + ". " + " Se le agregó los dos complementos");
            // Alert dialog button
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // Alert dialog action goes here
                            dialog.dismiss();// use dismiss to cancel alert dialog
                        }
                    });
            alertDialog.show();
        }

        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_ONE_SHOT);

        // Notification
        Notification notification = new NotificationCompat.Builder(this)
                .setContentTitle("Notification Title")
                .setContentText("Some Content...")
                .setSmallIcon(R.mipmap.ic_launcher)
                .setColor(ContextCompat.getColor(this, R.color.colorPrimary))
                .setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION))
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)
                .build();

        // Notification manager
        NotificationManager notificationManager = (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(0, notification);


    }
}







