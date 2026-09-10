package com.inmobi.media;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class V4 extends P {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f23295e;
    public final InterfaceC3295x f;
    public final RelativeLayout g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f23296h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V4(WeakReference activityRef, InterfaceC3295x adContainer, RelativeLayout adBackgroundView) {
        super(adBackgroundView);
        Intrinsics.f(activityRef, "activityRef");
        Intrinsics.f(adContainer, "adContainer");
        Intrinsics.f(adBackgroundView, "adBackgroundView");
        this.f23295e = activityRef;
        this.f = adContainer;
        this.g = adBackgroundView;
    }

    @Override // com.inmobi.media.P
    public final void a(EnumC3179pa orientation) {
        Intrinsics.f(orientation, "orientation");
        this.f23056b = orientation;
        InterfaceC3295x interfaceC3295x = this.f;
        Intrinsics.d(interfaceC3295x, "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView");
        ((GestureDetectorOnGestureListenerC3005ec) interfaceC3295x).getWebViewFactory().a(new U4(orientation));
    }

    @Override // com.inmobi.media.P
    public final void b() {
        Activity activity = (Activity) this.f23295e.get();
        if (!(activity instanceof InMobiAdActivity) ? false : ((InMobiAdActivity) activity).f22661e) {
            try {
                InterfaceC3279w fullScreenEventsListener = this.f.getFullScreenEventsListener();
                if (fullScreenEventsListener != null) {
                    fullScreenEventsListener.b(null);
                }
            } catch (Exception unused) {
                AbstractC3048h7.a((byte) 2, "InMobi", "SDK encountered unexpected error while finishing fullscreen view");
            }
        } else {
            InterfaceC3295x interfaceC3295x = this.f;
            Intrinsics.d(interfaceC3295x, "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView");
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = (GestureDetectorOnGestureListenerC3005ec) interfaceC3295x;
            gestureDetectorOnGestureListenerC3005ec.setFullScreenActivityContext(null);
            try {
                gestureDetectorOnGestureListenerC3005ec.i();
            } catch (Exception unused2) {
                AbstractC3048h7.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
            }
            SparseArray sparseArray = InMobiAdActivity.k;
            InterfaceC3295x container = this.f;
            Intrinsics.f(container, "container");
            InMobiAdActivity.k.remove(container.hashCode());
        }
        this.f.b();
    }

    @Override // com.inmobi.media.P
    public final void c() {
        if (this.f23296h) {
            return;
        }
        try {
            this.f23296h = true;
            InterfaceC3279w fullScreenEventsListener = this.f.getFullScreenEventsListener();
            if (fullScreenEventsListener != null) {
                fullScreenEventsListener.a(null);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.inmobi.media.P
    public final void d() {
    }

    @Override // com.inmobi.media.P
    public final void f() {
        this.g.setBackgroundColor(0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        Xe viewableAd = this.f.getViewableAd();
        View viewD = viewableAd != null ? viewableAd.d() : null;
        if (viewD != null) {
            ViewParent parent = viewD.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(viewD);
            }
            this.g.addView(viewD, layoutParams);
        }
    }

    @Override // com.inmobi.media.P
    public final void g() {
        if (1 == this.f.getPlacementType()) {
            try {
                HashMap map = new HashMap();
                Xe viewableAd = this.f.getViewableAd();
                if (viewableAd != null) {
                    viewableAd.a(map);
                }
            } catch (Exception unused) {
                InterfaceC3279w fullScreenEventsListener = this.f.getFullScreenEventsListener();
                if (fullScreenEventsListener != null) {
                    fullScreenEventsListener.a();
                }
            }
        }
    }

    @Override // com.inmobi.media.P
    public final void a() {
        InterfaceC3295x interfaceC3295x = this.f;
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = interfaceC3295x instanceof GestureDetectorOnGestureListenerC3005ec ? (GestureDetectorOnGestureListenerC3005ec) interfaceC3295x : null;
        if (gestureDetectorOnGestureListenerC3005ec == null) {
            return;
        }
        gestureDetectorOnGestureListenerC3005ec.getWebViewFactory().a(T4.f23199a);
        if (gestureDetectorOnGestureListenerC3005ec.H) {
            return;
        }
        try {
            gestureDetectorOnGestureListenerC3005ec.i();
        } catch (Exception unused) {
            AbstractC3048h7.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
        }
    }
}
