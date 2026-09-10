package sg.bigo.ads.core.d.b;

import android.content.Context;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.g;
import sg.bigo.ads.common.j;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final sg.bigo.ads.core.d.a.a f48356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    sg.bigo.ads.core.d.c.a.b f48357b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f48358c;
    final g d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Context f48359e;
    private final j f;

    public b(Context context, sg.bigo.ads.core.d.a.a aVar, j jVar, g gVar) {
        this.f48359e = context;
        this.f48358c = new c(aVar);
        this.f48356a = aVar;
        this.f = jVar;
        this.d = gVar;
    }

    public static a b(String str, Map<String, String> map) {
        return new a(str, map);
    }

    public final void a() {
        sg.bigo.ads.core.d.c.a.a(this.f48357b);
        this.f48357b = null;
        final List<sg.bigo.ads.common.g.b.b> listA = this.f48358c.a();
        if (listA.isEmpty()) {
            sg.bigo.ads.common.t.a.b("Stats", "sendGeneralStats but event list is empty!!");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (sg.bigo.ads.common.g.b.b bVar : listA) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event_id", bVar.f47243b);
                jSONObject.put("event_info", bVar.f47244c);
                jSONArray.put(jSONObject);
            }
        } catch (JSONException unused) {
        }
        HashMap map = new HashMap();
        map.put("sdk_events", jSONArray);
        this.f.a(map, new j.a() { // from class: sg.bigo.ads.core.d.b.b.3
            @Override // sg.bigo.ads.common.j.a
            public final void a() {
                sg.bigo.ads.core.d.c.a.a(new Runnable() { // from class: sg.bigo.ads.core.d.b.b.3.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        b.this.f48358c.a(listA, true);
                        b.this.f48358c.d();
                        b.this.b();
                    }
                });
            }

            @Override // sg.bigo.ads.common.j.a
            public final void a(int i2, int i3, String str) {
                sg.bigo.ads.core.d.c.a.a(new Runnable() { // from class: sg.bigo.ads.core.d.b.b.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        b.this.f48358c.a(listA, false);
                        b.this.b();
                    }
                });
            }
        });
    }

    public final void a(final String str, final Map<String, String> map) {
        sg.bigo.ads.core.d.c.a.a(new Runnable() { // from class: sg.bigo.ads.core.d.b.b.1
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.core.d.a.a.C0867a c0867a = b.this.f48356a.f48348c.get(str);
                boolean z2 = c0867a == null ? true : c0867a.f48351c;
                sg.bigo.ads.core.d.a.a.C0867a c0867a2 = b.this.f48356a.f48348c.get(str);
                long jCurrentTimeMillis = System.currentTimeMillis() + ((long) (c0867a2 == null ? 3600000 : c0867a2.d));
                a aVarB = b.b(str, map);
                b bVar = b.this;
                bVar.f48358c.a(aVarB.a(bVar.d, jCurrentTimeMillis));
                if (z2) {
                    sg.bigo.ads.common.t.a.a(0, 3, "Stats", "SendDefer -> eventId=" + str + ", events=" + map);
                    b.a(b.this);
                    return;
                }
                sg.bigo.ads.common.t.a.a(0, 3, "Stats", "SendImmediately -> eventId=" + str + ", events=" + map);
                b.this.a();
            }
        });
    }

    public final void b() {
        if (this.f48357b != null) {
            return;
        }
        if (this.f48358c.c()) {
            sg.bigo.ads.common.t.a.a(0, 3, "Stats", "no events waitting for sending");
        } else {
            this.f48357b = sg.bigo.ads.core.d.c.a.a(new Runnable() { // from class: sg.bigo.ads.core.d.b.b.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (sg.bigo.ads.common.aa.c.b(b.this.f48359e)) {
                        b.this.a();
                        return;
                    }
                    b bVar = b.this;
                    bVar.f48357b = null;
                    bVar.b();
                }
            }, this.f48356a.f48347b);
        }
    }

    public static /* synthetic */ void a(b bVar) {
        if (bVar.f48358c.b() >= bVar.f48356a.f48346a) {
            bVar.a();
        } else {
            bVar.b();
        }
    }
}
