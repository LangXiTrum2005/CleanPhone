package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzevc implements zzijg {
    public static zzevc zza() {
        return zzevb.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        List arrayList = new ArrayList();
        zzbgb zzbgbVar = zzbgk.zznd;
        if (!((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).isEmpty()) {
            arrayList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).split(","));
        }
        zzijo.zzb(arrayList);
        return arrayList;
    }
}
