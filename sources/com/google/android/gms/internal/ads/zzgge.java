package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
final class zzgge extends zzgfz {
    private final DisplayMetrics zza;
    private final View zzb;

    public zzgge(zzavs zzavsVar, zzgev zzgevVar, DisplayMetrics displayMetrics, View view, zzgnc zzgncVar) {
        super("tq9z0bsqyfYem1dUfogYnUtJjgIFA+joGg8QA4Yjc06GGolRKpj33I2byFl1ahrM", "t+27szabmNhDv89ZHseqqkrSfYo80HKd8ZuzbFtUHyo=", zzavsVar, zzgevVar, zzgncVar.zza(124));
        this.zza = displayMetrics;
        this.zzb = view;
    }

    @Override // com.google.android.gms.internal.ads.zzgfz
    public final void zza(Method method, zzavs zzavsVar) throws IllegalAccessException, InvocationTargetException {
        View view = this.zzb;
        if (view == null) {
            return;
        }
        Object objInvoke = method.invoke("", this.zza, view);
        objInvoke.getClass();
        Long[] lArr = (Long[]) objInvoke;
        zzawn zzawnVarZza = zzawo.zza();
        zzawnVarZza.zzb(lArr[2].longValue());
        zzawnVarZza.zzc(lArr[1].longValue());
        zzawnVarZza.zzd(lArr[0].longValue());
        zzawnVarZza.zza(lArr[3].longValue());
        zzawnVarZza.zze(lArr[4].longValue());
        zzavsVar.zzM((zzawo) zzawnVarZza.zzbu());
    }
}
