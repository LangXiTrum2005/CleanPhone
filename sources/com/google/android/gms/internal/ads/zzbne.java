package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzbne implements zzgpr {
    static final /* synthetic */ zzbne zza = new zzbne();

    private /* synthetic */ zzbne() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpr
    public final /* synthetic */ Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        zzbnn zzbnnVar = zzbnm.zza;
        if (!((Boolean) zzbij.zzi.zze()).booleanValue()) {
            return "failure_click_attok";
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "prepareClickUrl.attestation1");
        return "failure_click_attok";
    }
}
