package kotlin.time;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/time/MonotonicTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MonotonicTimeSource implements TimeSource.WithComparableMarks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f44726a = System.nanoTime();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f44727b = 0;

    public static long b() {
        return System.nanoTime() - f44726a;
    }

    @Override // kotlin.time.TimeSource.WithComparableMarks
    public final ComparableTimeMark a() {
        return new TimeSource.Monotonic.ValueTimeMark(b());
    }

    public final String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
