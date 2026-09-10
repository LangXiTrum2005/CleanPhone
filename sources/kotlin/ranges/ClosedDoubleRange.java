package kotlin.ranges;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlin/ranges/ClosedDoubleRange;", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ClosedDoubleRange implements ClosedFloatingPointRange<Double> {
    public final boolean equals(Object obj) {
        if (!(obj instanceof ClosedDoubleRange)) {
            return false;
        }
        ClosedDoubleRange closedDoubleRange = (ClosedDoubleRange) obj;
        closedDoubleRange.getClass();
        closedDoubleRange.getClass();
        return true;
    }

    public final int hashCode() {
        return Double.hashCode(0.0d) + (Double.hashCode(0.0d) * 31);
    }

    public final String toString() {
        return "0.0..0.0";
    }
}
