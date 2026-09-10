package com.inmobi.media;

import com.vungle.ads.internal.Constants;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Z8 implements InterfaceC3279w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2934a9 f23406a;

    public Z8(C2934a9 c2934a9) {
        this.f23406a = c2934a9;
    }

    @Override // com.inmobi.media.InterfaceC3279w
    public final void a() {
        Intrinsics.e(this.f23406a.X, "access$getTAG$p(...)");
        P0 p0 = this.f23406a.f23221w;
        if (p0 != null) {
            p0.c();
        }
    }

    @Override // com.inmobi.media.InterfaceC3279w
    public final void b(Object obj) {
        Xe viewableAd;
        Intrinsics.e(this.f23406a.X, "access$getTAG$p(...)");
        C2968c9 c2968c9 = obj instanceof C2968c9 ? (C2968c9) obj : null;
        if (c2968c9 != null) {
            HashMap map = c2968c9.t;
            Boolean bool = Boolean.FALSE;
            map.put("didRequestFullScreen", bool);
            map.put("isFullScreen", bool);
            c2968c9.f23523w = null;
            HashMap map2 = c2968c9.t;
            map2.put("didRequestFullScreen", bool);
            map2.put("isFullScreen", bool);
            c2968c9.f23523w = null;
        }
        C2934a9 c2934a9 = this.f23406a;
        if (c2934a9.f23211a == 0) {
            Xe viewableAd2 = c2934a9.getViewableAd();
            if (viewableAd2 != null) {
                viewableAd2.a((byte) 2);
            }
            T7 t7 = this.f23406a.v;
            if (t7 != null && (viewableAd = t7.getViewableAd()) != null) {
                viewableAd.a((byte) 16);
            }
            if (c2968c9 != null) {
                c2968c9.a("exitFullscreen", this.f23406a.j(c2968c9), (L7) null, this.f23406a.W);
            }
        } else {
            Xe viewableAd3 = c2934a9.getViewableAd();
            if (viewableAd3 != null) {
                viewableAd3.a((byte) 3);
            }
        }
        P0 p0 = this.f23406a.f23221w;
        if (p0 != null) {
            p0.b();
        }
        InterfaceC3333z5 interfaceC3333z5 = this.f23406a.W;
        if (interfaceC3333z5 != null) {
            ((A5) interfaceC3333z5).a();
        }
    }

    @Override // com.inmobi.media.InterfaceC3279w
    public final void a(Object obj) {
        if (this.f23406a.f() == null) {
            return;
        }
        C2968c9 c2968c9 = obj instanceof C2968c9 ? (C2968c9) obj : null;
        Intrinsics.e(this.f23406a.X, "access$getTAG$p(...)");
        if (c2968c9 != null) {
            HashMap map = c2968c9.t;
            Boolean bool = Boolean.TRUE;
            map.put("didRequestFullScreen", bool);
            map.put("isFullScreen", bool);
            map.put("shouldAutoPlay", bool);
            C2984d8 c2984d8 = c2968c9.f23523w;
            if (c2984d8 != null) {
                HashMap map2 = c2984d8.t;
                map2.put("didRequestFullScreen", bool);
                map2.put("isFullScreen", bool);
                map2.put("shouldAutoPlay", bool);
            }
        }
        C2934a9 c2934a9 = this.f23406a;
        if (c2934a9.f23211a == 0) {
            Xe viewableAd = c2934a9.getViewableAd();
            if (viewableAd != null) {
                viewableAd.a((byte) 1);
            }
            if (c2968c9 != null) {
                c2968c9.a(Constants.TEMPLATE_TYPE_FULLSCREEN, this.f23406a.j(c2968c9), (L7) null, this.f23406a.W);
            }
        }
        P0 p0 = this.f23406a.f23221w;
        if (p0 != null) {
            p0.d();
        }
    }
}
