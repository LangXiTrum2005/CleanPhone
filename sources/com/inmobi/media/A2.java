package com.inmobi.media;

import A.RunnableC0887e;
import A.ViewOnClickListenerC0885d;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class A2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3005ec f22673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22675c;
    public final InterfaceC3333z5 d;

    public A2(GestureDetectorOnGestureListenerC3005ec renderView, boolean z2, boolean z3, InterfaceC3333z5 interfaceC3333z5) {
        Intrinsics.f(renderView, "renderView");
        this.f22673a = renderView;
        this.f22674b = z2;
        this.f22675c = z3;
        this.d = interfaceC3333z5;
    }

    public final void a(Bf insets) {
        Handler handler;
        Intrinsics.f(insets, "insets");
        ViewGroup viewGroup = (ViewGroup) this.f22673a.getRootView().findViewById(65534);
        if (viewGroup == null || (handler = viewGroup.getHandler()) == null) {
            return;
        }
        handler.post(new RunnableC0887e(this, viewGroup, insets, 0));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a5  */
    public static final void a(A2 this$0, ViewGroup viewGroup, Bf insets) {
        InterfaceC3333z5 interfaceC3333z5;
        Unit unit;
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(insets, "$insets");
        Pair pairA = this$0.a();
        View.OnClickListener onClickListener = (View.OnClickListener) pairA.X;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) pairA.f43249Y;
        boolean z2 = this$0.f22674b;
        Unit unit2 = Unit.f43263a;
        if (z2) {
            if ((viewGroup != null ? viewGroup.findViewById(65532) : null) != null) {
                InterfaceC3333z5 interfaceC3333z6 = this$0.d;
                if (interfaceC3333z6 != null) {
                    ((A5) interfaceC3333z6).c("CloseButtonHandler", "Close button already present, not adding again");
                }
            } else {
                Context context = this$0.f22673a.getContext();
                Intrinsics.e(context, "getContext(...)");
                View c3315y3 = new C3315y3(context, (byte) 0, this$0.d);
                c3315y3.setId(65532);
                if (L3.G()) {
                    c3315y3.setElevation(1.7014117E38f);
                }
                c3315y3.setOnClickListener(onClickListener);
                this$0.f22673a.getViewableAd().a(c3315y3, FriendlyObstructionPurpose.CLOSE_AD);
                if (viewGroup != null) {
                    viewGroup.addView(c3315y3, layoutParams);
                }
                layoutParams.setMargins(0, insets.f22729b, insets.f22730c, 0);
            }
        } else {
            View viewFindViewById = this$0.f22673a.getRootView().findViewById(65532);
            if (viewFindViewById != null) {
                this$0.f22673a.getViewableAd().a(viewFindViewById);
                ViewParent parent = viewFindViewById.getParent();
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(viewFindViewById);
                    unit = unit2;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    interfaceC3333z5 = this$0.d;
                    if (interfaceC3333z5 != null) {
                        ((A5) interfaceC3333z5).c("CloseButtonHandler", "Close button not present, not removing");
                    }
                }
            } else {
                interfaceC3333z5 = this$0.d;
                if (interfaceC3333z5 != null) {
                    ((A5) interfaceC3333z5).c("CloseButtonHandler", "Close button not present, not removing");
                }
            }
        }
        if (this$0.f22675c) {
            if ((viewGroup != null ? viewGroup.findViewById(65531) : null) != null) {
                InterfaceC3333z5 interfaceC3333z7 = this$0.d;
                if (interfaceC3333z7 != null) {
                    ((A5) interfaceC3333z7).c("CloseButtonHandler", "Close region already present, not adding again");
                    return;
                }
                return;
            }
            Context context2 = this$0.f22673a.getContext();
            Intrinsics.e(context2, "getContext(...)");
            View c3315y4 = new C3315y3(context2, (byte) 1, this$0.d);
            c3315y4.setId(65531);
            if (L3.G()) {
                c3315y4.setElevation(1.7014117E38f);
            }
            c3315y4.setOnClickListener(onClickListener);
            this$0.f22673a.getViewableAd().a(c3315y4, FriendlyObstructionPurpose.CLOSE_AD);
            if (viewGroup != null) {
                viewGroup.addView(c3315y4, layoutParams);
            }
            layoutParams.setMargins(0, insets.f22729b, insets.f22730c, 0);
            return;
        }
        View viewFindViewById2 = this$0.f22673a.getRootView().findViewById(65531);
        if (viewFindViewById2 != null) {
            this$0.f22673a.getViewableAd().a(viewFindViewById2);
            ViewParent parent2 = viewFindViewById2.getParent();
            ViewGroup viewGroup3 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup3 != null) {
                viewGroup3.removeView(viewFindViewById2);
            } else {
                unit2 = null;
            }
            if (unit2 != null) {
                return;
            }
        }
        InterfaceC3333z5 interfaceC3333z8 = this$0.d;
        if (interfaceC3333z8 != null) {
            ((A5) interfaceC3333z8).c("CloseButtonHandler", "Close region not present, not removing");
        }
    }

    public final Pair a() {
        float f = U3.d().f23294c;
        ViewOnClickListenerC0885d viewOnClickListenerC0885d = new ViewOnClickListenerC0885d(this, 0);
        int i2 = (int) (50 * f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i2, i2);
        layoutParams.addRule(11);
        return new Pair(viewOnClickListenerC0885d, layoutParams);
    }

    public static final void a(A2 this$0, View view) {
        Intrinsics.f(this$0, "this$0");
        try {
            tf webViewFactory = this$0.f22673a.getWebViewFactory();
            webViewFactory.getClass();
            GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = (GestureDetectorOnGestureListenerC3005ec) webViewFactory.f24017b.get("default");
            if (gestureDetectorOnGestureListenerC3005ec != null) {
                gestureDetectorOnGestureListenerC3005ec.i();
            }
        } catch (Exception unused) {
            AbstractC3048h7.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
        }
    }
}
