package sg.bigo.ads.controller.b;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.core.r;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f47898a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sg.bigo.ads.common.h.a.a f47899e;
    public final sg.bigo.ads.core.d.a.a f;
    public final sg.bigo.ads.core.b.a.a g;

    public d(Context context) {
        super(context);
        this.f47898a = new r();
        this.f47899e = new sg.bigo.ads.common.h.a.a();
        this.f = new sg.bigo.ads.core.d.a.a();
        this.g = new sg.bigo.ads.core.b.a.a();
    }

    @Override // sg.bigo.ads.common.e
    public final void a(Context context) {
        super.a(context);
        if (!TextUtils.isEmpty(this.f47918w)) {
            try {
                d(new JSONObject(this.f47918w));
            } catch (JSONException unused) {
            }
        }
        if (!TextUtils.isEmpty(this.v)) {
            try {
                a(new JSONObject(this.v));
            } catch (JSONException unused2) {
            }
        }
        if (!TextUtils.isEmpty(this.f47917u)) {
            try {
                b(new JSONObject(this.f47917u));
            } catch (JSONException unused3) {
            }
        }
        if (TextUtils.isEmpty(this.x)) {
            return;
        }
        try {
            c(new JSONObject(this.x));
        } catch (JSONException unused4) {
        }
    }

    @Override // sg.bigo.ads.common.e
    public final String b() {
        return "GlobalConfigData";
    }

    @Override // sg.bigo.ads.controller.b.e
    public final void c(JSONObject jSONObject) {
        this.f.a(jSONObject);
    }

    @Override // sg.bigo.ads.controller.b.e
    public final void d(JSONObject jSONObject) {
        this.g.a(jSONObject);
    }

    @Override // sg.bigo.ads.api.a.h
    public final r m() {
        return this.f47898a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GlobalConfigData{huaweiAdIdInfo=");
        sb.append(this.f47912h);
        sb.append(", googleAdIdInfo=");
        sb.append(this.f47913i);
        sb.append(", location=");
        sb.append(this.j);
        sb.append(", state=");
        sb.append(this.m);
        sb.append(", configId=");
        sb.append(this.f47915n);
        sb.append(", interval=");
        sb.append(this.o);
        sb.append(", token='");
        sb.append(this.f47916p);
        sb.append("', antiBan='");
        sb.append(this.q);
        sb.append("', strategy=");
        sb.append(this.r);
        sb.append(", abflags='");
        sb.append(this.s);
        sb.append("', country='");
        sb.append(this.t);
        sb.append("', creatives='");
        sb.append(this.f47917u);
        sb.append("', trackConfig='");
        sb.append(this.v);
        sb.append("', callbackConfig='");
        sb.append(this.f47918w);
        sb.append("', reportConfig='");
        sb.append(this.x);
        sb.append("', appCheckConfig='");
        sb.append(this.y);
        sb.append("', uid='");
        sb.append(this.f47919z);
        sb.append("', maxRequestNum=");
        sb.append(this.f47900A);
        sb.append(", negFeedbackState=");
        sb.append(this.f47901B);
        sb.append(", omUrl='");
        sb.append(this.C);
        sb.append("', globalSwitch=");
        sb.append(this.f47902E.f47053a);
        sb.append(", bannerJsUrl='");
        sb.append(this.D);
        sb.append("', reqCountry='");
        sb.append(this.L);
        sb.append("', appFlag='");
        return android.support.v4.media.a.i(this.f47906N, "'}", sb);
    }

    @Override // sg.bigo.ads.controller.b.e
    public final void a(JSONObject jSONObject) {
        this.f47898a.a(jSONObject);
    }

    @Override // sg.bigo.ads.controller.b.e
    public final void b(JSONObject jSONObject) {
        this.f47899e.a(jSONObject);
    }
}
