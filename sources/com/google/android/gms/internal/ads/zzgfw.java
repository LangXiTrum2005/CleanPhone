package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzgfw extends zzgfz {
    private static final Long zza = -1L;
    private final zzgba zzb;
    private final Context zzc;
    private final Map zzd;

    public zzgfw(zzavs zzavsVar, zzgev zzgevVar, zzgba zzgbaVar, Context context, Map map, zzgnc zzgncVar) {
        super("jTwehpFvggflbSQgZ6TF5ZqO2MGz4ZNlyaEKeNyxM2KkBYQA70h6S0RpRF1AFrD5", "26X1QwwnBSG6Ity/sCu7ijF3yvcDEyHR/EuBkm0iUZc=", zzavsVar, zzgevVar, zzgncVar.zza(121));
        this.zzb = zzgbaVar;
        this.zzc = context;
        this.zzd = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgfz
    public final void zza(Method method, zzavs zzavsVar) throws IllegalAccessException, InvocationTargetException {
        zzgba zzgbaVar = this.zzb;
        Object[] objArr = (Object[]) method.invoke("", Integer.valueOf(zzgbaVar.ordinal()), this.zzc, zzgpx.zza(this.zzd.get("up"), Boolean.TRUE));
        objArr.getClass();
        synchronized (zzavsVar) {
            try {
                if (zzgbaVar == zzgba.QUERY) {
                    Object obj = objArr[0];
                    Long l2 = zza;
                    zzavsVar.zzq(((Long) zzgpx.zza(obj, l2)).longValue());
                    zzavsVar.zzr(((Long) zzgpx.zza(objArr[1], l2)).longValue());
                }
                zzavsVar.zzg(((Long) objArr[2]).longValue());
                zzavsVar.zzQ(((Long) objArr[3]).longValue());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
