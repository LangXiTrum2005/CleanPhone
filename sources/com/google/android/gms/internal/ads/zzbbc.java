package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbbc extends zzbbh {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzbbc(zzazt zzaztVar, String str, String str2, zzavs zzavsVar, int i2, int i3) {
        super(zzaztVar, "VYNLVwJcUVwKHNYqtTAMU2Cbdf8xQvz3Fr3MGMTI+Feinwv11ysZpnAq/2AMk2I1", "XCAdtiyR5t8AMQ7u4CMXLD5NJ9dD+Tw+KRPDn9OS+vQ=", zzavsVar, i2, 33);
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzh == null) {
            synchronized (zzi) {
                try {
                    if (zzh == null) {
                        zzh = (Long) this.zze.invoke(null, new Object[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        zzavs zzavsVar = this.zzd;
        synchronized (zzavsVar) {
            zzavsVar.zzs(zzh.longValue());
        }
    }
}
