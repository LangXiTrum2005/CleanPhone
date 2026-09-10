package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
final class zzgkb implements zzgjw {
    private final zzgbr zza;
    private final zzgbr zzb;
    private final zzgbr zzc;
    private final zzgbr zzd;
    private final zzija zze;
    private final zzija zzf;
    private final File zzg;
    private final ExecutorService zzh;
    private final zzgnc zzi;

    public zzgkb(zzgbr zzgbrVar, zzgbr zzgbrVar2, zzija zzijaVar, zzgbr zzgbrVar3, zzgbr zzgbrVar4, zzija zzijaVar2, File file, ExecutorService executorService, zzgnc zzgncVar) {
        this.zza = zzgbrVar;
        this.zzc = zzgbrVar2;
        this.zze = zzijaVar;
        this.zzb = zzgbrVar3;
        this.zzd = zzgbrVar4;
        this.zzf = zzijaVar2;
        this.zzg = file;
        this.zzh = executorService;
        this.zzi = zzgncVar;
    }

    private final ListenableFuture zzj(byte[] bArr) {
        ListenableFuture listenableFutureZzc = this.zzd.zzc(bArr);
        this.zzi.zze(15305, listenableFutureZzc);
        return listenableFutureZzc;
    }

    private final ListenableFuture zzk(zzgcs zzgcsVar) {
        ListenableFuture listenableFutureZzc = this.zzb.zzc(zzgcsVar);
        this.zzi.zze(15303, listenableFutureZzc);
        return listenableFutureZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final ListenableFuture zza() {
        return zzgym.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgka
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new Boolean(this.zza.zzf());
            }
        }, this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final ListenableFuture zzb() {
        ListenableFuture listenableFutureZzb = this.zza.zzb();
        this.zzi.zze(15302, listenableFutureZzb);
        return listenableFutureZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final ListenableFuture zzc(final zzgcs zzgcsVar, byte[] bArr, byte[] bArr2) {
        ListenableFuture listenableFutureZzc = ((zzgbr) this.zzf.zzb()).zzc(bArr);
        this.zzi.zze(15307, listenableFutureZzc);
        return (zzgye) zzgym.zzj(zzgye.zzw(zzgym.zzl(listenableFutureZzc, zzj(bArr2))), new zzgxu() { // from class: com.google.android.gms.internal.ads.zzgjz
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzi(zzgcsVar, (List) obj);
            }
        }, zzgzd.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final ListenableFuture zzd(final zzgcs zzgcsVar, byte[] bArr) {
        return (zzgye) zzgym.zzj(zzgye.zzw(zzj(bArr)), new zzgxu() { // from class: com.google.android.gms.internal.ads.zzgjy
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzh(zzgcsVar, (Void) obj);
            }
        }, zzgzd.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgjw
    public final ListenableFuture zze() {
        zzgye zzgyeVar = (zzgye) zzgym.zzk(zzgye.zzw(this.zza.zzb()), new zzgpr() { // from class: com.google.android.gms.internal.ads.zzgjx
            @Override // com.google.android.gms.internal.ads.zzgpr
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzg((zzgcs) obj);
            }
        }, zzgzd.zza());
        this.zzi.zze(15314, zzgyeVar);
        return zzgyeVar;
    }

    public final /* synthetic */ boolean zzf() {
        zzgbr zzgbrVar;
        try {
            zzgbr zzgbrVar2 = this.zzb;
            File fileZza = zzgbrVar2.zza();
            if (!fileZza.exists()) {
                zzgbrVar2.zza().delete();
                ((zzgbr) this.zzf.zzb()).zza().delete();
                this.zzd.zza().delete();
                return false;
            }
            File fileZza2 = ((zzgbr) this.zzf.zzb()).zza();
            File fileZza3 = ((zzgbr) this.zze.zzb()).zza();
            try {
                if (fileZza2.exists()) {
                    File parentFile = fileZza3.getParentFile();
                    if (parentFile != null) {
                        zzfvq.zze(parentFile);
                    }
                    zzgwk.zzb(fileZza3);
                    zzgwk.zzc(fileZza2, fileZza3);
                }
                File fileZza4 = this.zzd.zza();
                File fileZza5 = this.zzc.zza();
                try {
                    if (fileZza4.exists()) {
                        zzgwk.zzb(fileZza5);
                        zzgwk.zzc(fileZza4, fileZza5);
                    }
                    File fileZza6 = this.zza.zza();
                    try {
                        if (fileZza.exists()) {
                            zzgwk.zzb(fileZza6);
                            zzgwk.zzc(fileZza, fileZza6);
                        }
                        this.zzb.zza().delete();
                        ((zzgbr) this.zzf.zzb()).zza().delete();
                        this.zzd.zza().delete();
                        return true;
                    } catch (IOException | SecurityException e2) {
                        this.zzi.zzd(15313, e2);
                        zzgbrVar = this.zzb;
                        zzgbrVar.zza().delete();
                        ((zzgbr) this.zzf.zzb()).zza().delete();
                        this.zzd.zza().delete();
                        return false;
                    }
                } catch (IOException | SecurityException e3) {
                    this.zzi.zzd(15312, e3);
                    zzgbrVar = this.zzb;
                }
            } catch (IOException e4) {
                e = e4;
                this.zzi.zzd(15311, e);
                zzgbrVar = this.zzb;
                zzgbrVar.zza().delete();
                ((zzgbr) this.zzf.zzb()).zza().delete();
                this.zzd.zza().delete();
                return false;
            } catch (SecurityException e5) {
                e = e5;
                this.zzi.zzd(15311, e);
                zzgbrVar = this.zzb;
                zzgbrVar.zza().delete();
                ((zzgbr) this.zzf.zzb()).zza().delete();
                this.zzd.zza().delete();
                return false;
            }
        } catch (Throwable th) {
            this.zzb.zza().delete();
            ((zzgbr) this.zzf.zzb()).zza().delete();
            this.zzd.zza().delete();
            throw th;
        }
    }

    public final /* synthetic */ zzfvo zzg(zzgcs zzgcsVar) {
        if (zzgcsVar == null || zzgcsVar.equals(zzgcs.zzg())) {
            return null;
        }
        zzbby zzbbyVarZza = zzgcsVar.zza();
        File fileZza = ((zzgbr) this.zze.zzb()).zza();
        zzgbr zzgbrVar = this.zzc;
        return new zzfvo(zzbbyVarZza, fileZza, zzgbrVar.zza(), this.zzg);
    }

    public final /* synthetic */ ListenableFuture zzh(zzgcs zzgcsVar, Void r2) {
        return zzk(zzgcsVar);
    }

    public final /* synthetic */ ListenableFuture zzi(zzgcs zzgcsVar, List list) {
        return zzk(zzgcsVar);
    }
}
