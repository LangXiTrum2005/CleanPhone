package m1;

import com.ironsource.mediationsdk.logger.IronSourceError;
import i1.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f45777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f45778b;

    public e(float f10, float f11) {
        go.k.h("Invalid latitude or longitude", f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f);
        this.f45777a = f10;
        this.f45778b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f45777a == eVar.f45777a && this.f45778b == eVar.f45778b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f45778b).hashCode() + ((Float.valueOf(this.f45777a).hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f45777a + ", longitude=" + this.f45778b;
    }
}
