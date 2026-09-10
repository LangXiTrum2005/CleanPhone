package sg.bigo.ads.core.b;

import android.text.TextUtils;
import com.p004ironsource.ne;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.api.b.e;
import sg.bigo.ads.api.core.c;
import sg.bigo.ads.api.core.p;
import sg.bigo.ads.common.utils.j;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static Map<String, Object> a(String str, l lVar, sg.bigo.ads.api.b bVar, c cVar, Integer num) {
        c cVarI;
        HashMap mapS = androidx.media3.extractor.text.ttml.a.s("action", str);
        mapS.put("slot", lVar.l());
        mapS.put("config_id", Long.valueOf(i.f46986a.i()));
        mapS.put("placement_id", lVar.n());
        mapS.put("strategy_id", lVar.a());
        mapS.put("ad_type", Integer.valueOf(lVar.b()));
        mapS.put("abflags", q.a(i.f46986a.j(), lVar.o()));
        mapS.put("ts", Long.valueOf(System.currentTimeMillis()));
        mapS.put("begin_ts", Long.valueOf(bVar.g.f));
        mapS.put("banner_type", Integer.valueOf(bVar.f46989c));
        mapS.put("adn_name", "bigoad");
        JSONObject jSONObject = new JSONObject();
        sg.bigo.ads.api.b.a aVar = bVar.g;
        j.a(jSONObject, "session_id", aVar.c());
        j.a(jSONObject, "gps_country", aVar.d());
        j.a(jSONObject, "sim_country", aVar.e());
        j.a(jSONObject, "system_country", aVar.f());
        j.a(jSONObject, "req_status", Integer.valueOf(aVar.h()));
        if (cVar != null) {
            j.a(jSONObject, "adx_country", cVar.m());
        }
        if (lVar.w()) {
            j.a(jSONObject, "config_country", i.f46986a.k());
        }
        String strG = aVar.g();
        if (!q.a((CharSequence) strG)) {
            j.a(jSONObject, "load_ext", strG);
        }
        if (num != null) {
            j.a(jSONObject, "auc_mode", num);
        }
        if ((bVar instanceof sg.bigo.ads.api.b.b) && (cVarI = ((sg.bigo.ads.api.b.b) bVar).i()) != null) {
            j.a(jSONObject, "host_slot", cVarI.b());
            j.a(jSONObject, "host_placement", cVarI.c());
            j.a(jSONObject, "host_sid", Long.valueOf(cVarI.y()));
            j.a(jSONObject, "host_ad_id", cVarI.r());
        }
        if (bVar instanceof sg.bigo.ads.api.b.c) {
            j.a(jSONObject, "icon_req_num", Integer.valueOf(((sg.bigo.ads.api.b.c) bVar).j()));
        }
        mapS.put("extra_json", jSONObject.toString());
        return mapS;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Map<String, Object> a(String str, l lVar, sg.bigo.ads.api.b bVar, c cVar, Integer num, String str2, String str3, sg.bigo.ads.api.b.a aVar) {
        JSONObject jSONObject;
        int i2;
        Map<String, Object> mapA = a(str, lVar, bVar, cVar, num);
        Object obj = mapA.get("extra_json");
        if (obj == null || !(obj instanceof String)) {
            jSONObject = new JSONObject();
        } else {
            try {
                jSONObject = new JSONObject((String) obj);
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            } catch (Throwable th) {
                new JSONObject();
                throw th;
            }
        }
        if (aVar instanceof e) {
            e eVar = (e) aVar;
            c cVar2 = (c) k.b(eVar.a());
            if (cVar2 != null) {
                i2 = 1;
                mapA.put("adx_type", Integer.valueOf(cVar2.w()));
                mapA.put(ne.b1, Long.valueOf(cVar2.y()));
                mapA.put("dsp", cVar2.v());
                mapA.put("logid", Long.valueOf(cVar2.Z()));
            } else {
                i2 = 1;
            }
            str.getClass();
            int i3 = -1;
            switch (str.hashCode()) {
                case -1274499742:
                    if (str.equals("filled")) {
                        i3 = 0;
                    }
                    break;
                case 120623625:
                    if (str.equals("impression")) {
                        i3 = i2;
                    }
                    break;
                case 860524583:
                    if (str.equals("clicked")) {
                        i3 = 2;
                    }
                    break;
            }
            switch (i3) {
                case 0:
                    j.a(jSONObject, "icon_fill_num", Integer.valueOf(eVar.i()));
                    break;
                case 1:
                case 2:
                    j.a(jSONObject, "icon_fill_num", Integer.valueOf(eVar.i()));
                    j.a(jSONObject, "icon_show_num", Integer.valueOf(eVar.j()));
                    break;
            }
        } else {
            i2 = 1;
            if (cVar != null) {
                sg.bigo.ads.api.b.a aVarI = aVar != null ? aVar.I() : null;
                if (aVarI instanceof e) {
                    e eVar2 = (e) aVarI;
                    j.a(jSONObject, "icon_fill_num", Integer.valueOf(eVar2.i()));
                    j.a(jSONObject, "icon_show_num", Integer.valueOf(eVar2.j()));
                }
                mapA.put("ad_id", cVar.r());
                mapA.put("creative_id", cVar.z());
                mapA.put(ne.b1, Long.valueOf(cVar.y()));
                mapA.put("series_id", cVar.A());
                mapA.put("adx_type", Integer.valueOf(cVar.w()));
                mapA.put("mapping_slot", cVar.M());
                mapA.put("enc_price", cVar.H());
                String strI = cVar.I();
                if (!TextUtils.isEmpty(strI)) {
                    mapA.put("abflags", q.a((String) mapA.get("abflags"), strI));
                }
                j.a(jSONObject, "dsp", cVar.v());
                j.a(jSONObject, "logid", Long.valueOf(cVar.Z()));
                if (sg.bigo.ads.api.core.b.c(lVar.b())) {
                    j.a(jSONObject, "style_id", cVar.ab());
                }
            }
        }
        j.a(jSONObject, "session_id", bVar.g.f46992b);
        if (str2 != null) {
            j.a(jSONObject, "sec_price", str2);
        }
        if (str3 != null) {
            j.a(jSONObject, "sec_bidder", str3);
        }
        p pVarC_ = aVar != null ? aVar.c_() : null;
        if (pVarC_ != null && pVarC_.f47058a != null) {
            j.a(jSONObject, "is_vpaid", Integer.valueOf(i2));
        }
        mapA.put("extra_json", jSONObject.toString());
        return mapA;
    }
}
