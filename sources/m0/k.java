package m0;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45723c;

    public k(String str, int i10, int i11) {
        this.f45721a = str;
        this.f45722b = i10;
        this.f45723c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Objects.equals(this.f45721a, kVar.f45721a) && this.f45722b == kVar.f45722b && this.f45723c == kVar.f45723c;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f45722b);
        Integer numValueOf2 = Integer.valueOf(this.f45723c);
        Float fValueOf = Float.valueOf(1.0f);
        return Objects.hash(this.f45721a, numValueOf, numValueOf2, fValueOf, 0, 0, 0, fValueOf);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DisplayShapeCompat{ spec=");
        String str = this.f45721a;
        sb2.append(str != null ? Integer.valueOf(str.hashCode()) : "null");
        sb2.append(" displayWidth=");
        sb2.append(this.f45722b);
        sb2.append(" displayHeight=");
        return l1.d.i(sb2, this.f45723c, " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}");
    }
}
