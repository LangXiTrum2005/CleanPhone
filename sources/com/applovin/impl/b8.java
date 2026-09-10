package com.applovin.impl;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class b8 implements s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f7598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f7599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f7600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f7601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f7602e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f7603f = -1;

    private b8() {
    }

    public static b8 a(q8 q8Var, v7 v7Var, com.applovin.impl.sdk.l lVar) {
        List<String> listExplode;
        int size;
        long seconds;
        if (q8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            String strD = q8Var.d();
            if (TextUtils.isEmpty(strD)) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().b("VastTracker", "Unable to create tracker. Could not find URL.");
                }
                return null;
            }
            b8 b8Var = new b8();
            b8Var.f7600c = strD;
            b8Var.f7598a = (String) q8Var.a().get("id");
            b8Var.f7599b = (String) q8Var.a().get(NotificationCompat.CATEGORY_EVENT);
            b8Var.f7601d = ((Boolean) lVar.a(z4.f10220o5)).booleanValue();
            if (v7Var != null) {
                b8Var.f7601d = JsonUtils.getBoolean(v7Var.b(), "vast_fire_trackers_from_webview", Boolean.valueOf(b8Var.f7601d)).booleanValue();
            }
            b8Var.f7603f = a(b8Var.b(), v7Var);
            String str = (String) q8Var.a().get("offset");
            if (StringUtils.isValidString(str)) {
                String strTrim = str.trim();
                if (strTrim.contains("%")) {
                    b8Var.f7603f = StringUtils.parseInt(strTrim.substring(0, strTrim.length() - 1));
                    return b8Var;
                }
                if (strTrim.contains(":") && (size = (listExplode = CollectionUtils.explode(strTrim, ":")).size()) > 0) {
                    int i10 = size - 1;
                    long j10 = 0;
                    for (int i11 = i10; i11 >= 0; i11--) {
                        String str2 = listExplode.get(i11);
                        if (StringUtils.isNumeric(str2)) {
                            int i12 = Integer.parseInt(str2);
                            if (i11 == i10) {
                                seconds = i12;
                            } else if (i11 == size - 2) {
                                seconds = TimeUnit.MINUTES.toSeconds(i12);
                            } else if (i11 == size - 3) {
                                seconds = TimeUnit.HOURS.toSeconds(i12);
                            }
                            j10 += seconds;
                        }
                    }
                    b8Var.f7602e = j10;
                    b8Var.f7603f = -1;
                }
            }
            return b8Var;
        } catch (Throwable th2) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a("VastTracker", "Error occurred while initializing", th2);
            }
            lVar.E().a("VastTracker", th2);
            return null;
        }
    }

    public String b() {
        return this.f7599b;
    }

    public String c() {
        return this.f7600c;
    }

    public boolean d() {
        return this.f7601d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8)) {
            return false;
        }
        b8 b8Var = (b8) obj;
        if (this.f7602e != b8Var.f7602e || this.f7603f != b8Var.f7603f) {
            return false;
        }
        String str = this.f7598a;
        if (str == null ? b8Var.f7598a != null : !str.equals(b8Var.f7598a)) {
            return false;
        }
        String str2 = this.f7599b;
        if (str2 == null ? b8Var.f7599b == null : str2.equals(b8Var.f7599b)) {
            return this.f7600c.equals(b8Var.f7600c);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f7598a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7599b;
        int iE = d5.u.e((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f7600c);
        long j10 = this.f7602e;
        return ((iE + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f7603f;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VastTracker{identifier='");
        sb2.append(this.f7598a);
        sb2.append("', event='");
        sb2.append(this.f7599b);
        sb2.append("', uriString='");
        sb2.append(this.f7600c);
        sb2.append("', offsetSeconds=");
        sb2.append(this.f7602e);
        sb2.append(", offsetPercent=");
        return d5.u.g(sb2, this.f7603f, '}');
    }

    public boolean a(long j10, int i10) {
        long j11 = this.f7602e;
        boolean z10 = j11 >= 0;
        boolean z11 = j10 >= j11;
        int i11 = this.f7603f;
        return (z10 && z11) || ((i11 >= 0) && (i10 >= i11));
    }

    private static int a(String str, v7 v7Var) {
        if ("start".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("firstQuartile".equalsIgnoreCase(str)) {
            return 25;
        }
        if (CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT.equalsIgnoreCase(str)) {
            return 50;
        }
        if ("thirdQuartile".equalsIgnoreCase(str)) {
            return 75;
        }
        if (!CampaignEx.JSON_NATIVE_VIDEO_COMPLETE.equalsIgnoreCase(str)) {
            return -1;
        }
        if (v7Var != null) {
            return v7Var.g();
        }
        return 95;
    }

    public static b8 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        b8 b8Var = new b8();
        String string = JsonUtils.getString(jSONObject, "uri_string", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        b8Var.f7600c = string;
        b8Var.f7598a = JsonUtils.getString(jSONObject, "identifier", "");
        b8Var.f7599b = JsonUtils.getString(jSONObject, NotificationCompat.CATEGORY_EVENT, "");
        b8Var.f7602e = JsonUtils.getLong(jSONObject, "offset_seconds", -1L);
        b8Var.f7603f = JsonUtils.getInt(jSONObject, "offset_percent", -1);
        return b8Var;
    }

    @Override // com.applovin.impl.s4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "identifier", this.f7598a);
        JsonUtils.putString(jSONObject, NotificationCompat.CATEGORY_EVENT, this.f7599b);
        JsonUtils.putString(jSONObject, "uri_string", this.f7600c);
        JsonUtils.putLong(jSONObject, "offset_seconds", this.f7602e);
        JsonUtils.putInt(jSONObject, "offset_percent", this.f7603f);
        return jSONObject;
    }
}
