package okhttp3;

import java.util.concurrent.TimeUnit;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ConnectionPool.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\fB\t\b\u0016¢\u0006\u0004\b\u0004\u0010\rJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lokhttp3/cutely;", "", "Lokhttp3/internal/connection/beachfront;", "delegate", "<init>", "(Lokhttp3/internal/connection/beachfront;)V", "", "maxIdleConnections", "", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "(IJLjava/util/concurrent/TimeUnit;)V", "()V", "attabal", "()I", "Lokhttp3/internal/connection/beachfront;", "saneness", "()Lokhttp3/internal/connection/beachfront;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class cutely {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final okhttp3.internal.connection.beachfront delegate;

    public cutely(okhttp3.internal.connection.beachfront delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    public final int attabal() {
        return this.delegate.wireman();
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final okhttp3.internal.connection.beachfront getDelegate() {
        return this.delegate;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cutely(int i, long j, TimeUnit timeUnit) {
        this(new okhttp3.internal.connection.beachfront(gold.marial.f27337taiyuan, i, j, timeUnit));
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
    }

    public cutely() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
