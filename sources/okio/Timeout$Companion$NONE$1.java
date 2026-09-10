package okio;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okio/Timeout$Companion$NONE$1", "Lokio/Timeout;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Timeout$Companion$NONE$1 extends Timeout {
    @Override // okio.Timeout
    public final Timeout deadlineNanoTime(long j) {
        return this;
    }

    @Override // okio.Timeout
    public final void throwIfReached() {
    }

    @Override // okio.Timeout
    public final Timeout timeout(long j, TimeUnit unit) {
        Intrinsics.f(unit, "unit");
        return this;
    }
}
