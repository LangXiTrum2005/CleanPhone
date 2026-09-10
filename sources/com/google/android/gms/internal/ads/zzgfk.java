package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
final class zzgfk extends zzgfz {
    private final Context zza;

    public zzgfk(zzavs zzavsVar, zzgev zzgevVar, Context context, zzgnc zzgncVar) {
        super("ElEd4VcZAEfP2Wn07dNn4m5KzOJYeOBfSNpGODwEVMM987QtZ6G7lEZTIkvpOYy8", "f+lS1NLa9mNIIiIqU+oCtIwtOpjS/HcJD4HNhQ2VxXc=", zzavsVar, zzgevVar, zzgncVar.zza(115));
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgfz
    public final void zza(Method method, zzavs zzavsVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", this.zza);
        objArr.getClass();
        synchronized (zzavsVar) {
            try {
                zzavsVar.zzO(((Integer) objArr[0]).intValue());
                int i2 = 1;
                zzavsVar.zzd(((Integer) objArr[1]).intValue());
                zzavsVar.zze(((Integer) objArr[2]).intValue());
                zzavsVar.zzab(((Integer) objArr[3]).intValue());
                Boolean bool = (Boolean) objArr[4];
                if (bool == null) {
                    zzavsVar.zzaf(3);
                } else {
                    zzavsVar.zzaf(true != bool.booleanValue() ? 1 : 2);
                }
                Boolean bool2 = (Boolean) objArr[5];
                if (bool2 == null) {
                    zzavsVar.zzae(3);
                } else {
                    if (true == bool2.booleanValue()) {
                        i2 = 2;
                    }
                    zzavsVar.zzae(i2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
