package com.thinkup.core.common.o0m.o;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
final class mo implements Executor {
    private Runnable m;
    private Runnable o;

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        if (this.o == null) {
            this.o = o(runnable);
            m0.o().execute(this.o);
        } else {
            if (this.m == null) {
                this.m = o(runnable);
            }
        }
    }

    private Runnable o(final Runnable runnable) {
        return new Runnable() { // from class: com.thinkup.core.common.o0m.o.mo.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    runnable.run();
                } finally {
                    mo.this.o();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o() {
        Runnable runnable = this.m;
        this.o = runnable;
        this.m = null;
        if (runnable != null) {
            m0.o().execute(this.o);
        }
    }
}
