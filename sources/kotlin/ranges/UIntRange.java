package kotlin.ranges;

import kotlin.Metadata;
import kotlin.UInt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/ranges/UIntRange;", "Lkotlin/ranges/UIntProgression;", "Lkotlin/ranges/ClosedRange;", "Lkotlin/UInt;", "Lkotlin/ranges/OpenEndRange;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UIntRange extends UIntProgression implements ClosedRange<UInt>, OpenEndRange<UInt> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/ranges/UIntRange$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        new UIntRange();
    }

    @Override // kotlin.ranges.UIntProgression
    public final boolean equals(Object obj) {
        if (!(obj instanceof UIntRange)) {
            return false;
        }
        if (isEmpty() && ((UIntRange) obj).isEmpty()) {
            return true;
        }
        UIntRange uIntRange = (UIntRange) obj;
        uIntRange.getClass();
        return this.X == uIntRange.X;
    }

    @Override // kotlin.ranges.UIntProgression
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (-31) + this.X;
    }

    @Override // kotlin.ranges.UIntProgression
    public final boolean isEmpty() {
        return Integer.compare(Integer.MAX_VALUE, this.X ^ Integer.MIN_VALUE) > 0;
    }

    @Override // kotlin.ranges.UIntProgression
    public final String toString() {
        return ((Object) UInt.a(-1)) + ".." + ((Object) UInt.a(this.X));
    }
}
