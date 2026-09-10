package com.p004ironsource;

import com.p004ironsource.mediationsdk.d;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0002\u0007\fBI\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010!\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010&\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b'\u0010(J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\t\u001a\u00020\bJ\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0004R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u0018\u0010\u001bR\u0019\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b\u0012\u0010 R\u0019\u0010&\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%¨\u0006)"}, d2 = {"Lcom/ironsource/i5;", "", "Lcom/ironsource/mediationsdk/demandOnly/a;", d.f25770h, "", "instanceId", "Lcom/ironsource/m5;", "a", "", i.f37957c, "providerName", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "auctionId", "Lcom/ironsource/mediationsdk/demandOnly/a;", h.f36614b, "()Lcom/ironsource/mediationsdk/demandOnly/a;", "c", "Lcom/ironsource/m5;", "e", "()Lcom/ironsource/m5;", "genericNotifications", "Lorg/json/JSONObject;", "d", "Lorg/json/JSONObject;", f.j, "()Lorg/json/JSONObject;", "genericParams", "configurations", "Lcom/ironsource/c5;", "Lcom/ironsource/c5;", "()Lcom/ironsource/c5;", "auctionReportUrls", "Lcom/ironsource/n5;", g.f40227p, "Lcom/ironsource/n5;", "()Lcom/ironsource/n5;", m5.s, "<init>", "(Ljava/lang/String;Lcom/ironsource/mediationsdk/demandOnly/a;Lcom/ironsource/m5;Lorg/json/JSONObject;Lorg/json/JSONObject;Lcom/ironsource/c5;Lcom/ironsource/n5;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class i5 {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String auctionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final com.p004ironsource.mediationsdk.demandOnly.a waterfall;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m5 genericNotifications;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final JSONObject genericParams;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final JSONObject configurations;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final c5 auctionReportUrls;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final n5 serverData;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002J\u0006\u0010\u0004\u001a\u00020\u0010R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\n\u0010\u0012R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\b\u0010\u0015R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u0016\u0010!\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/ironsource/i5$a;", "", "Lorg/json/JSONObject;", "auctionResponse", "a", "settingsJsonObject", "Lcom/ironsource/mediationsdk/demandOnly/a;", "Lcom/ironsource/m5;", "c", "d", "b", d.f25770h, "", "instanceId", "Lcom/ironsource/c5;", "Lcom/ironsource/n5;", "Lcom/ironsource/i5;", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "auctionData", "Ljava/lang/String;", "()Ljava/lang/String;", "auctionId", "Lcom/ironsource/mediationsdk/demandOnly/a;", "e", "Lcom/ironsource/m5;", "genericNotifications", f.j, "genericParams", g.f40227p, "configurations", h.f36614b, "Lcom/ironsource/c5;", "auctionReportUrls", i.f37957c, "Lcom/ironsource/n5;", m5.s, "<init>", "(Lorg/json/JSONObject;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final JSONObject auctionData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String instanceId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String auctionId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final com.p004ironsource.mediationsdk.demandOnly.a waterfall;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final m5 genericNotifications;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final JSONObject genericParams;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final JSONObject configurations;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final c5 auctionReportUrls;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final n5 serverData;

        public a(JSONObject auctionData, String instanceId) {
            Intrinsics.f(auctionData, "auctionData");
            Intrinsics.f(instanceId, "instanceId");
            this.auctionData = auctionData;
            this.instanceId = instanceId;
            JSONObject jSONObjectA = a(auctionData);
            this.auctionId = auctionData.optString("auctionId");
            com.p004ironsource.mediationsdk.demandOnly.a aVarA = a(auctionData, jSONObjectA);
            this.waterfall = aVarA;
            this.genericNotifications = c(jSONObjectA);
            this.genericParams = d(jSONObjectA);
            this.configurations = b(jSONObjectA);
            this.auctionReportUrls = a(aVarA, instanceId);
            this.serverData = b(aVarA, instanceId);
        }

        private final c5 a(com.p004ironsource.mediationsdk.demandOnly.a waterfall, String instanceId) {
            m5 m5VarA = waterfall.a(instanceId);
            if (m5VarA == null) {
                return null;
            }
            c5 c5Var = new c5();
            c5Var.a(m5VarA.b());
            c5Var.c(m5VarA.h());
            c5Var.b(m5VarA.g());
            return c5Var;
        }

        private final n5 b(com.p004ironsource.mediationsdk.demandOnly.a waterfall, String instanceId) {
            m5 m5VarA = waterfall.a(instanceId);
            if (m5VarA == null) {
                return null;
            }
            String strK = m5VarA.k();
            Intrinsics.e(strK, "it.serverData");
            return new n5(strK);
        }

        private final m5 c(JSONObject settingsJsonObject) {
            return new m5(settingsJsonObject);
        }

        private final JSONObject d(JSONObject settingsJsonObject) {
            return settingsJsonObject.optJSONObject("genericParams");
        }

        public final i5 a() {
            return new i5(this.auctionId, this.waterfall, this.genericNotifications, this.genericParams, this.configurations, this.auctionReportUrls, this.serverData);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final JSONObject getAuctionData() {
            return this.auctionData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getInstanceId() {
            return this.instanceId;
        }

        private final JSONObject a(JSONObject auctionResponse) {
            JSONObject jSONObjectOptJSONObject = auctionResponse.optJSONObject("settings");
            return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        }

        private final JSONObject b(JSONObject settingsJsonObject) {
            return settingsJsonObject.optJSONObject("configurations");
        }

        private final com.p004ironsource.mediationsdk.demandOnly.a a(JSONObject auctionResponse, JSONObject settingsJsonObject) {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObjectOptJSONObject = settingsJsonObject.optJSONObject(d.d);
            JSONArray jSONArrayOptJSONArray = auctionResponse.optJSONArray(d.f25770h);
            if (jSONArrayOptJSONArray != null) {
                IntRange intRangeE = RangesKt.e(0, jSONArrayOptJSONArray.length());
                ArrayList arrayList2 = new ArrayList();
                Iterator<Integer> it = intRangeE.iterator();
                while (((IntProgressionIterator) it).Z) {
                    int iA = ((IntIterator) it).a();
                    m5 m5Var = new m5(jSONArrayOptJSONArray.getJSONObject(iA), iA, jSONObjectOptJSONObject);
                    if (!m5Var.m()) {
                        m5Var = null;
                    }
                    if (m5Var != null) {
                        arrayList2.add(m5Var);
                    }
                }
                arrayList.addAll(arrayList2);
            }
            return new com.p004ironsource.mediationsdk.demandOnly.a.C0287a(arrayList);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.i5$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ.\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\u000b\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/ironsource/i5$b;", "", "Lcom/ironsource/i5;", "auctionResponse", "", "instanceId", "Lkotlin/Result;", "a", "(Lcom/ironsource/i5;Ljava/lang/String;)Ljava/lang/Object;", "Lorg/json/JSONObject;", "auctionData", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Object;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        private final Object a(i5 auctionResponse, String instanceId) {
            yg ygVar;
            String auctionId = auctionResponse.getAuctionId();
            if (auctionId == null || auctionId.length() == 0) {
                ygVar = new yg(wb.f27568a.i());
            } else if (auctionResponse.i()) {
                ygVar = new yg(wb.f27568a.f());
            } else {
                m5 m5VarA = auctionResponse.a(instanceId);
                if (m5VarA == null) {
                    ygVar = new yg(wb.f27568a.j());
                } else {
                    String strK = m5VarA.k();
                    if (strK != null && strK.length() != 0) {
                        return auctionResponse;
                    }
                    ygVar = new yg(wb.f27568a.e());
                }
            }
            return ResultKt.a(ygVar);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Object a(JSONObject auctionData, String instanceId) {
            Intrinsics.f(auctionData, "auctionData");
            Intrinsics.f(instanceId, "instanceId");
            return a(new a(auctionData, instanceId).a(), instanceId);
        }
    }

    public i5(String str, com.p004ironsource.mediationsdk.demandOnly.a waterfall, m5 genericNotifications, JSONObject jSONObject, JSONObject jSONObject2, c5 c5Var, n5 n5Var) {
        Intrinsics.f(waterfall, "waterfall");
        Intrinsics.f(genericNotifications, "genericNotifications");
        this.auctionId = str;
        this.waterfall = waterfall;
        this.genericNotifications = genericNotifications;
        this.genericParams = jSONObject;
        this.configurations = jSONObject2;
        this.auctionReportUrls = c5Var;
        this.serverData = n5Var;
    }

    private final m5 a(com.p004ironsource.mediationsdk.demandOnly.a waterfall, String instanceId) {
        return waterfall.a(instanceId);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAuctionId() {
        return this.auctionId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c5 getAuctionReportUrls() {
        return this.auctionReportUrls;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final JSONObject getConfigurations() {
        return this.configurations;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final m5 getGenericNotifications() {
        return this.genericNotifications;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final JSONObject getGenericParams() {
        return this.genericParams;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final n5 getServerData() {
        return this.serverData;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final com.p004ironsource.mediationsdk.demandOnly.a getWaterfall() {
        return this.waterfall;
    }

    public final boolean i() {
        return this.waterfall.isEmpty();
    }

    public final m5 a(String providerName) {
        Intrinsics.f(providerName, "providerName");
        return a(this.waterfall, providerName);
    }

    public final String a() {
        n5 n5Var = this.serverData;
        if (n5Var != null) {
            return n5Var.d();
        }
        return null;
    }
}
