package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C3194r7;
import com.inmobi.media.GestureDetectorOnGestureListenerC2829ci;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import pastie.dern;

/* JADX INFO: renamed from: com.inmobi.media.r7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3194r7 {
    public final RelativeLayout a;
    public Df b;
    public float c;
    public boolean d;
    public final WeakReference e;
    public final GestureDetectorOnGestureListenerC2829ci f;
    public final RelativeLayout g;
    public boolean h;

    public C3194r7(WeakReference activityRef, GestureDetectorOnGestureListenerC2829ci adContainer, RelativeLayout adBackgroundView) {
        Intrinsics.checkNotNullParameter(activityRef, "activityRef");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        Intrinsics.checkNotNullParameter(adBackgroundView, "adBackgroundView");
        Intrinsics.checkNotNullParameter(adBackgroundView, "adBackgroundView");
        this.a = adBackgroundView;
        this.b = Ef.a(J5.g());
        this.c = 1.0f;
        this.e = activityRef;
        this.f = adContainer;
        this.g = adBackgroundView;
    }

    public final void a(final Df orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.b = orientation;
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.f;
        Intrinsics.competently(gestureDetectorOnGestureListenerC2829ci, "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView");
        gestureDetectorOnGestureListenerC2829ci.getWebViewFactory().a(new Function1() { // from class: adsuki.danae
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3194r7.a(orientation, (GestureDetectorOnGestureListenerC2829ci) obj);
            }
        });
    }

    public final void b() {
        Activity activity = (Activity) this.e.get();
        if (!(activity instanceof InMobiAdActivity) ? false : ((InMobiAdActivity) activity).e) {
            try {
                B fullScreenEventsListener = this.f.getFullScreenEventsListener();
                if (fullScreenEventsListener != null) {
                    Vh vh = (Vh) fullScreenEventsListener;
                    InterfaceC3072m9 interfaceC3072m9 = vh.a.i;
                    if (interfaceC3072m9 != null) {
                        String str = GestureDetectorOnGestureListenerC2829ci.g1;
                        Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                        ((C3097n9) interfaceC3072m9).a(str, com.ironsource.If.m);
                    }
                    if (Intrinsics.wireman("Default", vh.a.getViewState())) {
                        vh.a.setAndUpdateViewState("Hidden");
                    }
                    vh.a.W();
                    Unit unit = Unit.f29295attabal;
                }
            } catch (Exception e) {
                e.getMessage();
                Kb.a((byte) 2, "InMobi", "SDK encountered unexpected error while finishing fullscreen view");
                Unit unit2 = Unit.f29295attabal;
            }
        } else {
            GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.f;
            Intrinsics.competently(gestureDetectorOnGestureListenerC2829ci, "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView");
            gestureDetectorOnGestureListenerC2829ci.setFullScreenActivityContext(null);
            try {
                gestureDetectorOnGestureListenerC2829ci.m();
            } catch (Exception e2) {
                e2.getMessage();
                Kb.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
            }
            SparseArray sparseArray = InMobiAdActivity.k;
            GestureDetectorOnGestureListenerC2829ci container = this.f;
            Intrinsics.checkNotNullParameter(container, "container");
            InMobiAdActivity.k.remove(container.hashCode());
        }
        this.f.b();
    }

    public final void c() {
        I5 i5;
        RelativeLayout.LayoutParams layoutParams;
        if (this.c == 1.0f) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(10);
            this.a.setLayoutParams(layoutParams2);
            return;
        }
        if (this.d) {
            L5 l5 = J5.a;
            Context context = this.a.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            i5 = J5.b(context);
        } else {
            L5 l6 = J5.a;
            Context context2 = this.a.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Intrinsics.checkNotNullParameter(context2, "context");
            Display displayA = J5.a(context2);
            if (displayA == null) {
                i5 = J5.b;
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                displayA.getMetrics(displayMetrics);
                i5 = new I5(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
        }
        int i = i5.a;
        Objects.toString(this.b);
        if (Ef.b(this.b)) {
            layoutParams = new RelativeLayout.LayoutParams(dern.wireman(i5.a * this.c), -1);
            layoutParams.addRule(9);
        } else {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, dern.wireman(i5.b * this.c));
            layoutParams3.addRule(10);
            layoutParams = layoutParams3;
        }
        this.a.setLayoutParams(layoutParams);
    }

    public final void d() {
        this.g.setBackgroundColor(0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        Fn viewableAd = this.f.getViewableAd();
        View viewC = viewableAd != null ? viewableAd.c() : null;
        if (viewC != null) {
            ViewParent parent = viewC.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(viewC);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this.g.getContext());
            relativeLayout.addView(viewC, new RelativeLayout.LayoutParams(-1, -1));
            this.g.addView(relativeLayout, layoutParams);
            this.f.a(relativeLayout);
        }
    }

    public final void e() {
        if (1 == this.f.getPlacementType()) {
            try {
                HashMap map = new HashMap();
                Fn viewableAd = this.f.getViewableAd();
                if (viewableAd != null) {
                    viewableAd.a(map);
                }
            } catch (Exception e) {
                e.getMessage();
                B fullScreenEventsListener = this.f.getFullScreenEventsListener();
                if (fullScreenEventsListener != null) {
                    ((Vh) fullScreenEventsListener).a();
                }
            }
        }
    }

    public final void a() {
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.f;
        if (gestureDetectorOnGestureListenerC2829ci == null) {
            gestureDetectorOnGestureListenerC2829ci = null;
        }
        if (gestureDetectorOnGestureListenerC2829ci == null) {
            return;
        }
        gestureDetectorOnGestureListenerC2829ci.getWebViewFactory().a(new Function1() { // from class: adsuki.extensimeter
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3194r7.a((GestureDetectorOnGestureListenerC2829ci) obj);
            }
        });
        if (gestureDetectorOnGestureListenerC2829ci.K) {
            return;
        }
        try {
            gestureDetectorOnGestureListenerC2829ci.m();
        } catch (Exception e) {
            e.getMessage();
            Kb.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
        }
    }

    public static final Unit a(GestureDetectorOnGestureListenerC2829ci it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.r();
        return Unit.f29295attabal;
    }

    public static final Unit a(Df df, GestureDetectorOnGestureListenerC2829ci it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.b(df);
        return Unit.f29295attabal;
    }
}
