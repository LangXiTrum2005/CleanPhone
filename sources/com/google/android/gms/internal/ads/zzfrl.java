package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfrl extends zzfrh {
    private final zzfrj zza;
    private zzftw zzc;
    private zzfsv zzd;
    private final String zzg;
    private final zzfsj zzb = new zzfsj();
    private boolean zze = false;
    private boolean zzf = false;

    public zzfrl(zzfri zzfriVar, zzfrj zzfrjVar, String str) {
        this.zza = zzfrjVar;
        this.zzg = str;
        zzk(null);
        if (zzfrjVar.zzi() == zzfrk.HTML || zzfrjVar.zzi() == zzfrk.JAVASCRIPT) {
            this.zzd = new zzfsw(str, zzfrjVar.zzf());
        } else {
            this.zzd = new zzfsz(str, zzfrjVar.zze(), null);
        }
        this.zzd.zza();
        zzfsf.zza().zzb(this);
        this.zzd.zzj(zzfriVar);
    }

    private final void zzk(View view) {
        this.zzc = new zzftw(view);
    }

    @Override // com.google.android.gms.internal.ads.zzfrh
    public final void zza() {
        if (this.zze || this.zzd == null) {
            return;
        }
        this.zze = true;
        zzfsf.zza().zzc(this);
        this.zzd.zzo(zzfsn.zza().zzg());
        this.zzd.zzn(zzfsd.zza().zzb());
        this.zzd.zzk(this, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfrh
    public final void zzb(View view) {
        if (this.zzf || zzi() == view) {
            return;
        }
        zzk(view);
        this.zzd.zzp();
        Collection<zzfrl> collectionZze = zzfsf.zza().zze();
        if (collectionZze == null || collectionZze.isEmpty()) {
            return;
        }
        for (zzfrl zzfrlVar : collectionZze) {
            if (zzfrlVar != this && zzfrlVar.zzi() == view) {
                zzfrlVar.zzc.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrh
    public final void zzc() {
        if (this.zzf) {
            return;
        }
        this.zzc.clear();
        if (!this.zzf) {
            this.zzb.zzc();
        }
        this.zzf = true;
        this.zzd.zzm();
        zzfsf.zza().zzd(this);
        this.zzd.zzb();
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfrh
    public final void zzd(View view, zzfro zzfroVar, String str) {
        if (this.zzf) {
            return;
        }
        this.zzb.zzb(view, zzfroVar, "Ad overlay");
    }

    public final List zzf() {
        return this.zzb.zza();
    }

    public final zzfsv zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zzi() {
        return (View) this.zzc.get();
    }

    public final boolean zzj() {
        return this.zze && !this.zzf;
    }
}
