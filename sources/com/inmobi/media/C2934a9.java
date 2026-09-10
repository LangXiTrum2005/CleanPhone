package com.inmobi.media;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.iab.omid.library.inmobi.adsession.media.Position;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.inmobi.media.a9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2934a9 extends T7 {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final String f23436U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final String f23437V;
    public final InterfaceC3333z5 W;
    public final String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f23438Y;
    public WeakReference Z;
    public final Z8 a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Y8 f23439b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2934a9(Context context, byte b2, C3177p8 dataModel, String impressionId, Set set, AdConfig adConfig, long j, boolean z2, String creativeId, C2996e3 c2996e3, S6 s6, InterfaceC3333z5 interfaceC3333z5) {
        super(context, b2, dataModel, impressionId, set, adConfig, j, z2, creativeId, c2996e3, s6, interfaceC3333z5);
        Intrinsics.f(context, "context");
        Intrinsics.f(dataModel, "dataModel");
        Intrinsics.f(impressionId, "impressionId");
        Intrinsics.f(adConfig, "adConfig");
        Intrinsics.f(creativeId, "creativeId");
        this.f23436U = impressionId;
        this.f23437V = creativeId;
        this.W = interfaceC3333z5;
        this.X = "a9";
        this.f23438Y = "InMobi";
        this.a0 = new Z8(this);
        this.f23439b0 = new Y8(this);
    }

    public final void a(View view, boolean z2) {
        C3114l9 c3114l9 = (C3114l9) view.findViewById(Integer.MAX_VALUE);
        if (c3114l9 != null) {
            Object tag = c3114l9.getTag();
            C2968c9 c2968c9 = tag instanceof C2968c9 ? (C2968c9) tag : null;
            if (c2968c9 != null) {
                new Handler(Looper.getMainLooper()).post(new A.U(c2968c9, z2, this, c3114l9, 0));
            }
        }
    }

    @Override // com.inmobi.media.T7
    public final void b(View view) {
        if (this.r || this.t || !(view instanceof C3114l9)) {
            return;
        }
        this.r = true;
        C2996e3 c2996e3 = this.f23215h;
        if (c2996e3 != null) {
            c2996e3.a();
        }
        Object tag = ((C3114l9) view).getTag();
        if (tag instanceof C2968c9) {
            String TAG = this.X;
            Intrinsics.e(TAG, "TAG");
            C2968c9 c2968c9 = (C2968c9) tag;
            Object obj = c2968c9.t.get("didImpressionFire");
            if (Intrinsics.a(obj instanceof Boolean ? (Boolean) obj : null, Boolean.TRUE)) {
                return;
            }
            ArrayList<U8> arrayList = c2968c9.s;
            HashMap mapJ = j(c2968c9);
            List list = null;
            for (U8 u8 : arrayList) {
                if ("VideoImpression".equals(u8.f23265b)) {
                    if (StringsKt.M(u8.d, "http", false)) {
                        C2984d8.a(u8, mapJ, (L7) null, this.W);
                    }
                    HashMap map = u8.f23267e;
                    Object obj2 = map != null ? map.get("referencedEvents") : null;
                    list = obj2 instanceof List ? (List) obj2 : null;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            c2968c9.a((String) it.next(), mapJ, (L7) null, this.W);
                        }
                    }
                }
            }
            if (list == null || list.isEmpty()) {
                c2968c9.a("start", mapJ, (L7) null, this.W);
                c2968c9.a("Impression", mapJ, this.O, this.W);
            }
            C3049h8 c3049h8 = this.f23212b.f23886e;
            if (c3049h8 != null) {
                c3049h8.a("Impression", j(c2968c9), this.O, this.W);
            }
            c2968c9.t.put("didImpressionFire", Boolean.TRUE);
            We we = this.f23219p;
            if (we != null) {
                we.a((byte) 0);
            }
            P0 p0 = this.f23221w;
            if (p0 != null) {
                p0.f();
            }
        }
    }

    @Override // com.inmobi.media.T7
    public final void c(C2984d8 asset) {
        Intrinsics.f(asset, "asset");
        byte b2 = asset.k;
        if (b2 != 0) {
            if (b2 == 2) {
                try {
                    if (1 != this.f23211a) {
                        P0 p0 = this.f23221w;
                        if (p0 != null) {
                            p0.h();
                        }
                        r();
                        return;
                    }
                    super.c(asset);
                    if ("VIDEO".equals(asset.f23515c)) {
                        View videoContainerView = getVideoContainerView();
                        C3130m9 c3130m9 = videoContainerView instanceof C3130m9 ? (C3130m9) videoContainerView : null;
                        if (c3130m9 != null) {
                            c3130m9.getVideoView().c();
                            c3130m9.getVideoView().j();
                        }
                        r();
                        return;
                    }
                    InterfaceC3333z5 interfaceC3333z5 = this.W;
                    if (interfaceC3333z5 != null) {
                        String TAG = this.X;
                        Intrinsics.e(TAG, "TAG");
                        ((A5) interfaceC3333z5).b(TAG, "Action 2 not valid for asset of type: " + asset.f23515c);
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    InterfaceC3333z5 interfaceC3333z6 = this.W;
                    if (interfaceC3333z6 != null) {
                        String str = this.X;
                        StringBuilder sbA = H6.a(str, "TAG", "Action 2 not valid for asset of type: ");
                        sbA.append(asset.f23515c);
                        ((A5) interfaceC3333z6).b(str, sbA.toString());
                    }
                    S5 s5 = S5.f23167a;
                    S5.d.a(AbstractC3285w5.a(e2, "event"));
                    return;
                }
            }
            if (b2 == 3) {
                try {
                    if (!"VIDEO".equals(asset.f23515c)) {
                        InterfaceC3333z5 interfaceC3333z7 = this.W;
                        if (interfaceC3333z7 != null) {
                            String TAG2 = this.X;
                            Intrinsics.e(TAG2, "TAG");
                            ((A5) interfaceC3333z7).b(TAG2, "Action 3 not valid for asset of type: " + asset.f23515c);
                            return;
                        }
                        return;
                    }
                    GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this.H;
                    if (gestureDetectorOnGestureListenerC3005ec != null) {
                        InterfaceC3333z5 interfaceC3333z8 = gestureDetectorOnGestureListenerC3005ec.f23587i;
                        if (interfaceC3333z8 != null) {
                            String TAG3 = GestureDetectorOnGestureListenerC3005ec.a1;
                            Intrinsics.e(TAG3, "TAG");
                            ((A5) interfaceC3333z8).a(TAG3, "replayToInterActive");
                        }
                        gestureDetectorOnGestureListenerC3005ec.c("window.imraid.broadcastEvent('replay');");
                    }
                    View viewG = g();
                    if (viewG != null) {
                        T8 t8A = T7.a(viewG);
                        if (t8A != null) {
                            t8A.d();
                        }
                        ViewParent parent = viewG.getParent();
                        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                        if (viewGroup != null) {
                            viewGroup.removeView(viewG);
                        }
                    }
                    View videoContainerView2 = getVideoContainerView();
                    C3130m9 c3130m10 = videoContainerView2 instanceof C3130m9 ? (C3130m9) videoContainerView2 : null;
                    if (c3130m10 != null) {
                        c3130m10.getVideoView().k();
                        c3130m10.getVideoView().start();
                        return;
                    }
                    return;
                } catch (Exception e3) {
                    InterfaceC3333z5 interfaceC3333z9 = this.W;
                    if (interfaceC3333z9 != null) {
                        String str2 = this.X;
                        ((A5) interfaceC3333z9).b(str2, rf.a(e3, H6.a(str2, "TAG", "Encountered unexpected error in handling replay action on video: ")));
                    }
                    AbstractC3048h7.a((byte) 2, this.f23438Y, "SDK encountered unexpected error in replaying video");
                    S5 s6 = S5.f23167a;
                    S5.d.a(AbstractC3285w5.a(e3, "event"));
                    return;
                }
            }
            if (b2 == 1) {
                super.c(asset);
                return;
            }
            if (b2 == 4) {
                try {
                    if (this.f23211a != 0) {
                        InterfaceC3333z5 interfaceC3333z10 = this.W;
                        if (interfaceC3333z10 != null) {
                            String TAG4 = this.X;
                            Intrinsics.e(TAG4, "TAG");
                            ((A5) interfaceC3333z10).b(TAG4, "Invalid action! Online inline videos can be expanded to fullscreen!");
                            return;
                        }
                        return;
                    }
                    View videoContainerView3 = getVideoContainerView();
                    C3130m9 c3130m11 = videoContainerView3 instanceof C3130m9 ? (C3130m9) videoContainerView3 : null;
                    if (c3130m11 != null) {
                        C3114l9 videoView = c3130m11.getVideoView();
                        Object tag = videoView.getTag();
                        C2968c9 c2968c9 = tag instanceof C2968c9 ? (C2968c9) tag : null;
                        if (videoView.getState() == 1 || c2968c9 == null) {
                            return;
                        }
                        try {
                            a(c2968c9, videoView);
                            return;
                        } catch (Exception e4) {
                            InterfaceC3333z5 interfaceC3333z11 = this.W;
                            if (interfaceC3333z11 != null) {
                                String TAG5 = this.X;
                                Intrinsics.e(TAG5, "TAG");
                                ((A5) interfaceC3333z11).b(TAG5, "SDK encountered unexpected error in handling the onVideoRequestedFullScreen event; " + e4.getMessage());
                            }
                            S5 s7 = S5.f23167a;
                            S5.d.a(new C3011f2(e4));
                            return;
                        }
                    }
                    return;
                } catch (Exception e5) {
                    InterfaceC3333z5 interfaceC3333z12 = this.W;
                    if (interfaceC3333z12 != null) {
                        String str3 = this.X;
                        ((A5) interfaceC3333z12).b(str3, rf.a(e5, H6.a(str3, "TAG", "Encountered unexpected error in handling fullscreen action on video: ")));
                    }
                    AbstractC3048h7.a((byte) 2, this.f23438Y, "SDK encountered unexpected error in expanding video to fullscreen");
                    S5 s8 = S5.f23167a;
                    S5.d.a(AbstractC3285w5.a(e5, "event"));
                    return;
                }
            }
            if (b2 == 5) {
                try {
                    View videoContainerView4 = getVideoContainerView();
                    C3130m9 c3130m12 = videoContainerView4 instanceof C3130m9 ? (C3130m9) videoContainerView4 : null;
                    if (c3130m12 != null) {
                        Object tag2 = c3130m12.getVideoView().getTag();
                        C2968c9 c2968c10 = tag2 instanceof C2968c9 ? (C2968c9) tag2 : null;
                        if (c2968c10 != null) {
                            HashMap map = c2968c10.t;
                            Boolean bool = Boolean.TRUE;
                            map.put("shouldAutoPlay", bool);
                            C2984d8 c2984d8 = c2968c10.f23523w;
                            if (c2984d8 != null) {
                                c2984d8.t.put("shouldAutoPlay", bool);
                            }
                        }
                        c3130m12.getVideoView().start();
                        return;
                    }
                    return;
                } catch (Exception e6) {
                    InterfaceC3333z5 interfaceC3333z13 = this.W;
                    if (interfaceC3333z13 != null) {
                        String str4 = this.X;
                        ((A5) interfaceC3333z13).b(str4, rf.a(e6, H6.a(str4, "TAG", "Encountered unexpected error in handling play action on video: ")));
                    }
                    AbstractC3048h7.a((byte) 2, this.f23438Y, "SDK encountered unexpected error in playing video");
                    S5 s9 = S5.f23167a;
                    S5.d.a(AbstractC3285w5.a(e6, "event"));
                    return;
                }
            }
            try {
                if (1 != this.f23211a) {
                    P0 p1 = this.f23221w;
                    if (p1 != null) {
                        p1.h();
                    }
                    r();
                    return;
                }
                super.c(asset);
                if ("VIDEO".equals(asset.f23515c)) {
                    View videoContainerView5 = getVideoContainerView();
                    C3130m9 c3130m13 = videoContainerView5 instanceof C3130m9 ? (C3130m9) videoContainerView5 : null;
                    if (c3130m13 != null) {
                        c3130m13.getVideoView().c();
                        c3130m13.getVideoView().j();
                    }
                    r();
                    return;
                }
                InterfaceC3333z5 interfaceC3333z14 = this.W;
                if (interfaceC3333z14 != null) {
                    String TAG6 = this.X;
                    Intrinsics.e(TAG6, "TAG");
                    ((A5) interfaceC3333z14).b(TAG6, "Action 2 not valid for asset of type: " + asset.f23515c);
                }
            } catch (Exception e7) {
                InterfaceC3333z5 interfaceC3333z15 = this.W;
                if (interfaceC3333z15 != null) {
                    String str5 = this.X;
                    StringBuilder sbA2 = H6.a(str5, "TAG", "Action 2 not valid for asset of type: ");
                    sbA2.append(asset.f23515c);
                    ((A5) interfaceC3333z15).b(str5, sbA2.toString());
                }
                S5 s10 = S5.f23167a;
                S5.d.a(AbstractC3285w5.a(e7, "event"));
            }
        }
    }

    public final void d(C2968c9 videoAsset) {
        Intrinsics.f(videoAsset, "videoAsset");
        InterfaceC3333z5 interfaceC3333z5 = this.W;
        if (interfaceC3333z5 != null) {
            String str = this.X;
            StringBuilder sbA = H6.a(str, "TAG", "Firing Q4 beacons for completion at ");
            sbA.append(videoAsset.D);
            ((A5) interfaceC3333z5).c(str, sbA.toString());
        }
        videoAsset.t.put("didQ4Fire", Boolean.TRUE);
        videoAsset.a("complete", j(videoAsset), (L7) null, this.W);
        We we = this.f23219p;
        if (we != null) {
            we.a((byte) 12);
        }
        InterfaceC3333z5 interfaceC3333z6 = this.W;
        if (interfaceC3333z6 != null) {
            String TAG = this.X;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z6).c(TAG, "onVideoQuartileEvent(Q4)");
        }
    }

    public final void e(C2968c9 videoAsset) {
        Intrinsics.f(videoAsset, "videoAsset");
        if (this.t) {
            return;
        }
        videoAsset.t.put("lastMediaVolume", 0);
        videoAsset.a("mute", j(videoAsset), (L7) null, this.W);
        InterfaceC3333z5 interfaceC3333z5 = this.W;
        if (interfaceC3333z5 != null) {
            String TAG = this.X;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "onVideoMuted");
        }
        We we = this.f23219p;
        if (we != null) {
            we.a((byte) 13);
        }
    }

    public final void f(C2968c9 videoAsset) {
        Intrinsics.f(videoAsset, "videoAsset");
        if (this.t) {
            return;
        }
        T8 t8A = T7.a(g());
        if (t8A != null) {
            t8A.b();
        }
        videoAsset.a("pause", j(videoAsset), (L7) null, this.W);
        InterfaceC3333z5 interfaceC3333z5 = this.W;
        if (interfaceC3333z5 != null) {
            String TAG = this.X;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "onVideoPaused");
        }
        We we = this.f23219p;
        if (we != null) {
            we.a((byte) 7);
        }
    }

    public final void g(C2968c9 videoAsset) {
        Intrinsics.f(videoAsset, "videoAsset");
        if (this.t) {
            return;
        }
        InterfaceC3333z5 interfaceC3333z5 = this.W;
        if (interfaceC3333z5 != null) {
            String TAG = this.X;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "onVideoPlayed");
        }
        if (this.f23211a == 0) {
            Object obj = videoAsset.t.get("currentMediaVolume");
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 0;
            Object obj2 = videoAsset.t.get("lastMediaVolume");
            Integer num2 = obj2 instanceof Integer ? (Integer) obj2 : null;
            int iIntValue2 = num2 != null ? num2.intValue() : 0;
            if (iIntValue > 0 && iIntValue2 == 0) {
                i(videoAsset);
            }
            Object obj3 = videoAsset.t.get("currentMediaVolume");
            Integer num3 = obj3 instanceof Integer ? (Integer) obj3 : null;
            int iIntValue3 = num3 != null ? num3.intValue() : 0;
            Object obj4 = videoAsset.t.get("lastMediaVolume");
            Integer num4 = obj4 instanceof Integer ? (Integer) obj4 : null;
            int iIntValue4 = num4 != null ? num4.intValue() : 0;
            if (iIntValue3 == 0 && iIntValue4 > 0) {
                e(videoAsset);
            }
        }
        Object obj5 = videoAsset.t.get("didStartPlaying");
        if (Intrinsics.a(obj5 instanceof Boolean ? (Boolean) obj5 : null, Boolean.FALSE)) {
            videoAsset.t.put("didStartPlaying", Boolean.TRUE);
            Xe viewableAd = getViewableAd();
            if (viewableAd != null) {
                viewableAd.a((byte) 6);
            }
        }
    }

    @Override // com.inmobi.media.T7, com.inmobi.media.InterfaceC3295x
    public final String getCreativeId() {
        return this.f23437V;
    }

    @Override // com.inmobi.media.T7, com.inmobi.media.InterfaceC3295x
    public final InterfaceC3279w getFullScreenEventsListener() {
        return this.a0;
    }

    @Override // com.inmobi.media.T7, com.inmobi.media.InterfaceC3295x
    public final String getImpressionId() {
        return this.f23436U;
    }

    @Override // com.inmobi.media.T7, com.inmobi.media.InterfaceC3295x
    public final View getVideoContainerView() {
        WeakReference weakReference = this.Z;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.inmobi.media.T7, com.inmobi.media.InterfaceC3295x
    public final Xe getViewableAd() {
        C2934a9 c2934a9;
        Context contextJ = j();
        if (this.f23219p == null && contextJ != null) {
            InterfaceC3333z5 interfaceC3333z5 = this.j;
            if (interfaceC3333z5 != null) {
                String TAG = this.m;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z5).c(TAG, "fireLoadedAndServedBeacons");
            }
            C3049h8 c3049h8 = this.f23212b.f23886e;
            if (c3049h8 != null) {
                HashMap mapA = a(c3049h8);
                a((byte) 1, mapA);
                a((byte) 2, mapA);
            }
            this.f23219p = new N5(this, new C2974cf(this, this.W), this.W);
            Set<C3199qe> set = this.d;
            if (set != null) {
                for (C3199qe c3199qe : set) {
                    try {
                        if (c3199qe.f23940a == 3) {
                            Object obj = c3199qe.f23941b.get("omidAdSession");
                            C3035ga c3035ga = obj instanceof C3035ga ? (C3035ga) obj : null;
                            Object obj2 = c3199qe.f23941b.get("videoAutoPlay");
                            Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                            Object obj3 = c3199qe.f23941b.get("videoSkippable");
                            Boolean bool2 = obj3 instanceof Boolean ? (Boolean) obj3 : null;
                            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                            Object obj4 = c3199qe.f23941b.get("videoSkipOffset");
                            Integer num = obj4 instanceof Integer ? (Integer) obj4 : null;
                            VastProperties vastPropertiesCreateVastPropertiesForSkippableMedia = zBooleanValue2 ? VastProperties.createVastPropertiesForSkippableMedia(num != null ? num.intValue() : 0, zBooleanValue, Position.STANDALONE) : VastProperties.createVastPropertiesForNonSkippableMedia(zBooleanValue, Position.STANDALONE);
                            C3035ga c3035ga2 = c3035ga;
                            We we = this.f23219p;
                            if (c3035ga2 == null || we == null) {
                                InterfaceC3333z5 interfaceC3333z6 = this.W;
                                if (interfaceC3333z6 != null) {
                                    String TAG2 = this.X;
                                    Intrinsics.e(TAG2, "TAG");
                                    ((A5) interfaceC3333z6).b(TAG2, "Did not find a OMID video ad session; the OMID decorator will not be applied.");
                                }
                            } else {
                                Intrinsics.c(vastPropertiesCreateVastPropertiesForSkippableMedia);
                                c2934a9 = this;
                                try {
                                    c2934a9.f23219p = new C3131ma(contextJ, we, c2934a9, c3035ga2, vastPropertiesCreateVastPropertiesForSkippableMedia, this.W);
                                } catch (Exception e2) {
                                    e = e2;
                                    InterfaceC3333z5 interfaceC3333z7 = c2934a9.W;
                                    if (interfaceC3333z7 != null) {
                                        String str = c2934a9.X;
                                        ((A5) interfaceC3333z7).b(str, rf.a(e, H6.a(str, "TAG", "Exception occurred while creating the video viewable ad : ")));
                                    }
                                    S5 s5 = S5.f23167a;
                                    S5.d.a(AbstractC3285w5.a(e, "event"));
                                }
                            }
                        }
                    } catch (Exception e3) {
                        e = e3;
                        c2934a9 = this;
                    }
                }
            }
        }
        return this.f23219p;
    }

    public final void h(C2968c9 videoAsset) {
        Intrinsics.f(videoAsset, "videoAsset");
        if (this.t) {
            return;
        }
        T8 t8A = T7.a(g());
        if (t8A != null) {
            t8A.c();
        }
        videoAsset.a("resume", j(videoAsset), (L7) null, this.W);
        InterfaceC3333z5 interfaceC3333z5 = this.W;
        if (interfaceC3333z5 != null) {
            String TAG = this.X;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "onVideoResumed");
        }
        We we = this.f23219p;
        if (we != null) {
            we.a((byte) 8);
        }
    }

    @Override // com.inmobi.media.T7
    public final ef i() {
        return this.f23439b0;
    }

    public final HashMap j(C2968c9 c2968c9) {
        String strB;
        C3114l9 videoView;
        C3049h8 c3049h8 = c2968c9.r;
        if (c3049h8 == null) {
            c3049h8 = null;
        }
        HashMap map = new HashMap();
        WeakReference weakReference = this.Z;
        View view = weakReference != null ? (View) weakReference.get() : null;
        C3130m9 c3130m9 = view instanceof C3130m9 ? (C3130m9) view : null;
        if (c3130m9 != null && (videoView = c3130m9.getVideoView()) != null) {
        }
        map.put("[ERRORCODE]", "405");
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        int iNextInt = 0;
        while (iNextInt == 0) {
            iNextInt = (secureRandom.nextInt() & Integer.MAX_VALUE) % 10;
        }
        sb.append(iNextInt);
        for (int i2 = 1; i2 < 8; i2++) {
            sb.append((secureRandom.nextInt() & Integer.MAX_VALUE) % 10);
        }
        String string = sb.toString();
        Intrinsics.e(string, "toString(...)");
        map.put("[CACHEBUSTING]", string);
        Ve veD = c2968c9.d();
        if (veD != null && (strB = ((Ue) veD).b()) != null) {
        }
        map.put("$TS", String.valueOf(System.currentTimeMillis()));
        Object obj = c2968c9.t.get("seekPosition");
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 0;
        Locale locale = Locale.US;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j = iIntValue;
        map.put("[CONTENTPLAYHEAD]", String.format(locale, "%02d:%02d:%02d.%03d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toHours(j)), Long.valueOf(timeUnit.toMinutes(j) - TimeUnit.HOURS.toMinutes(timeUnit.toHours(j))), Long.valueOf(timeUnit.toSeconds(j) - TimeUnit.MINUTES.toSeconds(timeUnit.toMinutes(j))), Long.valueOf(j - (timeUnit.toSeconds(j) * ((long) 1000)))}, 4)));
        if (c3049h8 != null) {
        }
        Object map2 = this.f23212b.t;
        if (map2 == null) {
            map2 = new HashMap();
        }
        map.putAll(map2);
        return map;
    }

    @Override // com.inmobi.media.T7
    public final boolean k() {
        return this.f23211a == 0 && f() != null;
    }

    @Override // com.inmobi.media.T7
    public final void l() {
        super.l();
        View videoContainerView = getVideoContainerView();
        C3130m9 c3130m9 = videoContainerView instanceof C3130m9 ? (C3130m9) videoContainerView : null;
        if (c3130m9 != null) {
            C3114l9 videoView = c3130m9.getVideoView();
            if (this.f23211a == 0 && !k() && videoView.getVideoVolume() > 0) {
                videoView.setLastVolume(-2);
                a(true);
            }
            videoView.pause();
        }
    }

    @Override // com.inmobi.media.T7
    public final boolean n() {
        return !this.f23201A;
    }

    public final void r() {
        C2996e3 c2996e3 = this.f23215h;
        if (c2996e3 != null) {
            if (!c2996e3.g.get()) {
                c2996e3.d.f23686h = 1;
                Intrinsics.c(c2996e3.f23543c);
            }
            this.f23215h.b();
        }
        We we = this.f23219p;
        if (we != null) {
            we.a((byte) 15);
        }
    }

    public final void i(C2968c9 videoAsset) {
        Intrinsics.f(videoAsset, "videoAsset");
        if (this.t) {
            return;
        }
        videoAsset.t.put("lastMediaVolume", 15);
        videoAsset.a("unmute", j(videoAsset), (L7) null, this.W);
        InterfaceC3333z5 interfaceC3333z5 = this.W;
        if (interfaceC3333z5 != null) {
            String TAG = this.X;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "onVideoUnMuted");
        }
        We we = this.f23219p;
        if (we != null) {
            we.a((byte) 14);
        }
    }

    public static final void a(C2968c9 c2968c9, boolean z2, C2934a9 this$0, C3114l9 c3114l9) {
        int videoVolume;
        int lastVolume;
        int videoVolume2;
        int lastVolume2;
        int videoVolume3;
        Intrinsics.f(this$0, "this$0");
        c2968c9.t.put("visible", Boolean.valueOf(z2));
        if (z2 && !this$0.f23220u) {
            c2968c9.t.put("lastVisibleTimestamp", Long.valueOf(SystemClock.uptimeMillis()));
            if (c3114l9.getPauseScheduled() && c3114l9.getMediaPlayer() != null) {
                if (c2968c9.c()) {
                    c3114l9.k();
                } else {
                    c3114l9.c();
                }
            }
            Handler handler = c3114l9.s;
            if (handler != null) {
                handler.removeMessages(0);
            }
            c3114l9.t = false;
            if (this$0.f23211a == 0 && !this$0.k() && (videoVolume3 = c3114l9.getVideoVolume()) != c3114l9.getLastVolume() && c3114l9.isPlaying()) {
                this$0.a(videoVolume3 <= 0);
                c3114l9.setLastVolume(videoVolume3);
            }
            if (this$0.f23211a == 0 && !this$0.k() && !c2968c9.f23489B && !c3114l9.isPlaying() && c3114l9.getState() == 5 && (videoVolume2 = c3114l9.getVideoVolume()) != (lastVolume2 = c3114l9.getLastVolume()) && lastVolume2 > 0) {
                this$0.a(true);
                c3114l9.setLastVolume(videoVolume2);
            }
            if (1 == c3114l9.getState()) {
                G8 mediaPlayer = c3114l9.getMediaPlayer();
                if (mediaPlayer == null) {
                    return;
                }
                mediaPlayer.f22845b = 3;
                return;
            }
            if (2 == c3114l9.getState() || 4 == c3114l9.getState() || (5 == c3114l9.getState() && c2968c9.f23489B)) {
                c3114l9.start();
                return;
            }
            return;
        }
        Intrinsics.c(c3114l9);
        if (this$0.f23211a == 0 && !this$0.k() && !this$0.f23220u && (videoVolume = c3114l9.getVideoVolume()) != (lastVolume = c3114l9.getLastVolume()) && lastVolume > 0) {
            this$0.a(true);
            c3114l9.setLastVolume(videoVolume);
        }
        c3114l9.a(c2968c9.f23490E);
    }

    public final void b(C2968c9 videoAsset, C3114l9 videoView) {
        Intrinsics.f(videoAsset, "videoAsset");
        Intrinsics.f(videoView, "videoView");
        InterfaceC3333z5 interfaceC3333z5 = this.W;
        if (interfaceC3333z5 != null) {
            String TAG = this.X;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "onVideoViewCreated");
        }
        videoView.setIsLockScreen(this.D);
        ViewParent parent = videoView.getParent();
        C3130m9 c3130m9 = parent instanceof C3130m9 ? (C3130m9) parent : null;
        if (c3130m9 != null) {
            this.Z = new WeakReference(c3130m9);
            C3002e9 mediaController = c3130m9.getVideoView().getMediaController();
            if (mediaController != null) {
                mediaController.setVideoAd(this);
            }
        }
    }

    @Override // com.inmobi.media.T7, com.inmobi.media.InterfaceC3295x
    public final void b() {
        C3114l9 videoView;
        if (this.t) {
            return;
        }
        View videoContainerView = getVideoContainerView();
        C3130m9 c3130m9 = videoContainerView instanceof C3130m9 ? (C3130m9) videoContainerView : null;
        if (c3130m9 != null && (videoView = c3130m9.getVideoView()) != null) {
            videoView.g();
        }
        super.b();
    }

    public final void a(boolean z2) {
        P0 p0;
        if (this.f23211a != 0 || k() || (p0 = this.f23221w) == null) {
            return;
        }
        InterfaceC3333z5 interfaceC3333z5 = p0.f23058a.j;
        if (interfaceC3333z5 != null) {
            String strE = S0.e();
            Intrinsics.e(strE, "<get-TAG>(...)");
            ((A5) interfaceC3333z5).a(strE, "onAudioStateChanged");
        }
        if (p0.f23058a.Z()) {
            return;
        }
        F0 f0 = (F0) p0.f23059b.get();
        if (f0 != null) {
            f0.a(z2);
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = p0.f23058a.j;
        if (interfaceC3333z6 != null) {
            ((A5) interfaceC3333z6).b("InMobi", "Listener was garbage collected.Unable to give callback");
        }
    }

    public final void b(C2968c9 videoAsset) {
        HashMap map;
        Intrinsics.f(videoAsset, "videoAsset");
        if (this.t) {
            return;
        }
        Object obj = videoAsset.t.get("didRequestFullScreen");
        if (Intrinsics.a(obj instanceof Boolean ? (Boolean) obj : null, Boolean.TRUE)) {
            HashMap map2 = videoAsset.t;
            Boolean bool = Boolean.FALSE;
            map2.put("didRequestFullScreen", bool);
            C2984d8 c2984d8 = videoAsset.f23523w;
            if (c2984d8 != null && (map = c2984d8.t) != null) {
                map.put("didRequestFullScreen", bool);
            }
            a();
            videoAsset.t.put("isFullScreen", bool);
        }
    }

    public final void a(C2968c9 videoAsset, int i2) {
        Intrinsics.f(videoAsset, "videoAsset");
        if (this.t) {
            return;
        }
        InterfaceC3333z5 interfaceC3333z5 = this.W;
        if (interfaceC3333z5 != null) {
            String str = this.X;
            ((A5) interfaceC3333z5).a(str, X8.a(str, "TAG", "Moat onVideoError + ", i2));
        }
        videoAsset.a("error", j(videoAsset), (L7) null, this.W);
        InterfaceC3333z5 interfaceC3333z6 = this.W;
        if (interfaceC3333z6 != null) {
            String TAG = this.X;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z6).c(TAG, "onVideoError");
        }
        We we = this.f23219p;
        if (we != null) {
            we.a((byte) 17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    public final void a(C2968c9 c2968c9, C3114l9 c3114l9) {
        boolean z2;
        if (this.t || this.x.get() == null) {
            return;
        }
        Object obj = c2968c9.t.get("didRequestFullScreen");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null ? bool.booleanValue() : false) {
            return;
        }
        HashMap map = c2968c9.t;
        Boolean bool2 = Boolean.TRUE;
        map.put("didRequestFullScreen", bool2);
        map.put("seekPosition", Integer.valueOf(c3114l9.getCurrentPosition()));
        map.put("lastMediaVolume", Integer.valueOf(c3114l9.getVolume()));
        G8 mediaPlayer = c3114l9.getMediaPlayer();
        if (mediaPlayer != null) {
            z2 = mediaPlayer.isPlaying();
        }
        if (z2) {
            G8 mediaPlayer2 = c3114l9.getMediaPlayer();
            if (mediaPlayer2 != null) {
                mediaPlayer2.pause();
            }
            c3114l9.getAudioFocusManager$media_release().a();
        }
        G8 mediaPlayer3 = c3114l9.getMediaPlayer();
        if (mediaPlayer3 != null) {
            mediaPlayer3.f22844a = 4;
        }
        c2968c9.t.put("isFullScreen", bool2);
        HashMap map2 = c2968c9.t;
        G8 mediaPlayer4 = c3114l9.getMediaPlayer();
        map2.put("seekPosition", Integer.valueOf(mediaPlayer4 != null ? mediaPlayer4.getCurrentPosition() : 0));
        InterfaceC3333z5 interfaceC3333z5 = this.j;
        if (interfaceC3333z5 != null) {
            String TAG = this.m;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "launchFullscreen");
        }
        T7 t7C = T7.c(this);
        if (t7C == null) {
            return;
        }
        P0 p0 = t7C.f23221w;
        if (p0 != null) {
            p0.e();
        }
        A a2 = this.M;
        int iHashCode = hashCode();
        M7 m7 = new M7(this, t7C);
        a2.getClass();
        A.a(iHashCode, m7);
    }

    public final void c(C2968c9 videoAsset) {
        Intrinsics.f(videoAsset, "videoAsset");
        InterfaceC3333z5 interfaceC3333z5 = this.W;
        if (interfaceC3333z5 != null) {
            String TAG = this.X;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z5).c(TAG, "Video completed; rewards, if any, will be unlocked and end-card displayed");
        }
        Object obj = videoAsset.t.get("didSignalVideoCompleted");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        C2996e3 c2996e3 = this.f23215h;
        if (c2996e3 != null) {
            if (!c2996e3.g.get()) {
                c2996e3.d.f23687i = 1;
                Intrinsics.c(c2996e3.f23543c);
            }
            this.f23215h.b();
        }
        if (Intrinsics.a(bool, Boolean.TRUE)) {
            InterfaceC3333z5 interfaceC3333z6 = this.W;
            if (interfaceC3333z6 != null) {
                String TAG2 = this.X;
                Intrinsics.e(TAG2, "TAG");
                ((A5) interfaceC3333z6).c(TAG2, "Ignoring callback onAdRewardsUnlocked(), as it is only fired after first time video is played.");
            }
        } else {
            q();
            P0 p0 = this.f23221w;
            if (p0 != null) {
                InterfaceC3333z5 interfaceC3333z7 = p0.f23058a.j;
                if (interfaceC3333z7 != null) {
                    String strE = S0.e();
                    Intrinsics.e(strE, "<get-TAG>(...)");
                    ((A5) interfaceC3333z7).a(strE, "onMediaPlaybackComplete");
                }
                if (!p0.f23058a.Z()) {
                    F0 f0 = (F0) p0.f23059b.get();
                    if (f0 != null) {
                        f0.f();
                    } else {
                        InterfaceC3333z5 interfaceC3333z8 = p0.f23058a.j;
                        if (interfaceC3333z8 != null) {
                            ((A5) interfaceC3333z8).b("InMobi", "Listener was garbage collected.Unable to give callback");
                        }
                    }
                }
            }
        }
        if (1 == this.f23211a) {
            b((C2984d8) videoAsset);
        }
    }
}
