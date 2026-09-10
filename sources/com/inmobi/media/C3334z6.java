package com.inmobi.media;

import android.app.Activity;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.widget.RelativeLayout;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.z6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3334z6 extends P {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f24146e;
    public final InterfaceC3295x f;
    public final RelativeLayout g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f24147h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f24148i;
    public C3114l9 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3334z6(WeakReference activityRef, InterfaceC3295x adContainer, RelativeLayout adBackgroundView) {
        super(adBackgroundView);
        Intrinsics.f(activityRef, "activityRef");
        Intrinsics.f(adContainer, "adContainer");
        Intrinsics.f(adBackgroundView, "adBackgroundView");
        this.f24146e = activityRef;
        this.f = adContainer;
        this.g = adBackgroundView;
    }

    public static final void a(C3334z6 this$0, C2968c9 c2968c9) {
        Intrinsics.f(this$0, "this$0");
        if (this$0.f.getPlacementType() == 1) {
            Object obj = c2968c9.t.get("didCompleteQ4");
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) obj).booleanValue()) {
                return;
            }
        }
        C3114l9 c3114l9 = this$0.j;
        if (c3114l9 != null) {
            c3114l9.start();
        }
    }

    @Override // com.inmobi.media.P
    public final void b() {
        C3114l9 c3114l9;
        Activity activity = (Activity) this.f24146e.get();
        if (!(activity instanceof InMobiAdActivity) ? false : ((InMobiAdActivity) activity).f22661e) {
            InterfaceC3295x interfaceC3295x = this.f;
            if (interfaceC3295x instanceof C2934a9) {
                View videoContainerView = ((C2934a9) interfaceC3295x).getVideoContainerView();
                C3130m9 c3130m9 = videoContainerView instanceof C3130m9 ? (C3130m9) videoContainerView : null;
                if (c3130m9 != null) {
                    Object tag = c3130m9.getVideoView().getTag();
                    Intrinsics.d(tag, "null cannot be cast to non-null type com.inmobi.ads.modelsv2.NativeVideoAsset");
                    a((C2968c9) tag);
                }
            } else if (interfaceC3295x instanceof T7) {
                a((C2968c9) null);
            }
        } else {
            InterfaceC3295x interfaceC3295x2 = this.f;
            if (interfaceC3295x2 instanceof C2934a9) {
                C3114l9 c3114l10 = this.j;
                Object tag2 = c3114l10 != null ? c3114l10.getTag() : null;
                C2968c9 c2968c9 = tag2 instanceof C2968c9 ? (C2968c9) tag2 : null;
                if (c2968c9 != null) {
                    if (1 == ((T7) interfaceC3295x2).f23211a && (c3114l9 = this.j) != null) {
                        c3114l9.f();
                    }
                    a(c2968c9);
                }
            } else if (interfaceC3295x2 instanceof T7) {
                a((C2968c9) null);
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
        InterfaceC3295x interfaceC3295x = this.f;
        if (interfaceC3295x instanceof C2934a9) {
            C3114l9 c3114l9 = this.j;
            Object tag = c3114l9 != null ? c3114l9.getTag() : null;
            C2968c9 c2968c9 = tag instanceof C2968c9 ? (C2968c9) tag : null;
            if (c2968c9 != null && this.f24147h) {
                new Handler(Looper.getMainLooper()).postDelayed(new A.I0(3, this, c2968c9), 50L);
            }
            try {
                if (!this.f24148i) {
                    this.f24148i = true;
                    InterfaceC3279w fullScreenEventsListener = this.f.getFullScreenEventsListener();
                    if (fullScreenEventsListener != null) {
                        fullScreenEventsListener.a(c2968c9);
                    }
                }
            } catch (Exception e2) {
                S5 s5 = S5.f23167a;
                S5.d.a(AbstractC3285w5.a(e2, "event"));
            }
        } else if (interfaceC3295x instanceof T7) {
            try {
                if (!this.f24148i) {
                    this.f24148i = true;
                    InterfaceC3279w fullScreenEventsListener2 = interfaceC3295x.getFullScreenEventsListener();
                    if (fullScreenEventsListener2 != null) {
                        fullScreenEventsListener2.a(null);
                    }
                }
            } catch (Exception e3) {
                S5 s6 = S5.f23167a;
                S5.d.a(AbstractC3285w5.a(e3, "event"));
            }
        }
        this.f24147h = false;
    }

    @Override // com.inmobi.media.P
    public final void d() {
        this.f24147h = true;
        C3114l9 c3114l9 = this.j;
        if (c3114l9 != null) {
            c3114l9.pause();
        }
    }

    @Override // com.inmobi.media.P
    public final void f() {
        C3049h8 c3049h8;
        C3001e8 c3001e8;
        byte placementType = this.f.getPlacementType();
        this.g.setBackgroundColor(-16777216);
        Object dataModel = this.f.getDataModel();
        C3177p8 c3177p8 = dataModel instanceof C3177p8 ? (C3177p8) dataModel : null;
        Point point = (c3177p8 == null || (c3049h8 = c3177p8.f23886e) == null || (c3001e8 = c3049h8.d) == null) ? null : c3001e8.f23552a;
        Xe viewableAd = this.f.getViewableAd();
        int requestedOrientation = 0;
        View viewA = viewableAd != null ? viewableAd.a(null, this.g, false) : null;
        InterfaceC3295x interfaceC3295x = this.f;
        if (interfaceC3295x instanceof C2934a9) {
            View videoContainerView = ((C2934a9) interfaceC3295x).getVideoContainerView();
            C3130m9 c3130m9 = videoContainerView instanceof C3130m9 ? (C3130m9) videoContainerView : null;
            if (c3130m9 != null) {
                C3114l9 videoView = c3130m9.getVideoView();
                this.j = videoView;
                if (videoView != null) {
                    videoView.requestFocus();
                }
                C3114l9 c3114l9 = this.j;
                Object tag = c3114l9 != null ? c3114l9.getTag() : null;
                Intrinsics.d(tag, "null cannot be cast to non-null type com.inmobi.ads.modelsv2.NativeVideoAsset");
                C2968c9 c2968c9 = (C2968c9) tag;
                C2984d8 c2984d8 = c2968c9.f23523w;
                if (c2984d8 != null) {
                    c2968c9.a((C2968c9) c2984d8);
                }
                if (placementType == 0) {
                    c2968c9.t.put("placementType", (byte) 0);
                } else {
                    c2968c9.t.put("placementType", (byte) 1);
                }
            }
        }
        if (viewA != null) {
            Intrinsics.c(point);
            this.g.addView(viewA, new RelativeLayout.LayoutParams(point.x, point.y));
        }
        Activity activity = (Activity) this.f24146e.get();
        if (activity == null || c3177p8 == null) {
            return;
        }
        byte b2 = c3177p8.f23884b;
        if (b2 == 1) {
            requestedOrientation = 1;
        } else if (b2 != 2) {
            requestedOrientation = activity.getRequestedOrientation();
        }
        if (activity instanceof InMobiAdActivity) {
            C3110l5 c3110l5 = ((InMobiAdActivity) activity).f22658a;
            if (c3110l5 != null) {
                c3110l5.f23765a.setRequestedOrientation(requestedOrientation);
            } else {
                Intrinsics.m("orientationHandler");
                throw null;
            }
        }
    }

    @Override // com.inmobi.media.P
    public final void g() {
        try {
            AdConfig adConfig = this.f.getAdConfig();
            Xe viewableAd = this.f.getViewableAd();
            if ((viewableAd != null ? viewableAd.b() : null) != null) {
                InterfaceC3295x interfaceC3295x = this.f;
                if (!(interfaceC3295x instanceof C2934a9)) {
                    if (interfaceC3295x instanceof T7) {
                        try {
                            viewableAd.a((Map) null);
                            return;
                        } catch (Exception unused) {
                            InterfaceC3279w fullScreenEventsListener = this.f.getFullScreenEventsListener();
                            if (fullScreenEventsListener != null) {
                                fullScreenEventsListener.a();
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                C3114l9 c3114l9 = this.j;
                Object tag = c3114l9 != null ? c3114l9.getTag() : null;
                C2968c9 c2968c9 = tag instanceof C2968c9 ? (C2968c9) tag : null;
                if (c2968c9 != null) {
                    AdConfig.ViewabilityConfig viewability = adConfig.getViewability();
                    int videoImpressionMinTimeViewed = viewability.getVideoImpressionMinTimeViewed();
                    HashMap map = c2968c9.f23491F;
                    Object obj = map != null ? map.get("time") : null;
                    if (obj instanceof Integer) {
                        videoImpressionMinTimeViewed = ((Number) obj).intValue();
                    }
                    viewability.setVideoImpressionMinTimeViewed(videoImpressionMinTimeViewed);
                    viewableAd.a((Map) null);
                }
            }
        } catch (Exception e2) {
            InterfaceC3279w fullScreenEventsListener2 = this.f.getFullScreenEventsListener();
            if (fullScreenEventsListener2 != null) {
                fullScreenEventsListener2.a();
            }
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
    }

    @Override // com.inmobi.media.P
    public final void a() {
        if (this.f.c()) {
            return;
        }
        InterfaceC3295x interfaceC3295x = this.f;
        if (interfaceC3295x instanceof C2934a9) {
            if (((C2934a9) interfaceC3295x).f23212b.f23885c) {
                return;
            }
            Activity activity = (Activity) this.f24146e.get();
            if (activity instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity).f22661e = true;
            }
            C3114l9 c3114l9 = this.j;
            if (c3114l9 == null) {
                Activity activity2 = (Activity) this.f24146e.get();
                if (activity2 == null) {
                    return;
                }
                activity2.finish();
                return;
            }
            Object tag = c3114l9.getTag();
            C2968c9 c2968c9 = tag instanceof C2968c9 ? (C2968c9) tag : null;
            if (c2968c9 != null) {
                if (1 == ((T7) interfaceC3295x).f23211a) {
                    c3114l9.f();
                }
                try {
                    Object obj = c2968c9.t.get("isFullScreen");
                    Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                    if (((Boolean) obj).booleanValue()) {
                        c2968c9.t.put("seekPosition", Integer.valueOf(c3114l9.getCurrentPosition()));
                        ((C2934a9) interfaceC3295x).b(c2968c9);
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    AbstractC3048h7.a((byte) 2, "InMobi", "SDK encountered unexpected error in closing video");
                    S5 s5 = S5.f23167a;
                    S5.d.a(AbstractC3285w5.a(e2, "event"));
                    return;
                }
            }
            return;
        }
        if (interfaceC3295x instanceof T7) {
            T7 t7 = (T7) interfaceC3295x;
            if (t7.f23212b.f23885c) {
                return;
            }
            t7.a();
            return;
        }
        Activity activity3 = (Activity) this.f24146e.get();
        if (activity3 == null) {
            return;
        }
        activity3.finish();
    }

    public final void a(C2968c9 c2968c9) {
        try {
            InterfaceC3279w fullScreenEventsListener = this.f.getFullScreenEventsListener();
            if (fullScreenEventsListener != null) {
                fullScreenEventsListener.b(c2968c9);
            }
        } catch (Exception e2) {
            AbstractC3048h7.a((byte) 2, "InMobi", "SDK encountered unexpected error while finishing fullscreen view");
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
    }
}
