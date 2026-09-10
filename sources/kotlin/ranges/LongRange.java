package kotlin.ranges;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/ranges/LongRange;", "Lkotlin/ranges/LongProgression;", "Lkotlin/ranges/ClosedRange;", "", "Lkotlin/ranges/OpenEndRange;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LongRange extends LongProgression implements ClosedRange<Long>, OpenEndRange<Long> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/ranges/LongRange$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // kotlin.ranges.LongProgression
    public final boolean equals(Object obj) {
        if (!(obj instanceof LongRange)) {
            return false;
        }
        if (isEmpty() && ((LongRange) obj).isEmpty()) {
            return true;
        }
        ((LongRange) obj).getClass();
        return 0 == 0;
    }

    @Override // kotlin.ranges.LongProgression
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) (((long) 31) + (0 ^ (0 >>> 32)));
    }

    @Override // kotlin.ranges.LongProgression
    public final boolean isEmpty() {
        return 1 > 0;
    }

    @Override // kotlin.ranges.LongProgression
    public final String toString() {
        return "1..0";
    }
}
