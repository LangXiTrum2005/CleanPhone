package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzgfq extends zzgfz {
    private final Map zza;

    public zzgfq(zzavs zzavsVar, zzgev zzgevVar, Map map, zzgnc zzgncVar) {
        super("HfOLt/75P0inB1ACQtpmoZ+1+wQRBgHtknW9eFeTyv4KW5Suh8LSIOlyCgysGkTB", "H5oaXmgEE2ioSjZtswlhWck6Iz70pHSCwKmqgx59qOA=", zzavsVar, zzgevVar, zzgncVar.zza(118));
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgfz
    public final void zza(Method method, zzavs zzavsVar) throws IllegalAccessException, InvocationTargetException {
        Map map = this.zza;
        Object[] objArr = (Object[]) method.invoke("", (NetworkCapabilities) map.get("ntc"), (Long) map.get("vs"), (Long) map.get("vf"));
        objArr.getClass();
        synchronized (zzavsVar) {
            try {
                zzavsVar.zzf(((Long) objArr[0]).longValue());
                long jLongValue = ((Long) objArr[1]).longValue();
                if (jLongValue >= 0) {
                    zzavsVar.zzW(jLongValue);
                }
                long jLongValue2 = ((Long) objArr[2]).longValue();
                if (jLongValue2 >= 0) {
                    zzavsVar.zzX(jLongValue2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
