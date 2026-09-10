package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbao extends zzbbh {
    private final Map zzh;
    private final View zzi;
    private final Context zzj;

    public zzbao(zzazt zzaztVar, String str, String str2, zzavs zzavsVar, int i2, int i3, Map map, View view, Context context) {
        super(zzaztVar, "ykIQv59ak7YBU+e791IU15tGonhZPUUBXST76bDGm7zXSjUSNn9qtHdf61t20THy", "l48tDWlMY/G/BSkitRUvd80RiFbNrk8nR5qlkOsZWs8=", zzavsVar, i2, 85);
        this.zzh = map;
        this.zzi = view;
        this.zzj = context;
    }

    private final long zzb(int i2) {
        Map map = this.zzh;
        Integer numValueOf = Integer.valueOf(i2);
        if (map.containsKey(numValueOf)) {
            return ((Long) map.get(numValueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = {zzb(1), zzb(2)};
        Context contextZzb = this.zzj;
        if (contextZzb == null) {
            contextZzb = this.zza.zzb();
        }
        long[] jArr2 = (long[]) this.zze.invoke(null, jArr, contextZzb, this.zzi);
        long j = jArr2[0];
        Map map = this.zzh;
        map.put(1, Long.valueOf(jArr2[1]));
        long j2 = jArr2[2];
        map.put(2, Long.valueOf(jArr2[3]));
        zzavs zzavsVar = this.zzd;
        synchronized (zzavsVar) {
            zzavsVar.zzY(j);
            zzavsVar.zzZ(j2);
        }
    }
}
