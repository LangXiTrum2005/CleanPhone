package com.p004ironsource.mediationsdk.adunit.adapter.utility;

import com.p004ironsource.cn;
import com.p004ironsource.mediationsdk.impressionData.ImpressionData;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.q9;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class AdInfo {
    private final ImpressionData mImpressionData;
    private final cn mLoadArmData;

    public AdInfo() {
        this.mImpressionData = null;
        this.mLoadArmData = null;
    }

    public String getAb() {
        ImpressionData impressionData = this.mImpressionData;
        return (impressionData == null || impressionData.getAb() == null) ? "" : this.mImpressionData.getAb();
    }

    public String getAdNetwork() {
        ImpressionData impressionData = this.mImpressionData;
        return (impressionData == null || impressionData.getAdNetwork() == null) ? "" : this.mImpressionData.getAdNetwork();
    }

    public String getAdUnit() {
        ImpressionData impressionData = this.mImpressionData;
        return (impressionData == null || impressionData.getAdUnit() == null) ? "" : this.mImpressionData.getAdUnit();
    }

    public String getAuctionId() {
        ImpressionData impressionData = this.mImpressionData;
        return (impressionData == null || impressionData.getAuctionId() == null) ? "" : this.mImpressionData.getAuctionId();
    }

    public String getCountry() {
        ImpressionData impressionData = this.mImpressionData;
        return (impressionData == null || impressionData.getCountry() == null) ? "" : this.mImpressionData.getCountry();
    }

    public String getEncryptedCPM() {
        ImpressionData impressionData = this.mImpressionData;
        return (impressionData == null || impressionData.getEncryptedCPM() == null) ? "" : this.mImpressionData.getEncryptedCPM();
    }

    public String getInstanceId() {
        ImpressionData impressionData = this.mImpressionData;
        return (impressionData == null || impressionData.getInstanceId() == null) ? "" : this.mImpressionData.getInstanceId();
    }

    public String getInstanceName() {
        ImpressionData impressionData = this.mImpressionData;
        return (impressionData == null || impressionData.getInstanceName() == null) ? "" : this.mImpressionData.getInstanceName();
    }

    public Double getLifetimeRevenue() {
        ImpressionData impressionData = this.mImpressionData;
        return (impressionData == null || impressionData.getLifetimeRevenue() == null) ? Double.valueOf(0.0d) : this.mImpressionData.getLifetimeRevenue();
    }

    public String getPrecision() {
        cn cnVar = this.mLoadArmData;
        if (cnVar != null) {
            return cnVar.c();
        }
        ImpressionData impressionData = this.mImpressionData;
        return (impressionData == null || impressionData.getPrecision() == null) ? "" : this.mImpressionData.getPrecision();
    }

    public Double getRevenue() {
        cn cnVar = this.mLoadArmData;
        if (cnVar != null) {
            return Double.valueOf(cnVar.d());
        }
        ImpressionData impressionData = this.mImpressionData;
        return (impressionData == null || impressionData.getRevenue() == null) ? Double.valueOf(0.0d) : this.mImpressionData.getRevenue();
    }

    public String getSegmentName() {
        ImpressionData impressionData = this.mImpressionData;
        return (impressionData == null || impressionData.getSegmentName() == null) ? "" : this.mImpressionData.getSegmentName();
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("auctionId", getAuctionId());
            jSONObject.put("adUnit", getAdUnit());
            jSONObject.put("country", getCountry());
            jSONObject.put("ab", getAb());
            jSONObject.put("segmentName", getSegmentName());
            jSONObject.put("adNetwork", getAdNetwork());
            jSONObject.put("instanceName", getInstanceName());
            jSONObject.put("instanceId", getInstanceId());
            jSONObject.put("revenue", getRevenue());
            jSONObject.put("precision", getPrecision());
            jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_LIFETIME_REVENUE, getLifetimeRevenue());
            jSONObject.put("encryptedCPM", getEncryptedCPM());
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error("error while parsing ad info " + e2.getMessage());
        }
        return jSONObject.toString();
    }

    public AdInfo(ImpressionData impressionData) {
        this.mImpressionData = impressionData;
        this.mLoadArmData = null;
    }

    public AdInfo(ImpressionData impressionData, cn cnVar) {
        this.mImpressionData = impressionData;
        this.mLoadArmData = cnVar;
    }
}
