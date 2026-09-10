package v7;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.n;
import l7.m0;
import l7.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f52494a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f52495b;

    public static final void a(Object o6, Throwable th2) {
        n.f(o6, "o");
        if (f52495b) {
            f52494a.add(o6);
            s sVar = s.f45212a;
            if (m0.c()) {
                a.a.n(th2);
                android.support.v4.media.session.a.b(th2, s7.a.f50199e).b();
            }
        }
    }

    public static final boolean b(Object o6) {
        n.f(o6, "o");
        return f52494a.contains(o6);
    }
}
