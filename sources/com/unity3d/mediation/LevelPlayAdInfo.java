package com.unity3d.mediation;

import an.p;
import com.ironsource.Ab;
import com.ironsource.C0474n4;
import com.ironsource.C0526q2;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronLog;
import d5.u;
import defpackage.e;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
import xj.w;
import zm.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class LevelPlayAdInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f38498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f38499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0526q2 f38500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LevelPlayAdSize f38501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f38502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, Object> f38503g;

    public LevelPlayAdInfo(String adId, String adUnitId, String adFormat, C0526q2 c0526q2, LevelPlayAdSize levelPlayAdSize, String str, Map<String, ? extends Object> adapterData) {
        n.f(adId, "adId");
        n.f(adUnitId, "adUnitId");
        n.f(adFormat, "adFormat");
        n.f(adapterData, "adapterData");
        this.f38497a = adId;
        this.f38498b = adUnitId;
        this.f38499c = adFormat;
        this.f38500d = c0526q2;
        this.f38501e = levelPlayAdSize;
        this.f38502f = str;
        this.f38503g = adapterData;
    }

    private final String a() {
        return this.f38497a;
    }

    private final String b() {
        return this.f38498b;
    }

    private final String c() {
        return this.f38499c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LevelPlayAdInfo copy$default(LevelPlayAdInfo levelPlayAdInfo, String str, String str2, String str3, C0526q2 c0526q2, LevelPlayAdSize levelPlayAdSize, String str4, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = levelPlayAdInfo.f38497a;
        }
        if ((i10 & 2) != 0) {
            str2 = levelPlayAdInfo.f38498b;
        }
        if ((i10 & 4) != 0) {
            str3 = levelPlayAdInfo.f38499c;
        }
        if ((i10 & 8) != 0) {
            c0526q2 = levelPlayAdInfo.f38500d;
        }
        if ((i10 & 16) != 0) {
            levelPlayAdSize = levelPlayAdInfo.f38501e;
        }
        if ((i10 & 32) != 0) {
            str4 = levelPlayAdInfo.f38502f;
        }
        if ((i10 & 64) != 0) {
            map = levelPlayAdInfo.f38503g;
        }
        String str5 = str4;
        Map map2 = map;
        LevelPlayAdSize levelPlayAdSize2 = levelPlayAdSize;
        String str6 = str3;
        return levelPlayAdInfo.copy(str, str2, str6, c0526q2, levelPlayAdSize2, str5, map2);
    }

    private final C0526q2 d() {
        return this.f38500d;
    }

    private final LevelPlayAdSize e() {
        return this.f38501e;
    }

    private final String f() {
        return this.f38502f;
    }

    private final Map<String, Object> g() {
        return this.f38503g;
    }

    public final LevelPlayAdInfo copy(String adId, String adUnitId, String adFormat, C0526q2 c0526q2, LevelPlayAdSize levelPlayAdSize, String str, Map<String, ? extends Object> adapterData) {
        n.f(adId, "adId");
        n.f(adUnitId, "adUnitId");
        n.f(adFormat, "adFormat");
        n.f(adapterData, "adapterData");
        return new LevelPlayAdInfo(adId, adUnitId, adFormat, c0526q2, levelPlayAdSize, str, adapterData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelPlayAdInfo)) {
            return false;
        }
        LevelPlayAdInfo levelPlayAdInfo = (LevelPlayAdInfo) obj;
        return n.a(this.f38497a, levelPlayAdInfo.f38497a) && n.a(this.f38498b, levelPlayAdInfo.f38498b) && n.a(this.f38499c, levelPlayAdInfo.f38499c) && n.a(this.f38500d, levelPlayAdInfo.f38500d) && n.a(this.f38501e, levelPlayAdInfo.f38501e) && n.a(this.f38502f, levelPlayAdInfo.f38502f) && n.a(this.f38503g, levelPlayAdInfo.f38503g);
    }

    public final String getAb() {
        JSONObject jSONObjectM;
        C0526q2 c0526q2 = this.f38500d;
        Object objOpt = (c0526q2 == null || (jSONObjectM = c0526q2.m()) == null) ? null : jSONObjectM.opt("ab");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public final String getAdFormat() {
        JSONObject jSONObjectM;
        C0526q2 c0526q2 = this.f38500d;
        Object objOpt = (c0526q2 == null || (jSONObjectM = c0526q2.m()) == null) ? null : jSONObjectM.opt("adFormat");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? this.f38499c : str;
    }

    public final String getAdId() {
        return this.f38497a;
    }

    public final String getAdNetwork() {
        JSONObject jSONObjectM;
        C0526q2 c0526q2 = this.f38500d;
        Object objOpt = (c0526q2 == null || (jSONObjectM = c0526q2.m()) == null) ? null : jSONObjectM.opt("adNetwork");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public final LevelPlayAdSize getAdSize() {
        return this.f38501e;
    }

    public final String getAdUnitId() {
        JSONObject jSONObjectM;
        C0526q2 c0526q2 = this.f38500d;
        Object objOpt = (c0526q2 == null || (jSONObjectM = c0526q2.m()) == null) ? null : jSONObjectM.opt("mediationAdUnitId");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? this.f38498b : str;
    }

    public final String getAdUnitName() {
        JSONObject jSONObjectM;
        C0526q2 c0526q2 = this.f38500d;
        Object objOpt = (c0526q2 == null || (jSONObjectM = c0526q2.m()) == null) ? null : jSONObjectM.opt("mediationAdUnitName");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public final String getAuctionId() {
        JSONObject jSONObjectM;
        C0526q2 c0526q2 = this.f38500d;
        Object objOpt = (c0526q2 == null || (jSONObjectM = c0526q2.m()) == null) ? null : jSONObjectM.opt("auctionId");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public final String getCountry() {
        JSONObject jSONObjectM;
        C0526q2 c0526q2 = this.f38500d;
        Object objOpt = (c0526q2 == null || (jSONObjectM = c0526q2.m()) == null) ? null : jSONObjectM.opt("country");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public final String getCreativeId() {
        JSONObject jSONObjectM;
        C0526q2 c0526q2 = this.f38500d;
        Object objOpt = (c0526q2 == null || (jSONObjectM = c0526q2.m()) == null) ? null : jSONObjectM.opt("creativeId");
        if (!(objOpt instanceof String)) {
            objOpt = null;
        }
        String str = (String) objOpt;
        if (str != null) {
            return str;
        }
        Object obj = this.f38503g.get("creativeId");
        String str2 = obj instanceof String ? (String) obj : null;
        return str2 == null ? "" : str2;
    }

    public final String getEncryptedCPM() {
        JSONObject jSONObjectM;
        C0526q2 c0526q2 = this.f38500d;
        Object objOpt = (c0526q2 == null || (jSONObjectM = c0526q2.m()) == null) ? null : jSONObjectM.opt("encryptedCPM");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public final String getImpressionPrecision$mediationsdk_release() {
        JSONObject jSONObjectM;
        C0526q2 c0526q2 = this.f38500d;
        Object objOpt = (c0526q2 == null || (jSONObjectM = c0526q2.m()) == null) ? null : jSONObjectM.opt("precision");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public final double getImpressionRevenue$mediationsdk_release() {
        JSONObject jSONObjectM;
        C0526q2 c0526q2 = this.f38500d;
        Double dValueOf = (c0526q2 == null || (jSONObjectM = c0526q2.m()) == null) ? null : Double.valueOf(jSONObjectM.optDouble("revenue"));
        if ((dValueOf == null || dValueOf.doubleValue() != Double.NaN) && dValueOf != null) {
            return dValueOf.doubleValue();
        }
        return 0.0d;
    }

    public final String getInstanceId() {
        JSONObject jSONObjectM;
        C0526q2 c0526q2 = this.f38500d;
        Object objOpt = (c0526q2 == null || (jSONObjectM = c0526q2.m()) == null) ? null : jSONObjectM.opt("instanceId");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public final String getInstanceName() {
        JSONObject jSONObjectM;
        C0526q2 c0526q2 = this.f38500d;
        Object objOpt = (c0526q2 == null || (jSONObjectM = c0526q2.m()) == null) ? null : jSONObjectM.opt("instanceName");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public final String getPlacementName() {
        String str = this.f38502f;
        return str == null ? "" : str;
    }

    public final String getPrecision() {
        Ab abD;
        String strC;
        C0526q2 c0526q2 = this.f38500d;
        return (c0526q2 == null || (abD = c0526q2.d()) == null || (strC = abD.c()) == null) ? getImpressionPrecision$mediationsdk_release() : strC;
    }

    public final double getRevenue() {
        Ab abD;
        C0526q2 c0526q2 = this.f38500d;
        return (c0526q2 == null || (abD = c0526q2.d()) == null) ? getImpressionRevenue$mediationsdk_release() : abD.d();
    }

    public final String getSegmentName() {
        JSONObject jSONObjectM;
        C0526q2 c0526q2 = this.f38500d;
        Object objOpt = (c0526q2 == null || (jSONObjectM = c0526q2.m()) == null) ? null : jSONObjectM.opt("segmentName");
        String str = (String) (objOpt instanceof String ? objOpt : null);
        return str == null ? "" : str;
    }

    public int hashCode() {
        int iE = u.e(u.e(this.f38497a.hashCode() * 31, 31, this.f38498b), 31, this.f38499c);
        C0526q2 c0526q2 = this.f38500d;
        int iHashCode = (iE + (c0526q2 == null ? 0 : c0526q2.hashCode())) * 31;
        LevelPlayAdSize levelPlayAdSize = this.f38501e;
        int iHashCode2 = (iHashCode + (levelPlayAdSize == null ? 0 : levelPlayAdSize.hashCode())) * 31;
        String str = this.f38502f;
        return this.f38503g.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final JSONObject impressionData$mediationsdk_release() {
        JSONObject jSONObject;
        String str;
        JSONObject jSONObjectM;
        try {
            C0526q2 c0526q2 = this.f38500d;
            if (c0526q2 == null || (jSONObjectM = c0526q2.m()) == null) {
                jSONObject = new JSONObject();
            } else {
                Iterator<String> itKeys = jSONObjectM.keys();
                n.e(itKeys, "it.keys()");
                jSONObject = new JSONObject(jSONObjectM, (String[]) l.W(l.M(itKeys)).toArray(new String[0]));
            }
        } catch (Exception e10) {
            IronLog.INTERNAL.error("failed to copy impression JSON", e10);
            C0474n4.d().a(e10);
            jSONObject = new JSONObject();
        }
        try {
            String placement = jSONObject.optString("placement");
            n.e(placement, "placement");
            if (placement.length() > 0 && (str = this.f38502f) != null) {
                jSONObject.put("placement", p.n0(placement, d.f29346r, str));
            }
            if (getCreativeId().length() > 0) {
                jSONObject.put("creativeId", getCreativeId());
            }
        } catch (Exception e11) {
            IronLog.INTERNAL.error("failed to put impression values", e11);
            C0474n4.d().a(e11);
        }
        return jSONObject;
    }

    public String toString() {
        String adId = getAdId();
        String adUnitId = getAdUnitId();
        String adUnitName = getAdUnitName();
        LevelPlayAdSize levelPlayAdSize = this.f38501e;
        String adFormat = getAdFormat();
        String placementName = getPlacementName();
        String auctionId = getAuctionId();
        String country = getCountry();
        String ab2 = getAb();
        String segmentName = getSegmentName();
        String adNetwork = getAdNetwork();
        String instanceName = getInstanceName();
        String instanceId = getInstanceId();
        double revenue = getRevenue();
        String precision = getPrecision();
        String encryptedCPM = getEncryptedCPM();
        String creativeId = getCreativeId();
        StringBuilder sbV = e.v("adId: ", adId, ", adUnitId: ", adUnitId, ", adUnitName: ");
        sbV.append(adUnitName);
        sbV.append(", adSize: ");
        sbV.append(levelPlayAdSize);
        sbV.append(", adFormat: ");
        u.r(sbV, adFormat, ", placementName: ", placementName, ", auctionId: ");
        u.r(sbV, auctionId, ", country: ", country, ", ab: ");
        u.r(sbV, ab2, ", segmentName: ", segmentName, ", adNetwork: ");
        u.r(sbV, adNetwork, ", instanceName: ", instanceName, ", instanceId: ");
        sbV.append(instanceId);
        sbV.append(", revenue: ");
        sbV.append(revenue);
        u.r(sbV, ", precision: ", precision, ", encryptedCPM: ", encryptedCPM);
        return e.q(", creativeId: ", creativeId, sbV);
    }

    private final <T> T a(String str) {
        JSONObject jSONObjectM;
        C0526q2 c0526q2 = this.f38500d;
        if (c0526q2 != null && (jSONObjectM = c0526q2.m()) != null) {
            jSONObjectM.opt(str);
        }
        n.k();
        throw null;
    }

    public /* synthetic */ LevelPlayAdInfo(String str, String str2, String str3, C0526q2 c0526q2, LevelPlayAdSize levelPlayAdSize, String str4, Map map, int i10, g gVar) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : c0526q2, (i10 & 16) != 0 ? null : levelPlayAdSize, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? w.f53867a : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayAdInfo(LevelPlayAdInfo adInfo, String str) {
        this(adInfo.f38497a, adInfo.f38498b, adInfo.f38499c, adInfo.f38500d, adInfo.f38501e, str, adInfo.f38503g);
        n.f(adInfo, "adInfo");
    }
}
