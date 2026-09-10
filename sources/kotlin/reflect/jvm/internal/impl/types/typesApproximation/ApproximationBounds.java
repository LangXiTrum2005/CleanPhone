package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ApproximationBounds<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f44597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f44598b;

    public ApproximationBounds(Object obj, Object obj2) {
        this.f44597a = obj;
        this.f44598b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApproximationBounds)) {
            return false;
        }
        ApproximationBounds approximationBounds = (ApproximationBounds) obj;
        return Intrinsics.a(this.f44597a, approximationBounds.f44597a) && Intrinsics.a(this.f44598b, approximationBounds.f44598b);
    }

    public final int hashCode() {
        Object obj = this.f44597a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f44598b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "ApproximationBounds(lower=" + this.f44597a + ", upper=" + this.f44598b + ')';
    }
}
