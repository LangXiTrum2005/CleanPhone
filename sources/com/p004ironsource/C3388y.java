package com.p004ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\r"}, d2 = {"Lcom/ironsource/y;", "Lcom/ironsource/if;", "", "", "", "output", "", "a", "Lcom/ironsource/ii;", "Lcom/ironsource/ii;", "sessionDepthService", "<init>", "(Lcom/ironsource/ii;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class C3388y implements Cif {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ii sessionDepthService;

    public C3388y(ii sessionDepthService) {
        Intrinsics.f(sessionDepthService, "sessionDepthService");
        this.sessionDepthService = sessionDepthService;
    }

    @Override // com.p004ironsource.Cif
    public void a(Map<String, Object> output) {
        Intrinsics.f(output, "output");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(ne.H0, Integer.valueOf(this.sessionDepthService.a(LevelPlay.AdFormat.INTERSTITIAL)));
        output.put("interstitial", linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(ne.H0, Integer.valueOf(this.sessionDepthService.a(LevelPlay.AdFormat.REWARDED)));
        output.put(ne.E0, linkedHashMap2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(ne.H0, Integer.valueOf(this.sessionDepthService.a(LevelPlay.AdFormat.BANNER)));
        output.put("banner", linkedHashMap3);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put(ne.H0, Integer.valueOf(this.sessionDepthService.a(LevelPlay.AdFormat.NATIVE_AD)));
        output.put("nativeAd", linkedHashMap4);
    }
}
