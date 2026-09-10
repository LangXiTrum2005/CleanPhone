package na;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class u implements r, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f46652a;

    public u(Object obj) {
        this.f46652a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return d0.c.h(this.f46652a, ((u) obj).f46652a);
        }
        return false;
    }

    @Override // na.r
    public final Object get() {
        return this.f46652a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46652a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f46652a + ")";
    }
}
