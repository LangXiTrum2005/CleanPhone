package com.smartdigimkt.z3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes6.dex */
public class h extends f {
    private final g<?, h, ?> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ByteBuffer f40364e;

    public h(g<?, h, ?> gVar) {
        this.d = gVar;
    }

    public ByteBuffer a(long j, int i2) {
        this.f40355b = j;
        ByteBuffer byteBuffer = this.f40364e;
        if (byteBuffer == null || byteBuffer.capacity() < i2) {
            this.f40364e = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        }
        this.f40364e.position(0);
        this.f40364e.limit(i2);
        return this.f40364e;
    }

    @Override // com.smartdigimkt.z3.f
    public void e() {
        this.d.a(this);
    }

    @Override // com.smartdigimkt.z3.a
    public void a() {
        super.a();
        ByteBuffer byteBuffer = this.f40364e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }
}
