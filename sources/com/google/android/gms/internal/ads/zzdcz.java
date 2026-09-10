package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdcz extends zzdgi implements zzdbe, zzdcj {
    private final zzfhr zzb;
    private final AtomicBoolean zzc;
    private final zzfic zzd;

    public zzdcz(Set set, zzfhr zzfhrVar, zzfic zzficVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzfhrVar;
        this.zzd = zzficVar;
    }

    private final void zzb() {
        final com.google.android.gms.ads.internal.client.zzt zztVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziW)).booleanValue() && this.zzc.compareAndSet(false, true) && (zztVar = this.zzb.zzae) != null && zztVar.zza == 3) {
            zzs(new zzdgh() { // from class: com.google.android.gms.internal.ads.zzdcy
                @Override // com.google.android.gms.internal.ads.zzdgh
                public final /* synthetic */ void zza(Object obj) {
                    ((zzddb) obj).zzm(zztVar);
                }
            });
        }
    }

    public final void zza(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        if (com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zza(this.zzd) && this.zzb.zzaB) {
            zzs(new zzdgh() { // from class: com.google.android.gms.internal.ads.zzdcx
                @Override // com.google.android.gms.internal.ads.zzdgh
                public final /* synthetic */ void zza(Object obj) {
                    ((zzddb) obj).zzm(zztVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbe
    public final void zzdr() {
        int i2 = this.zzb.zzb;
        if (i2 == 2 || i2 == 5 || i2 == 4 || i2 == 6 || i2 == 7) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcj
    public final void zzl() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }
}
