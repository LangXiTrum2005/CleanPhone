package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s10 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f19758a;

    public s10(ByteBuffer byteBuffer) {
        this.f19758a = byteBuffer.duplicate();
    }

    public final int a(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.f19758a;
        if (byteBuffer2.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer2.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    public final long d() {
        return this.f19758a.position();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
