package gold;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Task.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u000fR\"\u0010\u001f\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\n\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lgold/attabal;", "", "", "name", "", "cancelable", "<init>", "(Ljava/lang/String;Z)V", "", "beachfront", "()J", "Lgold/wireman;", "queue", "", "marial", "(Lgold/wireman;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "saneness", "attabal", "Z", "()Z", "Lgold/wireman;", "wireman", "()Lgold/wireman;", "setQueue$okhttp", "dern", "J", "competently", "(J)V", "nextExecuteNanoTime", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final boolean cancelable;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public long nextExecuteNanoTime;
    private final String name;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public wireman queue;

    public attabal(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.cancelable = z;
        this.nextExecuteNanoTime = -1L;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final boolean getCancelable() {
        return this.cancelable;
    }

    public abstract long beachfront();

    public final void competently(long j) {
        this.nextExecuteNanoTime = j;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final long getNextExecuteNanoTime() {
        return this.nextExecuteNanoTime;
    }

    public final void marial(wireman queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        wireman wiremanVar = this.queue;
        if (wiremanVar == queue) {
            return;
        }
        if (wiremanVar != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.queue = queue;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final wireman getQueue() {
        return this.queue;
    }

    public /* synthetic */ attabal(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z);
    }
}
