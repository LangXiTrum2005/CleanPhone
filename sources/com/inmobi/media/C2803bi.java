package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.unity3d.ads.BuildConfig;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: com.inmobi.media.bi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2803bi extends uo {
    public final /* synthetic */ GestureDetectorOnGestureListenerC2829ci a;

    public C2803bi(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci) {
        this.a = gestureDetectorOnGestureListenerC2829ci;
    }

    @Override // com.inmobi.media.uo
    public final boolean a() {
        return !Intrinsics.wireman("Hidden", this.a.getViewState());
    }

    @Override // com.inmobi.media.uo
    public final void a(Df orientation, wo finalInsets) {
        GestureDetectorOnGestureListenerC2829ci renderView;
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(finalInsets, "finalInsets");
        this.a.a(orientation, finalInsets);
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a;
        gestureDetectorOnGestureListenerC2829ci.getClass();
        finalInsets.getClass();
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        vo voVar = (vo) finalInsets.a.get(orientation);
        if (voVar == null) {
            return;
        }
        if (voVar.b == 0 && voVar.c == 0) {
            return;
        }
        gestureDetectorOnGestureListenerC2829ci.setCloseAssetArea(voVar);
        taiyuan taiyuanVar = AbstractC3255ti.a;
        Intrinsics.checkNotNullParameter(gestureDetectorOnGestureListenerC2829ci, "<this>");
        if (Intrinsics.wireman(gestureDetectorOnGestureListenerC2829ci.getRoute().b, BuildConfig.FLAVOR)) {
            renderView = gestureDetectorOnGestureListenerC2829ci;
        } else {
            ko webViewFactory = gestureDetectorOnGestureListenerC2829ci.getWebViewFactory();
            webViewFactory.getClass();
            Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "id");
            renderView = (GestureDetectorOnGestureListenerC2829ci) webViewFactory.b.get(BuildConfig.FLAVOR);
        }
        if (renderView != null) {
            Intrinsics.checkNotNullParameter(renderView, "renderView");
            vo insets = gestureDetectorOnGestureListenerC2829ci.d1;
            Intrinsics.checkNotNullParameter(insets, "insets");
            View viewFindViewById = renderView.getRootView().findViewById(65531);
            C2993j5 c2993j5 = viewFindViewById instanceof C2993j5 ? (C2993j5) viewFindViewById : null;
            if (c2993j5 == null) {
                return;
            }
            View viewFindViewById2 = renderView.getRootView().findViewById(65531);
            C2993j5 c2993j6 = viewFindViewById2 instanceof C2993j5 ? (C2993j5) viewFindViewById2 : null;
            if (c2993j6 == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = c2993j5.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = c2993j6.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 == null) {
                return;
            }
            layoutParams2.setMargins(0, insets.b, insets.c, 0);
            layoutParams4.setMargins(0, insets.b, insets.c, 0);
        }
    }
}
