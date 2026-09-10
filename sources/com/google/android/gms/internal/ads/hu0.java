package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.zzbp;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f15396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f15397d;

    public hu0(JsonReader jsonReader) throws JSONException, IOException {
        JSONObject jSONObjectZzd = zzbp.zzd(jsonReader);
        this.f15397d = jSONObjectZzd;
        this.f15394a = jSONObjectZzd.optString(CampaignEx.JSON_KEY_AD_HTML, null);
        this.f15395b = jSONObjectZzd.optString("ad_base_url", null);
        this.f15396c = jSONObjectZzd.optJSONObject("ad_json");
    }
}
