package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class zzban extends zzbbh {
    private final zzazu zzh;

    public zzban(zzazt zzaztVar, String str, String str2, zzavs zzavsVar, int i2, int i3, zzazu zzazuVar) {
        super(zzaztVar, "OKoG374XK3cB1cjYFPuO/Bg6vy6AufzuCyu4QCURxkWhJwL4+NqQjs8XziSHB+CQ", "PjHrXBXcXoGkJe75zH8RZ0khapXmOV4o2gX+YgkGdus=", zzavsVar, i2, 85);
        this.zzh = zzazuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        Method method = this.zze;
        zzazu zzazuVar = this.zzh;
        long[] jArr = (long[]) method.invoke(null, Long.valueOf(zzazuVar.zzf()), Long.valueOf(zzazuVar.zzg()), Long.valueOf(zzazuVar.zzi()), Long.valueOf(zzazuVar.zzh()));
        zzavs zzavsVar = this.zzd;
        synchronized (zzavsVar) {
            zzavsVar.zzY(jArr[0]);
            zzavsVar.zzZ(jArr[1]);
        }
    }
}
