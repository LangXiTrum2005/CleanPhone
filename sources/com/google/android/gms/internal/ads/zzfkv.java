package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfkv {
    private final zzfjz zza;
    private final zzfks zzb;
    private final zzfjv zzc;
    private zzflb zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzfkv(zzfjz zzfjzVar, zzfjv zzfjvVar, zzfks zzfksVar) {
        this.zza = zzfjzVar;
        this.zzc = zzfjvVar;
        this.zzb = zzfksVar;
        zzfjvVar.zza(new zzfju() { // from class: com.google.android.gms.internal.ads.zzfku
            @Override // com.google.android.gms.internal.ads.zzfju
            public final /* synthetic */ void zza() {
                this.zza.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzd() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhd)).booleanValue() && !com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzi()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (true) {
                ArrayDeque arrayDeque = this.zzd;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                zzfkt zzfktVar = (zzfkt) arrayDeque.pollFirst();
                if (zzfktVar == null || (zzfktVar.zzb() != null && this.zza.zzc(zzfktVar.zzb()))) {
                    zzflb zzflbVar = new zzflb(this.zza, this.zzb, zzfktVar);
                    this.zze = zzflbVar;
                    zzflbVar.zza(new zzfkq(this, zzfktVar));
                    return;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized void zza(zzfkt zzfktVar) {
        this.zzd.add(zzfktVar);
    }

    public final synchronized ListenableFuture zzb(zzfkt zzfktVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zzb(zzfktVar);
    }

    public final /* synthetic */ void zzc() {
        synchronized (this) {
            this.zzf = 1;
            zzd();
        }
    }

    public final /* synthetic */ ArrayDeque zze() {
        return this.zzd;
    }

    public final /* synthetic */ void zzf(zzflb zzflbVar) {
        this.zze = null;
    }

    public final /* synthetic */ int zzg() {
        return this.zzf;
    }
}
