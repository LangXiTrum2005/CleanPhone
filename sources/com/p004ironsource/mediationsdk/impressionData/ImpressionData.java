package com.p004ironsource.mediationsdk.impressionData;

import androidx.media3.extractor.text.ttml.a;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.q9;
import java.text.DecimalFormat;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class ImpressionData {
    public static final String IMPRESSION_DATA_KEY_ABTEST = "ab";
    public static final String IMPRESSION_DATA_KEY_AD_FORMAT = "adFormat";
    public static final String IMPRESSION_DATA_KEY_AD_NETWORK = "adNetwork";
    public static final String IMPRESSION_DATA_KEY_AD_UNIT = "adUnit";
    public static final String IMPRESSION_DATA_KEY_AUCTION_ID = "auctionId";
    public static final String IMPRESSION_DATA_KEY_COUNTRY = "country";
    public static final String IMPRESSION_DATA_KEY_CREATIVE_ID = "creativeId";
    public static final String IMPRESSION_DATA_KEY_ENCRYPTED_CPM = "encryptedCPM";
    public static final String IMPRESSION_DATA_KEY_INSTANCE_ID = "instanceId";
    public static final String IMPRESSION_DATA_KEY_INSTANCE_NAME = "instanceName";
    public static final String IMPRESSION_DATA_KEY_LIFETIME_REVENUE = "lifetimeRevenue";
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_ID = "mediationAdUnitId";
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_NAME = "mediationAdUnitName";
    public static final String IMPRESSION_DATA_KEY_PLACEMENT = "placement";
    public static final String IMPRESSION_DATA_KEY_PRECISION = "precision";
    public static final String IMPRESSION_DATA_KEY_REVENUE = "revenue";
    public static final String IMPRESSION_DATA_KEY_SEGMENT_NAME = "segmentName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f25908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f25909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f25910c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f25911e;
    private String f;
    private String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f25912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f25913i;
    private String j;
    private String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f25914l;
    private String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Double f25915n;
    private String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Double f25916p;
    private String q;
    private String r;
    private DecimalFormat s = new DecimalFormat("#.#####");

    public ImpressionData(ImpressionData impressionData) {
        this.f25909b = null;
        this.f25910c = null;
        this.d = null;
        this.f25911e = null;
        this.f = null;
        this.g = null;
        this.f25912h = null;
        this.f25913i = null;
        this.j = null;
        this.k = null;
        this.f25914l = null;
        this.m = null;
        this.f25915n = null;
        this.o = null;
        this.f25916p = null;
        this.q = null;
        this.r = null;
        this.f25908a = impressionData.f25908a;
        this.f25909b = impressionData.f25909b;
        this.f25910c = impressionData.f25910c;
        this.d = impressionData.d;
        this.f25911e = impressionData.f25911e;
        this.f = impressionData.f;
        this.g = impressionData.g;
        this.f25912h = impressionData.f25912h;
        this.f25913i = impressionData.f25913i;
        this.j = impressionData.j;
        this.k = impressionData.k;
        this.f25914l = impressionData.f25914l;
        this.m = impressionData.m;
        this.o = impressionData.o;
        this.q = impressionData.q;
        this.f25916p = impressionData.f25916p;
        this.f25915n = impressionData.f25915n;
        this.r = impressionData.r;
    }

    public String getAb() {
        return this.f25912h;
    }

    public String getAdFormat() {
        return this.f;
    }

    public String getAdNetwork() {
        return this.k;
    }

    @Deprecated
    public String getAdUnit() {
        return this.f25910c;
    }

    public JSONObject getAllData() {
        return this.f25908a;
    }

    public String getAuctionId() {
        return this.f25909b;
    }

    public String getCountry() {
        return this.g;
    }

    public String getCreativeId() {
        return this.r;
    }

    public String getEncryptedCPM() {
        return this.q;
    }

    public String getInstanceId() {
        return this.m;
    }

    public String getInstanceName() {
        return this.f25914l;
    }

    @Deprecated
    public Double getLifetimeRevenue() {
        return this.f25916p;
    }

    public String getMediationAdUnitId() {
        return this.f25911e;
    }

    public String getMediationAdUnitName() {
        return this.d;
    }

    public String getPlacement() {
        return this.j;
    }

    public String getPrecision() {
        return this.o;
    }

    public Double getRevenue() {
        return this.f25915n;
    }

    public String getSegmentName() {
        return this.f25913i;
    }

    public void replaceMacroForPlacementWithValue(String str, String str2) {
        String str3 = this.j;
        if (str3 != null) {
            String strReplace = str3.replace(str, str2);
            this.j = strReplace;
            JSONObject jSONObject = this.f25908a;
            if (jSONObject != null) {
                try {
                    jSONObject.put("placement", strReplace);
                } catch (JSONException e2) {
                    q9.d().a(e2);
                    IronLog.INTERNAL.error(e2.toString());
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("auctionId: '");
        sb.append(this.f25909b);
        sb.append("', adUnit: '");
        sb.append(this.f25910c);
        sb.append("', mediationAdUnitName: '");
        sb.append(this.d);
        sb.append("', mediationAdUnitId: '");
        sb.append(this.f25911e);
        sb.append("', adFormat: '");
        sb.append(this.f);
        sb.append("', country: '");
        sb.append(this.g);
        sb.append("', ab: '");
        sb.append(this.f25912h);
        sb.append("', segmentName: '");
        sb.append(this.f25913i);
        sb.append("', placement: '");
        sb.append(this.j);
        sb.append("', adNetwork: '");
        sb.append(this.k);
        sb.append("', instanceName: '");
        sb.append(this.f25914l);
        sb.append("', instanceId: '");
        sb.append(this.m);
        sb.append("', revenue: ");
        Double d = this.f25915n;
        sb.append(d == null ? null : this.s.format(d));
        sb.append(", precision: '");
        sb.append(this.o);
        sb.append("', lifetimeRevenue: ");
        Double d2 = this.f25916p;
        sb.append(d2 != null ? this.s.format(d2) : null);
        sb.append(", encryptedCPM: '");
        sb.append(this.q);
        sb.append("', creativeId: '");
        return a.p(sb, this.r, '\'');
    }

    public ImpressionData(JSONObject jSONObject) {
        Double dValueOf = null;
        this.f25909b = null;
        this.f25910c = null;
        this.d = null;
        this.f25911e = null;
        this.f = null;
        this.g = null;
        this.f25912h = null;
        this.f25913i = null;
        this.j = null;
        this.k = null;
        this.f25914l = null;
        this.m = null;
        this.f25915n = null;
        this.o = null;
        this.f25916p = null;
        this.q = null;
        this.r = null;
        if (jSONObject != null) {
            try {
                this.f25908a = jSONObject;
                this.f25909b = jSONObject.optString("auctionId", null);
                this.f25910c = jSONObject.optString("adUnit", null);
                this.d = jSONObject.optString("mediationAdUnitName", null);
                this.f25911e = jSONObject.optString("mediationAdUnitId", null);
                this.f = jSONObject.optString("adFormat", null);
                this.g = jSONObject.optString("country", null);
                this.f25912h = jSONObject.optString("ab", null);
                this.f25913i = jSONObject.optString("segmentName", null);
                this.j = jSONObject.optString("placement", null);
                this.k = jSONObject.optString("adNetwork", null);
                this.f25914l = jSONObject.optString("instanceName", null);
                this.m = jSONObject.optString("instanceId", null);
                this.o = jSONObject.optString("precision", null);
                this.q = jSONObject.optString("encryptedCPM", null);
                this.r = jSONObject.optString("creativeId", null);
                double dOptDouble = jSONObject.optDouble(IMPRESSION_DATA_KEY_LIFETIME_REVENUE);
                this.f25916p = Double.isNaN(dOptDouble) ? null : Double.valueOf(dOptDouble);
                double dOptDouble2 = jSONObject.optDouble("revenue");
                if (!Double.isNaN(dOptDouble2)) {
                    dValueOf = Double.valueOf(dOptDouble2);
                }
                this.f25915n = dValueOf;
            } catch (Exception e2) {
                q9.d().a(e2);
                IronLog.INTERNAL.error("error parsing impression " + e2.getMessage());
            }
        }
    }
}
