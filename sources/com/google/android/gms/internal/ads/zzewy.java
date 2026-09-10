package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzewy implements zzezv {
    private final Integer zza;

    public zzewy(Integer num) {
        this.zza = num;
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Integer num = this.zza;
        zzczm zzczmVar = (zzczm) obj;
        if (num != null) {
            zzczmVar.zza.putInt("dspct", Math.min(num.intValue(), 20));
        }
    }
}
