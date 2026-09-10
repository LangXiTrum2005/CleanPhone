package com.p004ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0003\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\t\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/ironsource/ws;", "", "Lcom/ironsource/qt;", "a", "Lcom/ironsource/qt;", "c", "()Lcom/ironsource/qt;", "fullResponse", "Lcom/ironsource/br;", "b", "Lcom/ironsource/br;", "d", "()Lcom/ironsource/br;", xs.f27730a, "Lcom/ironsource/dr;", "Lcom/ironsource/dr;", "e", "()Lcom/ironsource/dr;", xs.f27731b, "Lcom/ironsource/v8;", "Lcom/ironsource/v8;", "()Lcom/ironsource/v8;", "configurations", "Lcom/ironsource/nc;", "Lcom/ironsource/nc;", "()Lcom/ironsource/nc;", xs.d, "<init>", "(Lcom/ironsource/qt;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ws {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final qt fullResponse;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final br providerOrder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final dr providerSettings;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final v8 configurations;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final nc experiments;

    public ws(qt fullResponse) {
        Intrinsics.f(fullResponse, "fullResponse");
        this.fullResponse = fullResponse;
        JSONObject jSONObjectOptJSONObject = fullResponse.i().optJSONObject(xs.f27730a);
        this.providerOrder = new br(jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject);
        JSONObject jSONObjectOptJSONObject2 = fullResponse.i().optJSONObject(xs.f27731b);
        this.providerSettings = new dr(jSONObjectOptJSONObject2 == null ? new JSONObject() : jSONObjectOptJSONObject2);
        JSONObject jSONObjectOptJSONObject3 = fullResponse.i().optJSONObject("configurations");
        this.configurations = new v8(jSONObjectOptJSONObject3 == null ? new JSONObject() : jSONObjectOptJSONObject3);
        JSONObject jSONObjectOptJSONObject4 = fullResponse.i().optJSONObject(xs.d);
        this.experiments = new nc(jSONObjectOptJSONObject4 == null ? new JSONObject() : jSONObjectOptJSONObject4);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final v8 getConfigurations() {
        return this.configurations;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final nc getExperiments() {
        return this.experiments;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final qt getFullResponse() {
        return this.fullResponse;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final br getProviderOrder() {
        return this.providerOrder;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final dr getProviderSettings() {
        return this.providerSettings;
    }
}
