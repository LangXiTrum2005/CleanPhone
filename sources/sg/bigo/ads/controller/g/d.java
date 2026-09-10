package sg.bigo.ads.controller.g;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class d {
    public static String a(sg.bigo.ads.api.b bVar, sg.bigo.ads.common.g gVar) {
        int iF;
        long jH;
        int iG;
        if (bVar != null) {
            iF = bVar.d;
            iG = bVar.f46990e;
            jH = bVar.f;
        } else {
            iF = 0;
            jH = 0;
            iG = 0;
        }
        if (iF <= 0) {
            iF = gVar.f();
        }
        if (iG <= 0) {
            iG = gVar.g();
        }
        if (jH <= 0) {
            jH = gVar.h();
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("ad_a", Integer.valueOf(iF));
            jSONObject.putOpt("ad_g", Integer.valueOf(iG));
            jSONObject.putOpt("ad_channel", gVar.e());
            jSONObject.putOpt("ad_active", Long.valueOf(jH));
            jSONObject.putOpt("ad_ins", Long.valueOf(gVar.Y()));
            jSONObject.putOpt("ad_upd", Long.valueOf(gVar.Z()));
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
