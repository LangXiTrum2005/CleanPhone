package ads_mobile_sdk;

import java.io.InputStream;
import saneness.autoboat;

/* JADX INFO: loaded from: classes.dex */
public abstract class hr {
    public int a;
    public int b;
    public ir c;

    public static long a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public abstract int a();

    public abstract void a(int i);

    public abstract boolean b();

    public abstract void c(int i);

    public abstract boolean c();

    public abstract int d(int i);

    public abstract in d();

    public abstract double e();

    public abstract boolean e(int i);

    public abstract int f();

    public abstract int g();

    public abstract long h();

    public abstract float i();

    public abstract int j();

    public abstract long k();

    public abstract int l();

    public abstract long m();

    public abstract int n();

    public abstract long o();

    public abstract String p();

    public abstract String q();

    public abstract int r();

    public abstract int s();

    public abstract long t();

    public final void u() throws x81 {
        boolean zE;
        do {
            int iR = r();
            if (iR == 0) {
                return;
            }
            int i = this.a;
            int i2 = this.b;
            if (i + i2 >= 100) {
                throw new x81("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.b = i2 + 1;
            zE = e(iR);
            this.b--;
        } while (zE);
    }

    public static hr a(InputStream inputStream) {
        if (inputStream != null) {
            return new gr(inputStream);
        }
        autoboat autoboatVar = new autoboat(r21.a, 0, 0, false);
        try {
            autoboatVar.d(0);
            return autoboatVar;
        } catch (x81 e) {
            throw new IllegalArgumentException(e);
        }
    }
}
