package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f18393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f18394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f18395h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f18396i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f18397j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f18398k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f18399m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f18400n;

    /* JADX WARN: Code duplicated, block: B:12:0x0062  */
    public ox(Context context) {
        ActivityInfo activityInfo;
        String string;
        DisplayMetrics displayMetrics;
        PackageManager packageManager = context.getPackageManager();
        am.a(context);
        b(context);
        c(context);
        d(context);
        Locale locale = Locale.getDefault();
        this.f18390c = e("geo:0,0?q=donuts", packageManager) != null;
        this.f18391d = e("http://www.google.com", packageManager) != null;
        this.f18392e = locale.getCountry();
        zzt.zzc();
        zzay.zza();
        this.f18393f = zzf.zzy();
        this.f18394g = p9.c.h(context);
        this.f18395h = p9.c.l(context);
        this.f18396i = locale.getLanguage();
        ResolveInfo resolveInfoE = e("market://details?id=com.google.android.gms.ads", packageManager);
        String string2 = null;
        if (resolveInfoE == null || (activityInfo = resolveInfoE.activityInfo) == null) {
            string = null;
        } else {
            try {
                PackageInfo packageInfoF = r9.c.a(context).f(0, activityInfo.packageName);
                if (packageInfoF != null) {
                    int i10 = packageInfoF.versionCode;
                    String str = activityInfo.packageName;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 1 + String.valueOf(str).length());
                    sb2.append(i10);
                    sb2.append(".");
                    sb2.append(str);
                    string = sb2.toString();
                } else {
                    string = null;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        this.f18397j = string;
        try {
            PackageInfo packageInfoF2 = r9.c.a(context).f(128, "com.android.vending");
            if (packageInfoF2 != null) {
                int i11 = packageInfoF2.versionCode;
                String str2 = packageInfoF2.packageName;
                StringBuilder sb3 = new StringBuilder(String.valueOf(i11).length() + 1 + String.valueOf(str2).length());
                sb3.append(i11);
                sb3.append(".");
                sb3.append(str2);
                string2 = sb3.toString();
            }
        } catch (Exception unused2) {
        }
        this.f18400n = string2;
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return;
        }
        this.f18398k = displayMetrics.density;
        this.l = displayMetrics.widthPixels;
        this.f18399m = displayMetrics.heightPixels;
    }

    public static ResolveInfo e(String str, PackageManager packageManager) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), C.DEFAULT_BUFFER_SEGMENT_SIZE);
        } catch (Throwable th2) {
            zzt.zzh().d("DeviceInfo.getResolveInfo", th2);
            return null;
        }
    }

    public final px a() {
        return new px(this.f18390c, this.f18391d, this.f18392e, this.f18393f, this.f18394g, this.f18395h, this.f18396i, this.f18397j, this.f18400n, this.f18388a, this.f18389b, this.f18398k, this.l, this.f18399m);
    }

    public final void b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                audioManager.getMode();
                audioManager.isMusicActive();
                audioManager.isSpeakerphoneOn();
                audioManager.getStreamVolume(3);
                audioManager.getRingerMode();
                audioManager.getStreamVolume(2);
            } catch (Throwable th2) {
                zzt.zzh().d("DeviceInfo.gatherAudioInfo", th2);
            }
        }
    }

    public final void c(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        telephonyManager.getNetworkOperator();
        this.f18389b = ((Boolean) zzba.zzc().a(am.Z9)).booleanValue() ? 0 : telephonyManager.getNetworkType();
        telephonyManager.getPhoneType();
        this.f18388a = -2;
        zzt.zzc();
        if (zzs.zzD(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.f18388a = activeNetworkInfo.getType();
                activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.f18388a = -1;
            }
            connectivityManager.isActiveNetworkMetered();
        }
    }

    public final void d(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intentRegisterReceiver = (!((Boolean) zzba.zzc().a(am.Fc)).booleanValue() || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        if (intentRegisterReceiver != null) {
            intentRegisterReceiver.getIntExtra("status", -1);
            intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
            intentRegisterReceiver.getIntExtra("scale", -1);
        }
    }

    public ox(Context context, px pxVar) {
        am.a(context);
        b(context);
        c(context);
        d(context);
        String str = Build.FINGERPRINT;
        String str2 = Build.DEVICE;
        nm.a(context);
        this.f18390c = pxVar.f18819a;
        this.f18391d = pxVar.f18820b;
        this.f18392e = pxVar.f18821c;
        this.f18393f = pxVar.f18822d;
        this.f18394g = pxVar.f18823e;
        this.f18395h = pxVar.f18824f;
        this.f18396i = pxVar.f18825g;
        this.f18397j = pxVar.f18826h;
        this.f18400n = pxVar.f18827i;
        this.f18398k = pxVar.l;
        this.l = pxVar.f18830m;
        this.f18399m = pxVar.f18831n;
    }
}
