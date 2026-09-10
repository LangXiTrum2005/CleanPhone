package ub;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import l2.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements ThreadFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f51939e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f51940a = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f51942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f51943d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f51941b = str;
        this.f51942c = i10;
        this.f51943d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f51939e.newThread(new u(27, this, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f51941b + " Thread #" + this.f51940a.getAndIncrement());
        return threadNewThread;
    }
}
