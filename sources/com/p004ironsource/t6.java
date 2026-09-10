package com.p004ironsource;

import com.p004ironsource.mediationsdk.l;
import com.smartdigimkt.h5.f;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u0003\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/ironsource/t6;", "", "Lcom/ironsource/t6$b;", "a", "Lcom/ironsource/t6$b;", "b", "()Lcom/ironsource/t6$b;", "features", "", "", "Ljava/util/Map;", "()Ljava/util/Map;", w2.f27560c, "Lorg/json/JSONObject;", "bannerConfigurations", "<init>", "(Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class t6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b features;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, b> adUnits;

    /* JADX INFO: renamed from: com.ironsource.t6$a, reason: from Kotlin metadata */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/json/JSONObject;", "it", "Lcom/ironsource/t6$b;", "a", "(Lorg/json/JSONObject;)Lcom/ironsource/t6$b;"}, k = 3, mv = {1, 8, 0})
    public static final class JSONObject extends Lambda implements Function1<org.json.JSONObject, b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final JSONObject f27275a = new JSONObject();

        public JSONObject() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke(org.json.JSONObject it) {
            Intrinsics.f(it, "it");
            return new b(it);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\r\u0010\u0017R\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0003\u0010\u001d¨\u0006\""}, d2 = {"Lcom/ironsource/t6$b;", "", "", "a", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "isLoadWhileShow", "Lorg/json/JSONObject;", "b", "Lorg/json/JSONObject;", "refreshConfigs", "", "c", "I", "()I", v6.f27462a, "d", "Z", "()Z", v6.f27463b, "", "F", "()F", v6.g, "", "", f.j, "Ljava/util/List;", "()Ljava/util/List;", "bannerAdSizeFallbackList", "features", "<init>", "(Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Boolean isLoadWhileShow;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final org.json.JSONObject refreshConfigs;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int bannerInterval;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean isAutoRefresh;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final float maxScreenHeightPercentage;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final List<String> bannerAdSizeFallbackList;

        public b(org.json.JSONObject features) {
            Intrinsics.f(features, "features");
            org.json.JSONObject jSONObject = features.has("isLoadWhileShow") ? features : null;
            Boolean boolValueOf = jSONObject != null ? Boolean.valueOf(jSONObject.optBoolean("isLoadWhileShow")) : null;
            this.isLoadWhileShow = boolValueOf;
            org.json.JSONObject jSONObject2 = features.has(v6.f27464c) ? features : null;
            org.json.JSONObject jSONObjectOptJSONObject = jSONObject2 != null ? jSONObject2.optJSONObject(v6.f27464c) : null;
            this.refreshConfigs = jSONObjectOptJSONObject;
            Boolean bool = Boolean.TRUE;
            int iOptInt = 25;
            boolean zOptBoolean = true;
            if (!Intrinsics.a(boolValueOf, bool)) {
                iOptInt = features.optInt(v6.f27462a, 25);
            } else if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean("enabled")) {
                int iOptInt2 = jSONObjectOptJSONObject.optInt(v6.d, 25000);
                iOptInt = iOptInt2 == 0 ? 0 : iOptInt2 / 1000;
            }
            this.bannerInterval = iOptInt;
            if (!Intrinsics.a(boolValueOf, bool)) {
                zOptBoolean = features.optBoolean(v6.f27462a, true);
            } else if (jSONObjectOptJSONObject != null) {
                zOptBoolean = jSONObjectOptJSONObject.optBoolean("enabled", true);
            }
            this.isAutoRefresh = zOptBoolean;
            this.maxScreenHeightPercentage = features.has(v6.g) ? features.optInt(v6.g) / 100.0f : 0.15f;
            List<String> listB = features.has(v6.f27466h) ? tk.b(features.getJSONArray(v6.f27466h)) : CollectionsKt.I("BANNER", l.d);
            Intrinsics.e(listB, "BANNER_CONFIGURATIONS_AD…ZE_LEADERBOARD)\n        }");
            this.bannerAdSizeFallbackList = listB;
        }

        public final List<String> a() {
            return this.bannerAdSizeFallbackList;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getBannerInterval() {
            return this.bannerInterval;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getMaxScreenHeightPercentage() {
            return this.maxScreenHeightPercentage;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsAutoRefresh() {
            return this.isAutoRefresh;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Boolean getIsLoadWhileShow() {
            return this.isLoadWhileShow;
        }
    }

    public t6(org.json.JSONObject bannerConfigurations) {
        Intrinsics.f(bannerConfigurations, "bannerConfigurations");
        this.features = new b(bannerConfigurations);
        this.adUnits = new w2(bannerConfigurations).a(JSONObject.f27275a);
    }

    public final Map<String, b> a() {
        return this.adUnits;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getFeatures() {
        return this.features;
    }
}
