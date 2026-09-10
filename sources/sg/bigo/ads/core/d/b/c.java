package sg.bigo.ads.core.d.b;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import sg.bigo.ads.common.utils.p;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set<sg.bigo.ads.common.g.b.b> f48368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set<sg.bigo.ads.common.g.b.b> f48369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sg.bigo.ads.core.d.a.a f48370c;

    public c(sg.bigo.ads.core.d.a.a aVar) {
        this.f48370c = aVar;
        this.f48368a = p.a(aVar.f48346a);
        this.f48369b = p.a(aVar.f48346a);
        sg.bigo.ads.core.d.c.a.a(new Runnable() { // from class: sg.bigo.ads.core.d.b.c.1
            @Override // java.lang.Runnable
            public final void run() {
                c cVar = c.this;
                long jCurrentTimeMillis = System.currentTimeMillis();
                sg.bigo.ads.common.t.a.a(0, 3, "StatsDbHelper", "clearStatInfo");
                sg.bigo.ads.common.t.a.a(0, 3, "StatsDbHelper", "clearStatInfo count = ".concat(String.valueOf(sg.bigo.ads.common.g.a.a.b("tb_stat", "expired_ts < ".concat(String.valueOf(jCurrentTimeMillis)), null))));
                cVar.f48368a.addAll(cVar.e());
            }
        });
    }

    public final synchronized List<sg.bigo.ads.common.g.b.b> a() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList(this.f48368a);
            Iterator<sg.bigo.ads.common.g.b.b> it = this.f48369b.iterator();
            while (it.hasNext()) {
                arrayList.remove(it.next());
            }
            this.f48368a.clear();
            this.f48369b.addAll(arrayList);
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized int b() {
        return this.f48368a.size();
    }

    public final synchronized boolean c() {
        return this.f48368a.isEmpty();
    }

    public final synchronized void d() {
        try {
            if (this.f48368a.isEmpty()) {
                List<sg.bigo.ads.common.g.b.b> listE = e();
                Iterator<sg.bigo.ads.common.g.b.b> it = this.f48369b.iterator();
                while (it.hasNext()) {
                    listE.remove(it.next());
                }
                this.f48368a.addAll(listE);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final List<sg.bigo.ads.common.g.b.b> e() {
        return sg.bigo.ads.common.g.c.b.a(this.f48370c.a());
    }

    public final synchronized void f() {
        this.f48369b.clear();
        this.f48368a.clear();
    }

    public final synchronized void a(List<sg.bigo.ads.common.g.b.b> list, boolean z2) {
        try {
            this.f48369b.removeAll(list);
            if (!z2) {
                this.f48368a.addAll(list);
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<sg.bigo.ads.common.g.b.b> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(it.next().f47242a));
            }
            sg.bigo.ads.common.g.c.b.a(arrayList);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(sg.bigo.ads.common.g.b.b bVar) {
        try {
            this.f48368a.add(bVar);
            sg.bigo.ads.common.t.a.a(0, 3, "StatsDbHelper", "insertStatInfo:" + bVar.toString());
            ContentValues contentValues = new ContentValues();
            contentValues.put("event_id", bVar.f47243b);
            contentValues.put("event_info", bVar.f47244c);
            contentValues.put("expired_ts", Long.valueOf(bVar.d));
            contentValues.put("ext", bVar.f47245e);
            long jCurrentTimeMillis = bVar.f;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            contentValues.put("ctime", Long.valueOf(jCurrentTimeMillis));
            long jCurrentTimeMillis2 = bVar.g;
            if (jCurrentTimeMillis2 == 0) {
                jCurrentTimeMillis2 = System.currentTimeMillis();
            }
            contentValues.put("mtime", Long.valueOf(jCurrentTimeMillis2));
            bVar.f47242a = sg.bigo.ads.common.g.a.a.a("tb_stat", contentValues);
        } catch (Throwable th) {
            throw th;
        }
    }
}
