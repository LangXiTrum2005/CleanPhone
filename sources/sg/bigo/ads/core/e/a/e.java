package sg.bigo.ads.core.e.a;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.common.k;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f48438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f48439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f48440c;
    int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    JSONObject f48441e;
    private String f;
    private String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String[] f48442h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String[] f48443i;
    private String j;
    private int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map<String, String> f48444l;
    private sg.bigo.ads.common.g m;

    public e(JSONObject jSONObject) {
        this(jSONObject, null);
    }

    private boolean f() {
        return this.f48440c == 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:172:0x028e  */
    private String g() {
        byte b2;
        long jA;
        int iD;
        if (TextUtils.isEmpty(this.f) || TextUtils.isEmpty(this.f48439b)) {
            return "";
        }
        String strTrim = this.f.trim();
        if (this.f48442h != null && this.f48443i != null && this.m != null) {
            for (int i2 = 0; i2 < this.f48442h.length; i2++) {
                String str = this.f48443i[i2];
                switch (str) {
                    case "regist_time":
                        b2 = 47;
                        break;
                    case "timezone":
                        b2 = 21;
                        break;
                    case "express_id":
                        b2 = 33;
                        break;
                    case "resolution":
                        b2 = 17;
                        break;
                    case "sec_price":
                        b2 = 36;
                        break;
                    case "sec_bidder":
                        b2 = 37;
                        break;
                    case "os_lang":
                        b2 = 13;
                        break;
                    case "gps_adid":
                        b2 = 5;
                        break;
                    case "os_ver":
                        b2 = 12;
                        break;
                    case "pkg_ch":
                        b2 = 10;
                        break;
                    case "pkg_vc":
                        b2 = 9;
                        break;
                    case "region":
                        b2 = 46;
                        break;
                    case "sdk_vc":
                        b2 = 23;
                        break;
                    case "vendor":
                        b2 = 14;
                        break;
                    case "app_key":
                        b2 = 6;
                        break;
                    case "click_prop":
                        b2 = 32;
                        break;
                    case "first_price":
                        b2 = 38;
                        break;
                    case "support_om":
                        b2 = 30;
                        break;
                    case "pkg_ver":
                        b2 = 8;
                        break;
                    case "first_bidder":
                        b2 = 39;
                        break;
                    case "os":
                        b2 = 11;
                        break;
                    case "dpi":
                        b2 = 18;
                        break;
                    case "isp":
                        b2 = 16;
                        break;
                    case "lan":
                        b2 = 19;
                        break;
                    case "lat":
                        b2 = 27;
                        break;
                    case "lng":
                        b2 = 28;
                        break;
                    case "mac":
                        b2 = 44;
                        break;
                    case "net":
                        b2 = 20;
                        break;
                    case "uid":
                        b2 = 49;
                        break;
                    case "city":
                        b2 = 26;
                        break;
                    case "gaid":
                        b2 = 3;
                        break;
                    case "guid":
                        b2 = 2;
                        break;
                    case "hdid":
                        b2 = 45;
                        break;
                    case "imei":
                        b2 = 42;
                        break;
                    case "imsi":
                        b2 = 43;
                        break;
                    case "device_id":
                        b2 = 50;
                        break;
                    case "timestamp":
                        b2 = 0;
                        break;
                    case "af_id":
                        b2 = 29;
                        break;
                    case "model":
                        b2 = 15;
                        break;
                    case "state":
                        b2 = 25;
                        break;
                    case "advertising_id":
                        b2 = 4;
                        break;
                    case "click_module":
                        b2 = 35;
                        break;
                    case "click_source":
                        b2 = 34;
                        break;
                    case "country":
                        b2 = 24;
                        break;
                    case "pkg_name":
                        b2 = 7;
                        break;
                    case "pkg_sver":
                        b2 = 41;
                        break;
                    case "local_timestamp_ms":
                        b2 = 1;
                        break;
                    case "action_type":
                        b2 = 31;
                        break;
                    case "loss_reason":
                        b2 = 40;
                        break;
                    case "new_uid":
                        b2 = 48;
                        break;
                    case "sdk_ver":
                        b2 = 22;
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                String strValueOf = "0";
                switch (b2) {
                    case 0:
                        jA = r.a();
                        strValueOf = String.valueOf(jA);
                        break;
                    case 1:
                        jA = System.currentTimeMillis();
                        strValueOf = String.valueOf(jA);
                        break;
                    case 2:
                        strValueOf = this.m.C();
                        break;
                    case 3:
                    case 4:
                    case 5:
                        strValueOf = this.m.A();
                        break;
                    case 6:
                        strValueOf = this.m.a();
                        break;
                    case 7:
                        strValueOf = this.m.b();
                        break;
                    case 8:
                        strValueOf = String.valueOf(this.m.c());
                        break;
                    case 9:
                        iD = this.m.d();
                        strValueOf = String.valueOf(iD);
                        break;
                    case 10:
                        strValueOf = this.m.e();
                        break;
                    case 11:
                        strValueOf = this.m.i();
                        break;
                    case 12:
                        strValueOf = this.m.j();
                        break;
                    case 13:
                    case 19:
                        strValueOf = this.m.k();
                        break;
                    case 14:
                        strValueOf = this.m.l();
                        break;
                    case 15:
                        strValueOf = this.m.m();
                        break;
                    case 16:
                        strValueOf = this.m.n();
                        break;
                    case 17:
                        strValueOf = this.m.o();
                        break;
                    case 18:
                        iD = this.m.p();
                        strValueOf = String.valueOf(iD);
                        break;
                    case 20:
                        strValueOf = this.m.r();
                        break;
                    case 21:
                        strValueOf = this.m.s();
                        break;
                    case 22:
                        strValueOf = this.m.y();
                        break;
                    case 23:
                        strValueOf = "50501";
                        break;
                    case 24:
                        strValueOf = this.m.t();
                        break;
                    case 25:
                        strValueOf = this.m.w();
                        break;
                    case 26:
                        strValueOf = this.m.x();
                        break;
                    case 27:
                    case 28:
                        break;
                    case 29:
                        strValueOf = this.m.B();
                        break;
                    case 30:
                        strValueOf = "1";
                        break;
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                        if (this.f48444l.containsKey(str)) {
                            strValueOf = this.f48444l.get(str);
                            break;
                        }
                    default:
                        strValueOf = "";
                        break;
                }
                String str2 = this.f48442h[i2];
                if (strValueOf == null) {
                    strValueOf = "";
                }
                strTrim = strTrim.replace(str2, strValueOf);
            }
        }
        sg.bigo.ads.api.a.h hVar = i.f46986a;
        if (strTrim == null || hVar == null || !hVar.n().a(8)) {
            return strTrim;
        }
        try {
            return strTrim.replace("{", "%7B").replace("}", "%7D");
        } catch (Exception unused) {
            return strTrim;
        }
    }

    public final void a(String str, String str2) {
        this.f48444l.put(str, str2);
    }

    public final boolean b() {
        return this.k != 0 && r.a() / 1000 > ((long) this.k);
    }

    public final boolean c() {
        return this.f48438a == 0;
    }

    public final sg.bigo.ads.common.u.a d() {
        k.b aVar;
        if (TextUtils.isEmpty(this.j)) {
            e();
            p005e.a.f(new StringBuilder("getRealUrl url = "), 0, this.j, 3, "ThirdTrack");
        }
        if (c() && f()) {
            k kVar = d.a().d;
            if (kVar != null) {
                aVar = kVar.a(this.j);
                sg.bigo.ads.common.t.a.a(0, 3, "ThirdTrack", "replaceHost new url = " + aVar.a());
            } else {
                sg.bigo.ads.common.t.a.a(0, "ThirdTrack", "replaceHost handle is null, replace failed");
                aVar = null;
            }
        } else {
            aVar = null;
        }
        if (aVar == null) {
            aVar = new k.a(this.j);
        }
        return new sg.bigo.ads.core.e.a(aVar);
    }

    public final void e() {
        this.j = g();
        p005e.a.f(new StringBuilder("updateRealUrl url = "), 0, this.j, 3, "ThirdTrack");
        JSONObject jSONObject = this.f48441e;
        if (jSONObject != null) {
            try {
                jSONObject.putOpt("real_url", this.j);
            } catch (JSONException unused) {
            }
        }
    }

    public final String toString() {
        return "type=" + this.f48438a + ",name=" + this.f48439b + ",url=" + this.j;
    }

    public e(JSONObject jSONObject, sg.bigo.ads.common.g gVar) {
        this.m = gVar;
        this.f48441e = jSONObject;
        this.f48444l = new HashMap();
        this.f48438a = jSONObject.optInt("type", 0);
        this.f = jSONObject.optString("value", "");
        this.f48439b = jSONObject.optString("name", "");
        this.g = jSONObject.optString("uuid", "");
        this.k = jSONObject.optInt("expired");
        this.f48440c = jSONObject.optInt("replace", 0);
        this.d = jSONObject.optInt("norepeat", 0);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("reg");
        if (jSONArrayOptJSONArray != null) {
            this.f48442h = new String[jSONArrayOptJSONArray.length()];
            this.f48443i = new String[jSONArrayOptJSONArray.length()];
            a(jSONArrayOptJSONArray);
        }
        this.j = jSONObject.optString("real_url");
    }

    private void a(JSONArray jSONArray) {
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            if (jSONArray.optJSONObject(i2) != null) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                this.f48442h[i2] = jSONObjectOptJSONObject.optString("token", "");
                this.f48443i[i2] = jSONObjectOptJSONObject.optString("value", "");
            }
        }
    }

    public final boolean a() {
        return "bigo_tracker".equals(this.g);
    }
}
