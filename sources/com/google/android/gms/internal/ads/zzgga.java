package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzgga extends zzgfz {
    private final Map zza;
    private final zzgba zzb;

    public zzgga(zzavs zzavsVar, zzgev zzgevVar, zzgba zzgbaVar, Map map, zzgnc zzgncVar) {
        super("PL1+PnLeilPUwoW2fO9HYIrx4Gg09J/+FJQHQ2Jxmj5/l/Syl1OYiCh2G/imF0wq", "lSzEOSnnLGs69ZQnPGdq+hn/fw2CPePS7EJBVgPn7n4=", zzavsVar, zzgevVar, zzgncVar.zza(122));
        this.zza = map;
        this.zzb = zzgbaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfz
    public final void zza(Method method, zzavs zzavsVar) throws IllegalAccessException, InvocationTargetException {
        Long[] lArr = new Long[9];
        Arrays.fill((Object[]) lArr, (Object) (-1L));
        Map map = this.zza;
        lArr[0] = (Long) zzgpx.zza((Long) map.get("tcq"), -1L);
        lArr[1] = (Long) zzgpx.zza((Long) map.get("tpq"), -1L);
        lArr[2] = (Long) zzgpx.zza((Long) map.get("tcv"), -1L);
        lArr[3] = (Long) zzgpx.zza((Long) map.get("tpv"), -1L);
        lArr[4] = (Long) zzgpx.zza((Long) map.get("tchv"), -1L);
        lArr[5] = (Long) zzgpx.zza((Long) map.get("tphv"), -1L);
        lArr[6] = (Long) zzgpx.zza((Long) map.get("tcc"), -1L);
        lArr[7] = (Long) zzgpx.zza((Long) map.get("tpc"), -1L);
        lArr[8] = (Long) zzgpx.zza((Long) map.get("tst"), -1L);
        for (int i2 = 0; i2 < 9; i2++) {
            if (lArr[i2] == null) {
                lArr[i2] = -1L;
            }
        }
        Long[] lArr2 = (Long[]) method.invoke("", lArr, Integer.valueOf(this.zzb.ordinal()));
        lArr2.getClass();
        synchronized (zzavsVar) {
            zzavsVar.zzac(lArr2[0].longValue());
            zzavsVar.zzs(lArr2[1].longValue());
            zzavsVar.zzn(lArr2[2].longValue());
            zzavsVar.zzk(lArr2[3].longValue());
            zzavsVar.zzY(lArr2[4].longValue());
            zzavsVar.zzZ(lArr2[5].longValue());
            zzavsVar.zzF(lArr2[6].longValue());
            zzavsVar.zzG(lArr2[7].longValue());
        }
    }
}
