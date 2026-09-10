package bb;

import ea.f2;
import java.util.Objects;
import va.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f5525b;

    public e(int i10, d dVar) {
        this.f5524a = i10;
        this.f5525b = dVar;
    }

    public static f2 b() {
        f2 f2Var = new f2(6, false);
        f2Var.f39409b = null;
        f2Var.f39410c = d.f5522d;
        return f2Var;
    }

    @Override // va.i
    public final boolean a() {
        return this.f5525b != d.f5522d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.f5524a == this.f5524a && eVar.f5525b == this.f5525b;
    }

    public final int hashCode() {
        return Objects.hash(e.class, Integer.valueOf(this.f5524a), this.f5525b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AesSiv Parameters (variant: ");
        sb2.append(this.f5525b);
        sb2.append(", ");
        return l1.d.i(sb2, this.f5524a, "-byte key)");
    }
}
