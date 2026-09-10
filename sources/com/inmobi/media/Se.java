package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.ads.exceptions.VastException;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.Se;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes5.dex */
public final class Se {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Se f23186a = new Se();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy f23187b = LazyKt.b(Re.f23129a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy f23188c = LazyKt.b(Qe.f23113a);

    public static void a(C3040h ad, AdConfig adConfig, Te te, InterfaceC3333z5 interfaceC3333z5) {
        Intrinsics.f(ad, "ad");
        Intrinsics.f(adConfig, "adConfig");
        ((ExecutorService) f23187b.getX()).execute(new A.F(ad, adConfig, te, interfaceC3333z5, 0));
    }

    public static final void b(C3040h ad, AdConfig adConfig, Te te, InterfaceC3333z5 interfaceC3333z5) {
        Intrinsics.f(ad, "$ad");
        Intrinsics.f(adConfig, "$adConfig");
        Se se = f23186a;
        try {
            if (se.a(ad.s(), te)) {
                C3040h c3040hA = J.a(ad, adConfig, interfaceC3333z5);
                if (c3040hA == null) {
                    se.a(ad, false, (short) 75);
                } else {
                    se.a(c3040hA, true, (short) 0);
                }
            }
        } catch (VastException e2) {
            se.a(ad, false, e2.getTelemetryErrorCode());
        } catch (JSONException unused) {
            se.a(ad, false, (short) 58);
        }
    }

    public final synchronized boolean a(String str, Te te) {
        Lazy lazy = f23188c;
        List list = (List) ((HashMap) lazy.getX()).get(str);
        if (list != null) {
            list.add(new WeakReference(te));
            return false;
        }
        ((HashMap) lazy.getX()).put(str, CollectionsKt.L(new WeakReference(te)));
        return true;
    }

    public final synchronized void a(final C3040h c3040h, final boolean z2, final short s) {
        List list = (List) ((HashMap) f23188c.getX()).remove(c3040h.s());
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final Te te = (Te) ((WeakReference) it.next()).get();
                if (te != null) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: A.E
                        @Override // java.lang.Runnable
                        public final void run() {
                            Se.a(te, c3040h, z2, s);
                        }
                    });
                }
            }
        }
    }

    public static final void a(Te te, C3040h ad, boolean z2, short s) {
        Intrinsics.f(ad, "$ad");
        te.a(ad, z2, s);
    }
}
