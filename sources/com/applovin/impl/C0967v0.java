package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0967v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f11958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final JSONObject f11959b;

    /* JADX INFO: renamed from: com.applovin.impl.v0$a */
    public enum a {
        NONE(0),
        IS_AL_GDPR(1000),
        IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT(1001),
        HAS_TERMS_OF_SERVICE_URI(1002);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f11963a;

        a(int i2) {
            this.f11963a = i2;
        }

        public int b() {
            return this.f11963a;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.v0$b */
    public enum b {
        ALERT,
        POST_ALERT,
        EVENT,
        REINIT,
        CMP_LOAD,
        CMP_SHOW,
        DECISION
    }

    public C0967v0(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.f11958a = kVar;
        this.f11959b = jSONObject;
    }

    public static C0967v0 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        b bVarC = c(JsonUtils.getString(jSONObject, "type", null));
        if (bVarC == b.ALERT) {
            return new C0969w0(jSONObject, kVar);
        }
        return bVarC == b.EVENT ? new y0(jSONObject, kVar) : new C0967v0(jSONObject, kVar);
    }

    public String b() {
        return JsonUtils.getString(this.f11959b, "decision_type", null);
    }

    public int c() {
        return JsonUtils.getInt(this.f11959b, "id", -1);
    }

    public b d() {
        return c(e());
    }

    public String e() {
        return JsonUtils.getString(this.f11959b, "type", null);
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
        if ("event".equalsIgnoreCase(str)) {
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
        throw new IllegalArgumentException(android.support.v4.media.a.C("Invalid type provided: ", str));
    }

    public String b(String str) {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f11959b, str, (JSONObject) null);
        JSONArray jSONArrayV = androidx.media3.extractor.text.ttml.a.v("replacements", jSONObject);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArrayV.length(); i2++) {
            String string = JsonUtils.getObjectAtIndex(jSONArrayV, i2, "").toString();
            if ("<APP_NAME>".equalsIgnoreCase(string)) {
                String str2 = (String) this.f11958a.A().M().get("app_name");
                if (StringUtils.isValidString(str2)) {
                    arrayList.add(str2);
                } else {
                    arrayList.add(com.applovin.impl.sdk.k.a("THIS_APP"));
                }
            } else {
                arrayList.add(string);
            }
        }
        return com.applovin.impl.sdk.k.a(JsonUtils.getString(jSONObject, "key", null), arrayList);
    }

    public a a() {
        return a(b());
    }

    public int a(Boolean bool) {
        int i2 = JsonUtils.getInt(this.f11959b, "destination_state_id", -1);
        if (i2 > 0) {
            return i2;
        }
        if (bool != null) {
            return bool.booleanValue() ? JsonUtils.getInt(this.f11959b, "destination_state_id_true", -1) : JsonUtils.getInt(this.f11959b, "destination_state_id_false", -1);
        }
        throw new IllegalStateException(android.support.v4.media.a.h(i2, "Decision needed for state: "));
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
