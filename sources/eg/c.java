package eg;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.n;
import zb.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Number f40042b;

    public c(int i10) {
        this.f40041a = i10;
        switch (i10) {
            case 1:
                this.f40042b = new AtomicInteger(0);
                break;
            default:
                this.f40042b = new AtomicInteger(1);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r2) {
        switch (this.f40041a) {
            case 0:
                n.f(r2, "r");
                return new Thread(r2, l1.d.e(((AtomicInteger) this.f40042b).getAndIncrement(), "TranscoderThread #"));
            case 1:
                Thread thread = new Thread(r2);
                thread.setName("arch_disk_io_" + ((AtomicInteger) this.f40042b).getAndIncrement());
                return thread;
            default:
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(new v(r2));
                threadNewThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) this.f40042b).getAndIncrement());
                return threadNewThread;
        }
    }

    public c(AtomicLong atomicLong) {
        this.f40041a = 2;
        this.f40042b = atomicLong;
    }
}
