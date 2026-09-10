package com.inmobi.media;

import A.RunnableC0895i;
import android.content.Context;
import android.media.AudioManager;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3215s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static AudioManager f23973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C3136n f23974c;
    public static ScheduledFuture f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static C3184q f23976h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3215s f23972a = new C3215s();
    public static final AtomicBoolean d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReference f23975e = new AtomicReference(null);
    public static final Set g = Collections.synchronizedSet(new LinkedHashSet());

    public static void a(InterfaceC3333z5 interfaceC3333z5, Ib listener) {
        Intrinsics.f(listener, "listener");
        ((ScheduledThreadPoolExecutor) AbstractC3332z4.f24145c.getX()).execute(new A.u0(interfaceC3333z5, listener, 0));
    }

    public static final void b(InterfaceC3333z5 interfaceC3333z5, Ib listener) {
        Intrinsics.f(listener, "$listener");
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("AdAudioTracker", "Adding audio volume change listener. Existing listeners - " + g.size());
        }
        Set<WeakReference> listeners = g;
        Intrinsics.e(listeners, "listeners");
        for (WeakReference weakReference : listeners) {
            if (weakReference.get() == null) {
                g.remove(weakReference);
            }
        }
        Set set = g;
        boolean zIsEmpty = set.isEmpty();
        set.add(new WeakReference(listener));
        Float f2 = (Float) f23975e.get();
        Float fValueOf = f2 != null ? Float.valueOf(B2.a(f2.floatValue() * 100.0f)) : null;
        listener.f22891a.c("window.mraidview.broadcastEvent('audioVolumeChange', " + fValueOf + ");");
        if (!zIsEmpty) {
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).c("AdAudioTracker", "Resuming audio volume change listener");
                return;
            }
            return;
        }
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("AdAudioTracker", "Starting audio volume change listener");
        }
        Context contextD = Uc.d();
        if (contextD == null) {
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("AdAudioTracker", "Context is null. Cannot start audio volume tracking");
            }
            a((Float) null);
            return;
        }
        LinkedHashMap linkedHashMap = O2.f23027a;
        Throwable thA = Result.a(C2.a(new r(interfaceC3333z5, contextD, ((AdConfig) AbstractC3174p5.a("ads", "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null)).getMraid3().getMuteChangeInterval())));
        if (thA != null) {
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).b("AdAudioTracker", androidx.datastore.preferences.protobuf.a.o(thA, new StringBuilder("Error starting audio volume tracking - ")));
            }
            a((Float) null);
        }
    }

    public static void c(InterfaceC3333z5 interfaceC3333z5, Ib listener) {
        Intrinsics.f(listener, "listener");
        ((ScheduledThreadPoolExecutor) AbstractC3332z4.f24145c.getX()).execute(new A.u0(interfaceC3333z5, listener, 1));
    }

    public static final void d(InterfaceC3333z5 interfaceC3333z5, Ib listener) {
        Intrinsics.f(listener, "$listener");
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).c("AdAudioTracker", "Removing audio volume change listener");
        }
        Set<WeakReference> listeners = g;
        Intrinsics.e(listeners, "listeners");
        for (WeakReference weakReference : listeners) {
            if (Intrinsics.a(weakReference.get(), listener)) {
                g.remove(weakReference);
            }
        }
        if (g.isEmpty()) {
            if (interfaceC3333z5 != null) {
                ((A5) interfaceC3333z5).c("AdAudioTracker", "Stopping audio volume change listener");
            }
            Context contextD = Uc.d();
            if (contextD == null) {
                if (interfaceC3333z5 != null) {
                    ((A5) interfaceC3333z5).b("AdAudioTracker", "Context is null. Cannot stop audio volume tracking");
                }
                a((Float) null);
            } else {
                if (!d.compareAndSet(true, false)) {
                    if (interfaceC3333z5 != null) {
                        ((A5) interfaceC3333z5).c("AdAudioTracker", "Audio volume tracking is already stopped");
                        return;
                    }
                    return;
                }
                if (interfaceC3333z5 != null) {
                    ((A5) interfaceC3333z5).c("AdAudioTracker", "Stopping audio volume tracking");
                }
                Throwable thA = Result.a(C2.a(new C3168p(contextD)));
                if (thA == null || interfaceC3333z5 == null) {
                    return;
                }
                ((A5) interfaceC3333z5).b("AdAudioTracker", androidx.datastore.preferences.protobuf.a.o(thA, new StringBuilder("Error cleaning up audio volume tracker - ")));
            }
        }
    }

    public static final void e() {
        if (d.get() && b()) {
            a(Float.valueOf(0.0f));
        }
    }

    public static void a(long j) {
        f = ((ScheduledThreadPoolExecutor) AbstractC3332z4.f24145c.getX()).scheduleWithFixedDelay(new RunnableC0895i(9), 0L, j, TimeUnit.MILLISECONDS);
    }

    public static void c() {
        if (!L3.f22938a.H()) {
            a((Float) null);
        } else {
            ((ScheduledThreadPoolExecutor) AbstractC3332z4.f24145c.getX()).execute(new RunnableC0895i(10));
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0028  */
    public final synchronized float a() {
        float f2;
        try {
            boolean zB = b();
            AudioManager audioManager = f23973b;
            int streamVolume = audioManager != null ? audioManager.getStreamVolume(3) : 0;
            AudioManager audioManager2 = f23973b;
            int streamMaxVolume = audioManager2 != null ? audioManager2.getStreamMaxVolume(3) : 0;
            if (zB || streamVolume < 0) {
                f2 = 0.0f;
            } else if (streamVolume > streamMaxVolume) {
                f2 = 1.0f;
            } else if (streamMaxVolume == 0) {
                f2 = 0.0f;
            } else {
                f2 = streamVolume / streamMaxVolume;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2;
    }

    public static void a(Float f2) {
        Float f3 = (Float) f23975e.getAndSet(f2);
        if (f3 == null) {
            if (f2 == null) {
                return;
            }
        } else if (f2 != null && f3.floatValue() == f2.floatValue()) {
            return;
        }
        Iterator it = g.iterator();
        while (it.hasNext()) {
            Ib ib = (Ib) ((WeakReference) it.next()).get();
            if (ib != null) {
                Float fValueOf = f2 != null ? Float.valueOf(B2.a(f2.floatValue() * 100.0f)) : null;
                ib.f22891a.c("window.mraidview.broadcastEvent('audioVolumeChange', " + fValueOf + ");");
            }
        }
    }

    public static final void d() {
        a(Float.valueOf(f23972a.a()));
    }

    public static boolean b() {
        AudioManager audioManager;
        AudioManager audioManager2;
        if (!L3.f22938a.H() ? (audioManager = f23973b) == null || audioManager.getStreamVolume(3) != 0 : (audioManager2 = f23973b) == null || !audioManager2.isStreamMute(3)) {
            if (!Uc.o()) {
                return false;
            }
        }
        return true;
    }
}
