package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfxd extends zzfxe implements Map {
    @Override // java.util.Map
    public final void clear() {
        zzb().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        return zzb().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        return zzb().containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        return zzb().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(@CheckForNull Object obj) {
        return obj == this || zzb().equals(obj);
    }

    @Override // java.util.Map
    @CheckForNull
    public Object get(@CheckForNull Object obj) {
        return zzb().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return zzb().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return zzb().isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return zzb().keySet();
    }

    @Override // java.util.Map
    @CheckForNull
    public final Object put(Object obj, Object obj2) {
        return zzb().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        zzb().putAll(map);
    }

    @Override // java.util.Map
    @CheckForNull
    public final Object remove(@CheckForNull Object obj) {
        return zzb().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return zzb().size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return zzb().values();
    }

    @Override // com.google.android.gms.internal.ads.zzfxe
    public /* bridge */ /* synthetic */ Object zza() {
        throw null;
    }

    public abstract Map zzb();

    public final int zzc() {
        return zzfzp.zza(entrySet());
    }

    public final boolean zzd(@CheckForNull Object obj) {
        zzfyf zzfyfVar = new zzfyf(entrySet().iterator());
        if (obj == null) {
            while (zzfyfVar.hasNext()) {
                if (zzfyfVar.next() == null) {
                }
            }
            return false;
        }
        while (zzfyfVar.hasNext()) {
            if (obj.equals(zzfyfVar.next())) {
            }
        }
        return false;
        return true;
    }

    public final boolean zze(@CheckForNull Object obj) {
        return zzfyk.zzb(this, obj);
    }
}
