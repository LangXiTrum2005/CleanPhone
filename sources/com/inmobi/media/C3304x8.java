package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.inmobi.commons.core.configs.AdConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.x8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3304x8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f24099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T7 f24100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3333z5 f24101c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final D8 f24102e;

    public C3304x8(Context context, AdConfig adConfig, T7 mNativeAdContainer, C3177p8 dataModel, InterfaceC3333z5 interfaceC3333z5) {
        Intrinsics.f(context, "context");
        Intrinsics.f(adConfig, "adConfig");
        Intrinsics.f(mNativeAdContainer, "mNativeAdContainer");
        Intrinsics.f(dataModel, "dataModel");
        this.f24100b = mNativeAdContainer;
        this.f24101c = interfaceC3333z5;
        this.d = "x8";
        D8 d8 = new D8(context, adConfig, mNativeAdContainer, dataModel, new C3288w8(this), new C3272v8(this), this, interfaceC3333z5);
        this.f24102e = d8;
        D9 d9 = d8.m;
        int i2 = mNativeAdContainer.f23202B;
        d9.getClass();
        D9.f = i2;
    }

    public final J8 a(View view, ViewGroup parent, boolean z2, GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec) {
        J8 j8A;
        InterfaceC3333z5 interfaceC3333z5;
        Intrinsics.f(parent, "parent");
        View viewFindViewWithTag = view != null ? view.findViewWithTag("InMobiAdView") : null;
        J8 j8 = viewFindViewWithTag instanceof J8 ? (J8) viewFindViewWithTag : null;
        if (z2) {
            j8A = this.f24102e.a(j8, parent, gestureDetectorOnGestureListenerC3005ec);
        } else {
            D8 d8 = this.f24102e;
            d8.getClass();
            d8.o = gestureDetectorOnGestureListenerC3005ec;
            J8 j8A2 = d8.a(j8, parent);
            if (!d8.f22773n) {
                C3049h8 c3049h8 = d8.f22768c.f23886e;
                if (j8A2 != null && c3049h8 != null) {
                    d8.b((ViewGroup) j8A2, c3049h8);
                }
            }
            j8A = j8A2;
        }
        if (j8 == null && (interfaceC3333z5 = this.f24101c) != null) {
            String TAG = this.d;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).b(TAG, "InMobiNative.getPrimaryView called with Non Native View.");
        }
        if (j8A != null) {
            j8A.setNativeStrandAd(this.f24100b);
        }
        if (j8A == null) {
            return j8A;
        }
        j8A.setTag("InMobiAdView");
        return j8A;
    }
}
