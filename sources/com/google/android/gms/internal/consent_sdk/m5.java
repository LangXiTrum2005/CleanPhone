package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m5 extends n5 {
    @Override // com.google.android.gms.internal.consent_sdk.n5
    public final byte b(int i10) {
        if (((47 - (i10 + 1)) | i10) >= 0) {
            return this.f23114b[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(l1.d.e(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(defpackage.e.h(i10, "Index > length: ", ", 47"));
    }

    @Override // com.google.android.gms.internal.consent_sdk.n5
    public final byte h(int i10) {
        return this.f23114b[i10];
    }

    @Override // com.google.android.gms.internal.consent_sdk.n5
    public final int m() {
        return 47;
    }
}
