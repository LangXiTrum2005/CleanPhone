package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes4.dex */
final class zzfet implements zzgyj {
    public zzfet(zzfew zzfewVar) {
        Objects.requireNonNull(zzfewVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.util.zze.zza("Notification of cache hit failed.");
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final /* synthetic */ void zzb(@NullableDecl Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("Notification of cache hit successful.");
    }
}
