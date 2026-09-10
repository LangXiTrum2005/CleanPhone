package com.p004ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0005\rB\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/ironsource/br;", "", "", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "Lcom/ironsource/br$a;", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "adFormats", "Lorg/json/JSONObject;", xs.f27730a, "<init>", "(Lorg/json/JSONObject;)V", "b", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class br {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<LevelPlay.AdFormat, a> adFormats;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/ironsource/br$a;", "", "", "", "Lcom/ironsource/br$b;", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "adUnitIds", "Lorg/json/JSONObject;", "adFormatProviderOrder", "<init>", "(Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Map<String, b> adUnitIds;

        public a(JSONObject adFormatProviderOrder) throws JSONException {
            Intrinsics.f(adFormatProviderOrder, "adFormatProviderOrder");
            Iterable iterableB = tk.b(adFormatProviderOrder.names());
            iterableB = iterableB == null ? EmptyList.X : iterableB;
            int iH = MapsKt.h(CollectionsKt.n(iterableB, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iH < 16 ? 16 : iH);
            for (Object obj : iterableB) {
                JSONArray jSONArrayOptJSONArray = adFormatProviderOrder.optJSONArray((String) obj);
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                linkedHashMap.put(obj, new b(jSONArrayOptJSONArray));
            }
            this.adUnitIds = linkedHashMap;
        }

        public final Map<String, b> a() {
            return this.adUnitIds;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ironsource/br$b;", "", "", "", "a", "Ljava/util/List;", "()Ljava/util/List;", xs.f27730a, "Lorg/json/JSONArray;", "<init>", "(Lorg/json/JSONArray;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<String> providerOrder;

        public b(JSONArray providerOrder) throws JSONException {
            Intrinsics.f(providerOrder, "providerOrder");
            List<String> listB = tk.b(providerOrder);
            Intrinsics.e(listB, "jsonArrayToStringList(providerOrder)");
            this.providerOrder = listB;
        }

        public final List<String> a() {
            return this.providerOrder;
        }
    }

    public br(JSONObject providerOrder) {
        Intrinsics.f(providerOrder, "providerOrder");
        LevelPlay.AdFormat[] adFormatArrValues = LevelPlay.AdFormat.values();
        int iH = MapsKt.h(adFormatArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH < 16 ? 16 : iH);
        for (LevelPlay.AdFormat adFormat : adFormatArrValues) {
            JSONObject jSONObjectOptJSONObject = providerOrder.optJSONObject(av.a(adFormat));
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            linkedHashMap.put(adFormat, new a(jSONObjectOptJSONObject));
        }
        this.adFormats = linkedHashMap;
    }

    public final Map<LevelPlay.AdFormat, a> a() {
        return this.adFormats;
    }
}
