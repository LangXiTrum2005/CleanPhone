package com.smartdigimkt.y3;

import com.smartdigimkt.w3.v;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public interface h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f40061a = Long.MIN_VALUE;

    public static final class a extends Exception {
        public a(Throwable th) {
            super(th);
        }

        public a(String str) {
            super(str);
        }
    }

    public static final class b extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f40062a;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(int i2, int i3, int i4, int i5) {
            StringBuilder sbP = androidx.datastore.preferences.protobuf.a.p(i2, i3, "AudioTrack init failed: ", ", Config(", ", ");
            sbP.append(i4);
            sbP.append(", ");
            sbP.append(i5);
            sbP.append(")");
            super(sbP.toString());
            this.f40062a = i2;
        }
    }

    public interface c {
        void a();

        void a(int i2);

        void a(int i2, long j, long j2);
    }

    public static final class d extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f40063a;

        public d(int i2) {
            super(android.support.v4.media.a.h(i2, "AudioTrack write failed: "));
            this.f40063a = i2;
        }
    }

    long a(boolean z2);

    v a(v vVar);

    void a(float f);

    void a(int i2);

    void a(int i2, int i3, int i4, int i5, int[] iArr, int i6, int i7) throws a;

    void a(com.smartdigimkt.y3.b bVar);

    void a(c cVar);

    boolean a();

    boolean a(ByteBuffer byteBuffer, long j) throws b, d;

    v b();

    boolean b(int i2);

    void c();

    void c(int i2);

    void d() throws d;

    boolean e();

    void f();

    void g();

    void h();

    void pause();

    void release();
}
