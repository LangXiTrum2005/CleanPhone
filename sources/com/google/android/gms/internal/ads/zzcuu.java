package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcuu implements zzbck {
    private final zzcir zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();

    public zzcuu(zzcir zzcirVar, Executor executor) {
        this.zza = zzcirVar;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzbck
    public final synchronized void zzdj(zzbcj zzbcjVar) {
        final zzcir zzcirVar = this.zza;
        if (zzcirVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zznW)).booleanValue()) {
                if (zzbcjVar.zzj) {
                    AtomicReference atomicReference = this.zzc;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcut
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzcirVar.onResume();
                            }
                        });
                    }
                } else {
                    AtomicReference atomicReference2 = this.zzc;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcus
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzcirVar.onPause();
                            }
                        });
                    }
                }
            }
        }
    }
}
