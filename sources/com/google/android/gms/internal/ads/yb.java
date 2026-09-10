package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yb extends yw1 {
    static {
        zw1.j(yb.class);
    }

    public yb(s10 s10Var, xb xbVar) {
        ByteBuffer byteBuffer = s10Var.f19758a;
        long jLimit = byteBuffer.limit();
        this.f22386b = s10Var;
        this.f22388d = s10Var.d();
        byteBuffer.position((int) (s10Var.d() + jLimit));
        this.f22389e = s10Var.d();
        this.f22385a = xbVar;
    }

    @Override // com.google.android.gms.internal.ads.yw1
    public final String toString() {
        String string = this.f22386b.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 7);
        sb2.append("model(");
        sb2.append(string);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.yw1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
