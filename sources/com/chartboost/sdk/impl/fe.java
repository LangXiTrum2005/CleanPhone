package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import com.chartboost.sdk.privacy.model.CCPA;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.Custom;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.chartboost.sdk.privacy.model.GDPR;
import com.chartboost.sdk.privacy.model.LGPD;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class fe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f13894a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f13895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y6 f13896c;

    public fe(SharedPreferences sharedPreferences, y6 y6Var) {
        this.f13895b = sharedPreferences;
        this.f13896c = y6Var;
        b();
    }

    public HashMap a() {
        return this.f13894a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ea  */
    public final void b() {
        byte b2;
        DataUseConsent gdpr;
        SharedPreferences sharedPreferences = this.f13895b;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString("privacy_standards", "");
            if (string.isEmpty()) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    String string2 = jSONObject.getString("privacyStandard");
                    String string3 = jSONObject.getString(com.ironsource.d9.i.f24748b0);
                    int iHashCode = string2.hashCode();
                    if (iHashCode != -1172350233) {
                        if (iHashCode != 3168159) {
                            if (iHashCode != 3319983) {
                                if (iHashCode == 94846581 && string2.equals("coppa")) {
                                    b2 = 2;
                                } else {
                                    b2 = -1;
                                }
                            } else if (string2.equals(LGPD.LGPD_STANDARD)) {
                                b2 = 3;
                            } else {
                                b2 = -1;
                            }
                        } else if (string2.equals("gdpr")) {
                            b2 = 0;
                        } else {
                            b2 = -1;
                        }
                    } else if (string2.equals(CCPA.CCPA_STANDARD)) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                    if (b2 == 0) {
                        GDPR.GDPR_CONSENT gdpr_consent = GDPR.GDPR_CONSENT.BEHAVIORAL;
                        if (gdpr_consent.getValue().equals(string3)) {
                            gdpr = new GDPR(gdpr_consent);
                        } else {
                            GDPR.GDPR_CONSENT gdpr_consent2 = GDPR.GDPR_CONSENT.NON_BEHAVIORAL;
                            if (gdpr_consent2.getValue().equals(string3)) {
                                gdpr = new GDPR(gdpr_consent2);
                            } else {
                                gdpr = null;
                            }
                        }
                    } else if (b2 == 1) {
                        CCPA.CCPA_CONSENT ccpa_consent = CCPA.CCPA_CONSENT.OPT_IN_SALE;
                        if (ccpa_consent.getValue().equals(string3)) {
                            gdpr = new CCPA(ccpa_consent);
                        } else {
                            CCPA.CCPA_CONSENT ccpa_consent2 = CCPA.CCPA_CONSENT.OPT_OUT_SALE;
                            if (ccpa_consent2.getValue().equals(string3)) {
                                gdpr = new CCPA(ccpa_consent2);
                            } else {
                                gdpr = null;
                            }
                        }
                    } else if (b2 != 2) {
                        gdpr = b2 != 3 ? new Custom(jSONObject.getString("privacyStandard"), jSONObject.getString(com.ironsource.d9.i.f24748b0)) : new LGPD(jSONObject.getBoolean(com.ironsource.d9.i.f24748b0));
                    } else {
                        gdpr = new COPPA(jSONObject.getBoolean(com.ironsource.d9.i.f24748b0));
                    }
                    if (gdpr != null) {
                        this.f13894a.put(gdpr.getPrivacyStandard(), gdpr);
                    } else {
                        b(string2);
                        za.a("Failed to load consent: " + string2, null);
                    }
                }
            } catch (JSONException e2) {
                a(e2);
                e2.printStackTrace();
            }
        }
    }

    public final void c() {
        if (this.f13895b != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f13894a.values().iterator();
            while (it.hasNext()) {
                jSONArray.put(a((DataUseConsent) it.next()));
            }
            a(this.f13895b, jSONArray);
        }
    }

    public void a(String str) {
        this.f13894a.remove(str);
        c();
    }

    public final void a(SharedPreferences sharedPreferences, JSONArray jSONArray) {
        if (sharedPreferences == null || jSONArray == null) {
            return;
        }
        sharedPreferences.edit().putString("privacy_standards", jSONArray.toString()).apply();
    }

    public final void a(JSONException jSONException) {
        this.f13896c.mo189track(h5.a(fh.d.DECODING_ERROR, jSONException.getMessage(), "", ""));
    }

    public final JSONObject a(DataUseConsent dataUseConsent) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("privacyStandard", dataUseConsent.getPrivacyStandard());
            jSONObject.put(com.ironsource.d9.i.f24748b0, dataUseConsent.getConsent());
            return jSONObject;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return jSONObject;
        }
    }

    public void b(DataUseConsent dataUseConsent) {
        za.a("Added privacy standard: " + dataUseConsent.getPrivacyStandard() + " with consent: " + dataUseConsent.getConsent(), null);
        this.f13894a.put(dataUseConsent.getPrivacyStandard(), dataUseConsent);
        c();
    }

    public final void b(String str) {
        this.f13896c.mo189track(h5.a(fh.d.PERSISTED_DATA_READING_ERROR, str, "", ""));
    }
}
