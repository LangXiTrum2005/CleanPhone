package com.ironsource.mediationsdk.adunit.adapter.utility;

import com.ironsource.Ab;
import com.ironsource.C0474n4;
import com.ironsource.W8;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.n;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class AdInfo {
    private final W8 impressionData;
    private final Ab loadArmData;

    public AdInfo(W8 w10, Ab ab2) {
        this.impressionData = w10;
        this.loadArmData = ab2;
    }

    public final String getAb() {
        W8 w10 = this.impressionData;
        return (w10 == null || w10.a() == null) ? "" : this.impressionData.a();
    }

    public final String getAdNetwork() {
        W8 w10 = this.impressionData;
        return (w10 == null || w10.c() == null) ? "" : this.impressionData.c();
    }

    public final String getAuctionId() {
        W8 w10 = this.impressionData;
        return (w10 == null || w10.e() == null) ? "" : this.impressionData.e();
    }

    public final String getCountry() {
        W8 w10 = this.impressionData;
        return (w10 == null || w10.f() == null) ? "" : this.impressionData.f();
    }

    public final String getEncryptedCPM() {
        W8 w10 = this.impressionData;
        return (w10 == null || w10.h() == null) ? "" : this.impressionData.h();
    }

    public final String getInstanceId() {
        W8 w10 = this.impressionData;
        return (w10 == null || w10.i() == null) ? "" : this.impressionData.i();
    }

    public final String getInstanceName() {
        W8 w10 = this.impressionData;
        return (w10 == null || w10.j() == null) ? "" : this.impressionData.j();
    }

    public final String getPrecision() {
        Ab ab2 = this.loadArmData;
        if (ab2 != null) {
            return ab2.c();
        }
        W8 w10 = this.impressionData;
        return (w10 == null || w10.n() == null) ? "" : this.impressionData.n();
    }

    public final double getRevenue() {
        Ab ab2 = this.loadArmData;
        if (ab2 != null) {
            return ab2.d();
        }
        W8 w10 = this.impressionData;
        if (w10 == null) {
            return 0.0d;
        }
        w10.o();
        return this.impressionData.o();
    }

    public final String getSegmentName() {
        W8 w10 = this.impressionData;
        return (w10 == null || w10.p() == null) ? "" : this.impressionData.p();
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("auctionId", getAuctionId());
            jSONObject.put("country", getCountry());
            jSONObject.put("ab", getAb());
            jSONObject.put("segmentName", getSegmentName());
            jSONObject.put("adNetwork", getAdNetwork());
            jSONObject.put("instanceName", getInstanceName());
            jSONObject.put("instanceId", getInstanceId());
            jSONObject.put("revenue", getRevenue());
            jSONObject.put("precision", getPrecision());
            jSONObject.put("encryptedCPM", getEncryptedCPM());
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error("error while parsing ad info " + e10.getMessage());
        }
        String string = jSONObject.toString();
        n.e(string, "adInfoData.toString()");
        return string;
    }
}
