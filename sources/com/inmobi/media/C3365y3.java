package com.inmobi.media;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.C3365y3;
import com.unity3d.ads.BuildConfig;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.formularize;

/* JADX INFO: renamed from: com.inmobi.media.y3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3365y3 {
    public final GestureDetectorOnGestureListenerC2829ci a;
    public final boolean b;
    public final boolean c;
    public final InterfaceC3072m9 d;

    public C3365y3(GestureDetectorOnGestureListenerC2829ci renderView, boolean z, boolean z2, InterfaceC3072m9 interfaceC3072m9) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        this.a = renderView;
        this.b = z;
        this.c = z2;
        this.d = interfaceC3072m9;
    }

    public final void a(final vo insets) {
        Handler handler;
        Intrinsics.checkNotNullParameter(insets, "insets");
        final ViewGroup viewGroup = (ViewGroup) this.a.getRootView().findViewById(65534);
        if (viewGroup == null || (handler = viewGroup.getHandler()) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: adsuki.anthomaniac
            @Override // java.lang.Runnable
            public final void run() {
                C3365y3.a(this.f3309kowloon, viewGroup, insets);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b8  */
    public static final void a(C3365y3 c3365y3, ViewGroup viewGroup, vo voVar) {
        InterfaceC3072m9 interfaceC3072m9;
        Unit unit;
        Fn viewableAd;
        Fn viewableAd2;
        Pair pairA = c3365y3.a();
        View.OnClickListener onClickListener = (View.OnClickListener) pairA.component1();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) pairA.component2();
        Unit unit2 = null;
        if (c3365y3.b) {
            View viewFindViewById = viewGroup != null ? viewGroup.findViewById(65532) : null;
            if (viewFindViewById != null) {
                InterfaceC3072m9 interfaceC3072m10 = c3365y3.d;
                if (interfaceC3072m10 != null) {
                    ((C3097n9) interfaceC3072m10).c("CloseButtonHandler", "Close button already present, not adding again");
                }
                c3365y3.a(viewFindViewById);
            } else {
                Context context = c3365y3.a.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                View c2993j5 = new C2993j5(context, (byte) 0, c3365y3.d);
                c2993j5.setId(65532);
                C3342x5.a.getClass();
                if (C3342x5.v()) {
                    c2993j5.setElevation(1.7014117E38f);
                }
                c2993j5.setOnClickListener(onClickListener);
                c3365y3.a(c2993j5);
                if (viewGroup != null) {
                    viewGroup.addView(c2993j5, layoutParams);
                }
                layoutParams.setMargins(0, voVar.b, voVar.c, 0);
            }
        } else {
            View viewFindViewById2 = c3365y3.a.getRootView().findViewById(65532);
            if (viewFindViewById2 != null) {
                ko webViewFactory = c3365y3.a.getWebViewFactory();
                webViewFactory.getClass();
                Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "id");
                GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = (GestureDetectorOnGestureListenerC2829ci) webViewFactory.b.get(BuildConfig.FLAVOR);
                if (gestureDetectorOnGestureListenerC2829ci != null && (viewableAd = gestureDetectorOnGestureListenerC2829ci.getViewableAd()) != null) {
                    viewableAd.a(viewFindViewById2);
                }
                ViewParent parent = viewFindViewById2.getParent();
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(viewFindViewById2);
                    unit = Unit.f29295attabal;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    interfaceC3072m9 = c3365y3.d;
                    if (interfaceC3072m9 != null) {
                        ((C3097n9) interfaceC3072m9).c("CloseButtonHandler", "Close button not present, not removing");
                        Unit unit3 = Unit.f29295attabal;
                    }
                }
            } else {
                interfaceC3072m9 = c3365y3.d;
                if (interfaceC3072m9 != null) {
                    ((C3097n9) interfaceC3072m9).c("CloseButtonHandler", "Close button not present, not removing");
                    Unit unit4 = Unit.f29295attabal;
                }
            }
        }
        if (c3365y3.c) {
            View viewFindViewById3 = viewGroup != null ? viewGroup.findViewById(65531) : null;
            if (viewFindViewById3 != null) {
                InterfaceC3072m9 interfaceC3072m11 = c3365y3.d;
                if (interfaceC3072m11 != null) {
                    ((C3097n9) interfaceC3072m11).c("CloseButtonHandler", "Close region already present, not adding again");
                }
                c3365y3.a(viewFindViewById3);
                return;
            }
            Context context2 = c3365y3.a.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            View c2993j6 = new C2993j5(context2, (byte) 1, c3365y3.d);
            c2993j6.setId(65531);
            C3342x5.a.getClass();
            if (C3342x5.v()) {
                c2993j6.setElevation(1.7014117E38f);
            }
            c2993j6.setOnClickListener(onClickListener);
            c3365y3.a(c2993j6);
            if (viewGroup != null) {
                viewGroup.addView(c2993j6, layoutParams);
            }
            layoutParams.setMargins(0, voVar.b, voVar.c, 0);
            return;
        }
        View viewFindViewById4 = c3365y3.a.getRootView().findViewById(65531);
        if (viewFindViewById4 != null) {
            ko webViewFactory2 = c3365y3.a.getWebViewFactory();
            webViewFactory2.getClass();
            Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "id");
            GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci2 = (GestureDetectorOnGestureListenerC2829ci) webViewFactory2.b.get(BuildConfig.FLAVOR);
            if (gestureDetectorOnGestureListenerC2829ci2 != null && (viewableAd2 = gestureDetectorOnGestureListenerC2829ci2.getViewableAd()) != null) {
                viewableAd2.a(viewFindViewById4);
            }
            ViewParent parent2 = viewFindViewById4.getParent();
            ViewGroup viewGroup3 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup3 != null) {
                viewGroup3.removeView(viewFindViewById4);
                unit2 = Unit.f29295attabal;
            }
            if (unit2 != null) {
                return;
            }
        }
        InterfaceC3072m9 interfaceC3072m12 = c3365y3.d;
        if (interfaceC3072m12 != null) {
            ((C3097n9) interfaceC3072m12).c("CloseButtonHandler", "Close region not present, not removing");
            Unit unit5 = Unit.f29295attabal;
        }
    }

    public final void a(View view) {
        Fn viewableAd;
        ko webViewFactory = this.a.getWebViewFactory();
        webViewFactory.getClass();
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "id");
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = (GestureDetectorOnGestureListenerC2829ci) webViewFactory.b.get(BuildConfig.FLAVOR);
        if (gestureDetectorOnGestureListenerC2829ci == null || (viewableAd = gestureDetectorOnGestureListenerC2829ci.getViewableAd()) == null) {
            return;
        }
        viewableAd.a(view, FriendlyObstructionPurpose.CLOSE_AD);
    }

    public final Pair a() {
        float f = J5.d().c;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: adsuki.salutatory
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3365y3.a(this.f3644kowloon, view);
            }
        };
        int i = (int) (50 * f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        layoutParams.addRule(11);
        return formularize.attabal(onClickListener, layoutParams);
    }

    public static final void a(C3365y3 c3365y3, View view) {
        try {
            c3365y3.a.m();
        } catch (Exception e) {
            e.getMessage();
            Kb.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
        }
    }
}
