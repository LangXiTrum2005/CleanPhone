package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfth {
    private final zzfsi zza;
    private final ArrayList zzb;

    public zzfth(zzfsi zzfsiVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.zzb = arrayList;
        this.zza = zzfsiVar;
        arrayList.add(str);
    }

    public final void zza(String str) {
        this.zzb.add(str);
    }

    public final zzfsi zzb() {
        return this.zza;
    }

    public final ArrayList zzc() {
        return this.zzb;
    }
}
