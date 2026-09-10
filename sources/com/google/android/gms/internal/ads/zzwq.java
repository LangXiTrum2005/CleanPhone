package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zzwq {
    public final int zza;
    public final zzwg zzb;
    private final CopyOnWriteArrayList zzc;

    private zzwq(CopyOnWriteArrayList copyOnWriteArrayList, int i2, zzwg zzwgVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzwgVar;
    }

    public final zzwq zza(int i2, zzwg zzwgVar) {
        return new zzwq(this.zzc, 0, zzwgVar);
    }

    public final void zzb(Handler handler, zzwr zzwrVar) {
        this.zzc.add(new zzwj(handler, zzwrVar));
    }

    public final void zzc(zzwr zzwrVar) {
        CopyOnWriteArrayList<zzwj> copyOnWriteArrayList = this.zzc;
        for (zzwj zzwjVar : copyOnWriteArrayList) {
            if (zzwjVar.zzb == zzwrVar) {
                copyOnWriteArrayList.remove(zzwjVar);
            }
        }
    }

    public final void zzd(final zzvx zzvxVar, final zzwc zzwcVar, final int i2) {
        zzi(new zzdr() { // from class: com.google.android.gms.internal.ads.zzwp
            @Override // com.google.android.gms.internal.ads.zzdr
            public final /* synthetic */ void zza(Object obj) {
                ((zzwr) obj).zzai(0, this.zza.zzb, zzvxVar, zzwcVar, i2);
            }
        });
    }

    public final void zze(final zzvx zzvxVar, final zzwc zzwcVar) {
        zzi(new zzdr() { // from class: com.google.android.gms.internal.ads.zzwk
            @Override // com.google.android.gms.internal.ads.zzdr
            public final /* synthetic */ void zza(Object obj) {
                ((zzwr) obj).zzaj(0, this.zza.zzb, zzvxVar, zzwcVar);
            }
        });
    }

    public final void zzf(final zzvx zzvxVar, final zzwc zzwcVar) {
        zzi(new zzdr() { // from class: com.google.android.gms.internal.ads.zzwl
            @Override // com.google.android.gms.internal.ads.zzdr
            public final /* synthetic */ void zza(Object obj) {
                ((zzwr) obj).zzak(0, this.zza.zzb, zzvxVar, zzwcVar);
            }
        });
    }

    public final void zzg(final zzvx zzvxVar, final zzwc zzwcVar, final IOException iOException, final boolean z2) {
        zzi(new zzdr() { // from class: com.google.android.gms.internal.ads.zzwm
            @Override // com.google.android.gms.internal.ads.zzdr
            public final /* synthetic */ void zza(Object obj) {
                ((zzwr) obj).zzal(0, this.zza.zzb, zzvxVar, zzwcVar, iOException, z2);
            }
        });
    }

    public final void zzh(final zzwc zzwcVar) {
        zzi(new zzdr() { // from class: com.google.android.gms.internal.ads.zzwn
            @Override // com.google.android.gms.internal.ads.zzdr
            public final /* synthetic */ void zza(Object obj) {
                ((zzwr) obj).zzam(0, this.zza.zzb, zzwcVar);
            }
        });
    }

    public final void zzi(final zzdr zzdrVar) {
        for (zzwj zzwjVar : this.zzc) {
            final zzwr zzwrVar = zzwjVar.zzb;
            zzfj.zzd(zzwjVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzwo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzdrVar.zza(zzwrVar);
                }
            });
        }
    }

    public zzwq() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
