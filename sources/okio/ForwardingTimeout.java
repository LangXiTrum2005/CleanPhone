package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/ForwardingTimeout;", "Lokio/Timeout;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class ForwardingTimeout extends Timeout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Timeout f45145a;

    public ForwardingTimeout(Timeout delegate) {
        Intrinsics.f(delegate, "delegate");
        this.f45145a = delegate;
    }

    @Override // okio.Timeout
    public final Timeout clearDeadline() {
        return this.f45145a.clearDeadline();
    }

    @Override // okio.Timeout
    public final Timeout clearTimeout() {
        return this.f45145a.clearTimeout();
    }

    @Override // okio.Timeout
    public final long deadlineNanoTime() {
        return this.f45145a.deadlineNanoTime();
    }

    @Override // okio.Timeout
    /* JADX INFO: renamed from: hasDeadline */
    public final boolean getHasDeadline() {
        return this.f45145a.getHasDeadline();
    }

    @Override // okio.Timeout
    public final void throwIfReached() throws IOException {
        this.f45145a.throwIfReached();
    }

    @Override // okio.Timeout
    public final Timeout timeout(long j, TimeUnit unit) {
        Intrinsics.f(unit, "unit");
        return this.f45145a.timeout(j, unit);
    }

    @Override // okio.Timeout
    /* JADX INFO: renamed from: timeoutNanos */
    public final long getTimeoutNanos() {
        return this.f45145a.getTimeoutNanos();
    }

    @Override // okio.Timeout
    public final Timeout deadlineNanoTime(long j) {
        return this.f45145a.deadlineNanoTime(j);
    }
}
