package sg.bigo.ads.core.b.b;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.aa.c;
import sg.bigo.ads.common.g;
import sg.bigo.ads.common.j;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    sg.bigo.ads.core.b.c.b.AbstractRunnableC0865b f48297a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f48298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final g f48299c;
    final Context d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final sg.bigo.ads.core.b.a.a f48300e;
    private final j f;

    public a(Context context, sg.bigo.ads.core.b.a.a aVar, j jVar, g gVar) {
        this.d = context;
        this.f48298b = new b(aVar);
        this.f48300e = aVar;
        this.f = jVar;
        this.f48299c = gVar;
    }

    public final void a() {
        sg.bigo.ads.core.b.c.b.a(this.f48297a);
        this.f48297a = null;
        final List<sg.bigo.ads.common.g.b.a> listB = this.f48298b.b();
        if (listB.isEmpty()) {
            sg.bigo.ads.common.t.a.b("Callback", "sendGeneralStats but event list is empty!!");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<sg.bigo.ads.common.g.b.a> it = listB.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(new JSONObject(it.next().f47240c));
            } catch (JSONException unused) {
            }
        }
        HashMap map = new HashMap();
        map.put("events", jSONArray);
        this.f.a(map, new j.a() { // from class: sg.bigo.ads.core.b.b.a.3
            @Override // sg.bigo.ads.common.j.a
            public final void a() {
                sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.a.3.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        a.this.f48298b.a(listB, true);
                        a.this.f48298b.e();
                        if (a.this.f48298b.d()) {
                            return;
                        }
                        a.this.b();
                    }
                });
            }

            @Override // sg.bigo.ads.common.j.a
            public final void a(int i2, int i3, String str) {
                sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.a.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        a.this.f48298b.a(listB, false);
                        a.this.b();
                    }
                });
            }
        });
    }

    public final void b() {
        if (this.f48297a != null) {
            return;
        }
        this.f48297a = sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.a.2
            @Override // java.lang.Runnable
            public final void run() {
                if (c.b(a.this.d)) {
                    a.this.a();
                    return;
                }
                a aVar = a.this;
                aVar.f48297a = null;
                aVar.b();
            }
        }, this.f48300e.f48292b);
    }

    public final void a(final String str, final JSONObject jSONObject) {
        sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.a.1
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.common.g.b.a aVar = new sg.bigo.ads.common.g.b.a(str, jSONObject.toString());
                a.this.f48298b.a(aVar);
                if (TextUtils.isEmpty(a.this.f48299c.P())) {
                    return;
                }
                if ("impression".equals(str) || "clicked".equals(str)) {
                    sg.bigo.ads.common.t.a.a(0, 3, "Callback", "SendImmediately -> action=" + str + ", eventInfo=" + aVar.toString());
                    a.this.a();
                    return;
                }
                sg.bigo.ads.common.t.a.a(0, 3, "Callback", "SendDefer -> action=" + str + ", eventInfo=" + aVar.toString());
                a.a(a.this);
            }
        });
    }

    public static /* synthetic */ void a(a aVar) {
        if (aVar.f48298b.c() >= aVar.f48300e.f48291a) {
            aVar.a();
        } else {
            if (aVar.f48298b.d()) {
                return;
            }
            aVar.b();
        }
    }
}
