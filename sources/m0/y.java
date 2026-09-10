package m0;

import android.graphics.Point;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Point f45765c;

    public y(int i10, int i11, Point point) {
        int i12 = point.x;
        int i13 = point.y;
        this.f45763a = i10;
        this.f45764b = i11;
        this.f45765c = new Point(i12, i13);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.f45763a == yVar.f45763a && this.f45764b == yVar.f45764b && this.f45765c.equals(yVar.f45765c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f45765c.hashCode() + (((this.f45763a * 31) + this.f45764b) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("RoundedCornerCompat{position=");
        int i10 = this.f45763a;
        if (i10 == 0) {
            str = "TopLeft";
        } else if (i10 == 1) {
            str = "TopRight";
        } else if (i10 != 2) {
            str = i10 != 3 ? "Invalid" : "BottomLeft";
        } else {
            str = "BottomRight";
        }
        sb2.append(str);
        sb2.append(", radius=");
        sb2.append(this.f45764b);
        sb2.append(", center=");
        sb2.append(this.f45765c);
        sb2.append('}');
        return sb2.toString();
    }
}
