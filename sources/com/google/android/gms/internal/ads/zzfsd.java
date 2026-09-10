package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfsd implements zzfsg {
    private static final zzfsd zza = new zzfsd(new zzfsh());
    private Date zzb;
    private boolean zzc;
    private final zzfsh zzd;
    private boolean zze;

    private zzfsd(zzfsh zzfshVar) {
        this.zzd = zzfshVar;
    }

    public static zzfsd zza() {
        return zza;
    }

    public final Date zzb() {
        Date date = this.zzb;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public final void zzc(Context context) {
        if (this.zzc) {
            return;
        }
        zzfsh zzfshVar = this.zzd;
        zzfshVar.zzd(context);
        zzfshVar.zzg(this);
        zzfshVar.zze();
        this.zze = zzfshVar.zza;
        this.zzc = true;
    }

    @Override // com.google.android.gms.internal.ads.zzfsg
    public final void zzd(boolean z2) {
        if (!this.zze && z2) {
            Date date = new Date();
            Date date2 = this.zzb;
            if (date2 == null || date.after(date2)) {
                this.zzb = date;
                if (this.zzc) {
                    Iterator it = zzfsf.zza().zzf().iterator();
                    while (it.hasNext()) {
                        ((zzfrl) it.next()).zzg().zzn(zzb());
                    }
                }
            }
        }
        this.zze = z2;
    }
}
