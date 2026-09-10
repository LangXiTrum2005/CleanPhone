package com.p004ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J(\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J(\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J8\u0010\f\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0012J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/ironsource/pq;", "", "Lcom/ironsource/hg$a;", "cappingService", "", "placementName", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "adFormat", "Lcom/ironsource/s$d;", "features", "", "b", "a", "c", "Lkotlin/Result;", "result", "Lcom/ironsource/p8;", "cappingType", "(Ljava/lang/Object;Ljava/lang/String;Lcom/unity3d/mediation/LevelPlay$AdFormat;Lcom/ironsource/p8;)V", "Lcom/ironsource/xm;", "Lcom/ironsource/xm;", "tools", "", "Lcom/ironsource/s;", "Ljava/util/Map;", "adFormatsConfigurations", "<init>", "(Lcom/ironsource/xm;Ljava/util/Map;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class pq {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final xm tools;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<LevelPlay.AdFormat, C3381s> adFormatsConfigurations;

    public pq(xm tools, Map<LevelPlay.AdFormat, C3381s> adFormatsConfigurations) {
        Intrinsics.f(tools, "tools");
        Intrinsics.f(adFormatsConfigurations, "adFormatsConfigurations");
        this.tools = tools;
        this.adFormatsConfigurations = adFormatsConfigurations;
    }

    private final void b(hg.a cappingService, String placementName, LevelPlay.AdFormat adFormat, C3381s.d features) throws JSONException {
        p8 p8Var = p8.Delivery;
        qa qaVar = features.getCom.ironsource.s.g java.lang.String();
        a(cappingService.a(placementName, adFormat, p8Var, new g8(qaVar != null ? Boolean.valueOf(qaVar.getEnabled()) : null, null, null, 6, null)), placementName, adFormat, p8Var);
    }

    private final void c(hg.a cappingService, String placementName, LevelPlay.AdFormat adFormat, C3381s.d features) throws JSONException {
        eq pacing = features.getPacing();
        if (pacing != null) {
            p8 p8Var = p8.Pacing;
            a(cappingService.a(placementName, adFormat, p8Var, new g8(pacing.getEnabled(), pacing.getNumOfSeconds(), o8.Second)), placementName, adFormat, p8Var);
        }
    }

    public final void a(hg.a cappingService) {
        Intrinsics.f(cappingService, "cappingService");
        for (Map.Entry<LevelPlay.AdFormat, C3381s> entry : this.adFormatsConfigurations.entrySet()) {
            LevelPlay.AdFormat key = entry.getKey();
            for (Map.Entry<String, C3381s.d> entry2 : entry.getValue().c().entrySet()) {
                String key2 = entry2.getKey();
                C3381s.d value = entry2.getValue();
                b(cappingService, key2, key, value);
                a(cappingService, key2, key, value);
                c(cappingService, key2, key, value);
            }
        }
    }

    private final void a(hg.a cappingService, String placementName, LevelPlay.AdFormat adFormat, C3381s.d features) throws JSONException {
        j8 j8Var = features.getCom.ironsource.s.e java.lang.String();
        if (j8Var != null) {
            p8 p8Var = p8.ShowCount;
            a(cappingService.a(placementName, adFormat, p8Var, new g8(j8Var.getEnabled(), j8Var.getMaxImpressions(), j8Var.getUnit())), placementName, adFormat, p8Var);
        }
    }

    private final void a(Object result, String placementName, LevelPlay.AdFormat adFormat, p8 cappingType) throws JSONException {
        Throwable thA = Result.a(result);
        if (thA != null) {
            this.tools.a(placementName, adFormat, new k8().a(cappingType), thA.getMessage());
        }
    }
}
