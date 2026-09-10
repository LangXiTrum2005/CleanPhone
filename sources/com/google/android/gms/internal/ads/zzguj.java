package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzguj extends AbstractMap {
    private transient Set zza;
    private transient Set zzb;
    private transient Collection zzc;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zza;
        if (set != null) {
            return set;
        }
        Set setZza = zza();
        this.zza = setZza;
        return setZza;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.zzb;
        if (set != null) {
            return set;
        }
        Set setZzh = zzh();
        this.zzb = setZzh;
        return setZzh;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzc;
        if (collection != null) {
            return collection;
        }
        zzgui zzguiVar = new zzgui(this);
        this.zzc = zzguiVar;
        return zzguiVar;
    }

    public abstract Set zza();

    public Set zzh() {
        return new zzguh(this);
    }
}
