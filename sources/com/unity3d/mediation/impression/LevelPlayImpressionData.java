package com.unity3d.mediation.impression;

import d5.u;
import defpackage.e;
import java.text.DecimalFormat;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class LevelPlayImpressionData {
    public static final a Companion = new a(null);
    public static final String IMPRESSION_DATA_KEY_ABTEST = "ab";
    public static final String IMPRESSION_DATA_KEY_AD_FORMAT = "adFormat";
    public static final String IMPRESSION_DATA_KEY_AD_NETWORK = "adNetwork";
    public static final String IMPRESSION_DATA_KEY_AUCTION_ID = "auctionId";
    public static final String IMPRESSION_DATA_KEY_COUNTRY = "country";
    public static final String IMPRESSION_DATA_KEY_CREATIVE_ID = "creativeId";
    public static final String IMPRESSION_DATA_KEY_ENCRYPTED_CPM = "encryptedCPM";
    public static final String IMPRESSION_DATA_KEY_INSTANCE_ID = "instanceId";
    public static final String IMPRESSION_DATA_KEY_INSTANCE_NAME = "instanceName";
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_ID = "mediationAdUnitId";
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_NAME = "mediationAdUnitName";
    public static final String IMPRESSION_DATA_KEY_PLACEMENT = "placement";
    public static final String IMPRESSION_DATA_KEY_PRECISION = "precision";
    public static final String IMPRESSION_DATA_KEY_REVENUE = "revenue";
    public static final String IMPRESSION_DATA_KEY_SEGMENT_NAME = "segmentName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f38534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DecimalFormat f38535b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        private a() {
        }
    }

    public LevelPlayImpressionData(JSONObject allData) {
        n.f(allData, "allData");
        this.f38534a = allData;
        this.f38535b = new DecimalFormat("#.#####");
    }

    public final String getAb() {
        String it = this.f38534a.optString("ab", "");
        n.e(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getAdFormat() {
        String it = this.f38534a.optString("adFormat", "");
        n.e(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getAdNetwork() {
        String it = this.f38534a.optString("adNetwork", "");
        n.e(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final JSONObject getAllData() {
        return this.f38534a;
    }

    public final String getAuctionId() {
        String it = this.f38534a.optString("auctionId", "");
        n.e(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getCountry() {
        String it = this.f38534a.optString("country", "");
        n.e(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getCreativeId() {
        String it = this.f38534a.optString("creativeId", "");
        n.e(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getEncryptedCPM() {
        String it = this.f38534a.optString("encryptedCPM", "");
        n.e(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getInstanceId() {
        String it = this.f38534a.optString("instanceId", "");
        n.e(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getInstanceName() {
        String it = this.f38534a.optString("instanceName", "");
        n.e(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getMediationAdUnitId() {
        String it = this.f38534a.optString("mediationAdUnitId", "");
        n.e(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getMediationAdUnitName() {
        String it = this.f38534a.optString("mediationAdUnitName", "");
        n.e(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getPlacement() {
        String it = this.f38534a.optString("placement", "");
        n.e(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getPrecision() {
        String it = this.f38534a.optString("precision", "");
        n.e(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final Double getRevenue() {
        double dOptDouble = this.f38534a.optDouble("revenue");
        Double dValueOf = Double.valueOf(dOptDouble);
        if (Double.isNaN(dOptDouble)) {
            return null;
        }
        return dValueOf;
    }

    public final String getSegmentName() {
        String it = this.f38534a.optString("segmentName", "");
        n.e(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public String toString() {
        LevelPlayImpressionData levelPlayImpressionData;
        String str;
        String auctionId = getAuctionId();
        String mediationAdUnitName = getMediationAdUnitName();
        String mediationAdUnitId = getMediationAdUnitId();
        String adFormat = getAdFormat();
        String country = getCountry();
        String ab2 = getAb();
        String segmentName = getSegmentName();
        String placement = getPlacement();
        String adNetwork = getAdNetwork();
        String instanceName = getInstanceName();
        String instanceId = getInstanceId();
        if (getRevenue() == null) {
            str = null;
            levelPlayImpressionData = this;
        } else {
            levelPlayImpressionData = this;
            str = levelPlayImpressionData.f38535b.format(levelPlayImpressionData.getRevenue());
        }
        String precision = levelPlayImpressionData.getPrecision();
        String encryptedCPM = levelPlayImpressionData.getEncryptedCPM();
        String creativeId = levelPlayImpressionData.getCreativeId();
        StringBuilder sbV = e.v("auctionId: '", auctionId, "', mediationAdUnitName: '", mediationAdUnitName, "', mediationAdUnitId: '");
        u.r(sbV, mediationAdUnitId, "', adFormat: '", adFormat, "', country: '");
        u.r(sbV, country, "', ab: '", ab2, "', segmentName: '");
        u.r(sbV, segmentName, "', placement: '", placement, "', adNetwork: '");
        u.r(sbV, adNetwork, "', instanceName: '", instanceName, "', instanceId: '");
        u.r(sbV, instanceId, "', revenue: ", str, ", precision: '");
        u.r(sbV, precision, "', encryptedCPM: '", encryptedCPM, "', creativeId: '");
        return e.q(creativeId, "'", sbV);
    }
}
