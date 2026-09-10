package c3;

import com.ironsource.mediationsdk.logger.IronSourceError;
import i1.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5924b;

    public c(float f10, int i10) {
        this.f5923a = f10;
        this.f5924b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f5923a == cVar.f5923a && this.f5924b == cVar.f5924b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f5923a).hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f5924b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f5923a + ", svcTemporalLayerCount=" + this.f5924b;
    }
}
