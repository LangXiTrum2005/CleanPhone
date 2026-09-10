package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.NetworkHelper;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class jh extends b3 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final eh f14293u;
    public final String v;

    public static final class a implements b3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh f14294a;

        public a(eh ehVar) {
            this.f14294a = ehVar;
        }

        @Override // com.chartboost.sdk.impl.b3.a
        public void a(b3 b3Var, JSONObject jSONObject) {
        }

        @Override // com.chartboost.sdk.impl.b3.a
        public void a(b3 b3Var, CBError cBError) {
            JSONArray jSONArrayH;
            za.a(android.support.v4.media.a.n("Request ", b3Var != null ? b3Var.e() : null, " failed!"), (Throwable) null, 2, (Object) null);
            if (b3Var == null || (jSONArrayH = b3Var.h()) == null) {
                return;
            }
            this.f14294a.a(jSONArrayH);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jh(String url, eh trackingEventCache, String sessionId, b3.a callback, y6 eventTracker) {
        Intrinsics.f(url, "url");
        Intrinsics.f(trackingEventCache, "trackingEventCache");
        Intrinsics.f(sessionId, "sessionId");
        Intrinsics.f(callback, "callback");
        Intrinsics.f(eventTracker, "eventTracker");
        NetworkHelper networkHelper = NetworkHelper.f15777a;
        super(networkHelper.a(url), networkHelper.b(url), (gf) null, ae.NORMAL, callback, eventTracker, (uf) null, 64, (DefaultConstructorMarker) null);
        this.f14293u = trackingEventCache;
        this.v = sessionId;
        this.s = false;
    }

    @Override // com.chartboost.sdk.impl.b3, com.chartboost.sdk.impl.v2
    public w2 a() {
        Map mapC = c(this.v);
        JSONArray jSONArrayH = h();
        return new w2(mapC, jSONArrayH != null ? t2.a(jSONArrayH) : null, "application/json");
    }

    public final Map c(String str) {
        return MapsKt.j(new Pair("Accept", "application/json"), new Pair("X-Chartboost-Client", g3.b()), new Pair("X-Chartboost-API", "9.10.2"), new Pair("x-monetization-session-id", str));
    }

    public /* synthetic */ jh(String str, eh ehVar, String str2, b3.a aVar, y6 y6Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, ehVar, str2, (i2 & 8) != 0 ? new a(ehVar) : aVar, y6Var);
    }
}
