package com.applovin.sdk;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.f2;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v0;
import defpackage.e;
import java.util.Arrays;
import java.util.Map;
import l1.d;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AppLovinSdkSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10432b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f10435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f10436f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f10437g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AppLovinTermsAndPrivacyPolicyFlowSettings f10440j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private l f10441k;
    private String l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f10434d = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f10438h = e.w();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f10439i = e.w();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10433c = true;

    public AppLovinSdkSettings(Context context) {
        this.l = "";
        if (context == null) {
            p.h("AppLovinSdkSettings", "context cannot be null. Please provide a valid context.");
        }
        Context contextE = q7.e(context);
        this.f10431a = q7.m(contextE);
        this.f10440j = v0.a(contextE);
        this.l = contextE.getPackageName();
        a(contextE);
    }

    private void a(Context context) {
        int identifier = context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName());
        if (identifier == 0) {
            return;
        }
        String strA = q7.a(identifier, context, (l) null);
        this.f10438h.putAll(JsonUtils.tryToStringMap(StringUtils.isValidString(strA) ? JsonUtils.jsonObjectFromJsonString(strA, new JSONObject()) : new JSONObject()));
    }

    public void attachAppLovinSdk(l lVar) {
        this.f10441k = lVar;
        if (StringUtils.isValidString(this.f10435e)) {
            lVar.u0().a(Arrays.asList(this.f10435e.split(",")));
            this.f10435e = null;
        }
        if (this.f10436f != null) {
            lVar.Q();
            if (p.a()) {
                e.C(new StringBuilder("Setting user id: "), this.f10436f, lVar.Q(), "AppLovinSdkSettings");
            }
            lVar.y0().a(this.f10436f);
            this.f10436f = null;
        }
        if (StringUtils.isValidString(this.f10437g)) {
            m.a(this.f10437g, lVar);
            this.f10437g = null;
        }
        for (Map.Entry entry : this.f10439i.entrySet()) {
            lVar.x0().a(f2.f7861k, "preInitExtraParameter", CollectionUtils.hashMap("details", ((String) entry.getKey()) + ":" + ((String) entry.getValue())));
        }
        this.f10439i.clear();
    }

    public Map<String, String> getExtraParameters() {
        Map<String, String> map;
        synchronized (this.f10438h) {
            map = CollectionUtils.map(this.f10438h);
        }
        return map;
    }

    public AppLovinTermsAndPrivacyPolicyFlowSettings getTermsAndPrivacyPolicyFlowSettings() {
        return this.f10440j;
    }

    @Nullable
    public String getUserIdentifier() {
        l lVar = this.f10441k;
        return lVar == null ? this.f10436f : lVar.y0().e();
    }

    public boolean isCreativeDebuggerEnabled() {
        return this.f10433c;
    }

    public boolean isMuted() {
        return this.f10432b;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.f10431a;
    }

    public void setCreativeDebuggerEnabled(boolean z10) {
        p.e("AppLovinSdkSettings", "setCreativeDebuggerEnabled(creativeDebuggerEnabled=" + z10 + ")");
        if (this.f10433c == z10) {
            return;
        }
        this.f10433c = z10;
        l lVar = this.f10441k;
        if (lVar == null) {
            return;
        }
        if (z10) {
            lVar.z().l();
        } else {
            lVar.z().k();
        }
    }

    public void setExtraParameter(String str, @Nullable String str2) {
        p.e("AppLovinSdkSettings", d.h("setExtraParameter(key=", str, ", value=", str2, ")"));
        if (TextUtils.isEmpty(str)) {
            p.h("AppLovinSdkSettings", "Failed to set extra parameter for null or empty key: " + str);
            return;
        }
        String strTrim = str2 != null ? str2.trim() : null;
        if ("test_mode_network".equalsIgnoreCase(str)) {
            if (this.f10441k == null) {
                this.f10435e = strTrim;
            } else if (StringUtils.isValidString(strTrim)) {
                this.f10441k.u0().a(Arrays.asList(strTrim.split(",")));
            } else {
                this.f10441k.u0().a((String) null);
            }
        } else if ("fan".equals(str) || "esc".equals(str)) {
            if (!this.l.startsWith("com.unity.")) {
                return;
            }
        } else if ("disable_all_logs".equals(str)) {
            p.a(Boolean.parseBoolean(strTrim));
        } else if ("package_name_override".equals(str)) {
            l lVar = this.f10441k;
            if (lVar != null) {
                m.a(strTrim, lVar);
            } else {
                this.f10437g = strTrim;
            }
        }
        if (this.f10441k != null) {
            this.f10441k.x0().a(f2.f7861k, "postInitExtraParameter", CollectionUtils.hashMap("details", str + ":" + str2));
        } else {
            this.f10439i.put(str, strTrim);
        }
        this.f10438h.put(str, strTrim);
    }

    public void setMuted(boolean z10) {
        p.e("AppLovinSdkSettings", "setMuted(muted=" + z10 + ")");
        this.f10432b = z10;
    }

    public void setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(boolean z10) {
        p.e("AppLovinSdkSettings", "setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(shouldFailAdDisplayIfDontKeepActivitiesIsEnabled=" + z10 + ")");
        this.f10434d = z10;
    }

    public void setUserIdentifier(String str) {
        p.e("AppLovinSdkSettings", "setUserIdentifier(userIdentifier=" + str + ")");
        if (StringUtils.isValidString(str) && str.length() > q7.d(8)) {
            p.h("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + q7.d(8) + " maximum)");
        }
        l lVar = this.f10441k;
        if (lVar == null) {
            this.f10436f = str;
            return;
        }
        lVar.Q();
        if (p.a()) {
            e.A("Setting user id: ", str, this.f10441k.Q(), "AppLovinSdkSettings");
        }
        this.f10441k.y0().a(str);
    }

    public void setVerboseLogging(boolean z10) {
        p.e("AppLovinSdkSettings", "setVerboseLogging(isVerboseLoggingEnabled=" + z10 + ")");
        if (!q7.l()) {
            this.f10431a = z10;
            return;
        }
        p.h("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already.");
        if (q7.m(null) != z10) {
            p.h("AppLovinSdkSettings", "Attempted to programmatically set verbose logging flag to value different from value configured in Android Manifest.");
        }
    }

    public boolean shouldFailAdDisplayIfDontKeepActivitiesIsEnabled() {
        return this.f10434d;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AppLovinSdkSettings{isVerboseLoggingEnabled=");
        sb2.append(this.f10431a);
        sb2.append(", muted=");
        sb2.append(this.f10432b);
        sb2.append(", creativeDebuggerEnabled=");
        return e.t(sb2, this.f10433c, '}');
    }
}
