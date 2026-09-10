package j6;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import ta.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f43716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43717b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f43719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicInteger f43720e = new AtomicInteger();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f43718c = d.f43721a;

    public c(b bVar, String str, boolean z10) {
        this.f43716a = bVar;
        this.f43717b = str;
        this.f43719d = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        i0 i0Var = new i0(this, false, runnable, 28);
        this.f43716a.getClass();
        a aVar = new a(i0Var);
        aVar.setName("glide-" + this.f43717b + "-thread-" + this.f43720e.getAndIncrement());
        return aVar;
    }
}
