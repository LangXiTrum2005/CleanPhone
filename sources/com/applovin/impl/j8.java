package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class j8 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set f8231f = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f8232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f8233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f8234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f8235d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Timer f8236e;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends TimerTask {

        /* JADX INFO: renamed from: com.applovin.impl.j8$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class C0008a implements AppLovinBroadcastManager.Receiver {
            public C0008a() {
            }

            @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
            public void onReceive(Intent intent, Map map) {
                AppLovinBroadcastManager.unregisterReceiver(this);
                j8.this.c();
            }
        }

        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (!j8.this.f8233b.o0().isApplicationPaused() || j8.this.f8232a) {
                j8.this.c();
            } else {
                AppLovinBroadcastManager.registerReceiver(new C0008a(), new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
        }
    }

    private j8(long j10, boolean z10, com.applovin.impl.sdk.l lVar, Runnable runnable) {
        Timer timer = new Timer();
        this.f8236e = timer;
        if (j10 < 0) {
            throw new IllegalArgumentException(defpackage.e.i(j10, "Cannot create wall clock timer. Invalid timer length: "));
        }
        if (lVar == null) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Sdk is null");
        }
        if (runnable == null) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Runnable is null.");
        }
        this.f8232a = z10;
        this.f8233b = lVar;
        this.f8234c = runnable;
        f8231f.add(this);
        timer.schedule(b(), j10);
    }

    public static j8 a(long j10, boolean z10, com.applovin.impl.sdk.l lVar, Runnable runnable) {
        return new j8(j10, z10, lVar, runnable);
    }

    private TimerTask b() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Runnable runnable = this.f8234c;
        if (runnable != null) {
            runnable.run();
            a();
        }
    }

    public void a() {
        synchronized (this.f8235d) {
            this.f8236e.cancel();
            this.f8234c = null;
            f8231f.remove(this);
        }
    }
}
