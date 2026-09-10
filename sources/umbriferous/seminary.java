package umbriferous;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: OnDemandCounter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class seminary {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final AtomicInteger f39203attabal = new AtomicInteger();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final AtomicInteger f39204saneness = new AtomicInteger();

    public void attabal() {
        this.f39204saneness.getAndIncrement();
    }

    public void dern() {
        this.f39204saneness.set(0);
    }

    public void saneness() {
        this.f39203attabal.getAndIncrement();
    }
}
