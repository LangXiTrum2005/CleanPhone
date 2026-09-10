package com.smartdigimkt.y3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes6.dex */
public interface f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f40052a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class a extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        public a(int i2, int i3, int i4) {
            StringBuilder sbP = androidx.datastore.preferences.protobuf.a.p(i2, i3, "Unhandled format: ", " Hz, ", " channels in encoding ");
            sbP.append(i4);
            super(sbP.toString());
        }
    }

    void a(ByteBuffer byteBuffer);

    boolean a();

    boolean a(int i2, int i3, int i4) throws a;

    void c();

    ByteBuffer d();

    void e();

    boolean f();

    void flush();

    int g();

    int h();

    int i();
}
