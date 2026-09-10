package com.applovin.impl.sdk;

import android.app.ActivityManager;
import com.applovin.impl.a3;
import com.applovin.impl.f2;
import com.applovin.impl.h2;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.y3;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class o {
    private static final a l = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f9664a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f9666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f9667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f9668e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f9671h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Object f9672i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f9665b = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f9669f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f9670g = new AtomicBoolean();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f9673j = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f9674k = new Object();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f9675a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f9676b;

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public long b() {
            return this.f9675a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a((Object) this) && b() == aVar.b() && a() == aVar.a();
        }

        public int hashCode() {
            long jB = b();
            return a() + ((((int) (jB ^ (jB >>> 32))) + 59) * 59);
        }

        public String toString() {
            return "FullScreenAdTracker.LostShowAttemptsData(lastAttemptedTimeMillis=" + b() + ", attemptCount=" + a() + ")";
        }

        public static /* synthetic */ int a(a aVar) {
            int i10 = aVar.f9676b;
            aVar.f9676b = i10 + 1;
            return i10;
        }

        public int a() {
            return this.f9676b;
        }
    }

    public o(l lVar) {
        this.f9664a = lVar;
    }

    public Long c() {
        return this.f9667d;
    }

    public boolean d() {
        return this.f9665b.get();
    }

    public boolean e() {
        return this.f9670g.get();
    }

    public void a(boolean z10) {
        synchronized (this.f9669f) {
            try {
                this.f9670g.set(z10);
                if (z10) {
                    this.f9671h = System.currentTimeMillis();
                    this.f9664a.Q();
                    if (p.a()) {
                        this.f9664a.Q().a("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.f9671h);
                    }
                    ActivityManager.MemoryInfo memoryInfoA = q7.a((ActivityManager) l.p().getSystemService("activity"));
                    if (memoryInfoA != null) {
                        this.f9668e = memoryInfoA.availMem;
                    }
                    Long l10 = (Long) this.f9664a.a(z4.N1);
                    if (l10.longValue() >= 0) {
                        AppLovinSdkUtils.runOnUiThreadDelayed(new s(5, this, l10), l10.longValue());
                    }
                } else {
                    this.f9671h = 0L;
                    this.f9664a.Q();
                    if (p.a()) {
                        this.f9664a.Q().a("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public long b() {
        return this.f9666c;
    }

    public void c(String str) {
        synchronized (this.f9674k) {
            try {
                a aVar = (a) this.f9673j.get(str);
                if (aVar == null) {
                    aVar = new a();
                    this.f9673j.put(str, aVar);
                }
                aVar.f9675a = System.currentTimeMillis();
                a.a(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(Object obj) {
        if (!y3.a(obj) && this.f9665b.compareAndSet(true, false)) {
            this.f9672i = null;
            this.f9664a.Q();
            if (p.a()) {
                this.f9664a.Q().a("FullScreenAdTracker", "Setting fullscreen ad hidden: " + System.currentTimeMillis());
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    public a b(String str) {
        a aVar;
        synchronized (this.f9674k) {
            aVar = (a) this.f9673j.get(str);
            if (aVar == null) {
                aVar = l;
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l10) {
        if (e() && System.currentTimeMillis() - this.f9671h >= l10.longValue()) {
            this.f9664a.Q();
            if (p.a()) {
                this.f9664a.Q().a("FullScreenAdTracker", "Resetting \"pending display\" state...");
            }
            this.f9670g.set(false);
        }
    }

    public Object a() {
        return this.f9672i;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0066  */
    public void a(Object obj) {
        if (!y3.a(obj) && this.f9665b.compareAndSet(false, true)) {
            this.f9672i = obj;
            this.f9666c = System.currentTimeMillis();
            this.f9664a.Q();
            if (p.a()) {
                this.f9664a.Q().a("FullScreenAdTracker", "Setting fullscreen ad displayed: " + this.f9666c);
            }
            ActivityManager.MemoryInfo memoryInfoA = q7.a((ActivityManager) l.p().getSystemService("activity"));
            if (memoryInfoA != null) {
                long j10 = this.f9668e;
                if (j10 > 0) {
                    this.f9667d = Long.valueOf(j10 - memoryInfoA.availMem);
                    this.f9668e = 0L;
                } else {
                    this.f9667d = null;
                }
            } else {
                this.f9667d = null;
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_displayed", obj);
            Long l10 = (Long) this.f9664a.a(z4.O1);
            if (l10.longValue() >= 0) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new androidx.fragment.app.d(this, l10, obj, 23), l10.longValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l10, Object obj) {
        if (this.f9665b.get() && System.currentTimeMillis() - this.f9666c >= l10.longValue()) {
            this.f9664a.Q();
            if (p.a()) {
                this.f9664a.Q().a("FullScreenAdTracker", "Resetting \"display\" state...");
            }
            HashMap map = new HashMap();
            if (obj instanceof com.applovin.impl.sdk.ad.b) {
                map.putAll(h2.a((AppLovinAdImpl) obj));
            } else if (obj instanceof a3) {
                map.putAll(h2.a((a3) obj));
            }
            this.f9664a.E().a(f2.f7857i1, "fullscreenAdDisplayStateTimeout", map);
            b(obj);
        }
    }

    public void a(String str) {
        synchronized (this.f9674k) {
            this.f9673j.remove(str);
        }
    }
}
