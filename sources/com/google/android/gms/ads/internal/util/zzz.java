package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.b30;
import com.google.android.gms.internal.ads.g30;
import com.google.android.gms.internal.ads.ll;
import com.google.android.gms.internal.ads.pj;
import com.google.android.gms.internal.ads.zl0;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class zzz {
    @Nullable
    public CookieManager zza(Context context) {
        throw null;
    }

    public g30 zzb(b30 b30Var, pj pjVar, boolean z10, @Nullable zl0 zl0Var) {
        throw null;
    }

    public WebResourceResponse zzc(String str, String str2, int i10, String str3, Map map, InputStream inputStream) {
        throw null;
    }

    public ll zzd(Context context, TelephonyManager telephonyManager) {
        return ll.ENUM_UNKNOWN;
    }

    public boolean zzf(Context context, String str) {
        return false;
    }

    @Nullable
    public Intent zzg(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public int zzi(AudioManager audioManager) {
        return 0;
    }

    public int zzk(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }

    public void zzh(Activity activity) {
    }

    public void zze(Context context, String str, String str2) {
    }
}
