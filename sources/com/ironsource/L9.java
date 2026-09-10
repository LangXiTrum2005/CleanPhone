package com.ironsource;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class L9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f26492a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f26496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, String> f26497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Hc f26498g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f26499h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26493b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26494c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C0317e8 f26495d = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected boolean f26500i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected String f26501j = null;

    public L9(String str, Hc hc2) throws NullPointerException {
        this.f26492a = SDKUtils.requireNonEmptyOrNull(str, "Instance name can't be null");
        this.f26498g = (Hc) SDKUtils.requireNonNull(hc2, "AdListener name can't be null");
    }

    public L9 a(boolean z10) {
        this.f26494c = z10;
        return this;
    }

    public L9 b(boolean z10) {
        this.f26500i = z10;
        return this;
    }

    public L9 c() {
        this.f26493b = true;
        return this;
    }

    public L9 a(C0317e8 c0317e8) {
        this.f26495d = c0317e8;
        return this;
    }

    public L9 b(@Nullable String str) {
        this.f26501j = str;
        return this;
    }

    public L9 c(boolean z10) {
        this.f26499h = z10;
        return this;
    }

    public L9 a(String str) {
        this.f26496e = str;
        return this;
    }

    public String b() {
        String str = this.f26496e;
        if (str != null) {
            return str;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.f26492a);
            jSONObject.put("rewarded", this.f26493b);
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return (this.f26494c || this.f26499h) ? W9.a() : W9.a(jSONObject);
    }

    public L9 a(Map<String, String> map) {
        this.f26497f = map;
        return this;
    }

    public K9 a() {
        return new K9(b(), this.f26492a, this.f26493b, this.f26494c, this.f26499h, this.f26500i, this.f26501j, this.f26497f, this.f26498g, this.f26495d);
    }
}
