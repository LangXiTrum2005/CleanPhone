package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.X3;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hq implements oq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f15360a = Pattern.compile("^[a-zA-Z]([a-zA-Z0-9]|:|-|_)*$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f15361b = Pattern.compile("^[0-9]*(,[0-9]*)*$");

    @Override // com.google.android.gms.internal.ads.oq
    public final void b(Object obj, Map map) {
        b30 b30Var = (b30) obj;
        String str = (String) map.get("action");
        boolean zEquals = "tick".equals(str);
        Pattern pattern = f15360a;
        if (!zEquals) {
            if ("experiment".equals(str)) {
                String str2 = (String) map.get(X3.i.X);
                if (TextUtils.isEmpty(str2)) {
                    int i10 = zze.zza;
                    zzo.zzi("No value given for CSI experiment.");
                    return;
                }
                if (!((Boolean) zzba.zzc().a(am.Q2)).booleanValue() || f15361b.matcher(str2).matches()) {
                    ((gm) b30Var.zzq().f17037c).c("e", str2);
                    return;
                } else {
                    int i11 = zze.zza;
                    zzo.zzd("Invalid value given for CSI experiment. Should be a comma separated list of numbers.");
                    return;
                }
            }
            if ("extra".equals(str)) {
                String str3 = (String) map.get("name");
                String str4 = (String) map.get(X3.i.X);
                if (TextUtils.isEmpty(str4)) {
                    int i12 = zze.zza;
                    zzo.zzi("No value given for CSI extra.");
                    return;
                }
                if (TextUtils.isEmpty(str3)) {
                    int i13 = zze.zza;
                    zzo.zzi("No name given for CSI extra.");
                    return;
                }
                if (!((Boolean) zzba.zzc().a(am.Q2)).booleanValue() || pattern.matcher(str3).matches()) {
                    ((gm) b30Var.zzq().f17037c).c(str3, str4);
                    return;
                } else {
                    int i14 = zze.zza;
                    zzo.zzd("Invalid name given for CSI extra. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                    return;
                }
            }
            return;
        }
        String str5 = (String) map.get("label");
        String str6 = (String) map.get("start_label");
        String str7 = (String) map.get("timestamp");
        if (TextUtils.isEmpty(str5)) {
            int i15 = zze.zza;
            zzo.zzi("No label given for CSI tick.");
            return;
        }
        ul ulVar = am.Q2;
        if (((Boolean) zzba.zzc().a(ulVar)).booleanValue() && !pattern.matcher(str5).matches()) {
            int i16 = zze.zza;
            zzo.zzd("Invalid label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
            return;
        }
        if (TextUtils.isEmpty(str7)) {
            int i17 = zze.zza;
            zzo.zzi("No timestamp given for CSI tick.");
            return;
        }
        try {
            long j10 = Long.parseLong(str7);
            ((p9.b) zzt.zzk()).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            ((p9.b) zzt.zzk()).getClass();
            long jElapsedRealtime = (j10 - jCurrentTimeMillis) + SystemClock.elapsedRealtime();
            if (true == TextUtils.isEmpty(str6)) {
                str6 = "native:view_load";
            }
            if (((Boolean) zzba.zzc().a(ulVar)).booleanValue() && !pattern.matcher(str6).matches()) {
                int i18 = zze.zza;
                zzo.zzd("Invalid start label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                return;
            }
            lj1 lj1VarZzq = b30Var.zzq();
            HashMap map2 = (HashMap) lj1VarZzq.f17036b;
            em emVar = (em) map2.get(str6);
            String[] strArr = {str5};
            if (emVar != null) {
                ((gm) lj1VarZzq.f17037c).a(emVar, jElapsedRealtime, strArr);
            }
            map2.put(str5, new em(jElapsedRealtime, null, null));
        } catch (NumberFormatException e10) {
            int i19 = zze.zza;
            zzo.zzj("Malformed timestamp for CSI tick.", e10);
        }
    }
}
