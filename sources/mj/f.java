package mj;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f46116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f46117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f46118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f46119d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.f46116a.equals(fVar.f46116a) && this.f46117b.equals(fVar.f46117b) && this.f46118c.equals(fVar.f46118c) && this.f46119d.equals(fVar.f46119d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f46116a, this.f46117b, this.f46118c, this.f46119d);
    }
}
