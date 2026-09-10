package sg.bigo.ads.controller.b;

import android.os.Parcel;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.a.k;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.n;

/* JADX INFO: loaded from: classes7.dex */
class i implements l, sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f47929a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f47930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f47931c;
    protected int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f47932e;
    protected int f;
    protected int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f47933h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected boolean f47934i;
    protected boolean j;
    protected boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected int f47935l;
    protected String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected boolean f47936n;
    protected String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected List<sg.bigo.ads.api.a.a> f47937p;
    protected String q;
    protected String r;
    protected m s;
    protected int t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected int f47938u;
    protected boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected int f47939w;

    @Override // sg.bigo.ads.api.a.l
    public String a() {
        return this.f47930b;
    }

    @Override // sg.bigo.ads.api.a.l
    public int b() {
        return this.f47931c;
    }

    @Override // sg.bigo.ads.api.a.l
    public int c() {
        return this.d;
    }

    @Override // sg.bigo.ads.api.a.l
    public int d() {
        return this.f47932e;
    }

    @Override // sg.bigo.ads.api.a.l
    public int e() {
        return this.f;
    }

    @Override // sg.bigo.ads.api.a.l
    public int f() {
        return this.g;
    }

    @Override // sg.bigo.ads.api.a.l
    public int g() {
        return this.f47933h;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean h() {
        return this.f47934i;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean i() {
        return this.j;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean j() {
        return this.k;
    }

    @Override // sg.bigo.ads.api.a.l
    public int k() {
        return this.f47935l;
    }

    @Override // sg.bigo.ads.api.a.l
    public String l() {
        return this.m;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean m() {
        return this.f47936n;
    }

    @Override // sg.bigo.ads.api.a.l
    public String n() {
        return this.o;
    }

    @Override // sg.bigo.ads.api.a.l
    public String o() {
        return this.q;
    }

    @Override // sg.bigo.ads.api.a.l
    public String p() {
        return this.r;
    }

    @Override // sg.bigo.ads.api.a.l
    public m q() {
        if (this.s == null) {
            this.s = new j(new JSONObject());
        }
        return this.s;
    }

    @Override // sg.bigo.ads.api.a.l
    public int r() {
        return this.t;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean s() {
        return this.t == 1;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean t() {
        return this.f47938u == 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<sg.bigo.ads.api.a.a> list = this.f47937p;
        if (list != null) {
            for (sg.bigo.ads.api.a.a aVar : list) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(aVar);
            }
        }
        return "{strategyId=" + this.f47930b + ", adType=" + this.f47931c + ", countdown=" + this.d + ", reqTimeout=" + this.f47932e + ", mediaStrategy=" + this.f + ", webViewEnforceDuration=" + this.g + ", videoDirection=" + this.f47933h + ", videoReplay=" + this.f47934i + ", videoMute=" + this.j + ", bannerAutoRefresh=" + this.k + ", bannerRefreshInterval=" + this.f47935l + ", slotId='" + this.m + "', state=" + this.f47936n + ", placementId='" + this.o + "', express=[" + sb.toString() + "], styleId=" + this.r + ", playable=" + this.t + ", isCompanionRenderSupport=" + this.f47938u + ", aucMode=" + this.f47939w + ", nativeAdClickConfig=" + this.f47929a + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean u() {
        return this.v;
    }

    @Override // sg.bigo.ads.api.a.l
    public int v() {
        return this.f47939w;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean w() {
        return this.f47939w == 3;
    }

    @Override // sg.bigo.ads.api.a.l
    public k x() {
        return this.f47929a;
    }

    public void a(Parcel parcel) {
        parcel.writeString(this.f47930b);
        parcel.writeInt(this.f47931c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f47932e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.f47933h);
        parcel.writeInt(this.f47934i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.f47935l);
        parcel.writeString(this.m);
        parcel.writeInt(this.f47936n ? 1 : 0);
        parcel.writeString(this.o);
        n.a(parcel, this.f47937p);
        parcel.writeInt(this.t);
        parcel.writeString(this.r);
        m mVar = this.s;
        parcel.writeString(mVar == null ? null : mVar.toString());
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeInt(this.f47938u);
        parcel.writeInt(this.f47939w);
        n.a(parcel, this.f47929a);
    }

    public void b(Parcel parcel) {
        this.f47930b = parcel.readString();
        this.f47931c = parcel.readInt();
        this.d = parcel.readInt();
        this.f47932e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.f47933h = parcel.readInt();
        this.f47934i = parcel.readInt() != 0;
        this.j = parcel.readInt() != 0;
        this.k = parcel.readInt() != 0;
        this.f47935l = parcel.readInt();
        this.m = parcel.readString();
        this.f47936n = parcel.readInt() != 0;
        this.o = parcel.readString();
        this.f47937p = n.a(parcel, new sg.bigo.ads.common.f.a<sg.bigo.ads.api.a.a>() { // from class: sg.bigo.ads.controller.b.i.1
            @Override // sg.bigo.ads.common.f.a
            public final /* synthetic */ sg.bigo.ads.common.f a() {
                return new a();
            }
        });
        this.t = n.a(parcel, 0);
        this.r = n.a(parcel, "");
        a(n.a(parcel, ""));
        this.v = n.b(parcel, true);
        this.f47938u = n.a(parcel, 0);
        this.f47939w = n.a(parcel, 0);
        n.b(parcel, this.f47929a);
    }

    private void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (this.f47931c == 4 && !jSONObject.has("interstitial_video_style")) {
                jSONObject = new JSONObject().put("interstitial_video_style", jSONObject);
            }
            this.s = new j(jSONObject);
        } catch (JSONException unused) {
        }
    }

    public boolean a(JSONObject jSONObject) {
        if (jSONObject == null) {
            sg.bigo.ads.common.t.a.a(0, "Slot", "parseData error, jsonObject is null.");
            return false;
        }
        this.d = jSONObject.optInt(com.smartdigimkt.o1.b.l3, 5);
        this.f47931c = jSONObject.optInt("ad_type", -1);
        this.f47930b = jSONObject.optString("strategy_id", "");
        this.f47932e = jSONObject.optInt("req_once_load_timeout", 15);
        this.f = jSONObject.optInt("media_strategy", 0);
        this.g = jSONObject.optInt("webview_enforce_duration", 0) * 1000;
        this.f47933h = jSONObject.optInt("video_direction", 0);
        this.f47934i = sg.bigo.ads.api.core.b.d(this.f47931c) || jSONObject.optInt("video_replay", 1) == 1;
        this.j = sg.bigo.ads.api.core.b.d(this.f47931c) || jSONObject.optInt("video_mute", 0) == 0;
        this.k = jSONObject.optInt("banner_auto_refresh", 0) == 1;
        this.f47935l = jSONObject.optInt("banner_refresh_interval", 20);
        this.m = jSONObject.optString("slot", "");
        this.f47936n = jSONObject.optInt("state", 1) == 1;
        this.o = jSONObject.optString("placement_id", "");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("express_list");
        this.f47937p = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                a aVar = new a();
                if (jSONObjectOptJSONObject == null) {
                    sg.bigo.ads.common.t.a.a(0, "AdExpress", "parseData error, jsonObject is null.");
                } else {
                    aVar.f47875a = jSONObjectOptJSONObject.optLong("id", 0L);
                    aVar.f47876b = jSONObjectOptJSONObject.optString("name", "");
                    aVar.f47877c = jSONObjectOptJSONObject.optString("url", "");
                    aVar.d = jSONObjectOptJSONObject.optString("md5", "");
                    aVar.f47878e = jSONObjectOptJSONObject.optString("style", "");
                    aVar.f = jSONObjectOptJSONObject.optString("ad_types", "");
                    aVar.g = jSONObjectOptJSONObject.optString("file_id", "");
                    if (aVar.f47875a != 0 && !TextUtils.isEmpty(aVar.f47876b) && !TextUtils.isEmpty(aVar.f47877c) && !TextUtils.isEmpty(aVar.d) && !TextUtils.isEmpty(aVar.f) && !TextUtils.isEmpty(aVar.g)) {
                        this.f47937p.add(aVar);
                    }
                }
            }
        }
        this.q = jSONObject.optString("abflags");
        this.t = jSONObject.optInt("playable", 0);
        this.r = jSONObject.optString("style_id");
        a(jSONObject.optString("interstitial_style_config"));
        this.v = jSONObject.optInt("banner_multiple_click", 1) == 1;
        this.f47938u = jSONObject.optInt("companion_render", 0);
        this.f47939w = jSONObject.optInt("auc_mode", 0);
        g gVar = this.f47929a;
        gVar.f47924a = jSONObject.optInt("video_click_mode", 1) == 1;
        gVar.f47925b = jSONObject.optInt("native_ad_view_clickable", 0) == 1;
        gVar.f47926c = jSONObject.optInt("native_ad_click_type", 0);
        if (this.f47936n) {
            return (TextUtils.isEmpty(this.m) || TextUtils.isEmpty(this.o)) ? false : true;
        }
        return true;
    }
}
