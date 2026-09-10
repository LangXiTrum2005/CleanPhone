package com.applovin.shadow.okio;

import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\b\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0002\u001a\u00020\u00018\u0007@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0019\u001a\u0004\b\u0002\u0010\u001a\"\u0004\b\u0005\u0010\u0004¨\u0006\u001b"}, d2 = {"Lcom/applovin/shadow/okio/ForwardingTimeout;", "Lcom/applovin/shadow/okio/Timeout;", "delegate", "<init>", "(Llo/v;)V", "setDelegate", "(Lcom/applovin/shadow/okio/Timeout;)Lcom/applovin/shadow/okio/ForwardingTimeout;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "(JLjava/util/concurrent/TimeUnit;)Lcom/applovin/shadow/okio/Timeout;", "timeoutNanos", "()J", "", "hasDeadline", "()Z", "deadlineNanoTime", "(J)Lcom/applovin/shadow/okio/Timeout;", "clearTimeout", "()Lcom/applovin/shadow/okio/Timeout;", "clearDeadline", "Lwj/r;", "throwIfReached", "()V", "Lcom/applovin/shadow/okio/Timeout;", "()Llo/v;", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public class ForwardingTimeout extends Timeout {
    private Timeout delegate;

    public ForwardingTimeout(Timeout delegate) {
        n.f(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // com.applovin.shadow.okio.Timeout
    public Timeout clearDeadline() {
        return this.delegate.clearDeadline();
    }

    @Override // com.applovin.shadow.okio.Timeout
    public Timeout clearTimeout() {
        return this.delegate.clearTimeout();
    }

    @Override // com.applovin.shadow.okio.Timeout
    public long deadlineNanoTime() {
        return this.delegate.deadlineNanoTime();
    }

    /* JADX INFO: renamed from: delegate, reason: from getter */
    public final Timeout getDelegate() {
        return this.delegate;
    }

    @Override // com.applovin.shadow.okio.Timeout
    /* JADX INFO: renamed from: hasDeadline */
    public boolean getHasDeadline() {
        return this.delegate.getHasDeadline();
    }

    /* JADX INFO: renamed from: setDelegate, reason: collision with other method in class */
    public final /* synthetic */ void m154setDelegate(Timeout timeout) {
        n.f(timeout, "<set-?>");
        this.delegate = timeout;
    }

    @Override // com.applovin.shadow.okio.Timeout
    public void throwIfReached() throws IOException {
        this.delegate.throwIfReached();
    }

    @Override // com.applovin.shadow.okio.Timeout
    public Timeout timeout(long timeout, TimeUnit unit) {
        n.f(unit, "unit");
        return this.delegate.timeout(timeout, unit);
    }

    @Override // com.applovin.shadow.okio.Timeout
    /* JADX INFO: renamed from: timeoutNanos */
    public long getTimeoutNanos() {
        return this.delegate.getTimeoutNanos();
    }

    @Override // com.applovin.shadow.okio.Timeout
    public Timeout deadlineNanoTime(long deadlineNanoTime) {
        return this.delegate.deadlineNanoTime(deadlineNanoTime);
    }

    public final ForwardingTimeout setDelegate(Timeout delegate) {
        n.f(delegate, "delegate");
        this.delegate = delegate;
        return this;
    }
}
