package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzghq {
    private final zzgls zza;
    private final zzgje zzb;
    private final zzgjv zzc;
    private final zzgnc zzd;
    private final zzgbj zze;
    private final boolean zzf;
    private final long zzg;
    private final long zzh;

    public zzghq(zzgls zzglsVar, zzgje zzgjeVar, zzgjv zzgjvVar, zzgnc zzgncVar, zzgbj zzgbjVar, boolean z2, long j, long j2) {
        this.zza = zzglsVar;
        this.zzb = zzgjeVar;
        this.zzc = zzgjvVar;
        this.zzd = zzgncVar;
        this.zze = zzgbjVar;
        this.zzf = z2;
        this.zzg = j;
        this.zzh = j2;
    }

    private final ListenableFuture zzh(final int i2) {
        zzgye zzgyeVar = (zzgye) zzgym.zzg((zzgye) zzgym.zzg((zzgye) zzgym.zzg((zzgye) zzgym.zzk((zzgye) zzgym.zzj((zzgye) zzgym.zzk(zzgye.zzw(this.zzb.zza()), new zzgpr() { // from class: com.google.android.gms.internal.ads.zzghh
            @Override // com.google.android.gms.internal.ads.zzgpr
            public final /* synthetic */ Object apply(Object obj) {
                zzgcq zzgcqVar = (zzgcq) obj;
                this.zza.zzd(zzgcqVar);
                return zzgcqVar;
            }
        }, zzgzd.zza()), new zzgxu() { // from class: com.google.android.gms.internal.ads.zzghi
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zze((zzgcq) obj);
            }
        }, zzgzd.zza()), zzghj.zza, zzgzd.zza()), zzghc.class, zzghk.zza, zzgzd.zza()), zzghd.class, zzghl.zza, zzgzd.zza()), zzghb.class, new zzgpr() { // from class: com.google.android.gms.internal.ads.zzghm
            @Override // com.google.android.gms.internal.ads.zzgpr
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzf(i2, (zzghb) obj);
            }
        }, zzgzd.zza());
        this.zzd.zze(1002, zzgyeVar);
        return zzgyeVar;
    }

    public final void zza(long j) {
        if (j > 0) {
            this.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgho
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb();
                }
            }, j);
        } else {
            zzb();
        }
    }

    public final ListenableFuture zzb() {
        zzgye zzgyeVar = (zzgye) zzgym.zzg(zzgye.zzw(this.zzc.zzb()), Throwable.class, zzghf.zza, zzgzd.zza());
        final zzgls zzglsVar = this.zza;
        Objects.requireNonNull(zzglsVar);
        return (zzgye) zzgym.zzj((zzgye) zzgym.zzk(zzgyeVar, new zzgpr() { // from class: com.google.android.gms.internal.ads.zzghe
            @Override // com.google.android.gms.internal.ads.zzgpr
            public final /* synthetic */ Object apply(Object obj) {
                return new Boolean(zzglsVar.zza((zzgcs) obj));
            }
        }, zzgzd.zza()), new zzgxu() { // from class: com.google.android.gms.internal.ads.zzghg
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc((Boolean) obj);
            }
        }, zzgzd.zza());
    }

    public final /* synthetic */ ListenableFuture zzc(Boolean bool) {
        if (bool.booleanValue()) {
            return zzh(0);
        }
        this.zzd.zzb(1003);
        return zzgym.zza(zzghp.RESULT_NOOP_LOCAL_PROGRAM_STILL_VALID);
    }

    public final /* synthetic */ zzgcq zzd(zzgcq zzgcqVar) {
        int iZzj = zzgcqVar.zzj() - 1;
        if (iZzj == 1 || iZzj == 2) {
            return zzgcqVar;
        }
        if (iZzj == 3) {
            zzgnc zzgncVar = this.zzd;
            int iZzj2 = zzgcqVar.zzj() - 1;
            StringBuilder sb = new StringBuilder(String.valueOf(iZzj2).length());
            sb.append(iZzj2);
            zzgncVar.zzc(1004, sb.toString());
            throw new zzghd(zzgcqVar.zzj() - 1);
        }
        if (iZzj != 12) {
            zzgnc zzgncVar2 = this.zzd;
            int iZzj3 = zzgcqVar.zzj() - 1;
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj3).length());
            sb2.append(iZzj3);
            zzgncVar2.zzc(1005, sb2.toString());
            throw new zzghc(zzgcqVar.zzj() - 1);
        }
        zzgnc zzgncVar3 = this.zzd;
        int iZzj4 = zzgcqVar.zzj() - 1;
        StringBuilder sb3 = new StringBuilder(String.valueOf(iZzj4).length());
        sb3.append(iZzj4);
        zzgncVar3.zzc(1005, sb3.toString());
        throw new zzghb(zzgcqVar.zzj() - 1);
    }

    public final /* synthetic */ ListenableFuture zze(zzgcq zzgcqVar) {
        if (zzgcqVar.zzj() == 2) {
            return this.zzc.zzd(zzgcqVar.zza(), zzgcqVar.zzb().zzy());
        }
        if (zzgcqVar.zzj() == 3) {
            return this.zzc.zzc(zzgcqVar.zza(), zzgcqVar.zzc().zzy(), zzgcqVar.zzb().zzy());
        }
        throw new AssertionError("Unreachable");
    }

    public final /* synthetic */ zzghp zzf(final int i2, zzghb zzghbVar) {
        if (this.zzf && i2 < this.zzg) {
            this.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzghn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzg(i2);
                }
            }, this.zzh * ((long) Math.pow(2.0d, i2)));
        }
        return zzghp.RESULT_FAILURE_FETCHER_HTTP_RUNTIME_EXCEPTION;
    }

    public final /* synthetic */ void zzg(int i2) {
        zzh(i2 + 1);
    }
}
