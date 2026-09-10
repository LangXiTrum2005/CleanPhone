package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.aw;
import com.google.android.gms.internal.ads.qt;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class NotificationHandlerActivity extends Activity {

    @NonNull
    public static final String CLASS_NAME = "com.google.android.gms.ads.NotificationHandlerActivity";

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            aw awVarZzj = zzay.zzb().zzj(this, new qt());
            if (awVarZzj == null) {
                zzo.zzf("OfflineUtils is null");
            } else {
                awVarZzj.s(getIntent());
            }
        } catch (RemoteException e10) {
            zzo.zzf("RemoteException calling handleNotificationIntent: ".concat(e10.toString()));
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        finish();
    }
}
