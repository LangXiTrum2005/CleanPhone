package com.inmobi.media;

import A.RunnableC0895i;
import A.RunnableC0899k;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3298x2 implements N2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ThreadPoolExecutor f24090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static HandlerC3171p2 f24091c;
    public static HandlerThread d;
    public static AdConfig.ImaiConfig g;
    public static final C3282w2 m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3298x2 f24089a = new C3298x2();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static List f24092e = new ArrayList();
    public static final AtomicBoolean f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicBoolean f24093h = new AtomicBoolean(true);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f24094i = new Object();
    public static final LinkedHashMap j = new LinkedHashMap();
    public static final C3250u2 k = C3250u2.f24018a;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Lazy f24095l = LazyKt.b(C3266v2.f24042a);

    static {
        Uc.a(new RunnableC0895i(12));
        m = new C3282w2();
    }

    public static final HashMap a(C3298x2 c3298x2, C3107l2 c3107l2) {
        c3298x2.getClass();
        HashMap map = new HashMap();
        try {
            AdConfig.ImaiConfig imaiConfig = g;
            int maxRetries = ((imaiConfig != null ? imaiConfig.getMaxRetries() : 0) - c3107l2.f) + 1;
            if (maxRetries > 0) {
                map.put("X-im-retry-count", String.valueOf(maxRetries));
            }
        } catch (Exception unused) {
        }
        return map;
    }

    public static final /* synthetic */ String f() {
        return "x2";
    }

    public static void i() {
        try {
            AtomicBoolean atomicBoolean = f;
            atomicBoolean.set(false);
            synchronized (f24094i) {
                try {
                    if (!atomicBoolean.get()) {
                        HandlerThread handlerThread = d;
                        if (handlerThread != null) {
                            handlerThread.getLooper().quit();
                            handlerThread.interrupt();
                        }
                        d = null;
                        f24091c = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
    }

    public final boolean g() {
        return ((Boolean) f24095l.getX()).booleanValue();
    }

    public final void h() {
        HandlerThread handlerThread;
        try {
            if (T9.a(false) != null) {
                return;
            }
            synchronized (f24094i) {
                try {
                    AtomicBoolean atomicBoolean = f;
                    if (atomicBoolean.compareAndSet(false, true)) {
                        if (d == null) {
                            HandlerThread handlerThread2 = new HandlerThread("pingHandlerThread");
                            d = handlerThread2;
                            D4.a(handlerThread2, "pingHandlerThread");
                        }
                        if (f24091c == null && (handlerThread = d) != null) {
                            Looper looper = handlerThread.getLooper();
                            Intrinsics.e(looper, "getLooper(...)");
                            f24091c = new HandlerC3171p2(looper);
                        }
                        C3123m2 c3123m2B = Nc.b();
                        if (c3123m2B == null || T1.a(c3123m2B, null, null, 63) == 0) {
                            atomicBoolean.set(false);
                            i();
                        } else {
                            Message messageObtain = Message.obtain();
                            messageObtain.what = 1;
                            HandlerC3171p2 handlerC3171p2 = f24091c;
                            if (handlerC3171p2 != null) {
                                handlerC3171p2.sendMessage(messageObtain);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
    }

    public static final void b(C3298x2 c3298x2, C3107l2 c3107l2) {
        c3298x2.getClass();
        LinkedHashMap linkedHashMap = j;
        Z1 z1 = (Z1) linkedHashMap.get(Integer.valueOf(c3107l2.f23758a));
        if (z1 != null) {
            z1.a(c3107l2);
        }
        linkedHashMap.remove(Integer.valueOf(c3107l2.f23758a));
    }

    public static final void c(C3298x2 c3298x2, C3107l2 c3107l2) {
        c3298x2.getClass();
        int i2 = c3107l2.f;
        if (i2 > 0) {
            c3107l2.f = i2 - 1;
            c3107l2.g = System.currentTimeMillis();
            C3123m2 c3123m2B = Nc.b();
            c3123m2B.getClass();
            c3123m2B.b(c3107l2, "id = ?", new String[]{String.valueOf(c3107l2.f23758a)});
        }
    }

    public static final /* synthetic */ void a(C3298x2 c3298x2) {
        c3298x2.getClass();
        i();
    }

    public static final void a() {
        C3298x2 c3298x2 = f24089a;
        try {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new K5("x2"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            f24090b = threadPoolExecutor;
            HandlerThread handlerThread = new HandlerThread("pingHandlerThread");
            d = handlerThread;
            D4.a(handlerThread, "pingHandlerThread");
            HandlerThread handlerThread2 = d;
            Intrinsics.c(handlerThread2);
            Looper looper = handlerThread2.getLooper();
            Intrinsics.e(looper, "getLooper(...)");
            f24091c = new HandlerC3171p2(looper);
            LinkedHashMap linkedHashMap = O2.f23027a;
            Config configA = M2.a("ads", Uc.b(), c3298x2);
            Intrinsics.d(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig");
            g = ((AdConfig) configA).getImai();
            Uc.f().a(new int[]{10, 11, 2, 1}, k);
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void b(C3298x2 c3298x2, String str, boolean z2, Z1 z1, InterfaceC3333z5 interfaceC3333z5, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z1 = null;
        }
        c3298x2.b(str, z2, z1, interfaceC3333z5);
    }

    public final void b(String url, boolean z2, Z1 z1, InterfaceC3333z5 interfaceC3333z5) {
        Intrinsics.f(url, "url");
        Ua ua = AbstractC3314y2.f24114a;
        AbstractC3314y2.a(new A.J0(url, z2, interfaceC3333z5, z1, 1), Ta.f23232b);
    }

    public static final void c(String url, boolean z2, InterfaceC3333z5 interfaceC3333z5) {
        Intrinsics.f(url, "$url");
        try {
            if (f24089a.g()) {
                AdConfig.ImaiConfig imaiConfig = g;
                C3107l2 c3107l2 = new C3107l2(url, null, z2, true, (imaiConfig != null ? imaiConfig.getMaxRetries() : 0) + 1, 197);
                if (interfaceC3333z5 != null) {
                    ((A5) interfaceC3333z5).c("x2", "Received click (" + url + ") for pinging in WebView");
                }
                a(c3107l2, (Z1) null, interfaceC3333z5);
            }
        } catch (Exception e2) {
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("x2", rf.a(e2, H6.a("x2", "TAG", "SDK encountered unexpected error in pinging click over WebView; ")));
            }
        }
    }

    public static final void b(String url, boolean z2, InterfaceC3333z5 interfaceC3333z5, Z1 z1) {
        Intrinsics.f(url, "$url");
        try {
            if (f24089a.g()) {
                AdConfig.ImaiConfig imaiConfig = g;
                C3107l2 c3107l2 = new C3107l2(url, null, z2, false, (imaiConfig != null ? imaiConfig.getMaxRetries() : 0) + 1, 197);
                if (interfaceC3333z5 != null) {
                    ((A5) interfaceC3333z5).a("x2", "Received click (" + url + ") for pinging over HTTP");
                }
                a(c3107l2, z1, interfaceC3333z5);
            }
        } catch (Exception e2) {
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("x2", rf.a(e2, H6.a("x2", "TAG", "SDK encountered unexpected error in pinging click; ")));
            }
        }
    }

    public final void b(String url, boolean z2, InterfaceC3333z5 interfaceC3333z5) {
        Intrinsics.f(url, "url");
        Ua ua = AbstractC3314y2.f24114a;
        AbstractC3314y2.a(new RunnableC0899k(url, z2, interfaceC3333z5, 2), Ta.f23233c);
    }

    @Override // com.inmobi.media.N2
    public void a(Config config) {
        Intrinsics.f(config, "config");
        AdConfig adConfig = config instanceof AdConfig ? (AdConfig) config : null;
        g = adConfig != null ? adConfig.getImai() : null;
    }

    public final void a(String url, boolean z2, InterfaceC3333z5 interfaceC3333z5) {
        Intrinsics.f(url, "url");
        a(url, z2, (Z1) null, interfaceC3333z5);
    }

    public static /* synthetic */ void a(C3298x2 c3298x2, String str, boolean z2, Z1 z1, InterfaceC3333z5 interfaceC3333z5, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z1 = null;
        }
        c3298x2.a(str, z2, z1, interfaceC3333z5);
    }

    public final void a(String url, boolean z2, Z1 z1, InterfaceC3333z5 interfaceC3333z5) {
        Intrinsics.f(url, "url");
        Ua ua = AbstractC3314y2.f24114a;
        AbstractC3314y2.a(new A.J0(url, z2, interfaceC3333z5, z1, 0), Ta.f23233c);
    }

    public static final void a(String url, boolean z2, InterfaceC3333z5 interfaceC3333z5, Z1 z1) {
        Intrinsics.f(url, "$url");
        try {
            if (f24089a.g()) {
                AdConfig.ImaiConfig imaiConfig = g;
                C3107l2 c3107l2 = new C3107l2(url, null, z2, false, (imaiConfig != null ? imaiConfig.getMaxRetries() : 0) + 1, 197);
                if (interfaceC3333z5 != null) {
                    ((A5) interfaceC3333z5).a("x2", "Received click (" + url + ") for pinging over HTTP");
                }
                a(c3107l2, z1, interfaceC3333z5);
            }
        } catch (Exception e2) {
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("x2", rf.a(e2, H6.a("x2", "TAG", "SDK encountered unexpected error in pinging click; ")));
            }
        }
    }

    public static /* synthetic */ void a(C3298x2 c3298x2, String str, Map map, boolean z2, Z1 z1, Ta ta, InterfaceC3333z5 interfaceC3333z5, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z1 = null;
        }
        c3298x2.a(str, map, z2, z1, ta, interfaceC3333z5);
    }

    public final void a(String url, Map<String, String> map, boolean z2, Z1 z1, Ta priority, InterfaceC3333z5 interfaceC3333z5) {
        Intrinsics.f(url, "url");
        Intrinsics.f(priority, "priority");
        AbstractC3314y2.a(new A.K0(url, map, z2, interfaceC3333z5, z1, 0), priority);
    }

    public static final void a(String url, Map map, boolean z2, InterfaceC3333z5 interfaceC3333z5, Z1 z1) {
        Intrinsics.f(url, "$url");
        try {
            if (f24089a.g()) {
                AdConfig.ImaiConfig imaiConfig = g;
                C3107l2 c3107l2 = new C3107l2(url, map, z2, false, (imaiConfig != null ? imaiConfig.getMaxRetries() : 0) + 1, 193);
                if (interfaceC3333z5 != null) {
                    ((A5) interfaceC3333z5).a("x2", "Received click (" + url + ") for pinging over HTTP");
                }
                a(c3107l2, z1, interfaceC3333z5);
            }
        } catch (Exception e2) {
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("x2", rf.a(e2, H6.a("x2", "TAG", "SDK encountered unexpected error in pinging click; ")));
            }
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
    }

    public static void a(C3107l2 click, Z1 z1, InterfaceC3333z5 interfaceC3333z5) {
        C3107l2 c3107l2;
        HandlerC3171p2 handlerC3171p2 = f24091c;
        if (handlerC3171p2 != null) {
            handlerC3171p2.f23880a = interfaceC3333z5;
        }
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("x2", "record Click");
        }
        AdConfig.ImaiConfig imaiConfig = g;
        if (imaiConfig != null) {
            C3123m2 c3123m2B = Nc.b();
            int maxDbEvents = imaiConfig.getMaxDbEvents();
            synchronized (c3123m2B) {
                try {
                    Intrinsics.f(click, "click");
                    if (T1.a(c3123m2B, null, null, 63) >= maxDbEvents && (c3107l2 = (C3107l2) c3123m2B.b("ts= (SELECT MIN(ts) FROM click LIMIT 1)", null)) != null) {
                        f24089a.a(click, "DB_OVERLOAD");
                        c3123m2B.a("id = ?", new String[]{String.valueOf(c3107l2.f23758a)});
                    }
                    c3123m2B.a(click);
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z1 != null) {
                j.put(Integer.valueOf(click.f23758a), z1);
            }
        }
        if (T9.a(false) != null) {
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("x2", "No network available. Saving click for later processing ...");
            }
            f.set(false);
            i();
            return;
        }
        if (interfaceC3333z5 != null) {
            StringBuilder sbA = H6.a("x2", "TAG", "submit click - ");
            sbA.append(click.f23758a);
            ((A5) interfaceC3333z5).a("x2", sbA.toString());
        }
        ThreadPoolExecutor threadPoolExecutor = f24090b;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.submit(new A.I0(1, click, interfaceC3333z5));
        }
    }

    public static final void a(C3107l2 click, InterfaceC3333z5 interfaceC3333z5) {
        Intrinsics.f(click, "$click");
        SystemClock.elapsedRealtime();
        if (click.f23761e) {
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).c("x2", "ping in web view");
            }
            new C3202r2(m, interfaceC3333z5).a(click);
        } else {
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).c("x2", "ping in http executor");
            }
            new C3218s2(m, interfaceC3333z5).a(click);
        }
    }

    public final void a(C3107l2 click, String error) {
        Intrinsics.f(click, "click");
        Intrinsics.f(error, "error");
        LinkedHashMap linkedHashMap = j;
        Z1 z1 = (Z1) linkedHashMap.get(Integer.valueOf(click.f23758a));
        if (z1 != null) {
            z1.a(click, error);
        }
        linkedHashMap.remove(Integer.valueOf(click.f23758a));
    }
}
