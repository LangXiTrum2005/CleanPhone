package wa;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class r extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f53120b;

    public r(int i10, h hVar) {
        this.f53119a = i10;
        this.f53120b = hVar;
    }

    public static v6.c b() {
        v6.c cVar = new v6.c();
        cVar.f52487a = null;
        cVar.f52488b = h.f53060s;
        return cVar;
    }

    @Override // va.i
    public final boolean a() {
        return this.f53120b != h.f53060s;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return rVar.f53119a == this.f53119a && rVar.f53120b == this.f53120b;
    }

    public final int hashCode() {
        return Objects.hash(r.class, Integer.valueOf(this.f53119a), this.f53120b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb2.append(this.f53120b);
        sb2.append(", ");
        return l1.d.i(sb2, this.f53119a, "-byte key)");
    }
}
