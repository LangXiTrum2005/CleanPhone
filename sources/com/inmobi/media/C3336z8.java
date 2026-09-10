package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.z8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3336z8 implements InterfaceC3050h9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D8 f24156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2968c9 f24157b;

    public C3336z8(D8 d8, C2968c9 c2968c9) {
        this.f24156a = d8;
        this.f24157b = c2968c9;
    }

    public final void a(byte b2) {
        T7 t7 = this.f24156a.f22767b;
        if (t7.t || !(t7 instanceof C2934a9)) {
            return;
        }
        C2934a9 c2934a9 = (C2934a9) t7;
        C2968c9 videoAsset = this.f24157b;
        Intrinsics.f(videoAsset, "videoAsset");
        if (!c2934a9.t) {
            if (b2 == 0) {
                videoAsset.a("firstQuartile", c2934a9.j(videoAsset), (L7) null, c2934a9.W);
                InterfaceC3333z5 interfaceC3333z5 = c2934a9.W;
                if (interfaceC3333z5 != null) {
                    String TAG = c2934a9.X;
                    Intrinsics.e(TAG, "TAG");
                    ((A5) interfaceC3333z5).c(TAG, "onVideoQuartileEvent(Q1)");
                }
                We we = c2934a9.f23219p;
                if (we != null) {
                    we.a((byte) 9);
                }
            } else if (b2 == 1) {
                videoAsset.a("midpoint", c2934a9.j(videoAsset), (L7) null, c2934a9.W);
                InterfaceC3333z5 interfaceC3333z6 = c2934a9.W;
                if (interfaceC3333z6 != null) {
                    String TAG2 = c2934a9.X;
                    Intrinsics.e(TAG2, "TAG");
                    ((A5) interfaceC3333z6).c(TAG2, "onVideoQuartileEvent(Q2)");
                }
                We we2 = c2934a9.f23219p;
                if (we2 != null) {
                    we2.a((byte) 10);
                }
            } else if (b2 == 2) {
                videoAsset.a("thirdQuartile", c2934a9.j(videoAsset), (L7) null, c2934a9.W);
                InterfaceC3333z5 interfaceC3333z7 = c2934a9.W;
                if (interfaceC3333z7 != null) {
                    String TAG3 = c2934a9.X;
                    Intrinsics.e(TAG3, "TAG");
                    ((A5) interfaceC3333z7).c(TAG3, "onVideoQuartileEvent(Q3)");
                }
                We we3 = c2934a9.f23219p;
                if (we3 != null) {
                    we3.a((byte) 11);
                }
            } else if (b2 == 3) {
                Object obj = videoAsset.t.get("didQ4Fire");
                if (Intrinsics.a(obj instanceof Boolean ? (Boolean) obj : null, Boolean.FALSE)) {
                    c2934a9.d(videoAsset);
                }
            } else {
                InterfaceC3333z5 interfaceC3333z8 = c2934a9.W;
                if (interfaceC3333z8 != null) {
                    String TAG4 = c2934a9.X;
                    Intrinsics.e(TAG4, "TAG");
                    ((A5) interfaceC3333z8).b(TAG4, "Unhandled quartileEvent ( " + ((int) b2) + " ) for Native Video");
                }
            }
        }
        if (3 == b2) {
            try {
                ((C2934a9) this.f24156a.f22767b).c(this.f24157b);
            } catch (Exception e2) {
                D8 d8 = this.f24156a;
                InterfaceC3333z5 interfaceC3333z9 = d8.f;
                if (interfaceC3333z9 != null) {
                    String str = d8.g;
                    ((A5) interfaceC3333z9).b(str, rf.a(e2, H6.a(str, "access$getTAG$p(...)", "SDK encountered unexpected error in handling the onVideoCompleted event; ")));
                }
            }
        }
    }
}
