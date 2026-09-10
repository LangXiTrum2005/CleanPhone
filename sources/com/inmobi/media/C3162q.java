package com.inmobi.media;

import android.content.Context;
import android.media.AudioManager;
import com.inmobi.media.C3162q;
import com.inmobi.media.I2;
import com.inmobi.media.core.config.models.AdConfig;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.saran;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3162q {
    public static AudioManager b;
    public static C3012k c;
    public static monroe f;
    public static Function1 i;
    public static final C3162q a = new C3162q();
    public static final AtomicBoolean d = new AtomicBoolean(false);
    public static final AtomicReference e = new AtomicReference(null);
    public static final saran g = A9.d;
    public static final CopyOnWriteArraySet h = new CopyOnWriteArraySet();

    public static final Unit a(long j, I2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i2 = it.a;
        if (i2 != 101) {
            if (i2 == 102) {
                monroe monroeVar = f;
                if (monroeVar != null) {
                    monroe.attabal.attabal(monroeVar, null, 1, null);
                }
                f = null;
            }
        } else if (f == null && d.get()) {
            f = F3.a(g, 0L, j, new C3112o(null));
        }
        return Unit.f29295attabal;
    }

    public static boolean b() {
        AudioManager audioManager;
        AudioManager audioManager2;
        C3342x5.a.getClass();
        if (!C3342x5.w() ? (audioManager = b) == null || audioManager.getStreamVolume(3) != 0 : (audioManager2 = b) == null || !audioManager2.isStreamMute(3)) {
            if (!Ji.f) {
                return false;
            }
        }
        return true;
    }

    public static void a(final long j) {
        Function1 function1 = new Function1() { // from class: adsuki.cocoon
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3162q.a(j, (I2) obj);
            }
        };
        i = function1;
        ((C3349xc) Ji.e.getValue()).a(new int[]{102, 101}, function1);
    }

    public static void a(final InterfaceC3072m9 interfaceC3072m9) {
        final Context context = Ji.a;
        if (context == null) {
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).b("AdAudioTracker", "Context is null. Cannot start audio volume tracking");
            }
            a((Float) null);
            return;
        }
        C2968i4 c2968i4 = Y3.a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        final long muteChangeInterval = ((AdConfig) Y3.a.a(AdConfig.class)).getMraid3().getMuteChangeInterval();
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(H3.a(new Function0() { // from class: adsuki.delphology
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3162q.a(interfaceC3072m9, context, muteChangeInterval);
            }
        }));
        if (thM3354exceptionOrNullimpl != null) {
            if (interfaceC3072m9 != null) {
                ((C3097n9) interfaceC3072m9).b("AdAudioTracker", "Error starting audio volume tracking - " + thM3354exceptionOrNullimpl.getMessage());
            }
            a((Float) null);
        }
    }

    public static final Object a(InterfaceC3072m9 interfaceC3072m9, Context context, long j) {
        if (d.compareAndSet(false, true)) {
            return cutely.wireman(g, null, null, new C3137p(interfaceC3072m9, context, j, null), 3, null);
        }
        if (interfaceC3072m9 == null) {
            return null;
        }
        ((C3097n9) interfaceC3072m9).c("AdAudioTracker", "Audio volume tracking is already started");
        return Unit.f29295attabal;
    }

    public static void a(final Context context, InterfaceC3072m9 interfaceC3072m9) {
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(H3.a(new Function0() { // from class: adsuki.retrocession
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3162q.a(context);
            }
        }));
        if (thM3354exceptionOrNullimpl == null || interfaceC3072m9 == null) {
            return;
        }
        ((C3097n9) interfaceC3072m9).b("AdAudioTracker", "Error cleaning up audio volume tracker - " + thM3354exceptionOrNullimpl.getMessage());
    }

    public static final Unit a(final Context context) {
        final C3012k c3012k = c;
        if (c3012k != null) {
            H3.a(new Function0() { // from class: adsuki.bramley
                @Override // p002kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3162q.a(context, c3012k);
                }
            });
            c = null;
        }
        monroe monroeVar = f;
        if (monroeVar != null) {
            monroe.attabal.attabal(monroeVar, null, 1, null);
        }
        Function1 function1 = i;
        if (function1 != null) {
            ((C3349xc) Ji.e.getValue()).a(function1);
        }
        i = null;
        f = null;
        return Unit.f29295attabal;
    }

    public static final Unit a(Context context, C3012k c3012k) {
        context.unregisterReceiver(c3012k);
        return Unit.f29295attabal;
    }

    public final synchronized float a() {
        try {
            boolean zB = b();
            AudioManager audioManager = b;
            int streamVolume = audioManager != null ? audioManager.getStreamVolume(3) : 0;
            AudioManager audioManager2 = b;
            int streamMaxVolume = audioManager2 != null ? audioManager2.getStreamMaxVolume(3) : 0;
            if (zB) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            if (streamVolume < 0) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            if (streamVolume > streamMaxVolume) {
                return 1.0f;
            }
            if (streamMaxVolume == 0) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            return streamVolume / streamMaxVolume;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void a(Float f2) {
        if (Intrinsics.dern((Float) e.getAndSet(f2), f2)) {
            return;
        }
        Iterator it = h.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            InterfaceC2987j interfaceC2987j = (InterfaceC2987j) ((WeakReference) it.next()).get();
            if (interfaceC2987j != null) {
                ((Ph) interfaceC2987j).a(f2 != null ? Float.valueOf(F3.a(f2.floatValue() * 100.0f)) : null);
            }
        }
    }
}
