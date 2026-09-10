package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzapi {
    public final int zza;
    public final byte[] zzb;

    @Nullable
    public final Map zzc;

    @Nullable
    public final List zzd;
    public final boolean zze;

    private zzapi(int i, byte[] bArr, @Nullable Map map, @Nullable List list, boolean z, long j) {
        this.zza = i;
        this.zzb = bArr;
        this.zzc = map;
        this.zzd = list == null ? null : Collections.unmodifiableList(list);
        this.zze = z;
    }

    @Nullable
    private static List zza(@Nullable Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new zzape((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    @Deprecated
    public zzapi(int i, byte[] bArr, @Nullable Map map, boolean z, long j) {
        this(i, bArr, map, zza(map), z, j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map] */
    public zzapi(int i, byte[] bArr, boolean z, long j, @Nullable List list) {
        ?? treeMap;
        if (list == null) {
            treeMap = 0;
        } else if (list.isEmpty()) {
            treeMap = Collections.emptyMap();
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzape zzapeVar = (zzape) it.next();
                treeMap.put(zzapeVar.zza(), zzapeVar.zzb());
            }
        }
        this(i, bArr, treeMap, list, z, j);
    }

    @Deprecated
    public zzapi(byte[] bArr, @Nullable Map map) {
        this(200, bArr, map, zza(map), false, 0L);
    }
}
