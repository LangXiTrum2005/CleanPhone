package oi;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f47449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f47450b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f47451c = new AtomicBoolean(false);

    public g(ExecutorService executorService) {
        this.f47449a = executorService;
    }

    @Override // oi.d
    public final void a(b bVar) {
        this.f47450b.add(bVar);
        this.f47449a.execute(new com.mbridge.msdk.config.component.info.provider.subprovider.f(this, 26));
    }
}
