package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdnl extends com.google.android.gms.ads.internal.client.zzec {
    private final Object zza = new Object();

    @Nullable
    private final com.google.android.gms.ads.internal.client.zzed zzb;

    @Nullable
    private final zzbto zzc;

    public zzdnl(@Nullable com.google.android.gms.ads.internal.client.zzed zzedVar, @Nullable zzbto zzbtoVar) {
        this.zzb = zzedVar;
        this.zzc = zzbtoVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzf() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzg(boolean z2) throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final boolean zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final int zzi() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final float zzj() throws RemoteException {
        zzbto zzbtoVar = this.zzc;
        if (zzbtoVar != null) {
            return zzbtoVar.zzA();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final float zzk() throws RemoteException {
        zzbto zzbtoVar = this.zzc;
        if (zzbtoVar != null) {
            return zzbtoVar.zzB();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzl(@Nullable com.google.android.gms.ads.internal.client.zzeg zzegVar) throws RemoteException {
        synchronized (this.zza) {
            try {
                com.google.android.gms.ads.internal.client.zzed zzedVar = this.zzb;
                if (zzedVar != null) {
                    zzedVar.zzl(zzegVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final float zzm() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final boolean zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzeg zzo() throws RemoteException {
        synchronized (this.zza) {
            try {
                com.google.android.gms.ads.internal.client.zzed zzedVar = this.zzb;
                if (zzedVar == null) {
                    return null;
                }
                return zzedVar.zzo();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzq() throws RemoteException {
        throw new RemoteException();
    }
}
