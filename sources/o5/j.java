package o5;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends h {
    public final boolean h(Object obj) {
        if (obj == null) {
            obj = h.f47200g;
        }
        if (!h.f47199f.f(this, null, obj)) {
            return false;
        }
        h.b(this);
        return true;
    }

    public final boolean i(Throwable th2) {
        if (!h.f47199f.f(this, null, new b(th2))) {
            return false;
        }
        h.b(this);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public final boolean j(ListenableFuture listenableFuture) {
        b bVar;
        listenableFuture.getClass();
        Object obj = this.f47201a;
        if (obj != null) {
            if (obj instanceof a) {
                listenableFuture.cancel(((a) obj).f47179a);
            }
        } else if (listenableFuture.isDone()) {
            if (h.f47199f.f(this, null, h.e(listenableFuture))) {
                h.b(this);
                return true;
            }
        } else {
            e eVar = new e(this, listenableFuture);
            if (h.f47199f.f(this, null, eVar)) {
                try {
                    listenableFuture.addListener(eVar, i.f47204a);
                    return true;
                } catch (Throwable th2) {
                    try {
                        bVar = new b(th2);
                    } catch (Throwable unused) {
                        bVar = b.f47181b;
                    }
                    h.f47199f.f(this, eVar, bVar);
                    return true;
                }
            }
            obj = this.f47201a;
            if (obj instanceof a) {
                listenableFuture.cancel(((a) obj).f47179a);
            }
        }
        return false;
    }
}
