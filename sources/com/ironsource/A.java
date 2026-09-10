package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class A implements InterfaceC0423k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M8 f25597a;

    public A(M8 sessionDepthService) {
        kotlin.jvm.internal.n.f(sessionDepthService, "sessionDepthService");
        this.f25597a = sessionDepthService;
    }

    @Override // com.ironsource.InterfaceC0423k7
    public void a(Map<String, Object> output) {
        kotlin.jvm.internal.n.f(output, "output");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(O6.K0, Integer.valueOf(this.f25597a.a(LevelPlay.AdFormat.INTERSTITIAL)));
        output.put("interstitial", linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(O6.K0, Integer.valueOf(this.f25597a.a(LevelPlay.AdFormat.REWARDED)));
        output.put(O6.H0, linkedHashMap2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(O6.K0, Integer.valueOf(this.f25597a.a(LevelPlay.AdFormat.BANNER)));
        output.put("banner", linkedHashMap3);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put(O6.K0, Integer.valueOf(this.f25597a.a(LevelPlay.AdFormat.NATIVE_AD)));
        output.put("nativeAd", linkedHashMap4);
    }
}
