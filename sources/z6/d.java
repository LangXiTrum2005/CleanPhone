package z6;

import a7.h;
import e6.f;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f54653b;

    public d(Object obj) {
        h.c(obj, "Argument must not be null");
        this.f54653b = obj;
    }

    @Override // e6.f
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(this.f54653b.toString().getBytes(f.f39142a));
    }

    @Override // e6.f
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f54653b.equals(((d) obj).f54653b);
        }
        return false;
    }

    @Override // e6.f
    public final int hashCode() {
        return this.f54653b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f54653b + '}';
    }
}
