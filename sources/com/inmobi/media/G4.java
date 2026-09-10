package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.RootConfig;
import com.inmobi.sdk.InMobiSdk;
import com.vungle.ads.internal.model.Cookie;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class G4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G4 f22837a = new G4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static JSONObject f22838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static JSONObject f22839c;
    public static JSONObject d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static RootConfig f22840e;

    public static final JSONObject c() {
        String string;
        int i2;
        JSONObject jSONObject;
        String string2;
        String string3;
        Context contextD = Uc.d();
        SharedPreferences sharedPreferences = contextD != null ? contextD.getSharedPreferences(android.support.v4.media.a.r(new StringBuilder(), contextD != null ? contextD.getPackageName() : null, "_preferences"), 0) : null;
        if (sharedPreferences != null) {
            try {
                string = sharedPreferences.getString("IABTCF_TCString", null);
                try {
                    i2 = sharedPreferences.getInt(Cookie.IABTCF_GDPR_APPLIES, -1);
                } catch (Exception unused) {
                    i2 = -1;
                }
            } catch (Exception unused2) {
                string = null;
            }
            if (string != null) {
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("gdpr_consent", string);
                    if (i2 != -1) {
                        jSONObject.put("gdpr", String.valueOf(i2));
                    }
                } catch (JSONException unused3) {
                    jSONObject = null;
                }
            } else {
                jSONObject = null;
            }
            if (jSONObject == null) {
                try {
                    string2 = sharedPreferences.getString("IABConsent_ConsentString", null);
                    try {
                        string3 = sharedPreferences.getString("IABConsent_SubjectToGDPR", null);
                    } catch (Exception unused4) {
                        string3 = null;
                    }
                } catch (Exception unused5) {
                    string2 = null;
                }
                if (string2 != null) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("gdpr_consent", string2);
                        if (string3 != null) {
                            jSONObject2.put("gdpr", string3);
                        }
                        jSONObject = jSONObject2;
                    } catch (JSONException unused6) {
                        jSONObject = null;
                    }
                } else {
                    jSONObject = null;
                }
            }
            if (jSONObject != null) {
                return jSONObject;
            }
        }
        JSONObject jSONObject3 = f22839c;
        if (jSONObject3 == null) {
            return f22838b;
        }
        if (f22838b != null) {
            jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = f22839c;
            Iterator<String> itKeys = jSONObject4 != null ? jSONObject4.keys() : null;
            if (itKeys != null) {
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        JSONObject jSONObject5 = f22839c;
                        jSONObject3.put(next, jSONObject5 != null ? jSONObject5.opt(next) : null);
                    } catch (JSONException unused7) {
                    }
                }
            }
            JSONObject jSONObject6 = f22838b;
            Iterator<String> itKeys2 = jSONObject6 != null ? jSONObject6.keys() : null;
            if (itKeys2 != null) {
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    try {
                        JSONObject jSONObject7 = f22838b;
                        jSONObject3.put(next2, jSONObject7 != null ? jSONObject7.opt(next2) : null);
                    } catch (JSONException unused8) {
                    }
                }
            }
        }
        return jSONObject3;
    }

    @JvmStatic
    public static /* synthetic */ void d() {
    }

    public static final byte e() {
        JSONObject jSONObjectC = c();
        if (jSONObjectC == null) {
            return (byte) -1;
        }
        if (jSONObjectC.has("gdpr_consent")) {
            return (byte) 1;
        }
        if (!jSONObjectC.has(InMobiSdk.IM_GDPR_CONSENT_AVAILABLE)) {
            return (byte) -1;
        }
        try {
            return jSONObjectC.getBoolean(InMobiSdk.IM_GDPR_CONSENT_AVAILABLE) ? (byte) 1 : (byte) 0;
        } catch (JSONException unused) {
            return (byte) -1;
        }
    }

    @JvmStatic
    public static /* synthetic */ void f() {
    }

    @JvmStatic
    public static final void h() {
        HashMap map = D3.f22758a;
        Config configA = D3.a(Uc.b(), "root");
        Intrinsics.d(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig");
        f22840e = (RootConfig) configA;
    }

    @JvmStatic
    public static final void i() {
        f22838b = null;
        f22839c = null;
        d = null;
        f22840e = null;
    }

    public final void a(JSONObject jSONObject) {
        d = jSONObject;
    }

    public final JSONObject b() {
        return d;
    }

    public final JSONObject g() {
        return f22838b;
    }

    public final void j() {
        LinkedHashMap linkedHashMap = O2.f23027a;
        f22840e = (RootConfig) AbstractC3174p5.a("root", "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig", null);
    }

    public static /* synthetic */ boolean a(G4 g4, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        return g4.a(z2);
    }

    public static final void b(JSONObject jSONObject) {
        if (jSONObject != null) {
            f22838b = jSONObject;
        }
    }

    public final boolean a(boolean z2) {
        if (f22840e == null) {
            j();
        }
        byte bE = e();
        RootConfig rootConfig = f22840e;
        return bE == 1 || Intrinsics.a(rootConfig != null ? Boolean.valueOf(rootConfig.shouldTransmitRequest()) : null, Boolean.TRUE) || z2;
    }

    public final boolean a() {
        return a(this, false, 1, null);
    }

    @JvmStatic
    public static final void c(JSONObject jSONObject) {
        if (jSONObject != null) {
            f22839c = jSONObject;
        }
    }
}
