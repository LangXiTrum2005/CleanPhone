package sg.bigo.ads.core.e.a;

import android.content.Context;
import android.database.Cursor;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import sg.bigo.ads.api.core.r;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends sg.bigo.ads.common.g.b.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f48445i;
    public long j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f48446l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f48447n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f48448p;
    final r q;
    int r;
    public CopyOnWriteArrayList<e> s;
    public CopyOnWriteArrayList<e> t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f48449u;
    public CopyOnWriteArrayList<e> v;

    public f(r rVar, Cursor cursor) {
        super(cursor);
        this.f48445i = 0;
        this.j = 0L;
        this.k = 0;
        this.f48446l = 0L;
        this.m = 0;
        this.f48447n = 0L;
        this.o = 0;
        this.f48448p = 0L;
        this.q = rVar;
        this.f47248c = 1;
    }

    public final int b(Context context) {
        Iterator<e> it = this.t.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2++;
            a(context, "click_track", it.next());
        }
        return i2;
    }

    public final int c(Context context) {
        Iterator<e> it = this.f48449u.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2++;
            a(context, "nurl_track", it.next());
        }
        return i2;
    }

    public final int d(Context context) {
        Iterator<e> it = this.v.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2++;
            a(context, "lurl_track", it.next());
        }
        return i2;
    }

    @Override // sg.bigo.ads.common.g.b.c
    public final String e() {
        if (this.v == null) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<e> it = this.v.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().f48441e);
        }
        return jSONArray.toString();
    }

    @Override // sg.bigo.ads.common.g.b.c
    public final long f() {
        return Math.max(Math.max(this.j, this.f48446l), this.d);
    }

    public final boolean g() {
        return a(this.s) && a(this.t) && a(this.f48449u) && a(this.v);
    }

    public f(r rVar, Map<String, String> map) {
        super(map);
        this.f48445i = 0;
        this.j = 0L;
        this.k = 0;
        this.f48446l = 0L;
        this.m = 0;
        this.f48447n = 0L;
        this.o = 0;
        this.f48448p = 0L;
        this.q = rVar;
        this.f47248c = 1;
    }

    public final void a(Context context) {
        Iterator<e> it = this.s.iterator();
        while (it.hasNext()) {
            a(context, "impl_track", it.next());
        }
    }

    @Override // sg.bigo.ads.common.g.b.c
    public final String b() {
        if (this.s == null) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<e> it = this.s.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().f48441e);
        }
        return jSONArray.toString();
    }

    @Override // sg.bigo.ads.common.g.b.c
    public final String c() {
        if (this.t == null) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<e> it = this.t.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().f48441e);
        }
        return jSONArray.toString();
    }

    @Override // sg.bigo.ads.common.g.b.c
    public final String d() {
        if (this.f48449u == null) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<e> it = this.f48449u.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().f48441e);
        }
        return jSONArray.toString();
    }

    private void a(Context context, final String str, final e eVar) {
        String str2 = eVar.f48439b;
        if (eVar.b()) {
            if ("impl_track".equals(str)) {
                this.s.remove(eVar);
                return;
            }
            if ("click_track".equals(str)) {
                this.t.remove(eVar);
                return;
            } else if ("nurl_track".equals(str)) {
                this.f48449u.remove(eVar);
                return;
            } else {
                if ("lurl_track".equals(str)) {
                    this.v.remove(eVar);
                    return;
                }
                return;
            }
        }
        int i2 = this.f48445i;
        if ("click_track".equals(str)) {
            i2 = this.k;
        } else if ("nurl_track".equals(str)) {
            i2 = this.m;
        } else if ("lurl_track".equals(str)) {
            i2 = this.o;
        }
        int i3 = i2;
        sg.bigo.ads.common.u.a aVarD = eVar.d();
        int i4 = eVar.f48440c;
        eVar.a();
        sg.bigo.ads.core.e.b.a(context, i4, str, aVarD, str2, this.r, this.f47247b, i3, this.f47250h, new sg.bigo.ads.core.e.b.a() { // from class: sg.bigo.ads.core.e.a.f.1
            @Override // sg.bigo.ads.core.e.b.a
            public final void a() {
                d.a().b(f.this);
            }

            @Override // sg.bigo.ads.core.e.b.a
            public final void b() {
                CopyOnWriteArrayList<e> copyOnWriteArrayList;
                if ("impl_track".equals(str)) {
                    copyOnWriteArrayList = f.this.s;
                } else if ("click_track".equals(str)) {
                    copyOnWriteArrayList = f.this.t;
                } else {
                    if (!"nurl_track".equals(str)) {
                        if ("lurl_track".equals(str)) {
                            copyOnWriteArrayList = f.this.v;
                        }
                        d.a().b(f.this);
                    }
                    copyOnWriteArrayList = f.this.f48449u;
                }
                copyOnWriteArrayList.remove(eVar);
                d.a().b(f.this);
            }

            @Override // sg.bigo.ads.core.e.b.a
            public final boolean a(int i5) {
                return f.this.q.a(i5);
            }
        });
    }

    @Override // sg.bigo.ads.common.g.b.c
    public final void b(String str) {
        if (q.a((CharSequence) str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            this.t = new CopyOnWriteArrayList<>();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                this.t.add(new e(jSONArray.getJSONObject(i2)));
            }
        } catch (JSONException unused) {
        }
    }

    @Override // sg.bigo.ads.common.g.b.c
    public final void c(String str) {
        if (q.a((CharSequence) str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            this.f48449u = new CopyOnWriteArrayList<>();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                this.f48449u.add(new e(jSONArray.getJSONObject(i2)));
            }
        } catch (JSONException unused) {
        }
    }

    @Override // sg.bigo.ads.common.g.b.c
    public final void d(String str) {
        if (q.a((CharSequence) str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            this.v = new CopyOnWriteArrayList<>();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                this.v.add(new e(jSONArray.getJSONObject(i2)));
            }
        } catch (JSONException unused) {
        }
    }

    @Override // sg.bigo.ads.common.g.b.c
    public final void a(String str) {
        if (q.a((CharSequence) str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            this.s = new CopyOnWriteArrayList<>();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                this.s.add(new e(jSONArray.getJSONObject(i2)));
            }
        } catch (JSONException unused) {
        }
    }

    public final boolean a(int i2) {
        return this.q.b(i2);
    }

    private static boolean a(List<e> list) {
        return list != null && list.size() == 0;
    }

    public final boolean a(List<e> list, int i2) {
        return list == null || list.size() == 0 || !a(i2);
    }
}
