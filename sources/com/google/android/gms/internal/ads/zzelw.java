package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzelw extends zzbur {
    final /* synthetic */ zzelx zza;
    private final zzejj zzb;

    public /* synthetic */ zzelw(zzelx zzelxVar, zzejj zzejjVar, byte[] bArr) {
        Objects.requireNonNull(zzelxVar);
        this.zza = zzelxVar;
        this.zzb = zzejjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zze(zzbto zzbtoVar) throws RemoteException {
        this.zza.zzc(zzbtoVar);
        ((zzekv) this.zzb.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zzf(String str) throws RemoteException {
        ((zzekv) this.zzb.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbus
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzekv) this.zzb.zzc).zzx(zzeVar);
    }
}
