package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StatFs;
import android.os.ext.SdkExtensions;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.CookieManager;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzac;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzq;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzv;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sf implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19950b;

    public /* synthetic */ sf(Object obj, int i10) {
        this.f19949a = i10;
        this.f19950b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005c A[Catch: IOException -> 0x0043, TryCatch #0 {IOException -> 0x0043, blocks: (B:3:0x0004, B:5:0x002b, B:7:0x003d, B:12:0x0048, B:17:0x006e, B:18:0x0093, B:27:0x00a0, B:29:0x00b2, B:31:0x00ca, B:33:0x00d3, B:38:0x00f9, B:40:0x0119, B:41:0x013a, B:54:0x0164, B:55:0x0169, B:68:0x0183, B:69:0x0188, B:77:0x01a2, B:75:0x019e, B:61:0x017c, B:66:0x0181, B:36:0x00e7, B:25:0x009e, B:15:0x005c, B:56:0x016a, B:57:0x0178, B:42:0x013b, B:43:0x0142, B:47:0x0154, B:48:0x0159, B:52:0x015d, B:53:0x0163, B:64:0x017f, B:70:0x0189, B:71:0x0197, B:20:0x0096, B:21:0x009a), top: B:81:0x0004, inners: #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x006e A[Catch: IOException -> 0x0043, TryCatch #0 {IOException -> 0x0043, blocks: (B:3:0x0004, B:5:0x002b, B:7:0x003d, B:12:0x0048, B:17:0x006e, B:18:0x0093, B:27:0x00a0, B:29:0x00b2, B:31:0x00ca, B:33:0x00d3, B:38:0x00f9, B:40:0x0119, B:41:0x013a, B:54:0x0164, B:55:0x0169, B:68:0x0183, B:69:0x0188, B:77:0x01a2, B:75:0x019e, B:61:0x017c, B:66:0x0181, B:36:0x00e7, B:25:0x009e, B:15:0x005c, B:56:0x016a, B:57:0x0178, B:42:0x013b, B:43:0x0142, B:47:0x0154, B:48:0x0159, B:52:0x015d, B:53:0x0163, B:64:0x017f, B:70:0x0189, B:71:0x0197, B:20:0x0096, B:21:0x009a), top: B:81:0x0004, inners: #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0094  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00e7 A[Catch: IOException -> 0x0043, TryCatch #0 {IOException -> 0x0043, blocks: (B:3:0x0004, B:5:0x002b, B:7:0x003d, B:12:0x0048, B:17:0x006e, B:18:0x0093, B:27:0x00a0, B:29:0x00b2, B:31:0x00ca, B:33:0x00d3, B:38:0x00f9, B:40:0x0119, B:41:0x013a, B:54:0x0164, B:55:0x0169, B:68:0x0183, B:69:0x0188, B:77:0x01a2, B:75:0x019e, B:61:0x017c, B:66:0x0181, B:36:0x00e7, B:25:0x009e, B:15:0x005c, B:56:0x016a, B:57:0x0178, B:42:0x013b, B:43:0x0142, B:47:0x0154, B:48:0x0159, B:52:0x015d, B:53:0x0163, B:64:0x017f, B:70:0x0189, B:71:0x0197, B:20:0x0096, B:21:0x009a), top: B:81:0x0004, inners: #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00f9 A[Catch: IOException -> 0x0043, TryCatch #0 {IOException -> 0x0043, blocks: (B:3:0x0004, B:5:0x002b, B:7:0x003d, B:12:0x0048, B:17:0x006e, B:18:0x0093, B:27:0x00a0, B:29:0x00b2, B:31:0x00ca, B:33:0x00d3, B:38:0x00f9, B:40:0x0119, B:41:0x013a, B:54:0x0164, B:55:0x0169, B:68:0x0183, B:69:0x0188, B:77:0x01a2, B:75:0x019e, B:61:0x017c, B:66:0x0181, B:36:0x00e7, B:25:0x009e, B:15:0x005c, B:56:0x016a, B:57:0x0178, B:42:0x013b, B:43:0x0142, B:47:0x0154, B:48:0x0159, B:52:0x015d, B:53:0x0163, B:64:0x017f, B:70:0x0189, B:71:0x0197, B:20:0x0096, B:21:0x009a), top: B:81:0x0004, inners: #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0119 A[Catch: IOException -> 0x0043, TryCatch #0 {IOException -> 0x0043, blocks: (B:3:0x0004, B:5:0x002b, B:7:0x003d, B:12:0x0048, B:17:0x006e, B:18:0x0093, B:27:0x00a0, B:29:0x00b2, B:31:0x00ca, B:33:0x00d3, B:38:0x00f9, B:40:0x0119, B:41:0x013a, B:54:0x0164, B:55:0x0169, B:68:0x0183, B:69:0x0188, B:77:0x01a2, B:75:0x019e, B:61:0x017c, B:66:0x0181, B:36:0x00e7, B:25:0x009e, B:15:0x005c, B:56:0x016a, B:57:0x0178, B:42:0x013b, B:43:0x0142, B:47:0x0154, B:48:0x0159, B:52:0x015d, B:53:0x0163, B:64:0x017f, B:70:0x0189, B:71:0x0197, B:20:0x0096, B:21:0x009a), top: B:81:0x0004, inners: #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0154 A[Catch: all -> 0x015b, TRY_ENTER, TryCatch #2 {all -> 0x015b, blocks: (B:42:0x013b, B:43:0x0142, B:47:0x0154, B:48:0x0159, B:52:0x015d, B:53:0x0163, B:64:0x017f, B:44:0x0143, B:45:0x0151), top: B:84:0x013b, outer: #0, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x015d A[Catch: all -> 0x015b, TryCatch #2 {all -> 0x015b, blocks: (B:42:0x013b, B:43:0x0142, B:47:0x0154, B:48:0x0159, B:52:0x015d, B:53:0x0163, B:64:0x017f, B:44:0x0143, B:45:0x0151), top: B:84:0x013b, outer: #0, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0182  */
    /* JADX WARN: Code duplicated, block: B:82:0x016a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x013b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0189 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final Object a() {
        b2.i0 i0VarA;
        b2.i0 i0Var;
        boolean z10;
        boolean z11;
        a21 a21VarF;
        x11 x11VarV;
        boolean z12;
        long jLongValue;
        boolean zZzx;
        x11 x11Var;
        boolean z13;
        z11 z11VarF;
        long jLongValue2;
        boolean zZzx2;
        tp0 tp0Var = (tp0) this.f19950b;
        try {
            Context context = (Context) tp0Var.f20456c;
            boolean zMatches = ((ou0) tp0Var.f20457d).f18366g.matches((String) zzba.zzc().a(am.f12252m4));
            b2.i0 i0Var2 = new b2.i0();
            b2.i0 i0Var3 = new b2.i0();
            if (zMatches) {
                if (!((Boolean) zzba.zzc().a(am.f12177h4)).booleanValue()) {
                    return new rr0(true);
                }
            }
            if (zMatches) {
                if (zMatches) {
                    if (((Boolean) zzba.zzc().a(am.f12146f4)).booleanValue()) {
                        z11VarF = z11.f(context);
                        jLongValue2 = ((Long) zzba.zzc().a(am.f12282o4)).longValue();
                        zZzx2 = zzt.zzh().g().zzx();
                        z11VarF.getClass();
                        synchronized (z11.class) {
                            i0VarA = z11VarF.a(null, null, jLongValue2, zZzx2);
                        }
                    }
                }
                i0VarA = i0Var2;
            } else {
                if (((Boolean) zzba.zzc().a(am.f12113d4)).booleanValue()) {
                    z11VarF = z11.f(context);
                    jLongValue2 = ((Long) zzba.zzc().a(am.f12282o4)).longValue();
                    zZzx2 = zzt.zzh().g().zzx();
                    z11VarF.getClass();
                    synchronized (z11.class) {
                        i0VarA = z11VarF.a(null, null, jLongValue2, zZzx2);
                    }
                } else {
                    if (zMatches) {
                        if (((Boolean) zzba.zzc().a(am.f12146f4)).booleanValue()) {
                            z11VarF = z11.f(context);
                            jLongValue2 = ((Long) zzba.zzc().a(am.f12282o4)).longValue();
                            zZzx2 = zzt.zzh().g().zzx();
                            z11VarF.getClass();
                            synchronized (z11.class) {
                                i0VarA = z11VarF.a(null, null, jLongValue2, zZzx2);
                            }
                        }
                    }
                    i0VarA = i0Var2;
                }
            }
            if (((Boolean) zzba.zzc().a(am.f12237l4)).booleanValue()) {
                if (((VersionInfoParcel) tp0Var.f20458e).clientJarVersion < ((Integer) zzba.zzc().a(am.f12223k4)).intValue()) {
                    a21.f(context).g();
                }
            }
            if (zMatches) {
                if (zMatches) {
                    if (((Boolean) zzba.zzc().a(am.f12162g4)).booleanValue()) {
                        a21VarF = a21.f(context);
                        x11VarV = x11.v(context);
                        if (((VersionInfoParcel) tp0Var.f20458e).clientJarVersion >= ((Integer) zzba.zzc().a(am.f12223k4)).intValue()) {
                            jLongValue = ((Long) zzba.zzc().a(am.f12297p4)).longValue();
                            zZzx = zzt.zzh().g().zzx();
                            a21VarF.getClass();
                            synchronized (a21.class) {
                                x11Var = a21VarF.f22080g;
                                x11Var.getClass();
                                synchronized (x11.class) {
                                    z13 = ((SharedPreferences) ((iw0) x11Var.f21703b).f15865c).getBoolean("paidv2_publisher_option", true);
                                    if (z13) {
                                        i0Var3 = a21VarF.a(null, null, jLongValue, zZzx);
                                    } else {
                                        i0Var3 = new b2.i0();
                                    }
                                    x11VarV.getClass();
                                    synchronized (x11.class) {
                                        z12 = ((SharedPreferences) ((iw0) x11VarV.f21703b).f15865c).getBoolean("paidv2_publisher_option", true);
                                    }
                                }
                            }
                        } else {
                            z12 = true;
                        }
                        x11VarV.getClass();
                        synchronized (x11.class) {
                            z11 = ((SharedPreferences) ((iw0) x11VarV.f21703b).f15865c).getBoolean("paidv2_user_option", true);
                            z10 = z12;
                            i0Var = i0Var3;
                        }
                    }
                }
                i0Var = i0Var3;
                z10 = true;
                z11 = true;
            } else {
                if (((Boolean) zzba.zzc().a(am.f12130e4)).booleanValue()) {
                    a21VarF = a21.f(context);
                    x11VarV = x11.v(context);
                    if (((VersionInfoParcel) tp0Var.f20458e).clientJarVersion >= ((Integer) zzba.zzc().a(am.f12223k4)).intValue()) {
                        jLongValue = ((Long) zzba.zzc().a(am.f12297p4)).longValue();
                        zZzx = zzt.zzh().g().zzx();
                        a21VarF.getClass();
                        synchronized (a21.class) {
                            x11Var = a21VarF.f22080g;
                            x11Var.getClass();
                            synchronized (x11.class) {
                                z13 = ((SharedPreferences) ((iw0) x11Var.f21703b).f15865c).getBoolean("paidv2_publisher_option", true);
                                if (z13) {
                                    i0Var3 = new b2.i0();
                                } else {
                                    i0Var3 = a21VarF.a(null, null, jLongValue, zZzx);
                                }
                                x11VarV.getClass();
                                synchronized (x11.class) {
                                    z12 = ((SharedPreferences) ((iw0) x11VarV.f21703b).f15865c).getBoolean("paidv2_publisher_option", true);
                                }
                            }
                        }
                    } else {
                        z12 = true;
                    }
                    x11VarV.getClass();
                    synchronized (x11.class) {
                        z11 = ((SharedPreferences) ((iw0) x11VarV.f21703b).f15865c).getBoolean("paidv2_user_option", true);
                        z10 = z12;
                        i0Var = i0Var3;
                    }
                } else {
                    if (zMatches) {
                        if (((Boolean) zzba.zzc().a(am.f12162g4)).booleanValue()) {
                            a21VarF = a21.f(context);
                            x11VarV = x11.v(context);
                            if (((VersionInfoParcel) tp0Var.f20458e).clientJarVersion >= ((Integer) zzba.zzc().a(am.f12223k4)).intValue()) {
                                jLongValue = ((Long) zzba.zzc().a(am.f12297p4)).longValue();
                                zZzx = zzt.zzh().g().zzx();
                                a21VarF.getClass();
                                synchronized (a21.class) {
                                    try {
                                        x11Var = a21VarF.f22080g;
                                        x11Var.getClass();
                                        synchronized (x11.class) {
                                            z13 = ((SharedPreferences) ((iw0) x11Var.f21703b).f15865c).getBoolean("paidv2_publisher_option", true);
                                        }
                                        if (z13) {
                                            i0Var3 = new b2.i0();
                                        } else {
                                            i0Var3 = a21VarF.a(null, null, jLongValue, zZzx);
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                x11VarV.getClass();
                                synchronized (x11.class) {
                                    z12 = ((SharedPreferences) ((iw0) x11VarV.f21703b).f15865c).getBoolean("paidv2_publisher_option", true);
                                }
                            } else {
                                z12 = true;
                            }
                            x11VarV.getClass();
                            synchronized (x11.class) {
                            }
                            z11 = ((SharedPreferences) ((iw0) x11VarV.f21703b).f15865c).getBoolean("paidv2_user_option", true);
                            z10 = z12;
                            i0Var = i0Var3;
                        }
                    }
                    i0Var = i0Var3;
                    z10 = true;
                    z11 = true;
                }
            }
            return new rr0(i0VarA, i0Var, z10, z11, zMatches);
        } catch (IOException e10) {
            zzt.zzh().d("PerAppIdSignal", e10);
            return new rr0(((ou0) tp0Var.f20457d).f18366g.matches((String) zzba.zzc().a(am.f12252m4)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0129  */
    /* JADX WARN: Code duplicated, block: B:33:0x013a  */
    /* JADX WARN: Code duplicated, block: B:35:0x014c  */
    /* JADX WARN: Code duplicated, block: B:47:0x01a2 A[EDGE_INSN: B:47:0x01a2->B:48:0x01a6 BREAK  A[LOOP:1: B:41:0x0172->B:46:0x019f]] */
    /* JADX WARN: Code duplicated, block: B:50:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:52:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:53:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:56:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:58:0x0202  */
    /* JADX WARN: Code duplicated, block: B:60:0x0209  */
    /* JADX WARN: Code duplicated, block: B:61:0x020e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0213  */
    /* JADX WARN: Code duplicated, block: B:64:0x0216  */
    /* JADX WARN: Code duplicated, block: B:67:0x021a  */
    private final Object b() {
        ActivityInfo activityInfo;
        boolean z10;
        Context context;
        String string;
        String str;
        String string2;
        String language;
        String str2;
        List<ResolveInfo> listQueryIntentActivities;
        Context context2;
        boolean zEquals;
        boolean z11;
        String strZzf;
        boolean z12;
        tp0 tp0Var = (tp0) this.f19950b;
        Context context3 = (Context) tp0Var.f20456c;
        PackageManager packageManager = context3.getPackageManager();
        Locale locale = Locale.getDefault();
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=donuts")), C.DEFAULT_BUFFER_SEGMENT_SIZE);
        ResolveInfo resolveInfoResolveActivity2 = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com")), C.DEFAULT_BUFFER_SEGMENT_SIZE);
        String country = locale.getCountry();
        zzt.zzc();
        zzay.zza();
        boolean zZzy = zzf.zzy();
        boolean zH = p9.c.h(context3);
        boolean zL = p9.c.l(context3);
        String language2 = locale.getLanguage();
        ArrayList arrayList = new ArrayList();
        LocaleList localeList = LocaleList.getDefault();
        for (int i10 = 0; i10 < localeList.size(); i10++) {
            arrayList.add(localeList.get(i10).getLanguage());
        }
        ResolveInfo resolveInfoResolveActivity3 = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.gms.ads")), C.DEFAULT_BUFFER_SEGMENT_SIZE);
        String strZza = null;
        if (resolveInfoResolveActivity3 == null || (activityInfo = resolveInfoResolveActivity3.activityInfo) == null) {
            context = context3;
            string = null;
            z10 = true;
        } else {
            z10 = true;
            try {
                context = context3;
                try {
                    PackageInfo packageInfoF = r9.c.a(context3).f(0, activityInfo.packageName);
                    if (packageInfoF != null) {
                        int i11 = packageInfoF.versionCode;
                        String str3 = activityInfo.packageName;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 1 + String.valueOf(str3).length());
                        sb2.append(i11);
                        sb2.append(".");
                        sb2.append(str3);
                        string = sb2.toString();
                    } else {
                        string = null;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                context = context3;
            }
        }
        try {
            PackageInfo packageInfoF2 = r9.c.a(context).f(128, "com.android.vending");
            if (packageInfoF2 != null) {
                int i12 = packageInfoF2.versionCode;
                String str4 = packageInfoF2.packageName;
                str = string;
                try {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i12).length() + 1 + String.valueOf(str4).length());
                    sb3.append(i12);
                    sb3.append(".");
                    sb3.append(str4);
                    string2 = sb3.toString();
                } catch (Exception unused3) {
                    string2 = null;
                }
                String str5 = Build.FINGERPRINT;
                language = Locale.getDefault().getLanguage();
                if (((Boolean) zzba.zzc().a(am.gf)).booleanValue()) {
                    zzq zzqVarZzk = zzs.zzk(context);
                    String strZzb = zzqVarZzk.zzb();
                    strZza = zzqVarZzk.zza();
                    str2 = strZzb;
                } else {
                    if (((Boolean) zzba.zzc().a(am.ff)).booleanValue()) {
                        language = zzs.zzk(context).zzb();
                    }
                    str2 = language;
                }
                String str6 = strZza;
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                ResolveInfo resolveInfoResolveActivity4 = packageManager.resolveActivity(intent, 0);
                listQueryIntentActivities = packageManager.queryIntentActivities(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE);
                if (listQueryIntentActivities == null || resolveInfoResolveActivity4 == null) {
                    context2 = context;
                    zEquals = false;
                    break;
                }
                int i13 = 0;
                while (true) {
                    if (i13 >= listQueryIntentActivities.size()) {
                        context2 = context;
                        zEquals = false;
                        break;
                    }
                    if (resolveInfoResolveActivity4.activityInfo.name.equals(listQueryIntentActivities.get(i13).activityInfo.name)) {
                        Context context4 = context;
                        zEquals = resolveInfoResolveActivity4.activityInfo.packageName.equals(jc1.c(context));
                        context2 = context4;
                        break;
                    }
                    i13++;
                }
                zzt.zzc();
                long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
                if (((Boolean) zzba.zzc().a(am.Xc)).booleanValue()) {
                    zzt.zzc();
                    if (zzs.zzE(context2)) {
                        z11 = z10;
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
                if (((Boolean) zzba.zzc().a(am.f12089bd)).booleanValue()) {
                    strZzf = "";
                } else if (((Boolean) zzba.zzc().a(am.f12121dd)).booleanValue()) {
                    strZzf = (String) tp0Var.f20458e;
                } else {
                    strZzf = zzf.zzf(context2);
                }
                String str7 = strZzf;
                if (resolveInfoResolveActivity2 != null) {
                    z12 = z10;
                } else {
                    z12 = false;
                }
                if (resolveInfoResolveActivity == null) {
                    z10 = false;
                }
                bk0 bk0Var = (bk0) tp0Var.f20457d;
                String str8 = Build.MODEL;
                return new ds0(z10, z12, country, zZzy, zH, zL, language2, arrayList, str, string2, zEquals, availableBytes, z11, str7, Build.VERSION.SDK_INT, str2, str6, bk0Var.a());
            }
            str = string;
        } catch (Exception unused4) {
        }
        string2 = null;
        String str9 = Build.FINGERPRINT;
        language = Locale.getDefault().getLanguage();
        if (((Boolean) zzba.zzc().a(am.gf)).booleanValue()) {
            zzq zzqVarZzk2 = zzs.zzk(context);
            String strZzb2 = zzqVarZzk2.zzb();
            strZza = zzqVarZzk2.zza();
            str2 = strZzb2;
        } else {
            if (((Boolean) zzba.zzc().a(am.ff)).booleanValue()) {
                language = zzs.zzk(context).zzb();
            }
            str2 = language;
        }
        String str10 = strZza;
        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveInfoResolveActivity5 = packageManager.resolveActivity(intent2, 0);
        listQueryIntentActivities = packageManager.queryIntentActivities(intent2, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (listQueryIntentActivities == null) {
            context2 = context;
            zEquals = false;
            break;
        }
        context2 = context;
        zEquals = false;
        break;
        zzt.zzc();
        long availableBytes2 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        if (((Boolean) zzba.zzc().a(am.Xc)).booleanValue()) {
            zzt.zzc();
            if (zzs.zzE(context2)) {
                z11 = z10;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        if (((Boolean) zzba.zzc().a(am.f12089bd)).booleanValue()) {
            strZzf = "";
        } else if (((Boolean) zzba.zzc().a(am.f12121dd)).booleanValue()) {
            strZzf = (String) tp0Var.f20458e;
        } else {
            strZzf = zzf.zzf(context2);
        }
        String str11 = strZzf;
        if (resolveInfoResolveActivity2 != null) {
            z12 = z10;
        } else {
            z12 = false;
        }
        if (resolveInfoResolveActivity == null) {
            z10 = false;
        }
        bk0 bk0Var2 = (bk0) tp0Var.f20457d;
        String str12 = Build.MODEL;
        return new ds0(z10, z12, country, zZzy, zH, zL, language2, arrayList, str, string2, zEquals, availableBytes2, z11, str11, Build.VERSION.SDK_INT, str2, str10, bk0Var2.a());
    }

    /* JADX WARN: Code duplicated, block: B:189:0x0433  */
    /* JADX WARN: Code duplicated, block: B:249:0x059a  */
    /* JADX WARN: Code duplicated, block: B:95:0x021f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:249:0x059a -> B:251:0x05a6). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        long j10;
        byte[] byteArray;
        ff1 ff1VarH;
        int extensionVersion;
        int i10;
        int streamMaxVolume;
        int intExtra;
        boolean zIsCharging;
        int intExtra2;
        JSONObject jSONObject;
        ViewGroup viewGroup;
        String str;
        boolean z10;
        HashMap map;
        int i11;
        int iOrdinal = -1;
        int i12 = 2;
        String strEncodeToString = null;
        Boolean boolValueOf = null;
        Bundle bundle = null;
        strEncodeToString = null;
        boolean z11 = true;
        boolean z12 = true;
        z = true;
        z = true;
        z = true;
        boolean z13 = true;
        int i13 = 0;
        boolean zIsActiveNetworkMetered = false;
        switch (this.f19949a) {
            case 0:
                Context context = (Context) this.f19950b;
                try {
                    return ps1.q(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
                } catch (Throwable unused) {
                    return null;
                }
            case 1:
                Context context2 = ((f00) this.f19950b).f14133e;
                int i14 = tx.f20518a;
                Context applicationContext = context2.getApplicationContext();
                if (applicationContext != null) {
                    context2 = applicationContext;
                }
                ArrayList arrayList = new ArrayList();
                try {
                    PackageInfo packageInfoF = r9.c.a(context2).f(4096, context2.getApplicationInfo().packageName);
                    if (packageInfoF.requestedPermissions != null && packageInfoF.requestedPermissionsFlags != null) {
                        while (true) {
                            String[] strArr = packageInfoF.requestedPermissions;
                            if (i13 < strArr.length) {
                                if ((packageInfoF.requestedPermissionsFlags[i13] & 2) != 0) {
                                    arrayList.add(strArr[i13]);
                                }
                                i13++;
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                return arrayList;
            case 2:
                w10 w10Var = (w10) this.f19950b;
                return Boolean.valueOf(w10Var.f21362c.k(w10Var.f21363d, w10Var.f21364e, w10Var));
            case 3:
                m20 m20Var = (m20) this.f19950b;
                m20Var.getClass();
                ej ejVarZzj = zzt.zzj();
                ij ijVar = m20Var.f17222n;
                synchronized (ejVarZzj.f13990c) {
                    try {
                        j10 = -2;
                        if (ejVarZzj.f13993f != null) {
                            if (ejVarZzj.f13991d.j()) {
                                try {
                                    jj jjVar = ejVarZzj.f13993f;
                                    Parcel parcelQ = jjVar.q();
                                    rh.c(parcelQ, ijVar);
                                    Parcel parcelR = jjVar.r(parcelQ, 3);
                                    long j11 = parcelR.readLong();
                                    parcelR.recycle();
                                    j10 = j11;
                                } catch (RemoteException e10) {
                                    int i15 = zze.zza;
                                    zzo.zzg("Unable to call into cache service.", e10);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return Long.valueOf(j10);
            case 4:
                CookieManager cookieManager = (CookieManager) this.f19950b;
                return cookieManager == null ? "" : cookieManager.getCookie((String) zzba.zzc().a(am.E1));
            case 5:
                return ((nl0) this.f19950b).getWritableDatabase();
            case 6:
                return ((ul0) this.f19950b).getWritableDatabase();
            case 7:
                tp0 tp0Var = (tp0) this.f19950b;
                ArrayList arrayList2 = new ArrayList();
                View view = (ViewGroup) tp0Var.f20458e;
                while (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent != null) {
                        int iIndexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("type", parent.getClass().getName());
                        bundle2.putInt("index_of_child", iIndexOfChild);
                        arrayList2.add(bundle2);
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                    }
                    return new up0((Context) tp0Var.f20456c, ((ou0) tp0Var.f20457d).f18365f, arrayList2, i13);
                }
                return new up0((Context) tp0Var.f20456c, ((ou0) tp0Var.f20457d).f18365f, arrayList2, i13);
            case 8:
                xp0 xp0Var = (xp0) this.f19950b;
                if (((Boolean) zzba.zzc().a(am.f12134e8)).booleanValue()) {
                    if ((((Boolean) zzba.zzc().a(am.f12166g8)).booleanValue() ? Arrays.asList(((String) zzba.zzc().a(am.h8)).split(",")) : Arrays.asList(((String) zzba.zzc().a(am.f12150f8)).split(","))).contains(zzv.zzb(zzv.zzc(xp0Var.f21956c.f18363d)))) {
                        try {
                            ti1 ti1Var = ti1.f20404b;
                            synchronized (ti1Var) {
                                HashMap map2 = ti1Var.f20405a;
                                if (!map2.containsKey("AES128_GCM")) {
                                    throw new GeneralSecurityException("Name AES128_GCM does not exist");
                                }
                                ff1VarH = (ff1) map2.get("AES128_GCM");
                            }
                            if (ff1VarH == null) {
                                try {
                                    ff1VarH = jd1.h(((wm1) ((lj1) vi1.f21181b.h(null)).f17037c).b());
                                } catch (GeneralSecurityException e11) {
                                    throw new aa.b(7, "Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e11);
                                }
                            }
                            iw0 iw0VarZ = iw0.z(ff1VarH);
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    iw0VarZ.h().c(byteArrayOutputStream);
                                    byteArrayOutputStream.close();
                                    byteArray = byteArrayOutputStream.toByteArray();
                                } catch (Throwable th3) {
                                    byteArrayOutputStream.close();
                                    throw th3;
                                }
                            } catch (IOException unused3) {
                                throw new GeneralSecurityException("Serialize keyset failed");
                            }
                        } catch (GeneralSecurityException e12) {
                            zze.zza("Failed to generate key".concat(e12.toString()));
                            zzt.zzh().d("CryptoUtils.generateKey", e12);
                            byteArray = new byte[0];
                        }
                        strEncodeToString = Base64.encodeToString(byteArray, 11);
                    }
                }
                return new yp0(strEncodeToString, i13);
            case 9:
                tp0 tp0Var2 = (tp0) this.f19950b;
                List<String> listAsList = Arrays.asList(((String) zzba.zzc().a(am.f12175h2)).split(";"));
                Bundle bundle3 = new Bundle();
                for (String str2 : listAsList) {
                    try {
                        wu0 wu0VarA = ((nh0) tp0Var2.f20456c).a(str2, new JSONObject());
                        wu0VarA.a();
                        boolean z14 = ((yi0) tp0Var2.f20457d).f22262b;
                        Bundle bundle4 = new Bundle();
                        if (!((Boolean) zzba.zzc().a(am.f12289od)).booleanValue() || z14) {
                            try {
                                fv fvVarM = wu0VarA.f21609a.m();
                                if (fvVarM != null) {
                                    try {
                                        bundle4.putString("sdk_version", fvVarM.toString());
                                    } catch (qu0 unused4) {
                                    }
                                }
                            } catch (Throwable th4) {
                                throw new qu0(th4);
                            }
                        }
                        try {
                            fv fvVarZzH = wu0VarA.f21609a.zzH();
                            if (fvVarZzH != null) {
                                try {
                                    bundle4.putString("adapter_version", fvVarZzH.toString());
                                } catch (qu0 unused5) {
                                }
                            }
                            bundle3.putBundle(str2, bundle4);
                        } catch (Throwable th5) {
                            throw new qu0(th5);
                        }
                    } catch (qu0 unused6) {
                    }
                }
                fq0 fq0Var = new fq0(0, bundle3);
                if (((Boolean) zzba.zzc().a(am.f12289od)).booleanValue()) {
                    ((gq0) tp0Var2.f20458e).f14931b = fq0Var;
                }
                return fq0Var;
            case 10:
                ContentResolver contentResolver = (ContentResolver) this.f19950b;
                return new iq0(i13, Settings.Secure.getString(contentResolver, "advertising_id"), Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 0) == 1);
            case 11:
                zp0 zp0Var = (zp0) this.f19950b;
                return new iq0(i12, ((ou0) zp0Var.f22688c).f18370k, ((h00) zp0Var.f22689d).f15018g);
            case 12:
                VersionInfoParcel versionInfoParcel = (VersionInfoParcel) ((jq0) this.f19950b).f16150c;
                if (!((Boolean) zzba.zzc().a(am.Hb)).booleanValue()) {
                    return new qq0(null, 0);
                }
                zzt.zzc();
                try {
                    int i16 = Build.VERSION.SDK_INT;
                    if (SdkExtensions.getExtensionVersion(30) > 3) {
                        extensionVersion = SdkExtensions.getExtensionVersion(1000000);
                    } else if (!((Boolean) zzba.zzc().a(am.Kb)).booleanValue()) {
                        extensionVersion = 0;
                    } else if (versionInfoParcel.clientJarVersion < ((Integer) zzba.zzc().a(am.Jb)).intValue() || i16 < 31 || SdkExtensions.getExtensionVersion(31) < 9) {
                        extensionVersion = 0;
                    } else {
                        extensionVersion = SdkExtensions.getExtensionVersion(31);
                    }
                } catch (Exception e13) {
                    zzt.zzh().d("AdUtil.getAdServicesExtensionVersion", e13);
                }
                return new qq0(Integer.valueOf(extensionVersion), 0);
            case 13:
                AudioManager audioManager = (AudioManager) ((hq0) this.f19950b).f15364c.getSystemService("audio");
                float fZzb = zzt.zzi().zzb();
                boolean zZzd = zzt.zzi().zzd();
                if (audioManager == null) {
                    return new sq0(-1, false, false, -1, -1, -1, -1, -1, fZzb, zZzd, true);
                }
                int mode = audioManager.getMode();
                boolean zIsMusicActive = audioManager.isMusicActive();
                boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
                int streamVolume = audioManager.getStreamVolume(3);
                if (((Boolean) zzba.zzc().a(am.Ec)).booleanValue()) {
                    int iZzi = zzt.zzf().zzi(audioManager);
                    streamMaxVolume = audioManager.getStreamMaxVolume(3);
                    i10 = iZzi;
                } else {
                    i10 = -1;
                    streamMaxVolume = -1;
                }
                return new sq0(mode, zIsMusicActive, zIsSpeakerphoneOn, streamVolume, i10, streamMaxVolume, audioManager.getRingerMode(), audioManager.getStreamVolume(2), fZzb, zZzd, false);
            case 14:
                hq0 hq0Var = (hq0) this.f19950b;
                double intExtra3 = -1.0d;
                if (((Boolean) zzba.zzc().a(am.Id)).booleanValue()) {
                    BatteryManager batteryManager = (BatteryManager) hq0Var.f15364c.getSystemService("batterymanager");
                    intExtra3 = batteryManager != null ? ((double) batteryManager.getIntProperty(4)) / 100.0d : -1.0d;
                    if (batteryManager != null) {
                        zIsCharging = batteryManager.isCharging();
                    } else {
                        Intent intentA = hq0Var.a();
                        if (intentA == null || ((intExtra2 = intentA.getIntExtra("status", -1)) != 2 && intExtra2 != 5)) {
                            z13 = false;
                        }
                    }
                    return new uq0(intExtra3, zIsCharging);
                }
                Intent intentA2 = hq0Var.a();
                if (intentA2 == null || ((intExtra = intentA2.getIntExtra("status", -1)) != 2 && intExtra != 5)) {
                    z13 = false;
                }
                if (intentA2 != null) {
                    intExtra3 = ((double) intentA2.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1)) / ((double) intentA2.getIntExtra("scale", -1));
                }
                zIsCharging = z13;
                return new uq0(intExtra3, zIsCharging);
            case 15:
                tp0 tp0Var3 = (tp0) this.f19950b;
                ou0 ou0Var = (ou0) tp0Var3.f20457d;
                ph0 ph0Var = (ph0) tp0Var3.f20456c;
                String str3 = ou0Var.f18366g;
                String str4 = (String) tp0Var3.f20458e;
                ph0Var.getClass();
                if (!((Boolean) zzba.zzc().a(am.f12114d5)).booleanValue() || str3 == null || str4 == null) {
                    jSONObject = null;
                } else {
                    if (!ph0Var.f18655d) {
                        ph0Var.a();
                        if (((Boolean) zzba.zzc().a(am.f12131e5)).booleanValue() && !ph0Var.f18657f.getAndSet(true)) {
                            zzt.zzh().g().zzk(new oh0(ph0Var, 0));
                        }
                    }
                    Map map3 = (Map) ph0Var.f18652a.get(str4);
                    if (map3 == null) {
                        jSONObject = null;
                    } else {
                        jSONObject = (JSONObject) map3.get(str3);
                        if (jSONObject == null) {
                            String strG = dv.g(ph0Var.f18656e, str3, str4);
                            if (strG != null) {
                                jSONObject = (JSONObject) map3.get(strG);
                            } else {
                                jSONObject = null;
                            }
                        }
                    }
                }
                return new ar0(0, jSONObject, ((Boolean) zzba.zzc().a(am.f12147f5)).booleanValue() ? ph0Var.f18653b : null);
            case 16:
                Context context3 = ((hq0) this.f19950b).f15364c;
                zzt.zzc();
                String string = !((Boolean) zzba.zzc().a(am.f12149f7)).booleanValue() ? "" : context3.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
                String string2 = ((Boolean) zzba.zzc().a(am.h7)).booleanValue() ? context3.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
                zzt.zzc();
                if (((Boolean) zzba.zzc().a(am.f12165g7)).booleanValue()) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context3);
                    Bundle bundle5 = new Bundle();
                    if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                        bundle5.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
                    }
                    String[] strArr2 = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
                    for (int i17 = 0; i17 < 4; i17++) {
                        String str5 = strArr2[i17];
                        if (defaultSharedPreferences.contains(str5)) {
                            bundle5.putString(str5, defaultSharedPreferences.getString(str5, null));
                        }
                    }
                    bundle = bundle5;
                }
                return new fr0(string, string2, bundle);
            case 17:
                hq0 hq0Var2 = (hq0) this.f19950b;
                zzt.zzc();
                return new qq0(zzs.zzu(hq0Var2.f15364c), 1);
            case 18:
                return new rp0("requester_type_2".equals(zzv.zzc(((xp0) this.f19950b).f21956c.f18363d)), 2);
            case 19:
                tp0 tp0Var4 = (tp0) this.f19950b;
                Set set = (Set) tp0Var4.f20457d;
                if (((Boolean) zzba.zzc().a(am.X6)).booleanValue() && (viewGroup = (ViewGroup) tp0Var4.f20458e) != null && set.contains("banner")) {
                    return new hr0(Boolean.valueOf(viewGroup.isHardwareAccelerated()), 0);
                }
                if (((Boolean) zzba.zzc().a(am.Y6)).booleanValue() && set.contains(IronSourceConstants.EVENTS_NATIVE)) {
                    Context context4 = (Context) tp0Var4.f20456c;
                    if (context4 instanceof Activity) {
                        Activity activity = (Activity) context4;
                        Window window = activity.getWindow();
                        if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                            try {
                                if ((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) == 0) {
                                    z12 = false;
                                }
                                boolValueOf = Boolean.valueOf(z12);
                                break;
                            } catch (PackageManager.NameNotFoundException unused7) {
                            }
                        } else {
                            boolValueOf = Boolean.TRUE;
                        }
                        return new hr0(boolValueOf, 0);
                    }
                }
                return new hr0(null, 0);
            case 20:
                lj0 lj0Var = (lj0) ((jq0) this.f19950b).f16150c;
                synchronized (lj0Var) {
                    if (((Boolean) zzba.zzc().a(am.f12393va)).booleanValue() && lj0Var.f()) {
                        long j12 = lj0Var.f17027q;
                        ((p9.b) zzt.zzk()).getClass();
                        if (j12 < System.currentTimeMillis() / 1000) {
                            lj0Var.f17025o = JsonUtils.EMPTY_JSON;
                            lj0Var.f17027q = Long.MAX_VALUE;
                            str = "";
                        } else if (lj0Var.f17025o.equals(JsonUtils.EMPTY_JSON)) {
                            str = "";
                        } else {
                            str = lj0Var.f17025o;
                        }
                    } else {
                        str = "";
                    }
                }
                String str6 = str;
                synchronized (lj0Var) {
                    z10 = lj0Var.f17029s;
                }
                return new jr0(str6, z10, zzt.zzo().zzk(), lj0Var.f17026p != null, lj0Var.f17033w < ((Long) zzba.zzc().a(am.Qa)).longValue());
            case 21:
                tp0 tp0Var5 = (tp0) this.f19950b;
                return new up0((ou0) tp0Var5.f20457d, (PackageInfo) tp0Var5.f20456c, (zzg) tp0Var5.f20458e, z11 ? 1 : 0);
            case 22:
                ji0 ji0Var = (ji0) ((jq0) this.f19950b).f16150c;
                synchronized (ji0Var) {
                    map = new HashMap();
                    if (((Boolean) zzba.zzc().a(am.Q8)).booleanValue()) {
                        ji0Var.b();
                        for (Map.Entry entry : ji0Var.f16103a.entrySet()) {
                            map.put((ii0) entry.getKey(), new ArrayDeque((Collection) entry.getValue()));
                        }
                    }
                }
                return new or0(map, i13);
            case 23:
                return a();
            case 24:
                zp0 zp0Var2 = (zp0) this.f19950b;
                kz kzVar = (kz) zp0Var2.f22687b;
                Context context5 = (Context) zp0Var2.f22689d;
                if (!kzVar.a(context5)) {
                    return new wr0(null, null, null, null, null);
                }
                String strB = kzVar.b(context5);
                String str7 = strB == null ? "" : strB;
                String strC = kzVar.c(context5);
                String str8 = strC == null ? "" : strC;
                String strD = kzVar.d(context5);
                String str9 = strD == null ? "" : strD;
                String str10 = true != kzVar.a(context5) ? null : "fa";
                return new wr0(str7, str8, str9, str10 == null ? "" : str10, "TIME_OUT".equals(str8) ? (Long) zzba.zzc().a(am.f12060a1) : null);
            case 25:
                tp0 tp0Var6 = (tp0) this.f19950b;
                Context context6 = (Context) tp0Var6.f20456c;
                boolean zG = r9.c.a(context6).g();
                zzt.zzc();
                boolean zZzH = zzs.zzH(context6);
                String str11 = ((VersionInfoParcel) tp0Var6.f20457d).afmaVersion;
                zzt.zzc();
                boolean zZzI = zzs.zzI();
                zzt.zzc();
                ApplicationInfo applicationInfo = context6.getApplicationInfo();
                return new xr0(zG, zZzH, str11, zZzI, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, t9.d.d(context6, ModuleDescriptor.MODULE_ID, false), t9.d.a(context6, ModuleDescriptor.MODULE_ID), (String) tp0Var6.f20458e);
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                return new fq0(3, zzac.zzb(((hq0) this.f19950b).f15364c, (String) zzba.zzc().a(am.f12195i7)));
            case 27:
                Context context7 = ((hq0) this.f19950b).f15364c;
                return new cs0(x10.B(context7, "init_without_write"), x10.B(context7, "crash_without_write"));
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                return b();
            default:
                Context context8 = ((hq0) this.f19950b).f15364c;
                TelephonyManager telephonyManager = (TelephonyManager) context8.getSystemService("phone");
                String networkOperator = telephonyManager.getNetworkOperator();
                int phoneType = telephonyManager.getPhoneType();
                zzt.zzc();
                if (zzs.zzD(context8, "android.permission.ACCESS_NETWORK_STATE")) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context8.getSystemService("connectivity");
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        int type = activeNetworkInfo.getType();
                        iOrdinal = activeNetworkInfo.getDetailedState().ordinal();
                        i11 = type;
                    } else {
                        i11 = -1;
                    }
                    zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                } else {
                    i11 = -2;
                }
                return new es0(networkOperator, i11, zzt.zzf().zzk(context8), phoneType, zIsActiveNetworkMetered, iOrdinal);
        }
    }
}
