package androidx.datastore.core;

import java.util.concurrent.atomic.AtomicInteger;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: Actual.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0007J\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0007J\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0007R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/datastore/core/saneness;", "", "", "initialValue", "<init>", "(I)V", "dern", "()I", "attabal", "saneness", "wireman", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "delegate", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final AtomicInteger delegate;

    public saneness(int i) {
        this.delegate = new AtomicInteger(i);
    }

    public final int attabal() {
        return this.delegate.decrementAndGet();
    }

    public final int dern() {
        return this.delegate.getAndIncrement();
    }

    public final int saneness() {
        return this.delegate.get();
    }

    public final int wireman() {
        return this.delegate.incrementAndGet();
    }
}
