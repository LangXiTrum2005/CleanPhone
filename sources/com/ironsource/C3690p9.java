package com.ironsource;

import android.os.Handler;
import com.ironsource.environment.thread.IronSourceThreadManager;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.p9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3690p9 {
    private final Handler a;

    /* JADX INFO: renamed from: com.ironsource.p9$a */
    public static final class a extends Xd {
        final /* synthetic */ Runnable b;

        public a(Runnable runnable) {
            this.b = runnable;
        }

        @Override // com.ironsource.Xd
        public void a() {
            this.b.run();
        }
    }

    public C3690p9() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void c(Runnable runnable) {
        Xd aVar = runnable instanceof Xd ? (Xd) runnable : new a(runnable);
        if (Thread.currentThread().getId() == this.a.getLooper().getThread().getId()) {
            aVar.run();
        } else {
            a(this, aVar, 0L, 2, null);
        }
    }

    public final Handler a() {
        return this.a;
    }

    public final void b(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        c(runnable);
    }

    public C3690p9(Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.a = handler;
    }

    public static /* synthetic */ void a(C3690p9 c3690p9, Xd xd, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c3690p9.a(xd, j);
    }

    public /* synthetic */ C3690p9(Handler handler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Handler(IronSourceThreadManager.INSTANCE.getSharedManagersThread().getLooper()) : handler);
    }

    public final void a(Xd task, long j) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.a.postDelayed(task, j);
    }

    public final void a(Xd task) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.a.removeCallbacks(task);
    }

    public final void a(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        c(callback);
    }
}
