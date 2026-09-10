package duvetyn;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ForwardingTimeout.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0002\u001a\u00020\u00018\u0007@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u0016\"\u0004\b\u001d\u0010\u0004¨\u0006\u001e"}, d2 = {"Lduvetyn/impassible;", "Lduvetyn/restrictive;", "delegate", "<init>", "(Lduvetyn/restrictive;)V", "cutely", "(Lduvetyn/restrictive;)Lduvetyn/impassible;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "competently", "(JLjava/util/concurrent/TimeUnit;)Lduvetyn/restrictive;", "", "marial", "()Z", "dern", "()J", "deadlineNanoTime", "wireman", "(J)Lduvetyn/restrictive;", "saneness", "()Lduvetyn/restrictive;", "attabal", "", "beachfront", "()V", "Lduvetyn/restrictive;", "taiyuan", "setDelegate", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class impassible extends restrictive {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public restrictive delegate;

    public impassible(restrictive delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // duvetyn.restrictive
    public restrictive attabal() {
        return this.delegate.attabal();
    }

    @Override // duvetyn.restrictive
    public void beachfront() throws IOException {
        this.delegate.beachfront();
    }

    @Override // duvetyn.restrictive
    public restrictive competently(long timeout, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this.delegate.competently(timeout, unit);
    }

    public final impassible cutely(restrictive delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
        return this;
    }

    @Override // duvetyn.restrictive
    public long dern() {
        return this.delegate.dern();
    }

    @Override // duvetyn.restrictive
    /* JADX INFO: renamed from: marial */
    public boolean getHasDeadline() {
        return this.delegate.getHasDeadline();
    }

    @Override // duvetyn.restrictive
    public restrictive saneness() {
        return this.delegate.saneness();
    }

    /* JADX INFO: renamed from: taiyuan, reason: from getter */
    public final restrictive getDelegate() {
        return this.delegate;
    }

    @Override // duvetyn.restrictive
    public restrictive wireman(long deadlineNanoTime) {
        return this.delegate.wireman(deadlineNanoTime);
    }
}
