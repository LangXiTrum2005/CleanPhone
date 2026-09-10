package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
final class zzgfm extends zzgfz {
    private final zzgad zza;

    public zzgfm(zzavs zzavsVar, zzgev zzgevVar, zzgad zzgadVar, zzgnc zzgncVar) {
        super("wtGqMd/1WM/X8Iw+J3Ea8gTPTQ9qzD2C6TcptISwpBzFOHGXqr9Zam0BzMtLgKpz", "WnUwwSu4en0kDO+iGEQNK9IW8rLFfprwibt/HeKMJc4=", zzavsVar, zzgevVar, zzgncVar.zza(116));
        this.zza = zzgadVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfz
    public final void zza(Method method, zzavs zzavsVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", this.zza.zzb());
        objArr.getClass();
        synchronized (zzavsVar) {
            zzavsVar.zzb((String) objArr[0]);
            zzavsVar.zzaa((String) objArr[1]);
        }
    }
}
