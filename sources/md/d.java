package md;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f45960a;

    public d() {
        this.f45960a = null;
    }

    public final Object a() {
        Object obj = this.f45960a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean b() {
        return this.f45960a != null;
    }

    public d(Object obj) {
        if (obj != null) {
            this.f45960a = obj;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
}
