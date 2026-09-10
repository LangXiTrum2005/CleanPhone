package p002kotlin.time;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import tithonia.saneness;

/* JADX INFO: compiled from: longSaturatedMath.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\r\u0010\n\u001a'\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\n¨\u0006\u0011"}, d2 = {"", "value", "Lkotlin/time/saneness;", "attabal", "(J)J", "valueNs", "origin", "Lkotlin/time/DurationUnit;", "unit", "saneness", "(JJLkotlin/time/DurationUnit;)J", "origin1", "origin2", "wireman", "value1", "value2", "dern", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class wireman {
    public static final long attabal(long j) {
        return j < 0 ? saneness.INSTANCE.saneness() : saneness.INSTANCE.attabal();
    }

    public static final long dern(long j, long j2, DurationUnit durationUnit) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return dern.graveside(j3, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return saneness.hydrovane(attabal(j3));
        }
        long jSaneness = saneness.saneness(1L, durationUnit2, durationUnit);
        long j4 = (j / jSaneness) - (j2 / jSaneness);
        long j5 = (j % jSaneness) - (j2 % jSaneness);
        saneness.Companion companion = saneness.INSTANCE;
        return saneness.polder(dern.graveside(j4, durationUnit2), dern.graveside(j5, durationUnit));
    }

    public static final long saneness(long j, long j2, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (1 | (j2 - 1)) == Long.MAX_VALUE ? saneness.hydrovane(attabal(j2)) : dern(j, j2, unit);
    }

    public static final long wireman(long j, long j2, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            return j == j2 ? saneness.INSTANCE.dern() : saneness.hydrovane(attabal(j2));
        }
        return (1 | (j - 1)) == Long.MAX_VALUE ? attabal(j) : dern(j, j2, unit);
    }
}
