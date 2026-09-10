package com.google.android.gms.internal.ads;

import com.p004ironsource.dc;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgtg<K, V> implements Map<K, V>, Serializable {
    private transient zzgtn zza;
    private transient zzgtn zzb;
    private transient zzgsz zzc;

    public static zzgtg zza() {
        return zzgvd.zza;
    }

    public static zzgtg zzb(Object obj, Object obj2) {
        zzgrz.zza("dialog_not_shown_reason", obj2);
        return zzgvd.zzk(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    public static zzgtg zzc(Map map) {
        if ((map instanceof zzgtg) && !(map instanceof SortedMap)) {
            zzgtg zzgtgVar = (zzgtg) map;
            zzgtgVar.zzj();
            return zzgtgVar;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        zzgtf zzgtfVar = new zzgtf(setEntrySet != null ? setEntrySet.size() : 4);
        zzgtfVar.zzb(setEntrySet);
        return zzgtfVar.zzc();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return zzguk.zzb(this, obj);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzgvn.zzc(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzgrz.zzb(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        boolean z2 = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append(dc.T);
            sb.append(entry.getValue());
            z2 = false;
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzgtn entrySet() {
        zzgtn zzgtnVar = this.zza;
        if (zzgtnVar != null) {
            return zzgtnVar;
        }
        zzgtn zzgtnVarZze = zze();
        this.zza = zzgtnVarZze;
        return zzgtnVarZze;
    }

    public abstract zzgtn zze();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzgtn keySet() {
        zzgtn zzgtnVar = this.zzb;
        if (zzgtnVar != null) {
            return zzgtnVar;
        }
        zzgtn zzgtnVarZzg = zzg();
        this.zzb = zzgtnVarZzg;
        return zzgtnVarZzg;
    }

    public abstract zzgtn zzg();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzgsz values() {
        zzgsz zzgszVar = this.zzc;
        if (zzgszVar != null) {
            return zzgszVar;
        }
        zzgsz zzgszVarZzi = zzi();
        this.zzc = zzgszVarZzi;
        return zzgszVarZzi;
    }

    public abstract zzgsz zzi();

    public abstract boolean zzj();
}
