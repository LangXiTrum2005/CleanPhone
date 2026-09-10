package com.apm.insight.b;

import android.os.SystemClock;
import com.apm.insight.runtime.m;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f9998b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f9999a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10000c = false;
    private final Runnable d;

    public c(b bVar) {
        Runnable runnable = new Runnable() { // from class: com.apm.insight.b.c.1
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                if (c.this.f10000c) {
                    return;
                }
                c.this.f9999a.d();
                long unused = c.f9998b = SystemClock.uptimeMillis();
                if (com.apm.insight.runtime.i.a().b()) {
                    m.a().a(c.this.d, 500L);
                } else {
                    m.a().a(c.this.d, 500L);
                }
                com.apm.insight.runtime.b.a(c.f9998b);
            }
        };
        this.d = runnable;
        this.f9999a = bVar;
        m.a().a(runnable, 5000L);
    }

    public static boolean c() {
        return SystemClock.uptimeMillis() - f9998b <= MBInterstitialActivity.WEB_LOAD_TIME;
    }

    public final void b() {
        this.f10000c = true;
    }

    public final void a() {
        if (this.f10000c) {
            return;
        }
        m.a().a(this.d, 5000L);
    }
}
