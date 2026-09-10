package ch;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6419b;

    public /* synthetic */ b(String str, int i10) {
        this.f6418a = i10;
        this.f6419b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f6418a) {
            case 0:
                Thread thread = new Thread(runnable, defpackage.e.n("UniqueQueue-", this.f6419b));
                thread.setDaemon(true);
                return thread;
            case 1:
                Thread thread2 = new Thread(runnable, defpackage.e.n("UniqueQueue-", this.f6419b));
                thread2.setDaemon(true);
                return thread2;
            case 2:
                return new Thread(runnable, this.f6419b);
            default:
                Thread thread3 = new Thread(runnable, this.f6419b);
                thread3.setPriority(10);
                return thread3;
        }
    }
}
