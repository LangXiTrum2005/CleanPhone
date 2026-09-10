package com.p004ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\t\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015R\u0017\u0010\u001a\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0003\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/ironsource/y3;", "", "Lcom/ironsource/in;", "a", "Lcom/ironsource/in;", "e", "()Lcom/ironsource/in;", "logger", "", "b", "Z", "d", "()Z", a4.g, "Lcom/ironsource/c4;", "c", "Lcom/ironsource/c4;", "()Lcom/ironsource/c4;", a4.f24257h, "Lcom/ironsource/j4;", "Lcom/ironsource/j4;", "()Lcom/ironsource/j4;", "generalSettings", "Lcom/ironsource/w3;", "Lcom/ironsource/w3;", "()Lcom/ironsource/w3;", "auctionSettings", "Lorg/json/JSONObject;", "applicationConfigurations", "<init>", "(Lorg/json/JSONObject;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final in logger;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean integration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c4 crashReporter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final j4 generalSettings;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final w3 auctionSettings;

    public y3(JSONObject applicationConfigurations) {
        Intrinsics.f(applicationConfigurations, "applicationConfigurations");
        JSONObject jSONObjectOptJSONObject = applicationConfigurations.optJSONObject(a4.f24253a);
        this.logger = new in(jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject);
        this.integration = applicationConfigurations.optBoolean(a4.g, false);
        JSONObject jSONObjectOptJSONObject2 = applicationConfigurations.optJSONObject(a4.f24257h);
        this.crashReporter = new c4(jSONObjectOptJSONObject2 == null ? new JSONObject() : jSONObjectOptJSONObject2);
        JSONObject jSONObjectOptJSONObject3 = applicationConfigurations.optJSONObject("settings");
        this.generalSettings = new j4(jSONObjectOptJSONObject3 == null ? new JSONObject() : jSONObjectOptJSONObject3);
        JSONObject jSONObjectOptJSONObject4 = applicationConfigurations.optJSONObject(a4.f);
        this.auctionSettings = new w3(jSONObjectOptJSONObject4 == null ? new JSONObject() : jSONObjectOptJSONObject4);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final w3 getAuctionSettings() {
        return this.auctionSettings;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c4 getCrashReporter() {
        return this.crashReporter;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final j4 getGeneralSettings() {
        return this.generalSettings;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIntegration() {
        return this.integration;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final in getLogger() {
        return this.logger;
    }
}
