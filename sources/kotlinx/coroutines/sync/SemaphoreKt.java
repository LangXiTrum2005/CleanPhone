package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.SystemPropsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SemaphoreKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f45108a = SystemPropsKt.d(100, 12, "kotlinx.coroutines.semaphore.maxSpinCycles");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Symbol f45109b = new Symbol("PERMIT");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Symbol f45110c = new Symbol("TAKEN");
    public static final Symbol d = new Symbol("BROKEN");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Symbol f45111e = new Symbol("CANCELLED");
    public static final int f = SystemPropsKt.d(16, 12, "kotlinx.coroutines.semaphore.segmentSize");
}
