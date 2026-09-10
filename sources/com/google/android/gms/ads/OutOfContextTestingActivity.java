package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.internal.ads.qt;
import s9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class OutOfContextTestingActivity extends Activity {

    @NonNull
    public static final String AD_UNIT_KEY = "adUnit";

    @NonNull
    public static final String CLASS_NAME = "com.google.android.gms.ads.OutOfContextTestingActivity";

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzdt zzdtVarZzh = zzay.zzb().zzh(this, new qt());
        if (zzdtVarZzh == null) {
            finish();
            return;
        }
        setContentView(R.layout.admob_empty_layout);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("adUnit");
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            zzdtVarZzh.zze(stringExtra, new b(this), new b(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}
