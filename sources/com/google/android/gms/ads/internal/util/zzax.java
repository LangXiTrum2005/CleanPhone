package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.kj0;
import com.google.android.gms.internal.ads.lj0;
import com.google.common.util.concurrent.ListenableFuture;
import com.mbridge.msdk.foundation.download.Command;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import p9.c;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11058a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11059b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11060c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11061d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11062e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f11063f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public lj0 f11064g;

    public static final String b(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put(Command.HTTP_HEADER_USER_AGENT, com.google.android.gms.ads.internal.zzt.zzc().zze(context, str2));
        ListenableFuture listenableFutureZzb = new zzbl(context).zzb(0, str, map, null);
        try {
            return (String) listenableFutureZzb.get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12148f6)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            String strValueOf = String.valueOf(str);
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Interrupted while retrieving a response from: ".concat(strValueOf), e10);
            listenableFutureZzb.cancel(true);
            return null;
        } catch (TimeoutException e11) {
            String strValueOf2 = String.valueOf(str);
            int i11 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Timeout while retrieving a response from: ".concat(strValueOf2), e11);
            listenableFutureZzb.cancel(true);
            return null;
        } catch (Exception e12) {
            String strValueOf3 = String.valueOf(str);
            int i12 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error retrieving a response from: ".concat(strValueOf3), e12);
            return null;
        }
    }

    public final void a(Context context, String str, boolean z10, boolean z11) {
        if (context instanceof Activity) {
            zzs.zza.post(new zzaw(this, context, str, z10, z11));
        } else {
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Can not create dialog without Activity Context");
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0072 A[Catch: all -> 0x0031, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0013, B:7:0x0018, B:12:0x003c, B:14:0x0044, B:16:0x0059, B:19:0x006b, B:11:0x0033, B:20:0x0072, B:21:0x0074), top: B:26:0x000b, inners: #1, #2 }] */
    public final Uri c(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        synchronized (this.f11058a) {
            if (TextUtils.isEmpty(this.f11059b)) {
                com.google.android.gms.ads.internal.zzt.zzc();
                try {
                    FileInputStream fileInputStreamOpenFileInput = context.openFileInput("debug_signals_id.txt");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    c.e(fileInputStreamOpenFileInput, byteArrayOutputStream, true);
                    str5 = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
                } catch (IOException unused) {
                    int i10 = zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Error reading from internal storage.");
                    str5 = "";
                }
                this.f11059b = str5;
                if (TextUtils.isEmpty(str5)) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    this.f11059b = UUID.randomUUID().toString();
                    com.google.android.gms.ads.internal.zzt.zzc();
                    String str6 = this.f11059b;
                    try {
                        FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        fileOutputStreamOpenFileOutput.write(str6.getBytes(StandardCharsets.UTF_8));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Exception e10) {
                        int i11 = zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error writing to file in internal storage.", e10);
                    }
                    str4 = this.f11059b;
                } else {
                    str4 = this.f11059b;
                }
            } else {
                str4 = this.f11059b;
            }
            throw th;
        }
        builderBuildUpon.appendQueryParameter("linkedDeviceId", str4);
        builderBuildUpon.appendQueryParameter("adSlotPath", str2);
        builderBuildUpon.appendQueryParameter("afmaVersion", str3);
        return builderBuildUpon.build();
    }

    public final void zza(lj0 lj0Var) {
        this.f11064g = lj0Var;
    }

    public final lj0 zzb() {
        return this.f11064g;
    }

    public final void zzc(Context context) {
        lj0 lj0Var;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.Ka)).booleanValue() || (lj0Var = this.f11064g) == null) {
            return;
        }
        lj0Var.e(new zzau(this, context), kj0.f16460d);
    }

    public final boolean zze(Context context, String str, String str2) {
        String strB = b(context, c(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12115d6), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strB)) {
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new JSONObject(strB.trim()).optString("debug_mode"));
            zzj(zEquals);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.Ka)).booleanValue()) {
                zzj zzjVarG = com.google.android.gms.ads.internal.zzt.zzh().g();
                if (true != zEquals) {
                    str = "";
                }
                zzjVarG.zzM(str);
            }
            return zEquals;
        } catch (JSONException e10) {
            int i11 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to get debug mode response json.", e10);
            return false;
        }
    }

    public final void zzf(Context context, String str, String str2) {
        com.google.android.gms.ads.internal.zzt.zzc();
        zzs.zzZ(context, c(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12082b6), str, str2));
    }

    public final boolean zzg(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !zzm()) {
            return false;
        }
        int i10 = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Sending troubleshooting signals to the server.");
        zzh(context, str, str2, str3);
        return true;
    }

    public final void zzh(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = c(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12132e6), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        com.google.android.gms.ads.internal.zzt.zzc();
        zzs.zzO(context, str, builderBuildUpon.build().toString());
    }

    public final String zzi() {
        String str;
        synchronized (this.f11058a) {
            str = this.f11060c;
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0036 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:4:0x0003, B:6:0x0017, B:8:0x0026, B:11:0x002c, B:13:0x0032, B:15:0x0036, B:16:0x003a, B:18:0x0040, B:21:0x0046), top: B:25:0x0003 }] */
    public final void zzj(boolean z10) {
        synchronized (this.f11058a) {
            try {
                this.f11062e = z10;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.Ka)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().g().zzK(z10);
                    lj0 lj0Var = this.f11064g;
                    if (lj0Var != null) {
                        if (lj0Var.f17031u) {
                            if (z10) {
                                if (!lj0Var.f17029s) {
                                    lj0Var.k();
                                }
                            }
                        } else if (z10) {
                            lj0Var.j();
                            if (!lj0Var.f17029s) {
                                lj0Var.k();
                            }
                        }
                        if (!lj0Var.f()) {
                            lj0Var.l();
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zzk() {
        boolean z10;
        synchronized (this.f11058a) {
            z10 = this.f11062e;
        }
        return z10;
    }

    public final void zzl(boolean z10) {
        synchronized (this.f11058a) {
            this.f11061d = z10;
        }
    }

    public final boolean zzm() {
        boolean z10;
        synchronized (this.f11058a) {
            z10 = this.f11061d;
        }
        return z10;
    }
}
