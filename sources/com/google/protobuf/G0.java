package com.google.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends e0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ByteBuffer f24841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f24842f;

    public g0(ByteBuffer byteBuffer) {
        super(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
        this.f24841e = byteBuffer;
        this.f24842f = byteBuffer.position();
    }

    @Override // com.google.protobuf.e0, com.google.protobuf.CodedOutputStream
    public final void flush() {
        this.f24841e.position(getTotalBytesWritten() + this.f24842f);
    }
}
