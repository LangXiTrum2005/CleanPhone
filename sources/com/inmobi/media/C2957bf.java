package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.bf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2957bf extends Xe {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final T7 f23469e;
    public GestureDetectorOnGestureListenerC3005ec f;
    public final InterfaceC3333z5 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f23470h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f23471i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2957bf(T7 mNativeAdContainer, GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec, InterfaceC3333z5 interfaceC3333z5) {
        super(mNativeAdContainer);
        Intrinsics.f(mNativeAdContainer, "mNativeAdContainer");
        this.f23469e = mNativeAdContainer;
        this.f = gestureDetectorOnGestureListenerC3005ec;
        this.g = interfaceC3333z5;
        this.f23470h = "InMobi";
    }

    @Override // com.inmobi.media.Xe
    public final void a(byte b2) {
    }

    @Override // com.inmobi.media.Xe
    public final void e() {
    }

    @Override // com.inmobi.media.Xe
    public final void a(Map map) {
    }

    @Override // com.inmobi.media.Xe
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        Intrinsics.f(childView, "childView");
        Intrinsics.f(obstructionCode, "obstructionCode");
    }

    @Override // com.inmobi.media.Xe
    public final void a(Context context, byte b2) {
        Intrinsics.f(context, "context");
    }

    @Override // com.inmobi.media.Xe
    public final void a(View childView) {
        Intrinsics.f(childView, "childView");
    }

    @Override // com.inmobi.media.Xe
    public final View a(View view, ViewGroup parent, boolean z2) {
        Context contextJ;
        Intrinsics.f(parent, "parent");
        if (this.f23471i || (contextJ = this.f23469e.j()) == null) {
            return null;
        }
        AdConfig adConfig = this.d;
        T7 t7 = this.f23469e;
        C3177p8 c3177p8 = t7.f23212b;
        Intrinsics.d(c3177p8, "null cannot be cast to non-null type com.inmobi.ads.modelsv2.NativeDataModel");
        this.f23352b = new C3304x8(contextJ, adConfig, t7, c3177p8, this.g);
        InterfaceC3333z5 interfaceC3333z5 = this.g;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).b(this.f23470h, "Ad markup loaded into the container will be inflated into a View.");
        }
        C3304x8 c3304x8 = this.f23352b;
        this.f23353c = new WeakReference(c3304x8 != null ? c3304x8.a(view, parent, z2, this.f) : null);
        T7 t8 = this.f23469e;
        t8.getClass();
        D4.a(new J7(t8, t8), "EndCardBuilderTask");
        return b();
    }

    @Override // com.inmobi.media.Xe
    public final void a() {
        if (this.f23471i) {
            return;
        }
        this.f23471i = true;
        C3304x8 c3304x8 = this.f23352b;
        if (c3304x8 != null) {
            D8 d8 = c3304x8.f24102e;
            d8.f22773n = true;
            d8.f22771i.clear();
            d8.f22774p = null;
            L8 l8 = d8.j;
            if (l8 != null) {
                l8.destroy();
            }
            d8.j = null;
            if (!c3304x8.f24099a) {
                c3304x8.f24099a = true;
            }
        }
        this.f23352b = null;
        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.f;
        if (gestureDetectorOnGestureListenerC3005ec != null) {
            gestureDetectorOnGestureListenerC3005ec.b();
        }
        this.f = null;
        super.a();
    }
}
