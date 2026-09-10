package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgfs extends zzgfz {
    private final Context zza;

    public zzgfs(zzavs zzavsVar, zzgev zzgevVar, Context context, zzgnc zzgncVar) {
        super("hzhbIB+AgGdYPFXbtYQQJVQ0myyvLQ035lSh6fryM+LYz5yD6wiuaRPJPr0GACLg", "8nQjwnciPBNothZ+NkFCxpR7DmL40cEAF/v8iM4vgFc=", zzavsVar, zzgevVar, zzgncVar.zza(119));
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgfz
    public final void zza(Method method, zzavs zzavsVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", this.zza);
        objArr.getClass();
        synchronized (zzavsVar) {
            zzavsVar.zzc(((Long) objArr[0]).longValue());
            zzavsVar.zzP(((Long) objArr[1]).longValue());
        }
    }
}
