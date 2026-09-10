package li;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45336b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f45335a) {
            case 0:
                Thread thread = new Thread(runnable);
                StringBuilder sb2 = new StringBuilder("flutter-worker-");
                int i10 = this.f45336b;
                this.f45336b = i10 + 1;
                sb2.append(i10);
                thread.setName(sb2.toString());
                return thread;
            default:
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
                threadNewThread.setName("WorkManager-WorkTimer-thread-" + this.f45336b);
                this.f45336b = this.f45336b + 1;
                return threadNewThread;
        }
    }
}
