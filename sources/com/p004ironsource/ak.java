package com.p004ironsource;

import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f24376a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f24379e;
    private Map<String, String> f;
    private final kp g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f24380h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24377b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24378c = false;
    private bh d = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected boolean f24381i = false;
    protected String j = null;

    public ak(String str, kp kpVar) throws NullPointerException {
        this.f24376a = SDKUtils.requireNonEmptyOrNull(str, "Instance name can't be null");
        this.g = (kp) SDKUtils.requireNonNull(kpVar, "AdListener name can't be null");
    }

    public ak a(bh bhVar) {
        this.d = bhVar;
        return this;
    }

    public ak b(String str) {
        this.j = str;
        return this;
    }

    public ak c() {
        this.f24377b = true;
        return this;
    }

    public ak a(String str) {
        this.f24379e = str;
        return this;
    }

    public ak b(boolean z2) {
        this.f24381i = z2;
        return this;
    }

    public ak c(boolean z2) {
        this.f24380h = z2;
        return this;
    }

    public ak a(Map<String, String> map) {
        this.f = map;
        return this;
    }

    public String b() {
        String str = this.f24379e;
        if (str != null) {
            return str;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.f24376a);
            jSONObject.put("rewarded", this.f24377b);
        } catch (JSONException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        return (this.f24378c || this.f24380h) ? jk.a() : jk.a(jSONObject);
    }

    public ak a(boolean z2) {
        this.f24378c = z2;
        return this;
    }

    public zj a() {
        return new zj(b(), this.f24376a, this.f24377b, this.f24378c, this.f24380h, this.f24381i, this.j, this.f, this.g, this.d);
    }
}
