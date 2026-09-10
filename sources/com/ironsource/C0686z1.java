package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.z1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0686z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<LevelPlay.AdFormat, C0523q> f31330a;

    public C0686z1(JSONObject applicationAuctionSettings) {
        kotlin.jvm.internal.n.f(applicationAuctionSettings, "applicationAuctionSettings");
        LevelPlay.AdFormat[] adFormatArrValues = LevelPlay.AdFormat.values();
        int iO = xj.b0.O(adFormatArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iO < 16 ? 16 : iO);
        for (LevelPlay.AdFormat adFormat : adFormatArrValues) {
            JSONObject jSONObjectOptJSONObject = applicationAuctionSettings.optJSONObject(If.a(adFormat));
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            linkedHashMap.put(adFormat, new C0523q(jSONObjectOptJSONObject));
        }
        this.f31330a = linkedHashMap;
    }

    public final Map<LevelPlay.AdFormat, C0523q> a() {
        return this.f31330a;
    }
}
