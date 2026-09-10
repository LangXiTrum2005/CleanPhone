package com.smartdigimkt.h8;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
class i implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Runnable f35760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Runnable f35761b;

    private Runnable b(Runnable runnable) {
        return new o(0, this, runnable);
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        try {
            if (this.f35760a == null) {
                this.f35760a = b(runnable);
                h.a().execute(this.f35760a);
            } else if (this.f35761b == null) {
                this.f35761b = b(runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Runnable runnable) {
        try {
            runnable.run();
        } finally {
            a();
        }
    }

    private synchronized void a() {
        Runnable runnable = this.f35761b;
        this.f35760a = runnable;
        this.f35761b = null;
        if (runnable != null) {
            h.a().execute(this.f35760a);
        }
    }
}
