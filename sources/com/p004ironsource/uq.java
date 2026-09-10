package com.p004ironsource;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/ironsource/uq;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function1;", "Lorg/json/JSONObject;", "valueExtractor", "", "", "a", "Lorg/json/JSONArray;", "Lorg/json/JSONArray;", uq.f27440c, "configuration", "<init>", "(Lorg/json/JSONObject;)V", "b", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class uq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f27440c = "placements";
    public static final String d = "placementName";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final JSONArray placements;

    public uq(JSONObject configuration) {
        Intrinsics.f(configuration, "configuration");
        this.placements = configuration.optJSONArray(f27440c);
    }

    public final <T> Map<String, T> a(Function1<? super JSONObject, ? extends T> valueExtractor) throws JSONException {
        Intrinsics.f(valueExtractor, "valueExtractor");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArray = this.placements;
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                String key = jSONObject.optString("placementName");
                Object objInvoke = valueExtractor.invoke(jSONObject);
                Intrinsics.e(key, "key");
                linkedHashMap.put(key, objInvoke);
            }
        }
        return linkedHashMap;
    }
}
