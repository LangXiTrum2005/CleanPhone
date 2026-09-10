package com.p004ironsource;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.ConstrainedOnceSequence;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u000e2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ,\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/ironsource/w2;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function1;", "Lorg/json/JSONObject;", "valueExtractor", "", "", "a", "Lorg/json/JSONObject;", w2.f27560c, "configurations", "<init>", "(Lorg/json/JSONObject;)V", "b", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class w2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f27560c = "adUnits";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final JSONObject adUnits;

    public w2(JSONObject configurations) {
        Intrinsics.f(configurations, "configurations");
        this.adUnits = configurations.optJSONObject(f27560c);
    }

    public final <T> Map<String, T> a(Function1<? super JSONObject, ? extends T> valueExtractor) throws JSONException {
        Intrinsics.f(valueExtractor, "valueExtractor");
        JSONObject jSONObject = this.adUnits;
        if (jSONObject == null) {
            return EmptyMap.X;
        }
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.e(itKeys, "adUnits.keys()");
        Sequence sequenceB = SequencesKt.b(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : (ConstrainedOnceSequence) sequenceB) {
            JSONObject jSONObject2 = jSONObject.getJSONObject((String) obj);
            Intrinsics.e(jSONObject2, "adUnits.getJSONObject(adUnitId)");
            linkedHashMap.put(obj, valueExtractor.invoke(jSONObject2));
        }
        return linkedHashMap;
    }
}
