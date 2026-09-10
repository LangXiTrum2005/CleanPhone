package androidx.room;

import A.I0;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/TransactionExecutor;", "Ljava/util/concurrent/Executor;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransactionExecutor implements Executor {
    public final Executor X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ArrayDeque f8252Y;
    public Runnable Z;
    public final Object e0;

    public TransactionExecutor(Executor executor) {
        Intrinsics.f(executor, "executor");
        this.X = executor;
        this.f8252Y = new ArrayDeque();
        this.e0 = new Object();
    }

    public final void a() {
        synchronized (this.e0) {
            Object objPoll = this.f8252Y.poll();
            Runnable runnable = (Runnable) objPoll;
            this.Z = runnable;
            if (objPoll != null) {
                this.X.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        Intrinsics.f(command, "command");
        synchronized (this.e0) {
            this.f8252Y.offer(new I0(16, command, this));
            if (this.Z == null) {
                a();
            }
        }
    }
}
