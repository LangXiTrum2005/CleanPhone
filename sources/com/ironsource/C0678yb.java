package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import java.util.Date;

/* JADX INFO: renamed from: com.ironsource.yb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0678yb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f31308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected long f31309b;

    /* JADX INFO: renamed from: com.ironsource.yb$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f31310a;

        public /* synthetic */ a(C0678yb c0678yb, int i10) {
            this();
        }

        public Handler a() {
            return this.f31310a;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Looper.prepare();
            this.f31310a = new Handler();
            Looper.loop();
        }

        private a() {
        }
    }

    public C0678yb() {
        a aVar = new a(this, 0);
        this.f31308a = aVar;
        aVar.start();
        this.f31309b = new Date().getTime();
    }

    public boolean a(Object obj) {
        return (obj == null || this.f31308a == null) ? false : true;
    }

    public void a(Runnable runnable) {
        Handler handlerA;
        a aVar = this.f31308a;
        if (aVar == null || (handlerA = aVar.a()) == null) {
            return;
        }
        handlerA.post(runnable);
    }
}
