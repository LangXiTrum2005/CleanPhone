package com.adjust.sdk.sig;

import android.util.Log;
import com.adjust.sdk.AdjustConfig;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f7026a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7027b;

    public x1(Map map) {
        this.f7027b = AdjustConfig.ENVIRONMENT_SANDBOX.equals(map.get("environment"));
    }

    public final void a(String str) {
        if (this.f7027b) {
            StringBuilder sbI = d5.u.i(str);
            sbI.append(this.f7026a.format(new Date(System.currentTimeMillis())));
            Log.v("SignerInstance", sbI.toString());
        }
    }
}
