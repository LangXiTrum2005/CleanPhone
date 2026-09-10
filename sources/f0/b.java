package f0;

import android.graphics.Insets;
import d5.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f40257e = new b(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40261d;

    public b(int i10, int i11, int i12, int i13) {
        this.f40258a = i10;
        this.f40259b = i11;
        this.f40260c = i12;
        this.f40261d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f40258a, bVar2.f40258a), Math.max(bVar.f40259b, bVar2.f40259b), Math.max(bVar.f40260c, bVar2.f40260c), Math.max(bVar.f40261d, bVar2.f40261d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f40257e : new b(i10, i11, i12, i13);
    }

    public static b c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return Insets.of(this.f40258a, this.f40259b, this.f40260c, this.f40261d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f40261d == bVar.f40261d && this.f40258a == bVar.f40258a && this.f40260c == bVar.f40260c && this.f40259b == bVar.f40259b;
    }

    public final int hashCode() {
        return (((((this.f40258a * 31) + this.f40259b) * 31) + this.f40260c) * 31) + this.f40261d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f40258a);
        sb2.append(", top=");
        sb2.append(this.f40259b);
        sb2.append(", right=");
        sb2.append(this.f40260c);
        sb2.append(", bottom=");
        return u.g(sb2, this.f40261d, '}');
    }
}
