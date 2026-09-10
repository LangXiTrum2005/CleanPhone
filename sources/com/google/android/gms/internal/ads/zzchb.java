package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzchb extends zzcgx {
    public zzchb(zzcfk zzcfkVar) {
        super(zzcfkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final boolean zze(String str) {
        String strZzf = com.google.android.gms.ads.internal.util.client.zzf.zzf(str);
        zzcfk zzcfkVar = (zzcfk) this.zzc.get();
        if (zzcfkVar != null && strZzf != null) {
            zzcfkVar.zzt(strZzf, this);
        }
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("VideoStreamNoopCache is doing nothing.");
        zzq(str, strZzf, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void zzl() {
    }
}
