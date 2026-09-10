package ta;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import m0.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends AtomicReference implements Executor, Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f50604e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s1 f50605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Executor f50606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f50607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Thread f50608d;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (get() == d0.f50599b) {
            this.f50606b = null;
            this.f50605a = null;
            return;
        }
        this.f50608d = Thread.currentThread();
        try {
            s1 s1Var = this.f50605a;
            Objects.requireNonNull(s1Var);
            r1.s sVar = (r1.s) s1Var.f45752c;
            if (((Thread) sVar.f49338b) == this.f50608d) {
                this.f50605a = null;
                go.k.t(((Runnable) sVar.f49339c) == null);
                sVar.f49339c = runnable;
                Executor executor = this.f50606b;
                Objects.requireNonNull(executor);
                sVar.f49340d = executor;
                this.f50606b = null;
            } else {
                Executor executor2 = this.f50606b;
                Objects.requireNonNull(executor2);
                this.f50606b = null;
                this.f50607c = runnable;
                executor2.execute(this);
            }
        } finally {
            this.f50608d = null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread != this.f50608d) {
            Runnable runnable = this.f50607c;
            Objects.requireNonNull(runnable);
            this.f50607c = null;
            runnable.run();
            return;
        }
        r1.s sVar = new r1.s(3);
        sVar.f49338b = threadCurrentThread;
        s1 s1Var = this.f50605a;
        Objects.requireNonNull(s1Var);
        s1Var.f45752c = sVar;
        this.f50605a = null;
        try {
            Runnable runnable2 = this.f50607c;
            Objects.requireNonNull(runnable2);
            this.f50607c = null;
            runnable2.run();
            while (true) {
                Runnable runnable3 = (Runnable) sVar.f49339c;
                if (runnable3 == null || (executor = (Executor) sVar.f49340d) == null) {
                    break;
                }
                sVar.f49339c = null;
                sVar.f49340d = null;
                executor.execute(runnable3);
            }
            sVar.f49338b = null;
        } catch (Throwable th2) {
            sVar.f49338b = null;
            throw th2;
        }
    }
}
