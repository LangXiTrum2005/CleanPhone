package x4;

import a5.m;
import android.content.Context;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ g f53623a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wj.j f53624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f53625c;

    static {
        d0.f44761a.b(h.class).g();
        f53624b = r9.b.u(f.f53622e);
        f53625c = a.f53604a;
    }

    public static b a(Context context) {
        n.f(context, "context");
        y4.a aVar = (y4.a) f53624b.getValue();
        if (aVar == null) {
            m mVar = m.f3405c;
            if (m.f3405c == null) {
                ReentrantLock reentrantLock = m.f3406d;
                reentrantLock.lock();
                try {
                    if (m.f3405c == null) {
                        a5.k kVar = null;
                        try {
                            u4.h hVarB = a5.i.b();
                            if (hVarB != null) {
                                u4.h other = u4.h.f51895f;
                                n.f(other, "other");
                                Object value = hVarB.f51900e.getValue();
                                n.e(value, "<get-bigInteger>(...)");
                                Object value2 = other.f51900e.getValue();
                                n.e(value2, "<get-bigInteger>(...)");
                                if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                    a5.k kVar2 = new a5.k(context);
                                    if (kVar2.e()) {
                                        kVar = kVar2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        m.f3405c = new m(kVar);
                    }
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            aVar = m.f3405c;
            n.c(aVar);
        }
        int i10 = l.f53631b;
        b bVar = new b(aVar);
        f53625c.getClass();
        return bVar;
    }
}
