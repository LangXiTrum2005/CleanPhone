package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class zzgxr extends zzgxp {
    private zzgxr() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final void zza(zzgxs zzgxsVar, Set set, Set set2) {
        synchronized (zzgxsVar) {
            try {
                if (zzgxsVar.seenExceptionsField == null) {
                    zzgxsVar.seenExceptionsField = set2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public final int zzb(zzgxs zzgxsVar) {
        int i2;
        synchronized (zzgxsVar) {
            i2 = zzgxsVar.remainingField - 1;
            zzgxsVar.remainingField = i2;
        }
        return i2;
    }

    public /* synthetic */ zzgxr(byte[] bArr) {
        super(null);
    }
}
