package com.inmobi.media;

import A.RunnableC0884c0;
import A.RunnableC0899k;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.kc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3101kc extends AbstractC3037gc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3117lc f23751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tf f23752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Cc f23753c;

    public C3101kc(C3117lc c3117lc, tf tfVar, Cc cc) {
        this.f23751a = c3117lc;
        this.f23752b = tfVar;
        this.f23753c = cc;
    }

    public static final void b(tf webViewFactory, Cc route, C3117lc this$0, GestureDetectorOnGestureListenerC3005ec renderView) {
        Intrinsics.f(webViewFactory, "$webViewFactory");
        Intrinsics.f(route, "$route");
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(renderView, "$renderView");
        String id = route.f22750a;
        Intrinsics.f(id, "id");
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = (GestureDetectorOnGestureListenerC3005ec) webViewFactory.f24017b.get(id);
        if (gestureDetectorOnGestureListenerC3005ec == null) {
            InterfaceC3333z5 logger = this$0.getLogger();
            if (logger != null) {
                ((A5) logger).b(this$0.e1, "Source RenderView not found for id: " + route.f22750a);
                return;
            }
            return;
        }
        Integer numA = renderView.getWvStateMachine().a(2);
        if (numA != null) {
            int iIntValue = numA.intValue();
            InterfaceC3333z5 logger2 = this$0.getLogger();
            if (logger2 != null) {
                ((A5) logger2).b(this$0.e1, android.support.v4.media.a.h(iIntValue, "Failed to transition to FIRE_AD_READY state: "));
            }
            gestureDetectorOnGestureListenerC3005ec.a("loadWebView", AbstractC3181pc.a(renderView.getRoute().f22751b, iIntValue));
            return;
        }
        String targetId = route.f22751b;
        Intrinsics.f(targetId, "targetId");
        InterfaceC3333z5 interfaceC3333z5 = this$0.f23587i;
        if (interfaceC3333z5 != null) {
            String TAG = GestureDetectorOnGestureListenerC3005ec.a1;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "fireLoadWebViewSuccess " + this$0);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", targetId);
        C3149nc c3149nc = this$0.W;
        jSONObject.put("latency", c3149nc != null ? c3149nc.f23838h : 0L);
        gestureDetectorOnGestureListenerC3005ec.c("window.imraidview.broadcastEvent('webViewLoaded', " + jSONObject + ");");
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public final void a(Yd telemetryOnAdImpression) {
        AbstractC3037gc listener;
        Intrinsics.f(telemetryOnAdImpression, "telemetryOnAdImpression");
        GestureDetectorOnGestureListenerC3005ec adRenderView = this.f23751a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(telemetryOnAdImpression);
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public final void c() {
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public final void d(GestureDetectorOnGestureListenerC3005ec renderView) {
        Intrinsics.f(renderView, "renderView");
        GestureDetectorOnGestureListenerC3005ec adRenderView = this.f23751a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().d(adRenderView);
        }
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public final void e(GestureDetectorOnGestureListenerC3005ec renderView) {
        Intrinsics.f(renderView, "renderView");
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public final void f(GestureDetectorOnGestureListenerC3005ec renderView) {
        Intrinsics.f(renderView, "renderView");
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public final void g(GestureDetectorOnGestureListenerC3005ec renderView) {
        Intrinsics.f(renderView, "renderView");
        ExecutorC3160o7 executorC3160o7 = (ExecutorC3160o7) AbstractC3332z4.d.getX();
        RunnableC0884c0 runnableC0884c0 = new RunnableC0884c0(this.f23752b, this.f23753c, this.f23751a, renderView, 0);
        executorC3160o7.getClass();
        executorC3160o7.f23866a.post(runnableC0884c0);
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public final void h(GestureDetectorOnGestureListenerC3005ec renderView) {
        Intrinsics.f(renderView, "renderView");
        ExecutorC3160o7 executorC3160o7 = (ExecutorC3160o7) AbstractC3332z4.d.getX();
        RunnableC0884c0 runnableC0884c0 = new RunnableC0884c0(this.f23752b, this.f23753c, this.f23751a, renderView, 1);
        executorC3160o7.getClass();
        executorC3160o7.f23866a.post(runnableC0884c0);
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public final void i(GestureDetectorOnGestureListenerC3005ec renderView) {
        Intrinsics.f(renderView, "renderView");
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public final void j(GestureDetectorOnGestureListenerC3005ec renderView) {
        Intrinsics.f(renderView, "renderView");
        GestureDetectorOnGestureListenerC3005ec adRenderView = this.f23751a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().j(adRenderView);
        }
    }

    public static final void a(tf webViewFactory, Cc route, C3117lc this$0, GestureDetectorOnGestureListenerC3005ec renderView) {
        Intrinsics.f(webViewFactory, "$webViewFactory");
        Intrinsics.f(route, "$route");
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(renderView, "$renderView");
        String id = route.f22750a;
        Intrinsics.f(id, "id");
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = (GestureDetectorOnGestureListenerC3005ec) webViewFactory.f24017b.get(id);
        if (gestureDetectorOnGestureListenerC3005ec == null) {
            InterfaceC3333z5 logger = this$0.getLogger();
            if (logger != null) {
                ((A5) logger).b(this$0.e1, "Source RenderView not found for id: " + route.f22750a);
                return;
            }
            return;
        }
        Integer numA = renderView.getWvStateMachine().a(3);
        if (numA != null) {
            int iIntValue = numA.intValue();
            InterfaceC3333z5 logger2 = this$0.getLogger();
            if (logger2 != null) {
                ((A5) logger2).b(this$0.e1, android.support.v4.media.a.h(iIntValue, "Failed to transition to FIRE_AD_FAILED state: "));
            }
            gestureDetectorOnGestureListenerC3005ec.a("loadWebView", AbstractC3181pc.a(renderView.getRoute().f22751b, iIntValue));
        }
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public final void a(HashMap params) {
        AbstractC3037gc listener;
        Intrinsics.f(params, "params");
        GestureDetectorOnGestureListenerC3005ec adRenderView = this.f23751a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(params);
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public final void a(String eventType, Map kv) {
        AbstractC3037gc listener;
        Intrinsics.f(eventType, "eventType");
        Intrinsics.f(kv, "kv");
        GestureDetectorOnGestureListenerC3005ec adRenderView = this.f23751a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(eventType, kv);
    }

    @Override // com.inmobi.media.AbstractC3037gc, com.inmobi.media.Fe
    public final void a() {
        AbstractC3037gc listener;
        GestureDetectorOnGestureListenerC3005ec adRenderView = this.f23751a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a();
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public final void a(GestureDetectorOnGestureListenerC3005ec renderView, String trackerName, Map macros) {
        Intrinsics.f(renderView, "renderView");
        Intrinsics.f(trackerName, "trackerName");
        Intrinsics.f(macros, "macros");
        GestureDetectorOnGestureListenerC3005ec adRenderView = this.f23751a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().a(adRenderView, trackerName, macros);
        }
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public final void a(D1 audioStatusInternal) {
        AbstractC3037gc listener;
        Intrinsics.f(audioStatusInternal, "audioStatusInternal");
        GestureDetectorOnGestureListenerC3005ec adRenderView = this.f23751a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(audioStatusInternal);
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public final void a(boolean z2) {
        AbstractC3037gc listener;
        GestureDetectorOnGestureListenerC3005ec adRenderView = this.f23751a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(z2);
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public final void a(String data) {
        AbstractC3037gc listener;
        Intrinsics.f(data, "data");
        GestureDetectorOnGestureListenerC3005ec adRenderView = this.f23751a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(data);
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public final void a(GestureDetectorOnGestureListenerC3005ec renderView, boolean z2) {
        Intrinsics.f(renderView, "renderView");
        ExecutorC3160o7 executorC3160o7 = (ExecutorC3160o7) AbstractC3332z4.d.getX();
        RunnableC0899k runnableC0899k = new RunnableC0899k(this.f23751a, this.f23753c, z2, 1);
        executorC3160o7.getClass();
        executorC3160o7.f23866a.post(runnableC0899k);
    }

    @Override // com.inmobi.media.AbstractC3037gc
    public final void b(GestureDetectorOnGestureListenerC3005ec renderView) {
        Intrinsics.f(renderView, "renderView");
        GestureDetectorOnGestureListenerC3005ec adRenderView = this.f23751a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().b(adRenderView);
        }
    }

    public static final void a(C3117lc this$0, Cc route, boolean z2) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(route, "$route");
        if (this$0.getWvStateMachine().a(4) != null) {
            this$0.a("loadWebView", AbstractC3181pc.a(route.f22751b, 307));
        }
        GestureDetectorOnGestureListenerC3005ec adRenderView = this$0.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().a(adRenderView, z2);
        }
    }
}
