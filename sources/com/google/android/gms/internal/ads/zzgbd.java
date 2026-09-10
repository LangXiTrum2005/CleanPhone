package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgbd implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzgbd(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzgbd zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzgbd(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        ExecutorService executorService = (ExecutorService) this.zza.zzb();
        zzgad zzgadVar = (zzgad) this.zzb.zzb();
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MODEL;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length() + 1);
        androidx.media3.extractor.text.ttml.a.C(sb, "Mozilla/5.0 (Linux; Android ", str, "; ", str2);
        sb.append(")");
        return new zzgbi(executorService, sb.toString(), zzgadVar.zzl());
    }
}
