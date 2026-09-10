package gj;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements xi.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f41917a;

    public b(CountDownLatch countDownLatch) {
        this.f41917a = countDownLatch;
    }

    @Override // xi.o
    public final void a(Object obj) {
        this.f41917a.countDown();
    }

    @Override // xi.o
    public final void b(String str, String str2, Object obj) {
        this.f41917a.countDown();
    }

    @Override // xi.o
    public final void c() {
        this.f41917a.countDown();
    }
}
