package com.p004ironsource;

import com.smartdigimkt.h5.f;
import com.smartdigimkt.y4.g;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0002\u0007\u0013B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ironsource/s;", "", "", "", "Lcom/ironsource/s$d;", "a", "Ljava/util/Map;", "c", "()Ljava/util/Map;", uq.f27440c, "b", "Lcom/ironsource/s$d;", "()Lcom/ironsource/s$d;", "features", w2.f27560c, "Lorg/json/JSONObject;", "configurations", "<init>", "(Lorg/json/JSONObject;)V", "d", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class C3381s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f26710e = "capping";
    public static final String f = "pacing";
    public static final String g = "delivery";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f26711h = "progressiveLoadingConfig";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f26712i = "expiredDurationInMinutes";
    public static final String j = "reward";
    public static final String k = "name";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f26713l = "amount";
    public static final String m = "virtualItemName";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f26714n = "virtualItemCount";
    public static final long o = 60;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, d> placements;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d features;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, d> adUnits;

    /* JADX INFO: renamed from: com.ironsource.s$a, reason: from Kotlin metadata */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/json/JSONObject;", "it", "Lcom/ironsource/s$d;", "a", "(Lorg/json/JSONObject;)Lcom/ironsource/s$d;"}, k = 3, mv = {1, 8, 0})
    public static final class JSONObject extends Lambda implements Function1<org.json.JSONObject, d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final JSONObject f26718a = new JSONObject();

        public JSONObject() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(org.json.JSONObject it) {
            Intrinsics.f(it, "it");
            return new d(it);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s$b, reason: from Kotlin metadata and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/json/JSONObject;", "it", "Lcom/ironsource/s$d;", "a", "(Lorg/json/JSONObject;)Lcom/ironsource/s$d;"}, k = 3, mv = {1, 8, 0})
    public static final class C3382b extends Lambda implements Function1<org.json.JSONObject, d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3382b f26719a = new C3382b();

        public C3382b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(org.json.JSONObject it) {
            Intrinsics.f(it, "it");
            return new d(it);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.s$d */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0003\u0010\u0019R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010!\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006&"}, d2 = {"Lcom/ironsource/s$d;", "", "Lcom/ironsource/j8;", "a", "Lcom/ironsource/j8;", "b", "()Lcom/ironsource/j8;", C3381s.f26710e, "Lcom/ironsource/eq;", "Lcom/ironsource/eq;", "e", "()Lcom/ironsource/eq;", "pacing", "Lcom/ironsource/qa;", "c", "Lcom/ironsource/qa;", "()Lcom/ironsource/qa;", C3381s.g, "", "d", "Ljava/lang/Long;", "()Ljava/lang/Long;", C3381s.f26712i, "Lcom/ironsource/jr;", "Lcom/ironsource/jr;", "()Lcom/ironsource/jr;", "adUnitReward", f.j, "placementReward", "Lcom/ironsource/yq;", g.f40227p, "Lcom/ironsource/yq;", "()Lcom/ironsource/yq;", C3381s.f26711h, "Lorg/json/JSONObject;", "features", "<init>", "(Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final j8 capping;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final eq pacing;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final qa delivery;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Long expiredDurationInMinutes;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final jr adUnitReward;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final jr placementReward;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final yq progressiveLoadingConfig;

        public d(org.json.JSONObject features) throws JSONException {
            j8 j8Var;
            eq eqVar;
            Intrinsics.f(features, "features");
            yq yqVar = null;
            if (features.has(C3381s.f26710e)) {
                org.json.JSONObject jSONObject = features.getJSONObject(C3381s.f26710e);
                Intrinsics.e(jSONObject, "features.getJSONObject(key)");
                j8Var = new j8(jSONObject);
            } else {
                j8Var = null;
            }
            this.capping = j8Var;
            if (features.has("pacing")) {
                org.json.JSONObject jSONObject2 = features.getJSONObject("pacing");
                Intrinsics.e(jSONObject2, "features.getJSONObject(key)");
                eqVar = new eq(jSONObject2);
            } else {
                eqVar = null;
            }
            this.pacing = eqVar;
            this.delivery = features.has(C3381s.g) ? new qa(features.getBoolean(C3381s.g)) : null;
            this.expiredDurationInMinutes = features.has(C3381s.f26712i) ? Long.valueOf(features.getLong(C3381s.f26712i)) : null;
            org.json.JSONObject jSONObjectOptJSONObject = features.optJSONObject("reward");
            this.adUnitReward = jSONObjectOptJSONObject != null ? new jr(jSONObjectOptJSONObject, "name", "amount") : null;
            jr jrVar = new jr(features, C3381s.m, C3381s.f26714n);
            String name = jrVar.getName();
            this.placementReward = (name == null || name.length() == 0 || jrVar.getAmount() == null) ? null : jrVar;
            if (features.has(C3381s.f26711h)) {
                org.json.JSONObject jSONObject3 = features.getJSONObject(C3381s.f26711h);
                Intrinsics.e(jSONObject3, "features.getJSONObject(key)");
                yqVar = new yq(jSONObject3);
            }
            this.progressiveLoadingConfig = yqVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jr getAdUnitReward() {
            return this.adUnitReward;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final j8 getCapping() {
            return this.capping;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final qa getDelivery() {
            return this.delivery;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Long getExpiredDurationInMinutes() {
            return this.expiredDurationInMinutes;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final eq getPacing() {
            return this.pacing;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final jr getPlacementReward() {
            return this.placementReward;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final yq getProgressiveLoadingConfig() {
            return this.progressiveLoadingConfig;
        }
    }

    public C3381s(org.json.JSONObject configurations) {
        Intrinsics.f(configurations, "configurations");
        this.placements = new uq(configurations).a(C3382b.f26719a);
        this.features = new d(configurations);
        this.adUnits = new w2(configurations).a(JSONObject.f26718a);
    }

    public final Map<String, d> a() {
        return this.adUnits;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getFeatures() {
        return this.features;
    }

    public final Map<String, d> c() {
        return this.placements;
    }
}
