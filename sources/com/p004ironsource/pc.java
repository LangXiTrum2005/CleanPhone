package com.p004ironsource;

import android.content.Context;
import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.p;
import com.p004ironsource.mediationsdk.server.HttpFunctions;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J*\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0016\u0010\u0013\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/ironsource/pc;", "Lcom/ironsource/op;", "Lorg/json/JSONObject;", "b", "", "dataSource", "impressionData", "", "a", "", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", w2.f27560c, "", "revived", "Lcom/ironsource/u8;", "configurations", "reason", "d", "Z", "isExternalArmEventsEnabled", "Ljava/lang/String;", "externalArmEventsUrl", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class pc implements op {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean isExternalArmEventsEnabled = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String externalArmEventsUrl = qc.j;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ironsource/pc$a", "Lcom/ironsource/ff;", "", "requestSucceeded", "", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements ff {
        @Override // com.p004ironsource.ff
        public void a(boolean requestSucceeded) {
            if (requestSucceeded) {
                return;
            }
            IronLog.API.error("failed to send impression data");
        }
    }

    private final JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("deviceOS", "android");
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            jSONObject.put("deviceType", IronSourceUtils.getDeviceType(applicationContext));
            ek ironSourceAdvId = IronSourceUtils.getIronSourceAdvId(applicationContext);
            if (ironSourceAdvId != null) {
                jSONObject.put("advId", ironSourceAdvId.c());
                jSONObject.put("advIdType", ironSourceAdvId.d());
            }
        }
        String strK = p.j().k();
        if (strK != null) {
            jSONObject.put(d9.i.g, strK);
        }
        return jSONObject;
    }

    @Override // com.p004ironsource.op
    public void a() {
    }

    @Override // com.p004ironsource.op
    public void d(String reason) {
    }

    public final void a(String dataSource, JSONObject impressionData) {
        Intrinsics.f(dataSource, "dataSource");
        Intrinsics.f(impressionData, "impressionData");
        if (!this.isExternalArmEventsEnabled) {
            IronLog.INTERNAL.verbose("disabled from server");
            return;
        }
        try {
            JSONObject jSONObjectB = b();
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("externalMediationSource", dataSource);
            jSONObject.putOpt("externalMediationData", impressionData);
            jSONObject.putOpt("clientParams", jSONObjectB);
            IronLog.API.info("impressionData: " + jSONObject);
            HttpFunctions.sendPostRequest(this.externalArmEventsUrl, jSONObject.toString(), new a());
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.API.error("exception " + e2.getMessage() + " sending impression data");
        }
    }

    @Override // com.p004ironsource.op
    public void a(List<IronSource.AD_UNIT> adUnits, boolean revived, u8 configurations) {
        if (configurations != null) {
            z3 applicationConfigurations = configurations.getApplicationConfigurations();
            j4 j4VarF = applicationConfigurations != null ? applicationConfigurations.f() : null;
            Intrinsics.c(j4VarF);
            this.isExternalArmEventsEnabled = j4VarF.getIsExternalArmEventsEnabled();
            this.externalArmEventsUrl = configurations.getApplicationConfigurations().f().getExternalArmEventsUrl();
        }
    }
}
