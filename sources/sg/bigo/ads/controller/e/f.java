package sg.bigo.ads.controller.e;

import android.os.Build;
import android.util.Base64;
import com.p004ironsource.ne;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.controller.c.p;

/* JADX INFO: loaded from: classes7.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f48120b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f48121a;
    private final int d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f48123e = 1;
    private final int f = 2;
    private final int g = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f48122c = 0;

    private String c(d dVar) {
        sg.bigo.ads.api.a.h hVar = i.f46986a;
        this.f48121a = (hVar == null || hVar.v() != 1) ? d(dVar) : e(dVar);
        this.f48122c = System.currentTimeMillis();
        return this.f48121a;
    }

    private static String d(d dVar) {
        String string;
        if (dVar == null) {
            sg.bigo.ads.common.t.a.a(0, "BigoAdSdk", "Failed to generate a token due to uninitialized provider.");
            return null;
        }
        String appKey = dVar.f48092a.getAppKey();
        String str = dVar.d;
        String str2 = dVar.f48095e;
        int i2 = dVar.f;
        String channel = dVar.f48092a.getChannel();
        String str3 = Build.VERSION.RELEASE;
        String str4 = dVar.g;
        String str5 = dVar.f48096h;
        String str6 = dVar.f48097i;
        String str7 = dVar.k;
        int i3 = dVar.f48098l;
        String str8 = dVar.m;
        String strR = dVar.r();
        String strU = dVar.U();
        String strA = dVar.A();
        String strA2 = sg.bigo.ads.common.b.a.a(dVar.f48093b);
        String strF = dVar.f48094c.F();
        String strD = q.d(sg.bigo.ads.common.utils.c.a());
        int iD = dVar.D();
        String strJ = dVar.f48094c.j();
        String strG = dVar.G();
        String strR2 = dVar.R();
        String strS = dVar.S();
        String strA3 = sg.bigo.ads.controller.g.d.a(null, dVar);
        String strR3 = sg.bigo.ads.common.x.a.r();
        sg.bigo.ads.common.b bVarAc = dVar.ac();
        String strValueOf = bVarAc != null ? String.valueOf(bVarAc.f47113c) : "";
        String strValueOf2 = bVarAc != null ? String.valueOf(bVarAc.f47111a) : "";
        String strValueOf3 = bVarAc != null ? String.valueOf(bVarAc.f47112b) : "";
        int i4 = dVar.s;
        String strE = sg.bigo.ads.common.m.b.e();
        int iO = sg.bigo.ads.common.x.a.o();
        int iN = sg.bigo.ads.common.x.a.n();
        int iP = sg.bigo.ads.common.x.a.p();
        int iB = sg.bigo.ads.core.d.b.b();
        String strAe = dVar.ae();
        boolean z2 = dVar.z();
        boolean zF = dVar.F();
        boolean zAd = dVar.ad();
        boolean zK = sg.bigo.ads.common.aa.b.k(dVar.f48093b);
        int iL = sg.bigo.ads.common.aa.b.l(dVar.f48093b);
        boolean zC = sg.bigo.ads.common.aa.b.c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("app_key", appKey);
            jSONObject.putOpt("pkg_name", str);
            jSONObject.putOpt("pkg_ver", str2);
            jSONObject.putOpt("pkg_vc", Integer.valueOf(i2));
            jSONObject.putOpt("pkg_ch", channel);
            jSONObject.putOpt(ne.f26256E, "android");
            jSONObject.putOpt("os_ver", str3);
            jSONObject.putOpt("os_lang", str4);
            jSONObject.putOpt("vendor", str5);
            jSONObject.putOpt("model", str6);
            jSONObject.putOpt("resolution", str7);
            jSONObject.putOpt("dpi", Integer.valueOf(i3));
            jSONObject.putOpt("dpi_f", str8);
            jSONObject.putOpt("net", strR);
            jSONObject.putOpt("country", strU);
            jSONObject.putOpt("sdk_ver", "5.5.1");
            jSONObject.putOpt("sdk_vc", 50501);
            jSONObject.putOpt("gaid", strA);
            jSONObject.putOpt("af_id", strA2);
            jSONObject.putOpt("uid", strF);
            jSONObject.putOpt("timezone", strD);
            jSONObject.putOpt("timestamp", Integer.valueOf(iD));
            jSONObject.putOpt("abflags", strJ);
            jSONObject.putOpt("hw_id", strG);
            jSONObject.putOpt("sim_country", strR2);
            jSONObject.putOpt("system_country", strS);
            jSONObject.putOpt("ad_info", strA3);
            jSONObject.putOpt("uuid", strR3);
            jSONObject.putOpt("bat_stat", strValueOf);
            jSONObject.putOpt("bat_num", strValueOf2);
            jSONObject.putOpt("bat_scale", strValueOf3);
            jSONObject.putOpt("simulator_file", Integer.valueOf(i4));
            jSONObject.putOpt("tc_string", strE);
            jSONObject.putOpt("fire_id", strAe);
            jSONObject.putOpt("lat_enable", Integer.valueOf(z2 ? 1 : 0));
            jSONObject.putOpt("hw_lat_enable", Integer.valueOf(zF ? 1 : 0));
            jSONObject.putOpt("fire_lat_enable", Integer.valueOf(zAd ? 1 : 0));
            jSONObject.putOpt("lgdp", Integer.valueOf(iO));
            jSONObject.putOpt(com.smartdigimkt.w7.a.r0, Integer.valueOf(iN));
            jSONObject.putOpt("coppa", Integer.valueOf(iP));
            jSONObject.putOpt("consent_status", Integer.valueOf(iB));
            jSONObject.putOpt("batsa", Integer.valueOf(zK ? 1 : 0));
            jSONObject.putOpt("datasa", Integer.valueOf(iL));
            jSONObject.putOpt("root", Integer.valueOf(zC ? 1 : 0));
            string = jSONObject.toString();
        } catch (Exception unused) {
            sg.bigo.ads.common.t.a.a(0, "BigoAdSdk", "Failed to generate a token due to unknown error.");
            string = null;
        }
        if (string != null) {
            return android.support.v4.media.a.m(sg.bigo.ads.common.j.a.a(string, "FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F"), "a2");
        }
        return null;
    }

    private static String e(d dVar) {
        if (dVar == null) {
            sg.bigo.ads.common.t.a.a(0, "BigoAdSdk", "Failed to generate a token due to uninitialized provider.");
            return null;
        }
        String strF = f(dVar);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ver", 1);
            jSONObject.put("token", strF);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    private static String f(d dVar) {
        p pVar = new p();
        pVar.a(dVar.f48092a.getAppKey());
        pVar.a(dVar.d);
        pVar.a(dVar.f48095e);
        pVar.a(dVar.f);
        pVar.a(dVar.f48092a.getChannel());
        pVar.a("android");
        pVar.a(Build.VERSION.RELEASE);
        pVar.a(dVar.g);
        pVar.a(dVar.f48096h);
        pVar.a(dVar.f48097i);
        pVar.a(dVar.k);
        pVar.a(dVar.f48098l);
        pVar.a(dVar.m);
        pVar.a(dVar.r());
        pVar.a(dVar.U());
        pVar.a("5.5.1");
        pVar.a(50501);
        pVar.a(dVar.A());
        pVar.a(sg.bigo.ads.common.b.a.a(dVar.f48093b));
        pVar.a(dVar.f48094c.F());
        pVar.a(q.d(sg.bigo.ads.common.utils.c.a()));
        pVar.a(dVar.D());
        pVar.a(dVar.f48094c.j());
        pVar.a(dVar.G());
        pVar.a(dVar.R());
        pVar.a(dVar.S());
        pVar.a(sg.bigo.ads.controller.g.d.a(null, dVar));
        pVar.a(sg.bigo.ads.common.x.a.r());
        sg.bigo.ads.common.b bVarAc = dVar.ac();
        String strValueOf = bVarAc != null ? String.valueOf(bVarAc.f47113c) : "";
        String strValueOf2 = bVarAc != null ? String.valueOf(bVarAc.f47111a) : "";
        String strValueOf3 = bVarAc != null ? String.valueOf(bVarAc.f47112b) : "";
        pVar.a(strValueOf);
        pVar.a(strValueOf2);
        pVar.a(strValueOf3);
        pVar.a(dVar.s);
        pVar.a(sg.bigo.ads.common.m.b.e());
        pVar.a(dVar.ae());
        pVar.a(dVar.z() ? 1 : 0);
        pVar.a(dVar.F() ? 1 : 0);
        pVar.a(dVar.ad() ? 1 : 0);
        pVar.a(sg.bigo.ads.common.x.a.o());
        pVar.a(sg.bigo.ads.common.x.a.n());
        pVar.a(sg.bigo.ads.common.x.a.p());
        pVar.a(sg.bigo.ads.core.d.b.b());
        pVar.a(sg.bigo.ads.common.aa.b.k(dVar.f48093b) ? 1 : 0);
        pVar.a(sg.bigo.ads.common.aa.b.l(dVar.f48093b));
        pVar.a(sg.bigo.ads.common.aa.b.c() ? 1 : 0);
        pVar.a("");
        pVar.a("");
        pVar.a("");
        int iA = 0;
        for (int i2 = 0; i2 < pVar.f48016a.size(); i2++) {
            iA += pVar.f48016a.get(i2).a();
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iA);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        for (int i3 = 0; i3 < pVar.f48016a.size(); i3++) {
            pVar.f48016a.get(i3).a(byteBufferAllocate);
        }
        byte[] bArrArray = byteBufferAllocate.array();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArrArray);
            gZIPOutputStream.close();
            String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            byteArrayOutputStream.close();
            return strEncodeToString;
        } catch (IOException unused) {
            return null;
        }
    }

    public final String a(d dVar) {
        String str = this.f48121a;
        if (str != null) {
            return str;
        }
        synchronized (f.class) {
            try {
                String str2 = this.f48121a;
                if (str2 != null) {
                    return str2;
                }
                String strC = c(dVar);
                this.f48121a = strC;
                return strC;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized String b(d dVar) {
        String strC;
        strC = c(dVar);
        this.f48121a = strC;
        return strC;
    }
}
