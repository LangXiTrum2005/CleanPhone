package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
final class zzgfc extends zzgfz {
    private final Activity zza;
    private final View zzb;

    public zzgfc(zzavs zzavsVar, zzgev zzgevVar, View view, Activity activity, zzgnc zzgncVar) {
        super("qRoTIX01TXm6ZXZVmOMKT4ZXdjMMLNGK2c/NbGGBLqG2cMg0IUL/T2oTGpQvSnC1", "ca4PDuMQK3q/+ALDD/ITco9AaE4C+BCyDm2ZesJa1q0=", zzavsVar, zzgevVar, zzgncVar.zza(111));
        this.zzb = view;
        this.zza = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzgfz
    public final void zza(Method method, zzavs zzavsVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", this.zzb, this.zza);
        objArr.getClass();
        synchronized (zzavsVar) {
            zzavsVar.zzS(((Long) objArr[0]).longValue());
            zzavsVar.zzT(((Long) objArr[1]).longValue());
            zzavsVar.zzU((String) objArr[2]);
        }
    }
}
