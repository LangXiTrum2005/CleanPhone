package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3851z1 {
    private final Map<LevelPlay.AdFormat, C3697q> a;

    public C3851z1(JSONObject applicationAuctionSettings) {
        Intrinsics.checkNotNullParameter(applicationAuctionSettings, "applicationAuctionSettings");
        LevelPlay.AdFormat[] adFormatArrValues = LevelPlay.AdFormat.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(p002kotlin.ranges.wireman.wireman(p002kotlin.collections.polder.marial(adFormatArrValues.length), 16));
        for (LevelPlay.AdFormat adFormat : adFormatArrValues) {
            JSONObject jSONObjectOptJSONObject = applicationAuctionSettings.optJSONObject(C3746sf.a(adFormat));
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            } else {
                Intrinsics.checkNotNullExpressionValue(jSONObjectOptJSONObject, "applicationAuctionSettin…ormatKey) ?: JSONObject()");
            }
            linkedHashMap.put(adFormat, new C3697q(jSONObjectOptJSONObject));
        }
        this.a = linkedHashMap;
    }

    public final Map<LevelPlay.AdFormat, C3697q> a() {
        return this.a;
    }
}
