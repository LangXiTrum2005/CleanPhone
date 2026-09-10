package com.inmobi.media;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import com.inmobi.media.C3315w3;
import com.inmobi.media.I2;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.preterite;
import kotlinx.coroutines.privatdozent;
import kotlinx.coroutines.sakeen;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.dern;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.saneness;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: com.inmobi.media.w3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3315w3 {
    public static final C3315w3 a = new C3315w3();
    public static final taiyuan b;
    public static saran c;
    public static HandlerC2917g3 d;
    public static HandlerThread e;
    public static List f;
    public static final AtomicBoolean g;
    public static final AtomicBoolean h;
    public static final Object i;
    public static final LinkedHashMap j;
    public static final Function1 k;
    public static final C3240t3 l;

    static {
        String TAG = C3315w3.class.getSimpleName();
        b = saneness.saneness(new Function0() { // from class: adsuki.macaronic
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3315w3.b();
            }
        });
        f = new ArrayList();
        g = new AtomicBoolean(false);
        h = new AtomicBoolean(true);
        i = new Object();
        j = new LinkedHashMap();
        k = new Function1() { // from class: adsuki.dirl
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3315w3.a((I2) obj);
            }
        };
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        Runnable runnable = new Runnable() { // from class: adsuki.reconvict
            @Override // java.lang.Runnable
            public final void run() {
                C3315w3.a();
            }
        };
        Context context = Ji.a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.g.submit(runnable);
        l = new C3240t3();
    }

    public static final Unit a(I2 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i2 = event.a;
        if (i2 == 1 || i2 == 2) {
            Intrinsics.checkNotNullExpressionValue("w3", "TAG");
            h.set(false);
        } else if (i2 != 10) {
            if (i2 != 11) {
                Intrinsics.checkNotNullExpressionValue("w3", "TAG");
            } else if (!Boolean.parseBoolean(event.b)) {
                f();
            }
        } else if (Intrinsics.wireman("available", event.b)) {
            f();
        }
        return Unit.f29295attabal;
    }

    public static final void b(S2 s2) throws InterruptedException {
        int i2 = s2.f;
        if (i2 > 0) {
            s2.f = i2 - 1;
            s2.g = System.currentTimeMillis();
            kotlinx.coroutines.taiyuan.saneness(null, new C3290v3(s2, null), 1, null);
        }
    }

    public static AdConfig.ImaiConfig c() {
        C2968i4 c2968i4 = Y3.a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        return ((AdConfig) Y3.a.a(AdConfig.class)).getImai();
    }

    public static void d() {
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            Intrinsics.checkNotNullExpressionValue("w3", "TAG");
            Intrinsics.checkNotNullParameter("w3", "name");
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5L, timeUnit, linkedBlockingQueue, new B9("w3", false));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            c = privatdozent.attabal(preterite.dern(threadPoolExecutor).plus(sakeen.saneness(null, 1, null)));
            HandlerThread handlerThread = new HandlerThread("pingHandlerThread");
            e = handlerThread;
            H6.a(handlerThread, "pingHandlerThread");
            HandlerThread handlerThread2 = e;
            Intrinsics.beachfront(handlerThread2);
            Looper looper = handlerThread2.getLooper();
            Intrinsics.checkNotNullExpressionValue(looper, "getLooper(...)");
            d = new HandlerC2917g3(looper);
            ((C3349xc) Ji.e.getValue()).a(new int[]{10, 11, 2, 1}, k);
        } catch (Exception e2) {
            Intrinsics.checkNotNullExpressionValue("w3", "TAG");
            e2.getMessage();
        }
    }

    public static boolean e() {
        C2968i4 c2968i4 = Y3.a;
        Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
        return !((RootConfig) Y3.a.a(RootConfig.class)).getMonetizationDisabled();
    }

    public static void f() {
        HandlerThread handlerThread;
        try {
            if (Re.a() != null) {
                return;
            }
            synchronized (i) {
                try {
                    if (g.compareAndSet(false, true)) {
                        Intrinsics.checkNotNullExpressionValue("w3", "TAG");
                        if (e == null) {
                            HandlerThread handlerThread2 = new HandlerThread("pingHandlerThread");
                            e = handlerThread2;
                            H6.a(handlerThread2, "pingHandlerThread");
                        }
                        if (d == null && (handlerThread = e) != null) {
                            Looper looper = handlerThread.getLooper();
                            Intrinsics.checkNotNullExpressionValue(looper, "getLooper(...)");
                            d = new HandlerC2917g3(looper);
                        }
                        kotlinx.coroutines.taiyuan.saneness(null, new C3265u3(null), 1, null);
                    }
                    Unit unit = Unit.f29295attabal;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e2) {
            Intrinsics.checkNotNullExpressionValue("w3", "TAG");
            e2.getMessage();
        }
    }

    public static void g() {
        try {
            AtomicBoolean atomicBoolean = g;
            atomicBoolean.set(false);
            synchronized (i) {
                try {
                    if (!atomicBoolean.get()) {
                        HandlerThread handlerThread = e;
                        if (handlerThread != null) {
                            handlerThread.getLooper().quit();
                            handlerThread.interrupt();
                        }
                        e = null;
                        d = null;
                    }
                    Unit unit = Unit.f29295attabal;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e2) {
            Intrinsics.checkNotNullExpressionValue("w3", "TAG");
            e2.getMessage();
        }
    }

    public static final W2 b() {
        return new W2(AbstractC2948h9.b());
    }

    public static final HashMap a(S2 s2) {
        HashMap map = new HashMap();
        try {
            int maxRetries = (c().getMaxRetries() - s2.f) + 1;
            if (maxRetries > 0) {
                map.put("X-im-retry-count", String.valueOf(maxRetries));
            }
            return map;
        } catch (Exception unused) {
            Intrinsics.checkNotNullExpressionValue("w3", "TAG");
            return map;
        }
    }

    public static final void a() {
        d();
    }

    public static void a(String url, boolean z, InterfaceC3072m9 interfaceC3072m9) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullExpressionValue("w3", "TAG");
        Dg.a(Ag.REGULAR, new C3066m3(url, z, interfaceC3072m9, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object a(S2 s2, C2759a0 c2759a0, InterfaceC3072m9 interfaceC3072m9, ContinuationImpl continuationImpl) {
        C3166q3 c3166q3;
        C2759a0 c2759a1;
        S2 s3 = s2;
        InterfaceC3072m9 interfaceC3072m10 = interfaceC3072m9;
        if (continuationImpl instanceof C3166q3) {
            c3166q3 = (C3166q3) continuationImpl;
            int i2 = c3166q3.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3166q3.f = i2 - Integer.MIN_VALUE;
            } else {
                c3166q3 = new C3166q3(this, continuationImpl);
            }
        } else {
            c3166q3 = new C3166q3(this, continuationImpl);
        }
        Object obj = c3166q3.d;
        Object objBeachfront = attabal.beachfront();
        int i3 = c3166q3.f;
        if (i3 == 0) {
            dern.saneness(obj);
            if (interfaceC3072m10 != null) {
                Intrinsics.checkNotNullExpressionValue("w3", "TAG");
                ((C3097n9) interfaceC3072m10).c("w3", "record Click");
            }
            W2 w2 = (W2) b.getValue();
            int maxDbEvents = c().getMaxDbEvents();
            c3166q3.a = s3;
            c2759a1 = c2759a0;
            c3166q3.b = c2759a1;
            c3166q3.c = interfaceC3072m10;
            c3166q3.f = 1;
            C2923g9 c2923g9 = w2.a;
            V2 v2 = new V2(maxDbEvents, w2, s3, null);
            c2923g9.getClass();
            Object objA = c2923g9.a(new C2897f9(c2923g9, v2, null), c3166q3);
            if (objA != attabal.beachfront()) {
                objA = Unit.f29295attabal;
            }
            if (objA == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC3072m9 interfaceC3072m11 = c3166q3.c;
            C2759a0 c2759a2 = c3166q3.b;
            S2 s4 = c3166q3.a;
            dern.saneness(obj);
            c2759a1 = c2759a2;
            interfaceC3072m10 = interfaceC3072m11;
            s3 = s4;
        }
        if (c2759a1 != null) {
            j.put(Integer.valueOf(s3.a), c2759a1);
        }
        if (Re.a() != null) {
            if (interfaceC3072m10 != null) {
                Intrinsics.checkNotNullExpressionValue("w3", "TAG");
                ((C3097n9) interfaceC3072m10).b("w3", "No network available. Saving click for later processing ...");
            }
            g.set(false);
            g();
        } else {
            if (interfaceC3072m10 != null) {
                Intrinsics.checkNotNullExpressionValue("w3", "TAG");
                ((C3097n9) interfaceC3072m10).a("w3", "submit click - " + s3.a);
            }
            saran saranVar = c;
            if (saranVar != null) {
                cutely.wireman(saranVar, null, null, new C3190r3(s3, interfaceC3072m10, null), 3, null);
            }
        }
        return Unit.f29295attabal;
    }

    public static void a(S2 click, String reason) {
        Intrinsics.checkNotNullParameter(click, "click");
        Intrinsics.checkNotNullParameter(reason, "error");
        LinkedHashMap linkedHashMap = j;
        C2759a0 c2759a0 = (C2759a0) linkedHashMap.get(Integer.valueOf(click.a));
        if (c2759a0 != null) {
            Intrinsics.checkNotNullParameter(click, "click");
            Intrinsics.checkNotNullParameter(reason, "error");
            C2934gk c2934gk = c2759a0.b;
            Intrinsics.checkNotNullParameter(reason, "reason");
            LinkedHashMap linkedHashMapA = c2934gk.a();
            linkedHashMapA.put("networkType", C3342x5.m());
            linkedHashMapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2178);
            linkedHashMapA.put("reason", reason);
            String str = c2934gk.d;
            if (str == null) {
                str = "";
            }
            linkedHashMapA.put("impressionId", str);
            Wj wj = Wj.a;
            Wj.b("AdImpressionSuccessful", linkedHashMapA, EnumC2779ak.SDK);
        }
        linkedHashMap.remove(Integer.valueOf(click.a));
    }
}
