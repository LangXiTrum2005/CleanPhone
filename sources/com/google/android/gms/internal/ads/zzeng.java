package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzeng extends zzbuu {
    private final zzejj zza;

    public /* synthetic */ zzeng(zzenh zzenhVar, zzejj zzejjVar, byte[] bArr) {
        Objects.requireNonNull(zzenhVar);
        this.zza = zzejjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbuv
    public final void zze() throws RemoteException {
        ((zzekv) this.zza.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbuv
    public final void zzf(String str) throws RemoteException {
        ((zzekv) this.zza.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbuv
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzekv) this.zza.zzc).zzx(zzeVar);
    }
}
