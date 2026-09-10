package com.inmobi.media;

import com.inmobi.media.C3006ji;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ji, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3006ji extends AbstractC2880ei {
    public final /* synthetic */ C3031ki a;
    public final /* synthetic */ ko b;
    public final /* synthetic */ Di c;

    public C3006ji(C3031ki c3031ki, ko koVar, Di di) {
        this.a = c3031ki;
        this.b = koVar;
        this.c = di;
    }

    public static final void a(ko koVar, Di di, C3031ki c3031ki, GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci) {
        String id = di.a;
        koVar.getClass();
        Intrinsics.checkNotNullParameter(id, "id");
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci2 = (GestureDetectorOnGestureListenerC2829ci) koVar.b.get(id);
        if (gestureDetectorOnGestureListenerC2829ci2 == null) {
            InterfaceC3072m9 logger = c3031ki.getLogger();
            if (logger != null) {
                ((C3097n9) logger).b(c3031ki.k1, "Source RenderView not found for id: " + di.a);
                return;
            }
            return;
        }
        Integer numA = gestureDetectorOnGestureListenerC2829ci.getWvStateMachine().a(3);
        if (numA != null) {
            int iIntValue = numA.intValue();
            InterfaceC3072m9 logger2 = c3031ki.getLogger();
            if (logger2 != null) {
                ((C3097n9) logger2).b(c3031ki.k1, "Failed to transition to FIRE_AD_FAILED state: " + iIntValue);
            }
            gestureDetectorOnGestureListenerC2829ci2.a("loadWebView", AbstractC3255ti.a(gestureDetectorOnGestureListenerC2829ci.getRoute().b, iIntValue));
        }
    }

    public static final void b(ko koVar, Di di, C3031ki c3031ki, GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci) throws JSONException {
        String id = di.a;
        koVar.getClass();
        Intrinsics.checkNotNullParameter(id, "id");
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci2 = (GestureDetectorOnGestureListenerC2829ci) koVar.b.get(id);
        if (gestureDetectorOnGestureListenerC2829ci2 == null) {
            InterfaceC3072m9 logger = c3031ki.getLogger();
            if (logger != null) {
                ((C3097n9) logger).b(c3031ki.k1, "Source RenderView not found for id: " + di.a);
                return;
            }
            return;
        }
        Integer numA = gestureDetectorOnGestureListenerC2829ci.getWvStateMachine().a(2);
        if (numA == null) {
            c3031ki.b(gestureDetectorOnGestureListenerC2829ci2, di.b);
            return;
        }
        int iIntValue = numA.intValue();
        InterfaceC3072m9 logger2 = c3031ki.getLogger();
        if (logger2 != null) {
            ((C3097n9) logger2).b(c3031ki.k1, "Failed to transition to FIRE_AD_READY state: " + iIntValue);
        }
        gestureDetectorOnGestureListenerC2829ci2.a("loadWebView", AbstractC3255ti.a(gestureDetectorOnGestureListenerC2829ci.getRoute().b, iIntValue));
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final void e(GestureDetectorOnGestureListenerC2829ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        GestureDetectorOnGestureListenerC2829ci adRenderView = this.a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().e(adRenderView);
        }
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final void f(GestureDetectorOnGestureListenerC2829ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final void g(GestureDetectorOnGestureListenerC2829ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final void h(final GestureDetectorOnGestureListenerC2829ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Wb wb = (Wb) AbstractC3119o6.e.getValue();
        final ko koVar = this.b;
        final Di di = this.c;
        final C3031ki c3031ki = this.a;
        Runnable runnable = new Runnable() { // from class: adsuki.vintage
            @Override // java.lang.Runnable
            public final void run() {
                C3006ji.a(koVar, di, c3031ki, renderView);
            }
        };
        wb.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        wb.a.post(runnable);
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final void i(final GestureDetectorOnGestureListenerC2829ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Wb wb = (Wb) AbstractC3119o6.e.getValue();
        final ko koVar = this.b;
        final Di di = this.c;
        final C3031ki c3031ki = this.a;
        Runnable runnable = new Runnable() { // from class: adsuki.slurp
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                C3006ji.b(koVar, di, c3031ki, renderView);
            }
        };
        wb.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        wb.a.post(runnable);
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final void j(GestureDetectorOnGestureListenerC2829ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final void k(GestureDetectorOnGestureListenerC2829ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        GestureDetectorOnGestureListenerC2829ci adRenderView = this.a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().k(adRenderView);
        }
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final void a(GestureDetectorOnGestureListenerC2829ci renderView, final boolean z) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Wb wb = (Wb) AbstractC3119o6.e.getValue();
        final C3031ki c3031ki = this.a;
        final Di di = this.c;
        Runnable runnable = new Runnable() { // from class: adsuki.jugal
            @Override // java.lang.Runnable
            public final void run() {
                C3006ji.a(c3031ki, di, z);
            }
        };
        wb.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        wb.a.post(runnable);
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final void c() {
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final void b(GestureDetectorOnGestureListenerC2829ci renderView) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        GestureDetectorOnGestureListenerC2829ci adRenderView = this.a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().b(adRenderView);
        }
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final void a(C2934gk telemetryOnAdImpression) {
        AbstractC2880ei listener;
        Intrinsics.checkNotNullParameter(telemetryOnAdImpression, "telemetryOnAdImpression");
        GestureDetectorOnGestureListenerC2829ci adRenderView = this.a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(telemetryOnAdImpression);
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final void a(HashMap params) {
        Intrinsics.checkNotNullParameter(params, "params");
        GestureDetectorOnGestureListenerC2829ci adRenderView = this.a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.a(params);
        }
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final void a(String eventType, HashMap kv) {
        AbstractC2880ei listener;
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(kv, "kv");
        GestureDetectorOnGestureListenerC2829ci adRenderView = this.a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(eventType, kv);
    }

    @Override // com.inmobi.media.AbstractC2880ei, com.inmobi.media.InterfaceC2780al
    public final void a() {
        AbstractC2880ei listener;
        GestureDetectorOnGestureListenerC2829ci adRenderView = this.a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a();
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final void a(GestureDetectorOnGestureListenerC2829ci renderView, String trackerName, Map macros) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
        GestureDetectorOnGestureListenerC2829ci adRenderView = this.a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().a(adRenderView, trackerName, macros);
        }
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final void a(V1 audioStatusInternal) {
        AbstractC2880ei listener;
        Intrinsics.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        GestureDetectorOnGestureListenerC2829ci adRenderView = this.a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(audioStatusInternal);
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final void a(boolean z) {
        AbstractC2880ei listener;
        GestureDetectorOnGestureListenerC2829ci adRenderView = this.a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(z);
    }

    @Override // com.inmobi.media.AbstractC2880ei
    public final void a(String data) {
        AbstractC2880ei listener;
        Intrinsics.checkNotNullParameter(data, "data");
        GestureDetectorOnGestureListenerC2829ci adRenderView = this.a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(data);
    }

    public static final void a(C3031ki c3031ki, Di di, boolean z) {
        if (c3031ki.getWvStateMachine().a(4) != null) {
            c3031ki.a("loadWebView", AbstractC3255ti.a(di.b, 307));
        }
        GestureDetectorOnGestureListenerC2829ci adRenderView = c3031ki.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().a(adRenderView, z);
        }
    }
}
