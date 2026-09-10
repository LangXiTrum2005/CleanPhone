package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
final class zzgjl implements zzgje {
    private final Context zza;
    private final zzija zzb;
    private final zzgjv zzc;
    private final zzgnc zzd;
    private final ExecutorService zze;
    private final zzgic zzf;
    private final zzfuf zzg;

    public zzgjl(Context context, zzija zzijaVar, zzgjv zzgjvVar, zzgnc zzgncVar, ExecutorService executorService, zzgic zzgicVar, zzfuf zzfufVar) {
        this.zza = context;
        this.zzb = zzijaVar;
        this.zzc = zzgjvVar;
        this.zzd = zzgncVar;
        this.zze = executorService;
        this.zzf = zzgicVar;
        this.zzg = zzfufVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgcq zzf(int i2) {
        zzgcp zzgcpVarZzd = zzgcq.zzd();
        zzgcpVarZzd.zze(i2);
        return (zzgcq) zzgcpVarZzd.zzbu();
    }

    @Override // com.google.android.gms.internal.ads.zzgje
    public final ListenableFuture zza() {
        final zzija zzijaVar = this.zzb;
        Objects.requireNonNull(zzijaVar);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzgjg
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzijaVar.zzb();
            }
        };
        ExecutorService executorService = this.zze;
        zzgye zzgyeVar = (zzgye) zzgym.zzg((zzgye) zzgym.zzk((zzgye) zzgym.zzj((zzgye) zzgym.zzk(zzgye.zzw(zzgym.zzd(callable, executorService)), new zzgpr() { // from class: com.google.android.gms.internal.ads.zzgjk
            @Override // com.google.android.gms.internal.ads.zzgpr
            public final /* synthetic */ Object apply(Object obj) {
                this.zza.zzb((zzbbq) obj);
                return new Integer(0);
            }
        }, zzgzd.zza()), new zzgxu() { // from class: com.google.android.gms.internal.ads.zzgjh
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc((Integer) obj);
            }
        }, zzgzd.zza()), new zzgpr() { // from class: com.google.android.gms.internal.ads.zzgji
            @Override // com.google.android.gms.internal.ads.zzgpr
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzd((zzgcs) obj);
            }
        }, executorService), zzgjf.class, zzgjj.zza, zzgzd.zza());
        this.zzd.zze(15202, zzgyeVar);
        return zzgyeVar;
    }

    public final /* synthetic */ int zzb(zzbbq zzbbqVar) {
        if (zzfvc.zza(zzbbqVar)) {
            return 0;
        }
        this.zzd.zzc(15204, zzbbqVar.name());
        throw new zzgjf(null);
    }

    public final /* synthetic */ ListenableFuture zzc(Integer num) {
        return this.zzc.zzb();
    }

    public final /* synthetic */ zzgcq zzd(zzgcs zzgcsVar) {
        String strZza = zzgcsVar.zza().zza();
        String strZzb = zzgcsVar.zza().zzb();
        zzgna zzgnaVarZza = this.zzd.zza(15203);
        try {
            zzgnaVarZza.zza();
            zzfvt zzfvtVarZza = zzfuo.zza(this.zza, 1, (zzbbq) this.zzb.zzb(), strZza, strZzb, "1", this.zzg);
            zzgnaVarZza.zzc();
            int i2 = 2;
            if (zzfvtVarZza.zzc == 2) {
                this.zzd.zzb(15208);
                return zzf(4);
            }
            byte[] bArr = zzfvtVarZza.zzb;
            if (bArr == null || bArr.length == 0) {
                this.zzd.zzb(IronSourceConstants.errorCode_destroy);
                return zzf(8);
            }
            try {
                zzbbs zzbbsVarZze = zzbbs.zze(bArr, zziab.zzb());
                if (zzbbsVarZze.zza().zza().isEmpty() || zzbbsVarZze.zza().zzb().isEmpty() || zzbbsVarZze.zzc().zzy().length == 0) {
                    this.zzd.zzb(15207);
                } else {
                    if (zzgcsVar.equals(zzgcs.zzg()) || !TextUtils.equals(zzgcsVar.zza().zza(), zzbbsVarZze.zza().zza()) || !TextUtils.equals(zzgcsVar.zza().zzb(), zzbbsVarZze.zza().zzb())) {
                        int i3 = zzfvtVarZza.zzc;
                        if (i3 == 4) {
                            if (!this.zzf.zza(zzbbsVarZze.zzb().zzy())) {
                                this.zzd.zzb(15206);
                                return zzf(12);
                            }
                            i3 = 4;
                        }
                        zzgcp zzgcpVarZzd = zzgcq.zzd();
                        if (i3 == 2) {
                            i2 = 4;
                        } else if (i3 != 3) {
                            if (i3 != 4) {
                                i2 = i3 != 6 ? 1 : 5;
                            } else {
                                i2 = 3;
                            }
                        }
                        zzgcpVarZzd.zze(i2);
                        zzgcr zzgcrVarZze = zzgcs.zze();
                        zzgcrVarZze.zza(zzbbsVarZze.zza());
                        zzgcrVarZze.zzc((zzbbq) this.zzb.zzb());
                        zzgcpVarZzd.zza((zzgcs) zzgcrVarZze.zzbu());
                        zzgcpVarZzd.zzd(zzbbsVarZze.zzb());
                        zzgcpVarZzd.zzc(zzbbsVarZze.zzc());
                        return (zzgcq) zzgcpVarZzd.zzbu();
                    }
                    this.zzd.zzb(15209);
                }
                return zzf(11);
            } catch (zzibg e2) {
                this.zzd.zzd(15205, e2);
                return zzf(9);
            } catch (NullPointerException unused) {
                this.zzd.zzb(15210);
                return zzf(10);
            }
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
}
