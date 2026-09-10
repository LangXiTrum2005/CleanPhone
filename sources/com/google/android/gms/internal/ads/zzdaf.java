package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdaf {
    public static final zzcbk zza(Context context, VersionInfoParcel versionInfoParcel, zzfhr zzfhrVar, zzcbg zzcbgVar) {
        zzcbh zzcbhVar = zzfhrVar.zzA;
        if (zzcbhVar == null) {
            return null;
        }
        zzfhw zzfhwVar = zzfhrVar.zzs;
        return new zzcbf(context, versionInfoParcel, zzcbhVar, zzfhwVar != null ? zzfhwVar.zzb : null, zzcbgVar);
    }
}
