package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlinx.coroutines.internal.SystemPropsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002*\f\b\u0000\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, d2 = {"", "TaskContext", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TasksKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f45066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f45067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f45068c;
    public static final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f45069e;
    public static final NanoTimeSource f;

    static {
        String strC = SystemPropsKt.c("kotlinx.coroutines.scheduler.default.name");
        if (strC == null) {
            strC = "DefaultDispatcher";
        }
        f45066a = strC;
        f45067b = SystemPropsKt.b("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int iA = SystemPropsKt.a();
        if (iA < 2) {
            iA = 2;
        }
        f45068c = SystemPropsKt.d(iA, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = SystemPropsKt.d(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f45069e = TimeUnit.SECONDS.toNanos(SystemPropsKt.b("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f = NanoTimeSource.f45063a;
    }
}
