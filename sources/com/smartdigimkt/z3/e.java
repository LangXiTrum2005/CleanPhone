package com.smartdigimkt.z3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public class e extends com.smartdigimkt.z3.a {
    public static final int f = 0;
    public static final int g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f40351h = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f40352b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer f40353c;
    public long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f40354e;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public e(int i2) {
        this.f40354e = i2;
    }

    public static e h() {
        return new e(0);
    }

    @Override // com.smartdigimkt.z3.a
    public void a() {
        super.a();
        ByteBuffer byteBuffer = this.f40353c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final void e() {
        this.f40353c.flip();
    }

    public void f(int i2) throws IllegalStateException {
        ByteBuffer byteBuffer = this.f40353c;
        if (byteBuffer == null) {
            this.f40353c = e(i2);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = this.f40353c.position();
        int i3 = i2 + iPosition;
        if (iCapacity >= i3) {
            return;
        }
        ByteBuffer byteBufferE = e(i3);
        if (iPosition > 0) {
            this.f40353c.position(0);
            this.f40353c.limit(iPosition);
            byteBufferE.put(this.f40353c);
        }
        this.f40353c = byteBufferE;
    }

    public final boolean g() {
        return this.f40353c == null && this.f40354e == 0;
    }

    private ByteBuffer e(int i2) {
        int i3 = this.f40354e;
        if (i3 == 1) {
            return ByteBuffer.allocate(i2);
        }
        if (i3 == 2) {
            return ByteBuffer.allocateDirect(i2);
        }
        ByteBuffer byteBuffer = this.f40353c;
        throw new IllegalStateException(androidx.datastore.preferences.protobuf.a.e(byteBuffer == null ? 0 : byteBuffer.capacity(), i2, "Buffer too small (", " < ", ")"));
    }

    public final boolean f() {
        return c(1073741824);
    }
}
