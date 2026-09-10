package com.thinkup.core.common.o0n;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes6.dex */
public class o0 implements o {
    private static volatile o0 m = null;
    private static final String o = "TimeOutHandlerImpl";
    private final Handler o0 = com.thinkup.core.common.ooo.m.m.o().o(12);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Handler f42162n = new Handler(Looper.getMainLooper());

    private o0() {
    }

    public static o o() {
        if (m == null) {
            synchronized (o0.class) {
                try {
                    if (m == null) {
                        m = new o0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    private Handler o(boolean z2) {
        return z2 ? this.f42162n : this.o0;
    }

    @Override // com.thinkup.core.common.o0n.o
    public final void o(m mVar, long j) {
        o(mVar, j, true);
    }

    @Override // com.thinkup.core.common.o0n.o
    public final void o(m mVar, long j, boolean z2) {
        Handler handlerO = o(z2);
        if (handlerO == null) {
            return;
        }
        handlerO.postDelayed(mVar, j);
    }

    @Override // com.thinkup.core.common.o0n.o
    public final void o(m mVar) {
        Handler handler = this.f42162n;
        if (handler != null && mVar != null) {
            handler.removeCallbacks(mVar);
        }
        Handler handler2 = this.o0;
        if (handler2 == null || mVar == null) {
            return;
        }
        handler2.removeCallbacks(mVar);
    }
}
