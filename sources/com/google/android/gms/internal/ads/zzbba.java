package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbba extends zzbbh {
    public zzbba(zzazt zzaztVar, String str, String str2, zzavs zzavsVar, int i2, int i3) {
        super(zzaztVar, "cOth2BAAthu6X8KDmzC58653OwqftcurhEiV9l+3uxMh7KBnOgbdhGM0zSnSPufi", "2EDSTVCwfkpT+1duJ+umEyNIZ3jEP0NWyK78oeLPLhI=", zzavsVar, i2, 51);
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzavs zzavsVar = this.zzd;
        synchronized (zzavsVar) {
            zzazo zzazoVar = new zzazo((String) this.zze.invoke(null, new Object[0]));
            zzavsVar.zzF(zzazoVar.zza.longValue());
            zzavsVar.zzG(zzazoVar.zzb.longValue());
        }
    }
}
