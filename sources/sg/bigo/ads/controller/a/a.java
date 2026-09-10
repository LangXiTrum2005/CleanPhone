package sg.bigo.ads.controller.a;

import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.ValueCallback;
import com.smartdigimkt.x.t;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.n;
import sg.bigo.ads.common.o;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends sg.bigo.ads.common.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f47748a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f47749e;
    String f;
    public final sg.bigo.ads.controller.a.a.c g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final sg.bigo.ads.controller.a.a.b f47750h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final sg.bigo.ads.controller.a.a.b f47751i;
    final sg.bigo.ads.controller.a.a.f j;
    final sg.bigo.ads.controller.a.a.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final sg.bigo.ads.controller.a.a.h f47752l;
    public final sg.bigo.ads.controller.a.a.d m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f47753n;
    private boolean o;

    public a(Context context, sg.bigo.ads.api.a.h hVar) {
        super(context);
        this.g = new sg.bigo.ads.controller.a.a.c(sg.bigo.ads.b.a());
        this.f47750h = new sg.bigo.ads.controller.a.a.b(sg.bigo.ads.b.b(), "");
        this.f47751i = new sg.bigo.ads.controller.a.a.b(sg.bigo.ads.b.c(), "");
        this.j = new sg.bigo.ads.controller.a.a.f();
        this.k = new sg.bigo.ads.controller.a.a.e();
        this.f47752l = new sg.bigo.ads.controller.a.a.h();
        this.m = new sg.bigo.ads.controller.a.a.d(hVar);
        this.f = "SDK";
        this.o = false;
    }

    @Override // sg.bigo.ads.common.e
    public final String a() {
        return "bigoad_antiban_config.dat";
    }

    @Override // sg.bigo.ads.common.e
    public final String b() {
        return "AntiBanConfig";
    }

    public final String toString() {
        return super.toString();
    }

    private static JSONObject a(JSONObject jSONObject) {
        return jSONObject != null ? jSONObject : new JSONObject();
    }

    @Override // sg.bigo.ads.common.f
    public final void b(Parcel parcel) {
        if (n.a(parcel, 4) < 4) {
            return;
        }
        this.f47753n = n.a(parcel, 0);
        this.f47748a = n.b(parcel, false);
        this.f47749e = n.b(parcel, false);
        this.f = n.a(parcel, "SDK");
        n.b(parcel, this.g);
        n.b(parcel, this.f47750h);
        n.b(parcel, this.f47751i);
        n.b(parcel, this.j);
        n.b(parcel, this.k);
        n.b(parcel, this.f47752l);
        n.b(parcel, this.m);
        this.o = n.b(parcel, true);
    }

    public final h a(String str, String str2, Map<String, String> map, String str3, int i2) {
        if (TextUtils.isEmpty(str)) {
            return h.a("", false, 4003, "config content is empty");
        }
        String strTrim = str.trim();
        boolean zStartsWith = strTrim.startsWith("{");
        final ArrayList arrayList = new ArrayList();
        if (!zStartsWith) {
            String strA = sg.bigo.ads.common.j.a.a(strTrim, "FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F", new ValueCallback<Exception>() { // from class: sg.bigo.ads.controller.a.a.1
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Exception exc) {
                    Exception exc2 = exc;
                    if (exc2 != null) {
                        arrayList.add(exc2);
                    }
                }
            });
            if (TextUtils.isEmpty(strA)) {
                sg.bigo.ads.common.t.a.a(0, "AntiBanUtils", "decrypt error, decrypted content is empty.");
                strTrim = null;
            } else {
                sg.bigo.ads.common.t.a.a(0, 3, "AntiBanUtils", android.support.v4.media.a.o("decrypt, cryptStr=", strTrim, ", hexStringSecKey=FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F, decryptStr=", strA));
                strTrim = strA;
            }
        }
        String str4 = strTrim;
        if (!sg.bigo.ads.common.utils.k.a((Collection) arrayList)) {
            this.f47749e = true;
            return h.a(str4, zStartsWith, 4004, Log.getStackTraceString((Throwable) arrayList.get(0)));
        }
        try {
            JSONObject jSONObject = new JSONObject(str4);
            int iOptInt = jSONObject.optInt("version", 0);
            int i3 = this.f47753n;
            if (!(iOptInt < i3 ? false : iOptInt == i3 ? this.o : true)) {
                return new h(str4, false, zStartsWith, 0, "local config version is " + this.f47753n + ", remote version is " + iOptInt);
            }
            boolean z2 = iOptInt == i3;
            this.f47753n = iOptInt;
            this.f47748a = zStartsWith;
            this.f = str2;
            this.g.a(a(jSONObject.optJSONObject("cfg_svr")), z2, str3, i2);
            this.f47750h.a(a(jSONObject.optJSONObject("report_svr")), z2, str3, i2);
            this.f47751i.a(a(jSONObject.optJSONObject("ad_svr")), z2, str3, i2);
            if (!z2) {
                this.j.a(a(jSONObject.optJSONObject("third_pay_svr")));
                this.k.a(a(jSONObject.optJSONObject("third_free_svr")));
                sg.bigo.ads.controller.a.a.h hVar = this.f47752l;
                JSONObject jSONObjectA = a(jSONObject.optJSONObject("uri_opt_timeout"));
                synchronized (hVar) {
                    hVar.f47794a = jSONObjectA.optLong("getsdkconfig", 0L) * 1000;
                    hVar.f47795b = jSONObjectA.optLong("getuniad", 0L) * 1000;
                    hVar.f47796c = jSONObjectA.optLong("unicallback", 0L) * 1000;
                    hVar.d = jSONObjectA.optLong("getuniconfig", 0L) * 1000;
                    hVar.f47797e = jSONObjectA.optLong("reportunibaina", 0L) * 1000;
                }
                sg.bigo.ads.controller.a.a.d dVar = this.m;
                JSONObject jSONObjectA2 = a(jSONObject.optJSONObject("req_pool_size"));
                synchronized (dVar) {
                    dVar.f47772a = jSONObjectA2.optInt("sdk_config", 3);
                    dVar.f47773b = jSONObjectA2.optInt("report", 2);
                    dVar.f47774c = jSONObjectA2.optInt("config_ad", 12);
                    dVar.d = jSONObjectA2.optInt("callback", 3);
                    dVar.f47775e = jSONObjectA2.optInt("vast_wrapper", 3);
                    dVar.f = jSONObjectA2.optInt("tracker", 10);
                    dVar.g = jSONObjectA2.optInt(t.o1, 5);
                }
                if (!sg.bigo.ads.common.utils.k.a(map)) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        a(entry.getKey(), entry.getValue());
                    }
                }
            }
            this.o = false;
            return new h(str4, zStartsWith);
        } catch (JSONException e2) {
            return h.a(str4, zStartsWith, 4005, Log.getStackTraceString(e2));
        }
    }

    @Override // sg.bigo.ads.common.e
    public final void a(Context context) {
        super.a(context);
        if (this.d) {
            try {
                new File(o.a(context), "bigoad_antiban.dat").deleteOnExit();
                new File(o.a(context), "bigoad_api_antiban.dat").deleteOnExit();
            } catch (Exception unused) {
            }
        }
    }

    @Override // sg.bigo.ads.common.f
    public final void a(Parcel parcel) {
        parcel.writeInt(4);
        parcel.writeInt(this.f47753n);
        n.a(parcel, this.f47748a);
        n.a(parcel, this.f47749e);
        parcel.writeString(this.f);
        n.a(parcel, this.g);
        n.a(parcel, this.f47750h);
        n.a(parcel, this.f47751i);
        n.a(parcel, this.j);
        n.a(parcel, this.k);
        n.a(parcel, this.f47752l);
        n.a(parcel, this.m);
        n.a(parcel, this.o);
    }

    public final boolean a(String str, String str2) {
        return this.f47751i.a(str, str2) | this.g.a(str, str2) | this.f47750h.a(str, str2);
    }
}
