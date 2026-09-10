package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
final class zzgxq extends zzgxp {
    private static final AtomicReferenceFieldUpdater zza = AtomicReferenceFieldUpdater.newUpdater(zzgxs.class, Set.class, "seenExceptionsField");
    private static final AtomicIntegerFieldUpdater zzb = AtomicIntegerFieldUpdater.newUpdater(zzgxs.class, "remainingField");

    private zzgxq() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final void zza(zzgxs zzgxsVar, Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zza;
        while (!atomicReferenceFieldUpdater.compareAndSet(zzgxsVar, null, set2) && atomicReferenceFieldUpdater.get(zzgxsVar) == null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final int zzb(zzgxs zzgxsVar) {
        return zzb.decrementAndGet(zzgxsVar);
    }

    public /* synthetic */ zzgxq(byte[] bArr) {
        super(null);
    }
}
