package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zztf {
    public final int zza;
    public final zzwg zzb;
    private final CopyOnWriteArrayList zzc;

    private zztf(CopyOnWriteArrayList copyOnWriteArrayList, int i2, zzwg zzwgVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzwgVar;
    }

    public final zztf zza(int i2, zzwg zzwgVar) {
        return new zztf(this.zzc, 0, zzwgVar);
    }

    public final void zzb(Handler handler, zztg zztgVar) {
        this.zzc.add(new zzte(handler, zztgVar));
    }

    public final void zzc(zztg zztgVar) {
        CopyOnWriteArrayList<zzte> copyOnWriteArrayList = this.zzc;
        for (zzte zzteVar : copyOnWriteArrayList) {
            if (zzteVar.zza == zztgVar) {
                copyOnWriteArrayList.remove(zzteVar);
            }
        }
    }

    public zztf() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
