package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzu implements zzgpr {
    static final /* synthetic */ zzu zza = new zzu();

    private /* synthetic */ zzu() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpr
    public final /* synthetic */ Object apply(Object obj) {
        zzx zzxVar = (zzx) obj;
        int i2 = zzv.zzO;
        String str = zzxVar.zza;
        String str2 = zzxVar.zzb;
        return android.support.v4.media.a.s(new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length()), str, ": ", str2);
    }
}
