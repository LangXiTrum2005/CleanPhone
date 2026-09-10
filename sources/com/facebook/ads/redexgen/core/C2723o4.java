package com.facebook.ads.redexgen.core;

import android.database.Cursor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.o4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2723o4 implements InterfaceC1266Bo {
    public final Cursor A00;

    public final /* synthetic */ boolean A01() {
        return AbstractC1265Bn.A00(this);
    }

    public C2723o4(Cursor cursor) {
        this.A00 = cursor;
    }

    public final C1262Bk A00() {
        return C9w.A01(this.A00);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A00.close();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1266Bo
    public final int getPosition() {
        return this.A00.getPosition();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1266Bo
    public final boolean moveToPosition(int i2) {
        return this.A00.moveToPosition(i2);
    }
}
