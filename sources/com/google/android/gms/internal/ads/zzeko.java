package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzeko extends zzbul {
    final /* synthetic */ zzekp zza;
    private final zzejj zzb;

    public /* synthetic */ zzeko(zzekp zzekpVar, zzejj zzejjVar, byte[] bArr) {
        Objects.requireNonNull(zzekpVar);
        this.zza = zzekpVar;
        this.zzb = zzejjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbum
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zza.zzd((View) ObjectWrapper.unwrap(iObjectWrapper));
        ((zzekv) this.zzb.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbum
    public final void zzf(String str) throws RemoteException {
        ((zzekv) this.zzb.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbum
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzekv) this.zzb.zzc).zzx(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbum
    public final void zzh(zzbti zzbtiVar) throws RemoteException {
        this.zza.zze(zzbtiVar);
        ((zzekv) this.zzb.zzc).zzj();
    }
}
