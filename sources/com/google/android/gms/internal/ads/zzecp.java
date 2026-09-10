package com.google.android.gms.internal.ads;

import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class zzecp implements zzijg {
    public static zzecp zza() {
        return zzeco.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        com.google.android.gms.ads.internal.zzt.zzc();
        String string = UUID.randomUUID().toString();
        zzijo.zzb(string);
        return string;
    }
}
