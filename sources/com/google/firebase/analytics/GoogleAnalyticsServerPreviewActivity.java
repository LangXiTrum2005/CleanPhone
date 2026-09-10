package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.c8;
import com.google.android.gms.internal.measurement.p7;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class GoogleAnalyticsServerPreviewActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c8 c8VarE = c8.e(this, null);
        Intent intent = getIntent();
        c8VarE.getClass();
        c8VarE.c(new p7(c8VarE, intent, 2));
        finish();
    }
}
