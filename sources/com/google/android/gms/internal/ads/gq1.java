package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class gq1 implements hf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj1 f14932a;

    public gq1(dj1 dj1Var) {
        this.f14932a = dj1Var;
    }

    @Override // com.google.android.gms.internal.ads.hf1
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Iterator it = this.f14932a.a(bArr).iterator();
        while (it.hasNext()) {
            try {
                ((hq1) it.next()).f15365a.a(bArr, bArr2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid signature");
    }
}
