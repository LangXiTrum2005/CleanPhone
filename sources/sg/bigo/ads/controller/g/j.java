package sg.bigo.ads.controller.g;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends b {
    public j(sg.bigo.ads.api.a.h hVar, sg.bigo.ads.common.g gVar, sg.bigo.ads.controller.a.b bVar, sg.bigo.ads.api.b bVar2, sg.bigo.ads.api.a.l lVar, sg.bigo.ads.controller.e<sg.bigo.ads.api.b, sg.bigo.ads.api.core.c, sg.bigo.ads.api.a.l> eVar) {
        super(hVar, gVar, bVar, bVar2, lVar, eVar);
    }

    @Override // sg.bigo.ads.controller.g.b, sg.bigo.ads.controller.g.a
    public final void a(String str, Map<String, Object> map) {
        sg.bigo.ads.controller.c.b bVarA;
        if (this.m != null) {
            Object obj = map.get("logid");
            long jLongValue = obj instanceof Long ? ((Long) obj).longValue() : 0L;
            try {
                JSONObject jSONObject = new JSONObject(str);
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ads");
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject != null && (bVarA = sg.bigo.ads.controller.c.b.a(jLongValue, k().g, this.f48160l, jSONObjectOptJSONObject)) != null) {
                        arrayList.add(bVarA);
                    }
                }
                if (sg.bigo.ads.common.utils.k.a((Collection) arrayList)) {
                    a(1005, 0, "empty ad data.");
                } else {
                    this.m.a(a(), this.k, (sg.bigo.ads.controller.c.b[]) arrayList.toArray(new sg.bigo.ads.controller.c.b[arrayList.size()]));
                }
            } catch (JSONException unused) {
                a(1005, 0, "Invalid ad data.");
            }
        }
    }

    @Override // sg.bigo.ads.controller.g.b, sg.bigo.ads.controller.g.a
    public final void i() {
        sg.bigo.ads.common.x.a.A();
    }

    @Override // sg.bigo.ads.controller.g.b, sg.bigo.ads.controller.g.a
    public final boolean j() {
        return sg.bigo.ads.api.a.i.f46986a.e() && sg.bigo.ads.common.x.a.z();
    }

    @Override // sg.bigo.ads.controller.g.b, sg.bigo.ads.controller.g.a
    /* JADX INFO: renamed from: m */
    public final sg.bigo.ads.controller.a.f f() {
        return this.f48148c.b("/Ad/GetUniIconAds", null);
    }
}
