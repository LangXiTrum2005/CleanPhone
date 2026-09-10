package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class zzfun implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzfvh zza;
    private final String zzb;
    private final String zzc;
    private final zzbbq zzd;
    private final LinkedBlockingQueue zze;
    private final HandlerThread zzf;
    private final zzfuf zzg;
    private final long zzh;

    public zzfun(Context context, int i2, zzbbq zzbbqVar, String str, String str2, String str3, zzfuf zzfufVar) {
        this.zzb = str;
        this.zzd = zzbbqVar;
        this.zzc = str2;
        this.zzg = zzfufVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zzf = handlerThread;
        handlerThread.start();
        this.zzh = System.currentTimeMillis();
        zzfvh zzfvhVar = new zzfvh(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfvhVar;
        this.zze = new LinkedBlockingQueue();
        zzfvhVar.checkAvailabilityAndConnect();
    }

    private final void zzd(int i2, long j, Exception exc) {
        zzfuf zzfufVar = this.zzg;
        if (zzfufVar != null) {
            zzfufVar.zzc(i2, System.currentTimeMillis() - j, exc);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfvm zzfvmVarZzc = zzc();
        if (zzfvmVarZzc != null) {
            try {
                zzfvt zzfvtVarZzg = zzfvmVarZzc.zzg(new zzfvr(1, this.zzd, this.zzb, this.zzc));
                zzd(IronSourceConstants.errorCode_internal, this.zzh, null);
                this.zze.put(zzfvtVarZzg);
            } catch (Throwable th) {
                try {
                    zzd(2010, this.zzh, new Exception(th));
                } finally {
                    zzb();
                    this.zzf.quit();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            zzd(4012, this.zzh, null);
            this.zze.put(new zzfvt(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i2) {
        try {
            zzd(4011, this.zzh, null);
            this.zze.put(new zzfvt(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    public final zzfvt zza(int i2) {
        zzfvt zzfvtVar;
        try {
            zzfvtVar = (zzfvt) this.zze.poll(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            zzd(2009, this.zzh, e2);
            zzfvtVar = null;
        }
        zzd(3004, this.zzh, null);
        if (zzfvtVar != null) {
            if (zzfvtVar.zzc == 7) {
                zzfuf.zzg(3);
            } else {
                zzfuf.zzg(2);
            }
        }
        return zzfvtVar == null ? new zzfvt(null, 1) : zzfvtVar;
    }

    public final void zzb() {
        zzfvh zzfvhVar = this.zza;
        if (zzfvhVar != null) {
            if (zzfvhVar.isConnected() || zzfvhVar.isConnecting()) {
                zzfvhVar.disconnect();
            }
        }
    }

    public final zzfvm zzc() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
