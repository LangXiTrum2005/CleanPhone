package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgdx {
    private final zzgyw zza;
    private final zzgec zzb;
    private final Set zzc;
    private final String zzd;
    private final zzavs zze;
    private final zzgev zzf;
    private final zzgnc zzg;

    public zzgdx(zzgyw zzgywVar, zzgec zzgecVar, zzgev zzgevVar, zzgba zzgbaVar, String str, zzavs zzavsVar, zzijv zzijvVar, zzijv zzijvVar2, zzijv zzijvVar3, zzgnc zzgncVar) {
        this.zza = zzgywVar;
        this.zzb = zzgecVar;
        this.zzd = str;
        this.zzf = zzgevVar;
        this.zze = zzavsVar;
        this.zzg = zzgncVar;
        int iOrdinal = zzgbaVar.ordinal();
        if (iOrdinal == 0) {
            this.zzc = ((zzijs) zzijvVar).zzb();
        } else if (iOrdinal == 1) {
            this.zzc = ((zzijs) zzijvVar2).zzb();
        } else {
            if (iOrdinal != 2) {
                throw new IllegalStateException();
            }
            this.zzc = ((zzijs) zzijvVar3).zzb();
        }
    }

    public final ListenableFuture zza() {
        if (!this.zzb.zzc()) {
            return zzgym.zza(Integer.toString(7));
        }
        if (!this.zzf.zzb()) {
            return zzgym.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgdw
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzb();
                }
            }, this.zza);
        }
        Set set = this.zzc;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(this.zza.submit((zzgfy) it.next()));
        }
        return zzgym.zzn(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzgdu
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        }, zzgzd.zza());
    }

    public final /* synthetic */ String zzb() {
        return this.zzb.zzg(16384, this.zzd);
    }

    public final /* synthetic */ String zzc() {
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzgdv
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzd();
            }
        };
        zzgna zzgnaVarZza = this.zzg.zza(101);
        try {
            zzgnaVarZza.zza();
            Object objCall = callable.call();
            zzgnaVarZza.zzc();
            return (String) objCall;
        } catch (Throwable th) {
            try {
                zzgnaVarZza.zzb(th);
                throw th;
            } catch (Throwable th2) {
                zzgnaVarZza.zzc();
                throw th2;
            }
        }
    }

    public final /* synthetic */ String zzd() {
        zzawp zzawpVar = (zzawp) this.zze.zzbu();
        String str = this.zzd;
        zzgec zzgecVar = this.zzb;
        try {
            return Base64.encodeToString(((zzaxg) zzgecVar.zzf(zzawpVar.zzaN(), str).zzbu()).zzaN(), 11);
        } catch (IllegalArgumentException unused) {
            return zzgecVar.zzg(4096, str);
        }
    }
}
