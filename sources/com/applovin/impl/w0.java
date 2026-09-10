package com.applovin.impl;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.X3;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.l f9917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final JSONObject f9918b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum a {
        NONE(0),
        IS_AL_GDPR(1000),
        IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT(1001),
        HAS_TERMS_OF_SERVICE_URI(1002);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f9924a;

        a(int i10) {
            this.f9924a = i10;
        }

        public int b() {
            return this.f9924a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum b {
        ALERT,
        POST_ALERT,
        EVENT,
        REINIT,
        CMP_LOAD,
        CMP_SHOW,
        DECISION
    }

    public w0(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        this.f9917a = lVar;
        this.f9918b = jSONObject;
    }

    public static w0 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        b bVarC = c(JsonUtils.getString(jSONObject, "type", null));
        if (bVarC == b.ALERT) {
            return new x0(jSONObject, lVar);
        }
        return bVarC == b.EVENT ? new z0(jSONObject, lVar) : new w0(jSONObject, lVar);
    }

    public String b() {
        return JsonUtils.getString(this.f9918b, "decision_type", null);
    }

    public int c() {
        return JsonUtils.getInt(this.f9918b, "id", -1);
    }

    public b d() {
        return c(e());
    }

    public String e() {
        return JsonUtils.getString(this.f9918b, "type", null);
    }

    public String toString() {
        return "ConsentFlowState{id=" + c() + ", type=" + d() + "}";
    }

    private static b c(String str) {
        if ("alert".equalsIgnoreCase(str)) {
            return b.ALERT;
        }
        if ("post_alert".equalsIgnoreCase(str)) {
            return b.POST_ALERT;
        }
        if (NotificationCompat.CATEGORY_EVENT.equalsIgnoreCase(str)) {
            return b.EVENT;
        }
        if ("cmp_load".equalsIgnoreCase(str)) {
            return b.CMP_LOAD;
        }
        if ("cmp_show".equalsIgnoreCase(str)) {
            return b.CMP_SHOW;
        }
        if ("decision".equalsIgnoreCase(str)) {
            return b.DECISION;
        }
        if ("reinit".equalsIgnoreCase(str)) {
            return b.REINIT;
        }
        throw new IllegalArgumentException(defpackage.e.n("Invalid type provided: ", str));
    }

    public String b(String str) {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f9918b, str, (JSONObject) null);
        JSONArray jSONArrayX = defpackage.e.x("replacements", jSONObject);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayX.length(); i10++) {
            String string = JsonUtils.getObjectAtIndex(jSONArrayX, i10, "").toString();
            if ("<APP_NAME>".equalsIgnoreCase(string)) {
                String str2 = (String) this.f9917a.B().M().get("app_name");
                if (StringUtils.isValidString(str2)) {
                    arrayList.add(str2);
                } else {
                    arrayList.add(com.applovin.impl.sdk.l.a("THIS_APP"));
                }
            } else {
                arrayList.add(string);
            }
        }
        return com.applovin.impl.sdk.l.a(JsonUtils.getString(jSONObject, X3.i.W, null), arrayList);
    }

    public a a() {
        return a(b());
    }

    public int a(Boolean bool) {
        int i10 = JsonUtils.getInt(this.f9918b, "destination_state_id", -1);
        if (i10 > 0) {
            return i10;
        }
        if (bool != null) {
            return bool.booleanValue() ? JsonUtils.getInt(this.f9918b, "destination_state_id_true", -1) : JsonUtils.getInt(this.f9918b, "destination_state_id_false", -1);
        }
        throw new IllegalStateException(l1.d.e(i10, "Decision needed for state: "));
    }

    private static a a(String str) {
        if ("is_al_gdpr".equalsIgnoreCase(str)) {
            return a.IS_AL_GDPR;
        }
        if ("is_eligible_for_terms_and_privacy_policy_alert".equalsIgnoreCase(str)) {
            return a.IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT;
        }
        if ("has_terms_of_service_uri".equalsIgnoreCase(str)) {
            return a.HAS_TERMS_OF_SERVICE_URI;
        }
        return a.NONE;
    }
}
