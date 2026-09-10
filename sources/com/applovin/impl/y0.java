package com.applovin.impl;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f10016a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum a {
        NEUTRAL,
        POSITIVE,
        NEGATIVE
    }

    private y0(JSONObject jSONObject) {
        this.f10016a = jSONObject;
    }

    public static y0 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        String string = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "title", (JSONObject) null), X3.i.W, null);
        if ("TOS".equalsIgnoreCase(string) && lVar.y().h() == null) {
            return null;
        }
        if ("PP".equalsIgnoreCase(string) && lVar.y().f() == null) {
            return null;
        }
        return new y0(jSONObject);
    }

    public String b() {
        return JsonUtils.getString(this.f10016a, NotificationCompat.CATEGORY_EVENT, null);
    }

    public a c() {
        String string = JsonUtils.getString(this.f10016a, TtmlNode.TAG_STYLE, null);
        if (BuildConfig.FLAVOR.equalsIgnoreCase(string)) {
            return a.POSITIVE;
        }
        return ("destructive".equalsIgnoreCase(string) || "cancel".equalsIgnoreCase(string)) ? a.NEGATIVE : a.NEUTRAL;
    }

    public String d() {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f10016a, "title", (JSONObject) null);
        return com.applovin.impl.sdk.l.a(JsonUtils.getString(jSONObject, X3.i.W, ""), JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "replacements", null), null));
    }

    public String toString() {
        return "ConsentFlowStateAlertAction{title=" + d() + ", destinationStateId=" + a() + ", event=" + b() + "}";
    }

    public int a() {
        return JsonUtils.getInt(this.f10016a, "destination_state_id", -1);
    }
}
