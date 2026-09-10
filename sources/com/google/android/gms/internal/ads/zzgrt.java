package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzgrt extends zzgrw implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    public zzgrt(Map map) {
        zzgqa.zza(map.isEmpty());
        this.zza = map;
    }

    public Collection zza(Collection collection) {
        throw null;
    }

    public Collection zzb(Object obj, Collection collection) {
        throw null;
    }

    public abstract Collection zzc();

    @Override // com.google.android.gms.internal.ads.zzgul
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgrw, com.google.android.gms.internal.ads.zzgul
    public final boolean zze(Object obj, Object obj2) {
        Map map = this.zza;
        Collection collection = (Collection) map.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.zzb++;
            return true;
        }
        Collection collectionZzc = zzc();
        if (!collectionZzc.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.zzb++;
        map.put(obj, collectionZzc);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgul
    public final void zzf() {
        Map map = this.zza;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.zzb = 0;
    }

    public final List zzg(Object obj, List list, zzgrq zzgrqVar) {
        return list instanceof RandomAccess ? new zzgrm(this, obj, list, zzgrqVar) : new zzgrs(this, obj, list, zzgrqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgrw
    public Set zzh() {
        throw null;
    }

    public final Set zzi() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzgrl(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new zzgro(this, (SortedMap) map) : new zzgrj(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzgrw
    public final Collection zzj() {
        return new zzgrv(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgrw
    public final Iterator zzk() {
        return new zzgrd(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgrw
    public Map zzl() {
        throw null;
    }

    public final Map zzm() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzgrk(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new zzgrn(this, (SortedMap) map) : new zzgrg(this, map);
    }

    public final /* synthetic */ void zzn(Object obj) {
        Object objRemove;
        try {
            objRemove = this.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.zzb -= size;
        }
    }

    public final /* synthetic */ Map zzo() {
        return this.zza;
    }

    public final /* synthetic */ int zzp() {
        return this.zzb;
    }

    public final /* synthetic */ void zzq(int i2) {
        this.zzb = i2;
    }
}
