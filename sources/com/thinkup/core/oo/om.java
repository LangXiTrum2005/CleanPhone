package com.thinkup.core.oo;

import android.support.v4.media.a;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class om {
    private String m0;
    private int[] on;
    private int o = 1;
    private int m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42472n = 3;
    private int o0 = 1;
    private double oo = 2.0d;
    private int om = 3;

    public final int m() {
        return this.m;
    }

    public final String m0() {
        return this.m0;
    }

    public final int n() {
        return this.f42472n;
    }

    public final int o() {
        return this.o;
    }

    public final int o0() {
        return this.o0;
    }

    public final int om() {
        return this.om;
    }

    public final int[] on() {
        return this.on;
    }

    public final double oo() {
        return this.oo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DynamicWaterfallStrategy{limitSegmentSwitch=");
        sb.append(this.o);
        sb.append(", latestDay=");
        sb.append(this.m);
        sb.append(", maxCollectCount=");
        sb.append(this.f42472n);
        sb.append(", minCollectCount=");
        sb.append(this.o0);
        sb.append(", premiumRate=");
        sb.append(this.oo);
        sb.append(", premiumLevel=");
        return a.p(sb, this.om, AbstractJsonLexerKt.END_OBJ);
    }

    public static om o(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            om omVar = new om();
            omVar.o = jSONObject.optInt("limit_sw", 1);
            omVar.m = jSONObject.optInt("latest_day", 0);
            omVar.f42472n = jSONObject.optInt("max_n", 3);
            omVar.o0 = jSONObject.optInt("min_m", 1);
            omVar.oo = jSONObject.optDouble("premium_rate", 2.0d);
            omVar.om = jSONObject.optInt("premium_level", 3);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("not_filter_list");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                omVar.m0 = jSONArrayOptJSONArray.toString();
                omVar.on = new int[jSONArrayOptJSONArray.length()];
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    omVar.on[i2] = jSONArrayOptJSONArray.optInt(i2);
                }
            }
            return omVar;
        } catch (Throwable unused) {
            return null;
        }
    }
}
