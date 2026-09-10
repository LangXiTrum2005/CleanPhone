package com.p004ironsource;

import android.os.Handler;
import com.p004ironsource.environment.thread.IronSourceThreadManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002R\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\n\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/ironsource/fj;", "", "Ljava/lang/Runnable;", "runnable", "", "c", "Lcom/ironsource/ks;", "task", "", "delay", "a", "b", "callback", "Landroid/os/Handler;", "Landroid/os/Handler;", "()Landroid/os/Handler;", "handler", "<init>", "(Landroid/os/Handler;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class fj {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Handler handler;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/ironsource/fj$a", "Lcom/ironsource/ks;", "", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends ks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f25024a;

        public a(Runnable runnable) {
            this.f25024a = runnable;
        }

        @Override // com.p004ironsource.ks
        public void a() {
            this.f25024a.run();
        }
    }

    public fj() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void c(Runnable runnable) {
        ks aVar = runnable instanceof ks ? (ks) runnable : new a(runnable);
        if (Thread.currentThread().getId() == this.handler.getLooper().getThread().getId()) {
            aVar.run();
        } else {
            a(this, aVar, 0L, 2, null);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Handler getHandler() {
        return this.handler;
    }

    public final void b(Runnable runnable) {
        Intrinsics.f(runnable, "runnable");
        c(runnable);
    }

    public fj(Handler handler) {
        Intrinsics.f(handler, "handler");
        this.handler = handler;
    }

    public static /* synthetic */ void a(fj fjVar, ks ksVar, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        fjVar.a(ksVar, j);
    }

    public /* synthetic */ fj(Handler handler, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new Handler(IronSourceThreadManager.INSTANCE.getSharedManagersThread().getLooper()) : handler);
    }

    public final void a(ks task) {
        Intrinsics.f(task, "task");
        this.handler.removeCallbacks(task);
    }

    public final void a(ks task, long delay) {
        Intrinsics.f(task, "task");
        this.handler.postDelayed(task, delay);
    }

    public final void a(Runnable callback) {
        Intrinsics.f(callback, "callback");
        c(callback);
    }
}
