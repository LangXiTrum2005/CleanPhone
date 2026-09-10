package com.mbridge.msdk.foundation.same.net;

import com.mbridge.msdk.foundation.entity.h;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.setting.i;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c<T> implements b<T> {
    private long startTime;
    public int adType = 0;
    public String placementId = "";
    public String unitId = "";
    private com.mbridge.msdk.foundation.same.report.campaignreport.b mRequestTime = null;
    private String key = "";
    private String isRKE = "0";

    public void calcRequestTime(long j10) {
        com.mbridge.msdk.foundation.same.report.campaignreport.b bVar = new com.mbridge.msdk.foundation.same.report.campaignreport.b(new h());
        this.mRequestTime = bVar;
        bVar.b(this.unitId);
        this.mRequestTime.b(1);
        this.mRequestTime.a((j10 - this.startTime) + "");
    }

    public String getKey() {
        return this.key;
    }

    public String isRKE() {
        return this.isRKE;
    }

    public void onPreExecute() {
        this.startTime = System.currentTimeMillis();
    }

    @Override // com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(e<T> eVar) {
        try {
            String str = com.mbridge.msdk.foundation.controller.c.n().b() + "_" + this.placementId + "_" + this.unitId + "_" + this.adType;
            i.b().a(this.unitId);
            q0.b("Listener", eVar.f33811c + " " + str);
            T t10 = eVar.f33811c;
            if (t10 instanceof JSONObject) {
                com.mbridge.msdk.foundation.same.net.utils.c.b().a(str, ((JSONObject) t10).optInt("status"), ((JSONObject) eVar.f33811c).toString(), System.currentTimeMillis());
            }
            if (eVar.f33811c instanceof String) {
                com.mbridge.msdk.foundation.same.net.utils.c.b().a(str, new JSONObject((String) eVar.f33811c).optInt("status"), (String) eVar.f33811c, System.currentTimeMillis());
            }
        } catch (Exception e10) {
            q0.b("Listener", e10.getMessage());
        }
    }

    public void saveHbState(int i10) {
        com.mbridge.msdk.foundation.same.report.campaignreport.b bVar = this.mRequestTime;
        if (bVar != null) {
            bVar.c(i10);
        }
    }

    public void saveRequestTime(int i10) {
        com.mbridge.msdk.foundation.same.report.campaignreport.b bVar = this.mRequestTime;
        if (bVar != null) {
            bVar.a(i10);
            this.mRequestTime.a();
        }
    }

    public void setAdType(int i10) {
        this.adType = i10;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setPlacementId(String str) {
        this.placementId = str;
    }

    public void setRKE(String str) {
        this.isRKE = str;
    }

    public void setUnitId(String str) {
        this.unitId = str;
    }

    public void onCancel() {
    }

    public void onFinish() {
    }

    public void onNetworking() {
    }

    public void onRetry() {
    }

    @Override // com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
    }

    public void onProgressChange(long j10, long j11) {
    }
}
