package u4;

import android.graphics.Rect;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f51880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f51881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f51882d;

    public b(Rect rect) {
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        this.f51879a = i10;
        this.f51880b = i11;
        this.f51881c = i12;
        this.f51882d = i13;
        if (i10 > i12) {
            throw new IllegalArgumentException(defpackage.e.g(i10, i12, "Left must be less than or equal to right, left: ", ", right: ").toString());
        }
        if (i11 > i13) {
            throw new IllegalArgumentException(defpackage.e.g(i11, i13, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
    }

    public final Rect a() {
        return new Rect(this.f51879a, this.f51880b, this.f51881c, this.f51882d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        n.d(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b bVar = (b) obj;
        return this.f51879a == bVar.f51879a && this.f51880b == bVar.f51880b && this.f51881c == bVar.f51881c && this.f51882d == bVar.f51882d;
    }

    public final int hashCode() {
        return (((((this.f51879a * 31) + this.f51880b) * 31) + this.f51881c) * 31) + this.f51882d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b.class.getSimpleName());
        sb2.append(" { [");
        sb2.append(this.f51879a);
        sb2.append(',');
        sb2.append(this.f51880b);
        sb2.append(',');
        sb2.append(this.f51881c);
        sb2.append(',');
        return l1.d.i(sb2, this.f51882d, "] }");
    }
}
