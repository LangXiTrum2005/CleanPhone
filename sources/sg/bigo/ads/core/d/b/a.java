package sg.bigo.ads.core.d.b;

import com.p004ironsource.ne;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.g;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f48353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f48354b = System.currentTimeMillis();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, String> f48355c;

    public a(String str, Map<String, String> map) {
        this.f48353a = str;
        this.f48355c = map;
    }

    private JSONObject a(g gVar) {
        String str;
        Object objB;
        JSONObject jSONObject = new JSONObject();
        if (gVar != null) {
            try {
                jSONObject.putOpt("app_key", gVar.a());
                jSONObject.putOpt("pkg_name", gVar.b());
                jSONObject.putOpt("pkg_ver", gVar.c());
                jSONObject.putOpt("pkg_vc", Integer.valueOf(gVar.d()));
                jSONObject.putOpt("pkg_ch", gVar.e());
                jSONObject.putOpt(ne.f26256E, gVar.i());
                jSONObject.putOpt("os_ver", gVar.j());
                jSONObject.putOpt("os_lang", gVar.k());
                jSONObject.putOpt("vendor", gVar.l());
                jSONObject.putOpt("model", gVar.m());
                jSONObject.putOpt("isp", gVar.n());
                jSONObject.putOpt("resolution", gVar.o());
                jSONObject.putOpt("dpi", Integer.valueOf(gVar.p()));
                jSONObject.putOpt("dpi_f", gVar.q());
                jSONObject.putOpt("net", gVar.r());
                jSONObject.putOpt("tz", gVar.s());
                jSONObject.putOpt("country", gVar.u());
                jSONObject.putOpt("state", gVar.w());
                jSONObject.putOpt("city", gVar.x());
                jSONObject.putOpt("sdk_ver", gVar.y());
                jSONObject.putOpt("sdk_vc", 50501);
                if (sg.bigo.ads.common.x.a.q()) {
                    str = "consent_status";
                    objB = Integer.valueOf(sg.bigo.ads.core.d.b.b());
                } else {
                    jSONObject.putOpt("gaid", gVar.A());
                    jSONObject.putOpt("hw_id", gVar.G());
                    jSONObject.putOpt("fire_id", gVar.ae());
                    str = "af_id";
                    objB = gVar.B();
                }
                jSONObject.putOpt(str, objB);
                jSONObject.putOpt("uid", gVar.C());
                jSONObject.putOpt("ts", Integer.valueOf(gVar.D()));
                jSONObject.putOpt("abflags", gVar.E());
                jSONObject.putOpt("gg_service_ver", gVar.H());
                jSONObject.putOpt("webkit_ver", gVar.I());
                jSONObject.putOpt("time", Long.valueOf(this.f48354b));
                jSONObject.putOpt("event_id", this.f48353a);
                jSONObject.putOpt("sdk_channel", gVar.aa());
                Map<String, String> map = this.f48355c;
                boolean z2 = false;
                if (map != null) {
                    if (q.a((CharSequence) map.get("session_id"))) {
                        this.f48355c.put("session_id", UUID.randomUUID().toString());
                    } else {
                        z2 = true;
                    }
                    for (Map.Entry<String, String> entry : this.f48355c.entrySet()) {
                        jSONObject.putOpt(entry.getKey(), entry.getValue());
                    }
                }
                if (!z2) {
                    jSONObject.putOpt("gps_country", gVar.Q());
                    jSONObject.putOpt("sim_country", gVar.R());
                    jSONObject.putOpt("system_country", gVar.S());
                }
                jSONObject.putOpt("ts_cold", Long.valueOf(gVar.V()));
                jSONObject.putOpt("ts_hot", Long.valueOf(gVar.W()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public final sg.bigo.ads.common.g.b.b a(g gVar, long j) {
        return new sg.bigo.ads.common.g.b.b(this.f48353a, a(gVar).toString(), j);
    }
}
