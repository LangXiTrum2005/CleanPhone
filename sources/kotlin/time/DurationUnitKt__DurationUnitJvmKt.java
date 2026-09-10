package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/time/DurationUnitKt")
class DurationUnitKt__DurationUnitJvmKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[TimeUnit.values().length];
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final double a(double d, DurationUnit sourceUnit, DurationUnit targetUnit) {
        Intrinsics.f(sourceUnit, "sourceUnit");
        Intrinsics.f(targetUnit, "targetUnit");
        TimeUnit timeUnit = targetUnit.X;
        TimeUnit timeUnit2 = sourceUnit.X;
        long jConvert = timeUnit.convert(1L, timeUnit2);
        return jConvert > 0 ? d * jConvert : d / timeUnit2.convert(1L, timeUnit);
    }

    public static final long b(long j, DurationUnit sourceUnit, DurationUnit targetUnit) {
        Intrinsics.f(sourceUnit, "sourceUnit");
        Intrinsics.f(targetUnit, "targetUnit");
        return targetUnit.X.convert(j, sourceUnit.X);
    }

    public static final long c(long j, DurationUnit sourceUnit, DurationUnit targetUnit) {
        Intrinsics.f(sourceUnit, "sourceUnit");
        Intrinsics.f(targetUnit, "targetUnit");
        return targetUnit.X.convert(j, sourceUnit.X);
    }
}
