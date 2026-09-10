package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfjh {
    public static void zza(int i2, Throwable th, String str) {
        String strG = androidx.datastore.preferences.protobuf.a.g(i2, "Ad failed to load : ", new StringBuilder(String.valueOf(i2).length() + 20));
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(strG);
        com.google.android.gms.ads.internal.util.zze.zzb(str, th);
        if (i2 == 3) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzh(th, str);
    }

    public static void zzb(Context context, boolean z2) {
        if (z2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("This request is sent from a test device.");
            return;
        }
        com.google.android.gms.ads.internal.client.zzbb.zza();
        String strZzD = com.google.android.gms.ads.internal.util.client.zzf.zzD(context);
        String strS = android.support.v4.media.a.s(new StringBuilder(String.valueOf(strZzD).length() + 102), "Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"", strZzD, "\")) to get test ads on this device.");
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(strS);
    }
}
