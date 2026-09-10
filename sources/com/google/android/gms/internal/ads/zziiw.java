package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zziiw implements Iterator {
    int zza = 0;
    final /* synthetic */ zziix zzb;

    public zziiw(zziix zziixVar) {
        this.zzb = zziixVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.zza;
        zziix zziixVar = this.zzb;
        return i2 < zziixVar.zza.size() || zziixVar.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.zza;
        zziix zziixVar = this.zzb;
        List list = zziixVar.zza;
        if (i2 >= list.size()) {
            list.add(zziixVar.zzb.next());
            return next();
        }
        int i3 = this.zza;
        this.zza = i3 + 1;
        return list.get(i3);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
