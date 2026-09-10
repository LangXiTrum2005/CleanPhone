package com.p004ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J \u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J0\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u000fJ\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/ironsource/s1;", "Lcom/ironsource/m8;", "Lcom/ironsource/nf$a;", "cappingService", "", "adUnitId", "Lcom/ironsource/s$d;", "features", "", "a", "b", "Lkotlin/Result;", "result", "Lcom/ironsource/p8;", "cappingType", "(Ljava/lang/Object;Ljava/lang/String;Lcom/ironsource/p8;)V", "Lcom/ironsource/xm;", "Lcom/ironsource/xm;", "tools", "", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "Lcom/ironsource/s;", "Ljava/util/Map;", "adFormatsConfigurations", "<init>", "(Lcom/ironsource/xm;Ljava/util/Map;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class s1 implements m8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final xm tools;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<LevelPlay.AdFormat, C3381s> adFormatsConfigurations;

    public s1(xm tools, Map<LevelPlay.AdFormat, C3381s> adFormatsConfigurations) {
        Intrinsics.f(tools, "tools");
        Intrinsics.f(adFormatsConfigurations, "adFormatsConfigurations");
        this.tools = tools;
        this.adFormatsConfigurations = adFormatsConfigurations;
    }

    private final void b(nf.a cappingService, String adUnitId, C3381s.d features) throws JSONException {
        eq pacing = features.getPacing();
        if (pacing != null) {
            p8 p8Var = p8.Pacing;
            a(cappingService.a(adUnitId, p8Var, new g8(pacing.getEnabled(), pacing.getNumOfSeconds(), pacing.getUnit())), adUnitId, p8Var);
        }
    }

    @Override // com.p004ironsource.m8
    public void a(nf.a cappingService) {
        Intrinsics.f(cappingService, "cappingService");
        Iterator<Map.Entry<LevelPlay.AdFormat, C3381s>> it = this.adFormatsConfigurations.entrySet().iterator();
        while (it.hasNext()) {
            for (Map.Entry<String, C3381s.d> entry : it.next().getValue().a().entrySet()) {
                String key = entry.getKey();
                C3381s.d value = entry.getValue();
                a(cappingService, key, value);
                b(cappingService, key, value);
            }
        }
    }

    private final void a(nf.a cappingService, String adUnitId, C3381s.d features) throws JSONException {
        j8 j8Var = features.getCom.ironsource.s.e java.lang.String();
        if (j8Var != null) {
            p8 p8Var = p8.ShowCount;
            a(cappingService.a(adUnitId, p8Var, new g8(j8Var.getEnabled(), j8Var.getMaxImpressions(), j8Var.getUnit())), adUnitId, p8Var);
        }
    }

    private final void a(Object result, String adUnitId, p8 cappingType) throws JSONException {
        Throwable thA = Result.a(result);
        if (thA != null) {
            this.tools.a(adUnitId, new k8().a(cappingType), thA.getMessage());
        }
    }
}
