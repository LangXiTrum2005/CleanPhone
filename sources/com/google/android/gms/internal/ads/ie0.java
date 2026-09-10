package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdz;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzed;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ie0 extends zzdz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15720a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzea f15721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eu f15722c;

    public ie0(zzea zzeaVar, eu euVar) {
        this.f15721b = zzeaVar;
        this.f15722c = euVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzf() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzg(boolean z10) throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final int zzi() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzj() {
        eu euVar = this.f15722c;
        return euVar != null ? euVar.zzA() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzk() {
        eu euVar = this.f15722c;
        return euVar != null ? euVar.zzB() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzl(zzed zzedVar) {
        synchronized (this.f15720a) {
            try {
                zzea zzeaVar = this.f15721b;
                if (zzeaVar != null) {
                    zzeaVar.zzl(zzedVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzm() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final zzed zzo() {
        synchronized (this.f15720a) {
            try {
                zzea zzeaVar = this.f15721b;
                if (zzeaVar == null) {
                    return null;
                }
                return zzeaVar.zzo();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzq() throws RemoteException {
        throw new RemoteException();
    }
}
