package p002kotlin.ranges;

import co.dern;
import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: PrimitiveRanges.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u001a2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u001bB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001c"}, d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/attabal;", "Lco/dern;", "", "", "start", "endInclusive", "<init>", "(II)V", "value", "", "impassible", "(I)Z", "isEmpty", "()Z", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "kowloon", "()Ljava/lang/Integer;", "triweekly", "molybdenite", "attabal", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IntRange extends attabal implements dern<Integer> {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static final IntRange f29406graveside = new IntRange(1, 0);

    /* JADX INFO: renamed from: kotlin.ranges.IntRange$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: PrimitiveRanges.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/ranges/IntRange$attabal;", "", "<init>", "()V", "Lkotlin/ranges/IntRange;", "EMPTY", "Lkotlin/ranges/IntRange;", "attabal", "()Lkotlin/ranges/IntRange;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IntRange attabal() {
            return IntRange.f29406graveside;
        }

        public Companion() {
        }
    }

    public IntRange(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // p002kotlin.ranges.attabal
    public boolean equals(Object other) {
        if (!(other instanceof IntRange)) {
            return false;
        }
        if (isEmpty() && ((IntRange) other).isEmpty()) {
            return true;
        }
        IntRange intRange = (IntRange) other;
        return getFirst() == intRange.getFirst() && getLast() == intRange.getLast();
    }

    @Override // p002kotlin.ranges.attabal
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getFirst() * 31) + getLast();
    }

    public boolean impassible(int value) {
        return getFirst() <= value && value <= getLast();
    }

    @Override // p002kotlin.ranges.attabal, co.dern
    public boolean isEmpty() {
        return getFirst() > getLast();
    }

    @Override // co.dern
    /* JADX INFO: renamed from: kowloon, reason: merged with bridge method [inline-methods] */
    public Integer wireman() {
        return Integer.valueOf(getFirst());
    }

    @Override // p002kotlin.ranges.attabal
    public String toString() {
        return getFirst() + ".." + getLast();
    }

    @Override // co.dern
    /* JADX INFO: renamed from: triweekly, reason: merged with bridge method [inline-methods] */
    public Integer marial() {
        return Integer.valueOf(getLast());
    }
}
