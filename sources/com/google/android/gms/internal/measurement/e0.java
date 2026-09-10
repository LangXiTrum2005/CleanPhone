package com.google.android.gms.internal.measurement;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final co.c f23403b = new co.c(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23404a;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i10 = this.f23404a;
        if (i10 <= 0) {
            throw new AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
        }
        this.f23404a = i10 - 1;
    }
}
