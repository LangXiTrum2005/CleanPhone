package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.dc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2988dc extends Af {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3005ec f23530a;

    public C2988dc(GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec) {
        this.f23530a = gestureDetectorOnGestureListenerC3005ec;
    }

    @Override // com.inmobi.media.Af
    public final boolean a() {
        return !"Hidden".equals(this.f23530a.getViewState());
    }

    @Override // com.inmobi.media.Af
    public final void a(EnumC3179pa orientation, Cf finalInsets) {
        JSONObject jSONObjectA;
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec;
        Intrinsics.f(orientation, "orientation");
        Intrinsics.f(finalInsets, "finalInsets");
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec2 = this.f23530a;
        InterfaceC3333z5 interfaceC3333z5 = gestureDetectorOnGestureListenerC3005ec2.f23587i;
        if (interfaceC3333z5 != null) {
            String str = GestureDetectorOnGestureListenerC3005ec.a1;
            ((A5) interfaceC3333z5).c(str, Ob.a(gestureDetectorOnGestureListenerC3005ec2, str, "TAG", "fireOnSafeAreaChanged "));
        }
        StringBuilder sb = new StringBuilder("window.imraid.broadcastEvent('onSafeAreaChange', ");
        try {
            Bf bf = (Bf) finalInsets.f22753a.get(orientation);
            if (bf != null) {
                jSONObjectA = bf.a();
                jSONObjectA.put("orientation", AbstractC3195qa.a(orientation));
            } else {
                jSONObjectA = null;
            }
        } catch (Exception unused) {
        }
        sb.append(jSONObjectA);
        sb.append(')');
        gestureDetectorOnGestureListenerC3005ec2.c(sb.toString());
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec3 = this.f23530a;
        Bf bf2 = (Bf) finalInsets.f22753a.get(orientation);
        if (bf2 == null) {
            return;
        }
        if (bf2.f22729b == 0 && bf2.f22730c == 0) {
            return;
        }
        gestureDetectorOnGestureListenerC3005ec3.setCloseAssetArea(bf2);
        Lazy lazy = AbstractC3181pc.f23897a;
        if (Intrinsics.a(gestureDetectorOnGestureListenerC3005ec3.getRoute().f22751b, "default")) {
            gestureDetectorOnGestureListenerC3005ec = gestureDetectorOnGestureListenerC3005ec3;
        } else {
            tf webViewFactory = gestureDetectorOnGestureListenerC3005ec3.getWebViewFactory();
            webViewFactory.getClass();
            gestureDetectorOnGestureListenerC3005ec = (GestureDetectorOnGestureListenerC3005ec) webViewFactory.f24017b.get("default");
        }
        if (gestureDetectorOnGestureListenerC3005ec != null) {
            Bf insets = gestureDetectorOnGestureListenerC3005ec3.X0;
            Intrinsics.f(insets, "insets");
            View viewFindViewById = gestureDetectorOnGestureListenerC3005ec.getRootView().findViewById(65531);
            C3315y3 c3315y3 = viewFindViewById instanceof C3315y3 ? (C3315y3) viewFindViewById : null;
            if (c3315y3 == null) {
                return;
            }
            View viewFindViewById2 = gestureDetectorOnGestureListenerC3005ec.getRootView().findViewById(65531);
            C3315y3 c3315y4 = viewFindViewById2 instanceof C3315y3 ? (C3315y3) viewFindViewById2 : null;
            if (c3315y4 == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = c3315y3.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = c3315y4.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 == null) {
                return;
            }
            layoutParams2.setMargins(0, insets.f22729b, insets.f22730c, 0);
            layoutParams4.setMargins(0, insets.f22729b, insets.f22730c, 0);
        }
    }
}
