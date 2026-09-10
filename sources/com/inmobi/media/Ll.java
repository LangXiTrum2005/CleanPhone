package com.inmobi.media;

import com.inmobi.media.Ll;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Ll {
    public final Nl a;
    public final C3374yc b;
    public final C3374yc c;
    public final C3374yc d;
    public final C3374yc e;
    public final C3374yc f;
    public final C3374yc g;
    public final C3374yc h;
    public final C3374yc i;
    public final C3374yc j;
    public final C3374yc k;
    public final C3374yc l;
    public final N5 m;
    public final C3374yc n;

    public Ll(Mc nativeBeaconMacroData, Nl trackerData) {
        Intrinsics.checkNotNullParameter(nativeBeaconMacroData, "nativeBeaconMacroData");
        Intrinsics.checkNotNullParameter(trackerData, "trackerData");
        this.a = trackerData;
        C2804bj c2804bj = new C2804bj(nativeBeaconMacroData, new Function0() { // from class: adsuki.cig
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ll.d(this.f3358kowloon);
            }
        });
        C2804bj c2804bj2 = new C2804bj(nativeBeaconMacroData, new Function0() { // from class: adsuki.vir
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ll.e(this.f3736kowloon);
            }
        });
        this.b = new C3374yc(nativeBeaconMacroData, new Function0() { // from class: adsuki.twybill
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ll.c(this.f3724kowloon);
            }
        });
        this.c = new C3374yc(nativeBeaconMacroData, new Function0() { // from class: adsuki.miliaria
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ll.f(this.f3537kowloon);
            }
        });
        this.d = new C3374yc(nativeBeaconMacroData, new Function0() { // from class: adsuki.incorrectly
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ll.g(this.f3485kowloon);
            }
        });
        this.e = new C3374yc(nativeBeaconMacroData, new Function0() { // from class: adsuki.hyalinization
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ll.b(this.f3467kowloon);
            }
        });
        this.f = new C3374yc(nativeBeaconMacroData, new Function0() { // from class: adsuki.demilitarize
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ll.i(this.f3405kowloon);
            }
        });
        this.g = new C3374yc(nativeBeaconMacroData, new Function0() { // from class: adsuki.sultanate
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ll.m(this.f3692kowloon);
            }
        });
        this.h = new C3374yc(nativeBeaconMacroData, new Function0() { // from class: adsuki.linendraper
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ll.j(this.f3522kowloon);
            }
        });
        this.i = new C3374yc(nativeBeaconMacroData, new Function0() { // from class: adsuki.stupefactive
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ll.n(this.f3689kowloon);
            }
        });
        this.j = new C3374yc(nativeBeaconMacroData, new Function0() { // from class: adsuki.libya
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ll.k(this.f3517kowloon);
            }
        });
        this.k = new C3374yc(nativeBeaconMacroData, new Function0() { // from class: adsuki.decarock
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ll.l(this.f3401kowloon);
            }
        });
        this.l = new C3374yc(nativeBeaconMacroData, new Function0() { // from class: adsuki.tailoring
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ll.h(this.f3700kowloon);
            }
        });
        this.m = new N5(nativeBeaconMacroData, trackerData, c2804bj, c2804bj2);
        this.n = new C3374yc(nativeBeaconMacroData, new Function0() { // from class: adsuki.liable
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ll.a(this.f3516kowloon);
            }
        });
    }

    public static final List a(Ll ll) {
        return AbstractC3391z4.a("companion_view", ll.a.a.a);
    }

    public static final List b(Ll ll) {
        return ll.a(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);
    }

    public static final List c(Ll ll) {
        return ll.a(CampaignEx.JSON_NATIVE_VIDEO_FIRST_QUARTILE, "firstQuartile");
    }

    public static final List d(Ll ll) {
        return AbstractC3391z4.a("progress_received", ll.a.a.a);
    }

    public static final List e(Ll ll) {
        return AbstractC3391z4.a("progress_occurred", ll.a.a.a);
    }

    public static final List f(Ll ll) {
        return ll.a("second_quartile", CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT);
    }

    public static final List g(Ll ll) {
        return ll.a(CampaignEx.JSON_NATIVE_VIDEO_THIRD_QUARTILE, "thirdQuartile");
    }

    public static final List h(Ll ll) {
        return ll.a("error", "error");
    }

    public static final List i(Ll ll) {
        return ll.a("load", com.ironsource.X3.i.r);
    }

    public static final List j(Ll ll) {
        return ll.a(CampaignEx.JSON_NATIVE_VIDEO_MUTE, CampaignEx.JSON_NATIVE_VIDEO_MUTE);
    }

    public static final List k(Ll ll) {
        return ll.a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public static final List l(Ll ll) {
        return ll.a(CampaignEx.JSON_NATIVE_VIDEO_RESUME, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public static final List m(Ll ll) {
        return ll.a("start", "start");
    }

    public static final List n(Ll ll) {
        return ll.a(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE, CampaignEx.JSON_NATIVE_VIDEO_UNMUTE);
    }

    public final List a(String str, String str2) {
        return CollectionsKt.unconsolidated(Jl.a(str2, this.a.b), AbstractC3391z4.a(str, this.a.a.a));
    }
}
