package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
final class zzele implements zzdlh {
    private final zzfhr zza;
    private final zzbuy zzb;
    private final AdFormat zzc;
    private zzdbc zzd = null;

    public zzele(zzfhr zzfhrVar, zzbuy zzbuyVar, AdFormat adFormat) {
        this.zza = zzfhrVar;
        this.zzb = zzbuyVar;
        this.zzc = adFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzdlh
    public final void zza(boolean z2, Context context, zzdax zzdaxVar) throws zzdlg {
        boolean zZzk;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int iOrdinal = this.zzc.ordinal();
            if (iOrdinal == 1) {
                zZzk = this.zzb.zzk(ObjectWrapper.wrap(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 5) {
                        zZzk = this.zzb.zzt(ObjectWrapper.wrap(context));
                    }
                    throw new zzdlg("Adapter failed to show.");
                }
                zZzk = this.zzb.zzm(ObjectWrapper.wrap(context));
            }
            if (zZzk) {
                zzdbc zzdbcVar = this.zzd;
                if (zzdbcVar == null) {
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzca)).booleanValue() || this.zza.zzY != 2) {
                    return;
                }
                zzdbcVar.zza();
                return;
            }
            throw new zzdlg("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdlg(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlh
    public final zzfhr zzb() {
        return this.zza;
    }

    public final void zzc(zzdbc zzdbcVar) {
        this.zzd = zzdbcVar;
    }
}
