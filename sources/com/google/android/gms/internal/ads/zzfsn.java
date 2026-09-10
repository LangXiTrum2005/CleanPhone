package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfsn implements zzfsg {
    private static zzfsn zza;
    private float zzb = 0.0f;
    private zzfsb zzc;
    private zzfsf zzd;

    public zzfsn(zzfsc zzfscVar, zzfry zzfryVar) {
    }

    public static zzfsn zza() {
        if (zza == null) {
            zza = new zzfsn(new zzfsc(), new zzfry());
        }
        return zza;
    }

    public final void zzb(Context context) {
        this.zzc = new zzfsb(new Handler(), context, new zzfrx(), this);
    }

    public final void zzc() {
        zzfse.zza().zzg(this);
        zzfse.zza().zze();
        zzftp.zzb().zzc();
        this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfsg
    public final void zzd(boolean z2) {
        if (z2) {
            zzftp.zzb().zzc();
        } else {
            zzftp.zzb().zze();
        }
    }

    public final void zze() {
        zzftp.zzb().zzd();
        zzfse.zza().zzf();
        this.zzc.zzb();
    }

    public final void zzf(float f) {
        this.zzb = f;
        if (this.zzd == null) {
            this.zzd = zzfsf.zza();
        }
        Iterator it = this.zzd.zzf().iterator();
        while (it.hasNext()) {
            ((zzfrl) it.next()).zzg().zzo(f);
        }
    }

    public final float zzg() {
        return this.zzb;
    }
}
