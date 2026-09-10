package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f4532a = new LinkedHashMap();

    public final void a() {
        for (x0 x0Var : this.f4532a.values()) {
            x0Var.f4618c = true;
            HashMap map = x0Var.f4616a;
            if (map != null) {
                synchronized (map) {
                    try {
                        Iterator it = x0Var.f4616a.values().iterator();
                        while (it.hasNext()) {
                            x0.a(it.next());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            LinkedHashSet linkedHashSet = x0Var.f4617b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        Iterator it2 = x0Var.f4617b.iterator();
                        while (it2.hasNext()) {
                            x0.a((Closeable) it2.next());
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                x0Var.f4617b.clear();
            }
            x0Var.b();
        }
        this.f4532a.clear();
    }
}
