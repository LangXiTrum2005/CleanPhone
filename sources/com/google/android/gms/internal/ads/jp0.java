package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class jp0 implements zza, qc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zzbe f16125a;

    @Override // com.google.android.gms.internal.ads.qc0
    public final synchronized void C() {
        zzbe zzbeVar = this.f16125a;
        if (zzbeVar != null) {
            try {
                zzbeVar.zzb();
            } catch (RemoteException e10) {
                int i10 = zze.zza;
                zzo.zzj("Remote Exception at onPhysicalClick.", e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qc0
    public final synchronized void O() {
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        zzbe zzbeVar = this.f16125a;
        if (zzbeVar != null) {
            try {
                zzbeVar.zzb();
            } catch (RemoteException e10) {
                int i10 = zze.zza;
                zzo.zzj("Remote Exception at onAdClicked.", e10);
            }
        }
    }
}
