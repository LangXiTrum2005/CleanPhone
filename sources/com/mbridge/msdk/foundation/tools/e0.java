package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.MBridgeConstans;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class e0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Runnable f34103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Runnable f34104b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f34105a;

        public a(Runnable runnable) {
            this.f34105a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f34105a.run();
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("LimitExecutor", e10.getMessage());
                }
            } finally {
                e0.this.a();
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        try {
            if (this.f34103a == null) {
                this.f34103a = a(runnable);
                c0.a().execute(this.f34103a);
            } else if (this.f34104b == null) {
                this.f34104b = a(runnable);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private Runnable a(Runnable runnable) {
        return new a(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        Runnable runnable = this.f34104b;
        this.f34103a = runnable;
        this.f34104b = null;
        if (runnable != null) {
            c0.a().execute(this.f34103a);
        }
    }
}
