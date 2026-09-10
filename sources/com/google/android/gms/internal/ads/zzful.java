package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class zzful implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzfvh zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;

    public zzful(Context context, String str, String str2) {
        this.zzb = str;
        this.zzc = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.zze = handlerThread;
        handlerThread.start();
        zzfvh zzfvhVar = new zzfvh(context, handlerThread.getLooper(), this, this, 9200000);
        this.zza = zzfvhVar;
        this.zzd = new LinkedBlockingQueue();
        zzfvhVar.checkAvailabilityAndConnect();
    }

    public static zzawp zzc() {
        zzavs zzavsVarZzj = zzawp.zzj();
        zzavsVarZzj.zzl(PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID);
        return (zzawp) zzavsVarZzj.zzbu();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfvm zzfvmVarZzd = zzd();
        if (zzfvmVarZzd != null) {
            try {
                try {
                    this.zzd.put(zzfvmVarZzd.zze(new zzfvi(this.zzb, this.zzc)).zza());
                } catch (InterruptedException unused) {
                } finally {
                    zzb();
                    this.zze.quit();
                }
            } catch (Throwable unused2) {
                this.zzd.put(zzc());
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            this.zzd.put(zzc());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i2) {
        try {
            this.zzd.put(zzc());
        } catch (InterruptedException unused) {
        }
    }

    public final zzawp zza(int i2) {
        zzawp zzawpVar;
        try {
            zzawpVar = (zzawp) this.zzd.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzawpVar = null;
        }
        return zzawpVar == null ? zzc() : zzawpVar;
    }

    public final void zzb() {
        zzfvh zzfvhVar = this.zza;
        if (zzfvhVar != null) {
            if (zzfvhVar.isConnected() || zzfvhVar.isConnecting()) {
                zzfvhVar.disconnect();
            }
        }
    }

    public final zzfvm zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
