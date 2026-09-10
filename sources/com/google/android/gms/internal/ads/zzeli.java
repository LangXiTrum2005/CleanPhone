package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzeli extends zzbuo {
    private final zzejj zza;

    public /* synthetic */ zzeli(zzelj zzeljVar, zzejj zzejjVar, byte[] bArr) {
        Objects.requireNonNull(zzeljVar);
        this.zza = zzejjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbup
    public final void zze() throws RemoteException {
        ((zzekv) this.zza.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbup
    public final void zzf(String str) throws RemoteException {
        ((zzekv) this.zza.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbup
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzekv) this.zza.zzc).zzx(zzeVar);
    }
}
