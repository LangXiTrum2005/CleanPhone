package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
final class zzglc implements zzgjw {
    private final zzgib zza;
    private final ExecutorService zzb;
    private final zzgnc zzc;

    public zzglc(zzgib zzgibVar, ExecutorService executorService, zzgnc zzgncVar) {
        this.zza = zzgibVar;
        this.zzb = executorService;
        this.zzc = zzgncVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final ListenableFuture zza() {
        return zzgym.zza(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final ListenableFuture zzb() {
        ListenableFuture listenableFutureZzd = zzgym.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzglb
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzf();
            }
        }, this.zzb);
        this.zzc.zze(15302, listenableFutureZzd);
        return listenableFutureZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final ListenableFuture zzc(final zzgcs zzgcsVar, final byte[] bArr, final byte[] bArr2) {
        ListenableFuture listenableFutureZzd = zzgym.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgla
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.zza.zzi(zzgcsVar, bArr, bArr2);
                return null;
            }
        }, this.zzb);
        this.zzc.zze(15321, listenableFutureZzd);
        return listenableFutureZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final ListenableFuture zzd(final zzgcs zzgcsVar, final byte[] bArr) {
        ListenableFuture listenableFutureZzd = zzgym.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgkz
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.zza.zzh(zzgcsVar, bArr);
                return null;
            }
        }, this.zzb);
        this.zzc.zze(15305, listenableFutureZzd);
        return listenableFutureZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgjw
    public final ListenableFuture zze() {
        ListenableFuture listenableFutureZzd = zzgym.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgky
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzg();
            }
        }, this.zzb);
        this.zzc.zze(15314, listenableFutureZzd);
        return listenableFutureZzd;
    }

    public final /* synthetic */ zzgcs zzf() {
        zzgcs zzgcsVarZzc = this.zza.zzc(1);
        return zzgcsVarZzc == null ? zzgcs.zzg() : zzgcsVarZzc;
    }

    public final /* synthetic */ zzfvo zzg() {
        return this.zza.zzb(1);
    }

    public final /* synthetic */ Void zzh(zzgcs zzgcsVar, byte[] bArr) {
        this.zza.zza(zzgcsVar, null, bArr);
        return null;
    }

    public final /* synthetic */ Void zzi(zzgcs zzgcsVar, byte[] bArr, byte[] bArr2) {
        this.zza.zza(zzgcsVar, bArr, bArr2);
        return null;
    }
}
