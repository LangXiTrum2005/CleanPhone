package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbbe extends zzbbh {
    private final View zzh;

    public zzbbe(zzazt zzaztVar, String str, String str2, zzavs zzavsVar, int i2, int i3, View view) {
        super(zzaztVar, "UGogIgDf9q+IGA3QKHqW/91b9ZzRTVJqtfmUoLBkD310fwrDg1hJZvDQk8/WK1MH", "sEqRe1gPhw/PwjhUj/qVAEUjKSVJDrXHsmrE44pcjTE=", zzavsVar, i2, 57);
        this.zzh = view;
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        View view = this.zzh;
        if (view != null) {
            Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzej);
            Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmp);
            zzazx zzazxVar = new zzazx((String) this.zze.invoke(null, view, this.zza.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzawn zzawnVarZza = zzawo.zza();
            zzawnVarZza.zzb(zzazxVar.zza.longValue());
            zzawnVarZza.zzc(zzazxVar.zzb.longValue());
            zzawnVarZza.zzd(zzazxVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zzawnVarZza.zza(zzazxVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zzawnVarZza.zze(zzazxVar.zzd.longValue());
            }
            this.zzd.zzM((zzawo) zzawnVarZza.zzbu());
        }
    }
}
