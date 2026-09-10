package p002kotlin.ranges;

import co.beachfront;
import co.dern;
import co.saneness;
import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: _Ranges.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001c\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000H\u0086\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001c\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\u0004¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000f\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0019\u0010\u0012\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0019\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\r\u001a\u0019\u0010\u0016\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0010\u001a\u0019\u0010\u0017\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0013\u001a!\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a!\u0010\u001a\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001b\u001a!\u0010\u001c\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001d\u001a!\u0010\u001f\u001a\u00020\u001e*\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 \u001a1\u0010%\u001a\u00028\u0000\"\u000e\b\u0000\u0010\"*\b\u0012\u0004\u0012\u00028\u00000!*\u00028\u00002\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0007¢\u0006\u0004\b%\u0010&\u001a\u001f\u0010(\u001a\u00020\u000e*\u00020\u000e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0'¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"", "to", "Lkotlin/ranges/attabal;", "kowloon", "(II)Lkotlin/ranges/attabal;", "step", "arytenoidectomy", "(Lkotlin/ranges/attabal;I)Lkotlin/ranges/attabal;", "Lkotlin/ranges/IntRange;", "monoploid", "(II)Lkotlin/ranges/IntRange;", "minimumValue", "wireman", "(II)I", "", "marial", "(JJ)J", "", "dern", "(FF)F", "maximumValue", "competently", "impromptu", "beachfront", "apical", "(III)I", "formularize", "(JJJ)J", "cutely", "(FFF)F", "", "taiyuan", "(DDD)D", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lco/saneness;", "range", "triweekly", "(Ljava/lang/Comparable;Lco/saneness;)Ljava/lang/Comparable;", "Lco/dern;", "impassible", "(JLco/dern;)J", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/ranges/RangesKt")
public class wireman extends beachfront {
    public static int apical(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static attabal arytenoidectomy(attabal attabalVar, int i) {
        Intrinsics.checkNotNullParameter(attabalVar, "<this>");
        beachfront.attabal(i > 0, Integer.valueOf(i));
        attabal.Companion c0663attabal = attabal.INSTANCE;
        int iBeachfront = attabalVar.getFirst();
        int iCompetently = attabalVar.getLast();
        if (attabalVar.getStep() <= 0) {
            i = -i;
        }
        return c0663attabal.attabal(iBeachfront, iCompetently, i);
    }

    public static float beachfront(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    public static int competently(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static float cutely(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            return f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static float dern(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    public static long formularize(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            return j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    public static long impassible(long j, dern<Long> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof saneness) {
            return ((Number) triweekly(Long.valueOf(j), (saneness) range)).longValue();
        }
        if (!range.isEmpty()) {
            if (j < ((Number) range.wireman()).longValue()) {
                return ((Number) range.wireman()).longValue();
            }
            return j > ((Number) range.marial()).longValue() ? ((Number) range.marial()).longValue() : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static long impromptu(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    public static attabal kowloon(int i, int i2) {
        return attabal.INSTANCE.attabal(i, i2, -1);
    }

    public static long marial(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static IntRange monoploid(int i, int i2) {
        return i2 <= Integer.MIN_VALUE ? IntRange.INSTANCE.attabal() : new IntRange(i, i2 - 1);
    }

    public static double taiyuan(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            return d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static final <T extends Comparable<? super T>> T triweekly(T t, saneness<T> range) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            if (!range.saneness(t, range.wireman()) || range.saneness(range.wireman(), t)) {
                return (!range.saneness(range.marial(), t) || range.saneness(t, range.marial())) ? t : range.marial();
            }
            return range.wireman();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static int wireman(int i, int i2) {
        return i < i2 ? i2 : i;
    }
}
