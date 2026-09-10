package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbad extends zzbbh {
    private final Activity zzh;
    private final View zzi;

    public zzbad(zzazt zzaztVar, String str, String str2, zzavs zzavsVar, int i2, int i3, View view, Activity activity) {
        super(zzaztVar, "YJMz4lZ/SFOXN6kW19UKnvAqcLtndNv4f6er9d24/5MuXcrsMTIC+9Jfbhpe2HMW", "6iuDHA2XEqaGCIdpenyLvoYWzHjKpoW5EjYN40bz5Cs=", zzavsVar, i2, 62);
        this.zzi = view;
        this.zzh = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        View view = this.zzi;
        if (view == null) {
            return;
        }
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdn);
        boolean zBooleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.zze.invoke(null, view, this.zzh, bool);
        zzavs zzavsVar = this.zzd;
        synchronized (zzavsVar) {
            try {
                zzavsVar.zzS(((Long) objArr[0]).longValue());
                zzavsVar.zzT(((Long) objArr[1]).longValue());
                if (zBooleanValue) {
                    zzavsVar.zzU((String) objArr[2]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
