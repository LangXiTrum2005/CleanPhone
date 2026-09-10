package com.p004ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/ironsource/w3;", "", "", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "Lcom/ironsource/p;", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "adFormats", "Lorg/json/JSONObject;", "applicationAuctionSettings", "<init>", "(Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<LevelPlay.AdFormat, C3376p> adFormats;

    public w3(JSONObject applicationAuctionSettings) {
        Intrinsics.f(applicationAuctionSettings, "applicationAuctionSettings");
        LevelPlay.AdFormat[] adFormatArrValues = LevelPlay.AdFormat.values();
        int iH = MapsKt.h(adFormatArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH < 16 ? 16 : iH);
        for (LevelPlay.AdFormat adFormat : adFormatArrValues) {
            JSONObject jSONObjectOptJSONObject = applicationAuctionSettings.optJSONObject(av.a(adFormat));
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            linkedHashMap.put(adFormat, new C3376p(jSONObjectOptJSONObject));
        }
        this.adFormats = linkedHashMap;
    }

    public final Map<LevelPlay.AdFormat, C3376p> a() {
        return this.adFormats;
    }
}
