package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzexg implements zzezv {
    private final Boolean zza;

    public zzexg(Boolean bool) {
        this.zza = bool;
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Boolean bool = this.zza;
        zzczm zzczmVar = (zzczm) obj;
        if (bool != null) {
            zzczmVar.zza.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
