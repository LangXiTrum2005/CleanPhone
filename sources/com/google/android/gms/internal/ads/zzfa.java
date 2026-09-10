package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfa {
    private final zzbb zza;
    private final zzaz zzb;
    private final zzeu zzc;
    private final zzbd zzd = new zzbd();
    private final zzdx zze;
    private final zzev zzf;
    private final zzex zzg;
    private final zzey zzh;
    private final zzez zzi;

    public zzfa(zzbb zzbbVar, zzeu zzeuVar, zzdn zzdnVar, int i2, int i3, int i4, int i5) {
        this.zza = zzbbVar;
        this.zzc = zzeuVar;
        this.zze = zzdnVar.zzd(zzbbVar.zzd(), new Handler.Callback() { // from class: com.google.android.gms.internal.ads.zzew
            @Override // android.os.Handler.Callback
            public final /* synthetic */ boolean handleMessage(Message message) {
                return this.zza.zzb(message);
            }
        });
        this.zzf = new zzev(this, i2);
        this.zzg = new zzex(this, i3);
        this.zzh = new zzey(this, i4);
        this.zzi = new zzez(this, i5);
        zzet zzetVar = new zzet(this);
        this.zzb = zzetVar;
        zzbbVar.zze(zzetVar);
    }

    public final void zza() {
        this.zze.zzm(null);
        this.zza.zzf(this.zzb);
    }

    public final /* synthetic */ boolean zzb(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            this.zzf.zza();
            return true;
        }
        if (i2 == 2) {
            this.zzg.zza();
            return true;
        }
        if (i2 == 3) {
            this.zzh.zza();
            return true;
        }
        if (i2 != 4) {
            return false;
        }
        this.zzi.zza();
        return true;
    }

    public final /* synthetic */ void zzc() {
        this.zzf.zza();
        this.zzg.zza();
        this.zzh.zza();
        this.zzi.zza();
    }

    public final /* synthetic */ zzbb zzd() {
        return this.zza;
    }

    public final /* synthetic */ zzeu zze() {
        return this.zzc;
    }

    public final /* synthetic */ zzbd zzf() {
        return this.zzd;
    }

    public final /* synthetic */ zzdx zzg() {
        return this.zze;
    }
}
