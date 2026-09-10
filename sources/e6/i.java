package e6;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a7.d f39148b = new a7.d(0);

    @Override // e6.f
    public final void b(MessageDigest messageDigest) {
        int i10 = 0;
        while (true) {
            a7.d dVar = this.f39148b;
            if (i10 >= dVar.f53506c) {
                return;
            }
            h hVar = (h) dVar.f(i10);
            Object objJ = this.f39148b.j(i10);
            g gVar = hVar.f39145b;
            if (hVar.f39147d == null) {
                hVar.f39147d = hVar.f39146c.getBytes(f.f39142a);
            }
            gVar.c(hVar.f39147d, objJ, messageDigest);
            i10++;
        }
    }

    public final Object c(h hVar) {
        a7.d dVar = this.f39148b;
        return dVar.containsKey(hVar) ? dVar.get(hVar) : hVar.f39144a;
    }

    @Override // e6.f
    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f39148b.equals(((i) obj).f39148b);
        }
        return false;
    }

    @Override // e6.f
    public final int hashCode() {
        return this.f39148b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f39148b + '}';
    }
}
