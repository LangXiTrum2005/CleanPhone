package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class sg0 extends VideoController.VideoLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je0 f19969a;

    public sg0(je0 je0Var) {
        this.f19969a = je0Var;
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        zzea zzeaVarR = this.f19969a.r();
        zzed zzedVarZzo = null;
        if (zzeaVarR != null) {
            try {
                zzedVarZzo = zzeaVarR.zzo();
            } catch (RemoteException unused) {
            }
        }
        if (zzedVarZzo == null) {
            return;
        }
        try {
            zzedVarZzo.zzh();
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zzj("Unable to call onVideoEnd()", e10);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        zzea zzeaVarR = this.f19969a.r();
        zzed zzedVarZzo = null;
        if (zzeaVarR != null) {
            try {
                zzedVarZzo = zzeaVarR.zzo();
            } catch (RemoteException unused) {
            }
        }
        if (zzedVarZzo == null) {
            return;
        }
        try {
            zzedVarZzo.zzg();
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zzj("Unable to call onVideoEnd()", e10);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        zzea zzeaVarR = this.f19969a.r();
        zzed zzedVarZzo = null;
        if (zzeaVarR != null) {
            try {
                zzedVarZzo = zzeaVarR.zzo();
            } catch (RemoteException unused) {
            }
        }
        if (zzedVarZzo == null) {
            return;
        }
        try {
            zzedVarZzo.zze();
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zzj("Unable to call onVideoEnd()", e10);
        }
    }
}
