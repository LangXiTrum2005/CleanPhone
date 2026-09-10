package com.google.android.gms.internal.ads;

import com.p004ironsource.d9;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgto extends zzgtj {
    public final zzgto zzb(Object obj, Object... objArr) {
        List listAsList = Arrays.asList(objArr);
        if (obj == null) {
            Iterator it = listAsList.iterator();
            StringBuilder sb = new StringBuilder(d9.i.d);
            boolean z2 = true;
            while (it.hasNext()) {
                if (!z2) {
                    sb.append(", ");
                }
                sb.append(it.next());
                z2 = false;
            }
            sb.append(AbstractJsonLexerKt.END_LIST);
            throw new NullPointerException("null key in entry: null=".concat(sb.toString()));
        }
        Iterator it2 = listAsList.iterator();
        if (it2.hasNext()) {
            zzgsy zzgsyVarZzs = (zzgsy) zza().get(obj);
            if (zzgsyVarZzs == null) {
                zzgsyVarZzs = zzgtn.zzs(listAsList instanceof Set ? Math.max(4, ((Set) listAsList).size()) : 4);
                zza().put(obj, zzgsyVarZzs);
            }
            while (it2.hasNext()) {
                Object next = it2.next();
                zzgrz.zza(obj, next);
                zzgsyVarZzs.zzd(next);
            }
        }
        return this;
    }

    public final zzgtq zzc() {
        Map map = this.zza;
        if (map == null) {
            return zzgsr.zza;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return zzgsr.zza;
        }
        zzgtf zzgtfVar = new zzgtf(setEntrySet.size());
        int size = 0;
        for (Map.Entry entry : setEntrySet) {
            Object key = entry.getKey();
            zzgtn zzgtnVarZzo = zzgtn.zzo(((zzgtm) entry.getValue()).zzi());
            if (!zzgtnVarZzo.isEmpty()) {
                zzgtfVar.zza(key, zzgtnVarZzo);
                size += zzgtnVarZzo.size();
            }
        }
        return new zzgtq(zzgtfVar.zzc(), size, null);
    }
}
