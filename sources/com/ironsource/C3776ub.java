package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import java.util.Date;

/* JADX INFO: renamed from: com.ironsource.ub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3776ub {
    private final a a;
    protected long b;

    /* JADX INFO: renamed from: com.ironsource.ub$a */
    public class a extends Thread {
        private Handler a;

        public Handler a() {
            return this.a;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Looper.prepare();
            this.a = new Handler();
            Looper.loop();
        }

        private a() {
        }
    }

    public C3776ub() {
        a aVar = new a();
        this.a = aVar;
        aVar.start();
        this.b = new Date().getTime();
    }

    public boolean a(Object obj) {
        return (obj == null || this.a == null) ? false : true;
    }

    public void a(Runnable runnable) {
        Handler handlerA;
        a aVar = this.a;
        if (aVar == null || (handlerA = aVar.a()) == null) {
            return;
        }
        handlerA.post(runnable);
    }
}
