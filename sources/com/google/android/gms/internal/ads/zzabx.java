package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
final class zzabx extends HandlerThread implements Handler.Callback {
    private zzdt zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzaby zze;

    public zzabx() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        try {
            if (i2 == 1) {
                try {
                    int i3 = message.arg1;
                    zzdt zzdtVar = this.zza;
                    if (zzdtVar == null) {
                        throw null;
                    }
                    zzdtVar.zza(i3);
                    this.zze = new zzaby(this, this.zza.zzc(), i3 != 0, null);
                    synchronized (this) {
                        notify();
                    }
                } catch (zzdu e2) {
                    zzee.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.zzd = new IllegalStateException(e2);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e3) {
                    zzee.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.zzc = e3;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e4) {
                    zzee.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e4);
                    this.zzd = e4;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i2 == 2) {
                try {
                    zzdt zzdtVar2 = this.zza;
                    if (zzdtVar2 == null) {
                        throw null;
                    }
                    zzdtVar2.zzb();
                    return true;
                } catch (Throwable th) {
                    try {
                        zzee.zzf("PlaceholderSurface", "Failed to release placeholder surface", th);
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }

    public final zzaby zza(int i2) {
        boolean z2;
        start();
        Handler handler = new Handler(getLooper(), this);
        this.zzb = handler;
        this.zza = new zzdt(handler, null);
        synchronized (this) {
            z2 = false;
            this.zzb.obtainMessage(1, i2, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.zzc;
        if (error != null) {
            throw error;
        }
        zzaby zzabyVar = this.zze;
        zzabyVar.getClass();
        return zzabyVar;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }
}
