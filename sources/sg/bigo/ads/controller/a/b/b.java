package sg.bigo.ads.controller.a.b;

import android.util.Pair;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.common.g;
import sg.bigo.ads.controller.b.h;
import sg.bigo.ads.controller.g.l;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends c {
    public b(sg.bigo.ads.controller.a.b bVar, g gVar, sg.bigo.ads.controller.b.d dVar, h hVar) {
        super(bVar, gVar, dVar, hVar);
    }

    @Override // sg.bigo.ads.controller.a.b.c
    public final sg.bigo.ads.common.n.e a() {
        return sg.bigo.ads.common.u.a.e.c();
    }

    @Override // sg.bigo.ads.controller.a.b.c
    public final sg.bigo.ads.controller.a.a.b b() {
        return this.f47836b.f47798a.f47750h;
    }

    @Override // sg.bigo.ads.controller.a.b.c
    public final void a(final Pair<String, Integer> pair) {
        if (this.f47836b == null || this.f47837c == null || pair == null) {
            return;
        }
        this.f47839h.set(true);
        HashMap map = new HashMap();
        try {
            HashMap map2 = new HashMap();
            map2.put("type", "1");
            map2.put("host", pair.first);
            map2.put("retry_times", String.valueOf(i.f46986a.y()));
            map2.put("retry_interval", String.valueOf(i.f46986a.z()));
            map2.put("next_retry_interval", String.valueOf(i.f46986a.A()));
            map2.put("cur_retry_time", String.valueOf(pair.second));
            map2.put("uuid", this.f47837c.X());
            map2.put("action", "2");
            sg.bigo.ads.common.g.b.b bVarA = sg.bigo.ads.core.d.b.b.b("06002067", map2).a(this.f47837c, 0L);
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event_id", bVarA.f47243b);
            jSONObject.put("event_info", bVarA.f47244c);
            jSONArray.put(jSONObject);
            map.put("sdk_events", jSONArray);
        } catch (Exception unused) {
        }
        l lVar = new l(map, this.f47837c, this.f47836b, new sg.bigo.ads.controller.b() { // from class: sg.bigo.ads.controller.a.b.b.1
            @Override // sg.bigo.ads.controller.e
            public final void a(int i2, int i3, int i4, String str, Object obj) {
                b.this.f47839h.set(false);
                b.this.a(pair, c.a(i4));
            }

            @Override // sg.bigo.ads.controller.b
            public final void a(int i2, String str) {
                b.this.f47839h.set(false);
                b.this.a(pair, false);
            }
        });
        lVar.f48151i = (String) pair.first;
        lVar.b();
    }
}
