package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
final class zzgak implements zzgaa {
    private ExecutorService zza;
    private Context zzb;
    private zzgad zzc;

    private zzgak() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgaa
    public final zzgab zza() {
        zzijo.zzc(this.zza, ExecutorService.class);
        zzijo.zzc(this.zzb, Context.class);
        zzijo.zzc(this.zzc, zzgad.class);
        return new zzgaj(new zzggi(), new zzggk(), new zzggm(), this.zza, this.zzb, this.zzc);
    }

    public final zzgak zzb(ExecutorService executorService) {
        executorService.getClass();
        this.zza = executorService;
        return this;
    }

    public final zzgak zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    public final zzgak zzd(zzgad zzgadVar) {
        zzgadVar.getClass();
        this.zzc = zzgadVar;
        return this;
    }

    public /* synthetic */ zzgak(byte[] bArr) {
    }
}
