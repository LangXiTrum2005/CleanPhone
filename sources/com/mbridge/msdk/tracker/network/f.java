package com.mbridge.msdk.tracker.network;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class f implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f36916a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f36917a;

        public a(Handler handler) {
            this.f36917a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f36917a.post(runnable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t f36919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final v f36920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f36921c;

        public b(t tVar, v vVar, Runnable runnable) {
            this.f36919a = tVar;
            this.f36920b = vVar;
            this.f36921c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f36919a.v()) {
                this.f36919a.c("canceled-at-delivery");
                return;
            }
            if (this.f36920b.a()) {
                this.f36919a.a(this.f36920b.f37035a);
            } else {
                this.f36919a.b(this.f36920b.f37037c);
            }
            if (this.f36920b.f37038d) {
                this.f36919a.a("intermediate-response");
            } else {
                this.f36919a.c("done");
            }
            Runnable runnable = this.f36921c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public f(Handler handler) {
        this.f36916a = new a(handler);
    }

    @Override // com.mbridge.msdk.tracker.network.w
    public void a(t<?> tVar, v<?> vVar) {
        a(tVar, vVar, null);
    }

    public void a(t<?> tVar, v<?> vVar, Runnable runnable) {
        tVar.w();
        tVar.a("post-response");
        this.f36916a.execute(new b(tVar, vVar, runnable));
    }

    public f(Executor executor) {
        this.f36916a = executor;
    }

    @Override // com.mbridge.msdk.tracker.network.w
    public void a(t<?> tVar, b0 b0Var) {
        tVar.a("post-error");
        this.f36916a.execute(new b(tVar, v.a(b0Var), null));
    }
}
