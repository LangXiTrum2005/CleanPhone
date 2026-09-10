package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcvs implements zzems {
    public final List zza;

    public zzcvs(List list) {
        this.zza = list;
    }

    public static zzejg zza(zzelm zzelmVar) {
        return new zzejh(zzelmVar, zzcvr.zza);
    }

    public static zzejg zzb(zzejg zzejgVar) {
        return new zzejh(zzejgVar, zzcvq.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final void zzm() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzgym.zzr((ListenableFuture) it.next(), new zzcvp(this), zzgzd.zza());
        }
    }

    public zzcvs(zzcvk zzcvkVar) {
        this.zza = Collections.singletonList(zzgym.zza(zzcvkVar));
    }
}
