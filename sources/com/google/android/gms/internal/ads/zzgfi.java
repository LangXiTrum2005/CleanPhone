package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
final class zzgfi extends zzgfz {
    public zzgfi(zzavs zzavsVar, zzgev zzgevVar, zzgnc zzgncVar) {
        super("h5woWk+/MKVn7UnkX48AE9w6oDGEwBuxIHHk8xiY2yxVLqDnKQK67m10f2Y48g47", "b++yFG7IFEWrMfvlJtGPZ8QEQ4/8mF+A/OqSDvgH3mE=", zzavsVar, zzgevVar, zzgncVar.zza(114));
    }

    @Override // com.google.android.gms.internal.ads.zzgfz
    public final void zza(Method method, zzavs zzavsVar) throws IllegalAccessException, InvocationTargetException {
        synchronized (zzavsVar) {
            zzavsVar.zza("E");
            zzavsVar.zzB(0L);
            zzavsVar.zzV("D");
        }
        Object[] objArr = (Object[]) method.invoke("", new Object[0]);
        objArr.getClass();
        synchronized (zzavsVar) {
            zzavsVar.zza((String) objArr[0]);
            zzavsVar.zzB(((Long) objArr[1]).longValue());
            zzavsVar.zzV((String) objArr[2]);
        }
    }
}
