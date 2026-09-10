package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzglh implements zzgle {
    private final zzgbr zza;
    private final zzgbr zzb;
    private final zzija zzc;
    private final zzgnc zzd;

    public zzglh(zzgbr zzgbrVar, zzgbr zzgbrVar2, zzija zzijaVar, zzgnc zzgncVar) {
        this.zza = zzgbrVar;
        this.zzb = zzgbrVar2;
        this.zzc = zzijaVar;
        this.zzd = zzgncVar;
    }

    private final ListenableFuture zzh(zzgcs zzgcsVar) {
        ListenableFuture listenableFutureZzc = this.zza.zzc(zzgcsVar);
        this.zzd.zze(20303, listenableFutureZzc);
        return listenableFutureZzc;
    }

    private final ListenableFuture zzi(byte[] bArr) {
        ListenableFuture listenableFutureZzc = this.zzb.zzc(bArr);
        this.zzd.zze(20305, listenableFutureZzc);
        return listenableFutureZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final ListenableFuture zza() {
        return zzgym.zza(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final ListenableFuture zzb() {
        ListenableFuture listenableFutureZzb = this.zza.zzb();
        this.zzd.zze(20302, listenableFutureZzb);
        return listenableFutureZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final ListenableFuture zzc(final zzgcs zzgcsVar, byte[] bArr, byte[] bArr2) {
        ListenableFuture listenableFutureZzc = ((zzgbr) this.zzc.zzb()).zzc(bArr);
        this.zzd.zze(20307, listenableFutureZzc);
        return (zzgye) zzgym.zzj(zzgye.zzw(zzgym.zzl(listenableFutureZzc, zzi(bArr2))), new zzgxu() { // from class: com.google.android.gms.internal.ads.zzglf
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzg(zzgcsVar, (List) obj);
            }
        }, zzgzd.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgjv
    public final ListenableFuture zzd(final zzgcs zzgcsVar, byte[] bArr) {
        return (zzgye) zzgym.zzj(zzgye.zzw(zzi(bArr)), new zzgxu() { // from class: com.google.android.gms.internal.ads.zzglg
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzf(zzgcsVar, (Void) obj);
            }
        }, zzgzd.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgle
    public final ListenableFuture zze() {
        ListenableFuture listenableFutureZzb = this.zzb.zzb();
        this.zzd.zze(20304, listenableFutureZzb);
        return listenableFutureZzb;
    }

    public final /* synthetic */ ListenableFuture zzf(zzgcs zzgcsVar, Void r2) {
        return zzh(zzgcsVar);
    }

    public final /* synthetic */ ListenableFuture zzg(zzgcs zzgcsVar, List list) {
        return zzh(zzgcsVar);
    }
}
