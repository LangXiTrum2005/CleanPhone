package x4;

import android.graphics.Rect;
import kotlin.jvm.internal.n;
import m0.r1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u4.b f53628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r1 f53629b;

    public j(Rect rect, r1 r1Var) {
        this.f53628a = new u4.b(rect);
        this.f53629b = r1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!j.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        n.d(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        j jVar = (j) obj;
        return n.a(this.f53628a, jVar.f53628a) && n.a(this.f53629b, jVar.f53629b);
    }

    public final int hashCode() {
        return this.f53629b.hashCode() + (this.f53628a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f53628a + ", windowInsetsCompat=" + this.f53629b + ')';
    }
}
