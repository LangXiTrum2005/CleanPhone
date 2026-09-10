package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.qg;
import com.google.android.gms.internal.measurement.xh;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4131b;

    public m(xh xhVar, int i10) {
        if (xhVar == null) {
            throw new IllegalArgumentException("format options cannot be null");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(l1.d.k(new StringBuilder(String.valueOf(i10).length() + 15), "invalid index: ", i10));
        }
        this.f4130a = i10;
        this.f4131b = xhVar;
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static com.google.crypto.tink.shaded.protobuf.j f(byte[] bArr, int i10, int i11, boolean z10) {
        com.google.crypto.tink.shaded.protobuf.j jVar = new com.google.crypto.tink.shaded.protobuf.j(bArr, i10, i11, z10);
        try {
            jVar.h(i11);
            return jVar;
        } catch (com.google.crypto.tink.shaded.protobuf.d0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract long A();

    public abstract boolean B(int i10);

    public void C() {
        boolean zB;
        do {
            int iY = y();
            if (iY == 0) {
                return;
            }
            int i10 = this.f4130a;
            if (i10 >= 100) {
                throw new g0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f4130a = i10 + 1;
            zB = B(iY);
            this.f4130a--;
        } while (zB);
    }

    public abstract void D(qg qgVar, Object obj);

    public abstract void a(int i10);

    public abstract int d();

    public abstract boolean e();

    public abstract void g(int i10);

    public abstract int h(int i10);

    public abstract boolean i();

    public abstract i j();

    public abstract com.google.crypto.tink.shaded.protobuf.h k();

    public abstract double l();

    public abstract int m();

    public abstract int n();

    public abstract long o();

    public abstract float p();

    public abstract int q();

    public abstract long r();

    public abstract int s();

    public abstract long t();

    public abstract int u();

    public abstract long v();

    public abstract String w();

    public abstract String x();

    public abstract int y();

    public abstract int z();
}
