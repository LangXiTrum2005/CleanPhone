package q9;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadFactory f48897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Serializable f48898c;

    public a(com.android.billingclient.api.a aVar) {
        this.f48896a = 1;
        this.f48897b = Executors.defaultThreadFactory();
        this.f48898c = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f48896a) {
            case 0:
                Thread threadNewThread = this.f48897b.newThread(new g6.a(1, runnable));
                threadNewThread.setName((String) this.f48898c);
                return threadNewThread;
            default:
                AtomicInteger atomicInteger = (AtomicInteger) this.f48898c;
                Thread threadNewThread2 = this.f48897b.newThread(runnable);
                threadNewThread2.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
                return threadNewThread2;
        }
    }

    public a(String str) {
        this.f48896a = 0;
        this.f48897b = Executors.defaultThreadFactory();
        this.f48898c = str;
    }
}
