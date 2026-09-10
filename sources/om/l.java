package om;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class l implements o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f47581d = an.h.R0(l.class.getCanonicalName(), ".", "");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f47582e = new b("NO_LOCKS", a.f47564a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f47583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f47584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47585c;

    public l(String str) {
        this(str, new od.c(new ReentrantLock(), 25));
    }

    public static void e(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i10 = 0;
        while (i10 < length) {
            if (!stackTrace[i10].getClassName().startsWith(f47581d)) {
                List listSubList = Arrays.asList(stackTrace).subList(i10, length);
                assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
            }
            i10++;
        }
        i10 = -1;
        List listSubList2 = Arrays.asList(stackTrace).subList(i10, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList2.toArray(new StackTraceElement[listSubList2.size()]));
    }

    public final i a(jk.a aVar) {
        return new i(this, aVar);
    }

    public final e b(jk.b bVar) {
        return new e(this, new ConcurrentHashMap(3, 1.0f, 2), bVar, 1);
    }

    public final j c(jk.b bVar) {
        return new j(this, new ConcurrentHashMap(3, 1.0f, 2), bVar);
    }

    public bc.i d(Object obj, String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder("Recursion detected ");
        sb2.append(str);
        if (obj == null) {
            str2 = "";
        } else {
            str2 = "on input: " + obj;
        }
        sb2.append(str2);
        sb2.append(" under ");
        sb2.append(this);
        AssertionError assertionError = new AssertionError(sb2.toString());
        e(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(" (");
        return defpackage.e.q(this.f47585c, ")", sb2);
    }

    public l(String str, n nVar) {
        a aVar = a.f47565b;
        this.f47583a = nVar;
        this.f47584b = aVar;
        this.f47585c = str;
    }
}
