package sg.bigo.ads.core.b.b;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import sg.bigo.ads.common.utils.p;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final sg.bigo.ads.core.b.a.a f48309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set<sg.bigo.ads.common.g.b.a> f48310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set<sg.bigo.ads.common.g.b.a> f48311c;
    long d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    a f48312e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f48314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f48315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f48316c;
        int d;

        private a() {
        }

        public static a a() {
            a aVar = new a();
            String strK = sg.bigo.ads.common.x.a.k();
            if (!q.a((CharSequence) strK)) {
                String[] strArrSplit = strK.split(",");
                if (strArrSplit.length == 4) {
                    try {
                        aVar.f48314a = Integer.parseInt(strArrSplit[0]);
                        aVar.f48315b = Integer.parseInt(strArrSplit[1]);
                        aVar.f48316c = Integer.parseInt(strArrSplit[2]);
                        aVar.d = Integer.parseInt(strArrSplit[3]);
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            return aVar;
        }

        public final boolean b() {
            return ((this.f48314a + this.f48315b) + this.f48316c) + this.d == 0;
        }

        public final void c() {
            this.f48314a = 0;
            this.f48315b = 0;
            this.f48316c = 0;
            this.d = 0;
            sg.bigo.ads.common.x.a.d(toString());
        }

        public final String toString() {
            return this.f48314a + "," + this.f48315b + "," + this.f48316c + "," + this.d;
        }
    }

    public b(sg.bigo.ads.core.b.a.a aVar) {
        this.f48309a = aVar;
        this.f48310b = p.a(aVar.f48291a);
        this.f48311c = p.a(aVar.f48291a);
        sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.b.1
            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                long jCurrentTimeMillis = System.currentTimeMillis() - ((long) bVar.f48309a.f48293c);
                sg.bigo.ads.common.t.a.a(0, 3, "EventDbHelper", "clearEventInfo");
                sg.bigo.ads.common.t.a.a(0, 3, "EventDbHelper", "clearEventInfo count = ".concat(String.valueOf(sg.bigo.ads.common.g.a.a.b("tb_event", "ctime < ".concat(String.valueOf(jCurrentTimeMillis)), null))));
                bVar.f48310b.addAll(bVar.f());
                long j = sg.bigo.ads.common.x.a.j();
                bVar.d = j;
                if (j == 0) {
                    bVar.d = System.currentTimeMillis();
                }
                bVar.f48312e = a.a();
                bVar.a();
            }
        });
    }

    public final void a() {
        a aVar = this.f48312e;
        if (aVar == null || aVar.b()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.d;
        if (jCurrentTimeMillis - j >= 300000) {
            a aVar2 = this.f48312e;
            sg.bigo.ads.core.d.b.a(j, aVar2.f48314a, aVar2.f48315b, aVar2.f48316c, aVar2.d);
            this.d = jCurrentTimeMillis;
            sg.bigo.ads.common.x.a.d(jCurrentTimeMillis);
            this.f48312e.c();
        }
    }

    public final synchronized List<sg.bigo.ads.common.g.b.a> b() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList(this.f48310b);
            Iterator<sg.bigo.ads.common.g.b.a> it = this.f48311c.iterator();
            while (it.hasNext()) {
                arrayList.remove(it.next());
            }
            this.f48310b.clear();
            this.f48311c.addAll(arrayList);
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized int c() {
        return this.f48310b.size();
    }

    public final synchronized boolean d() {
        return this.f48310b.isEmpty();
    }

    public final synchronized void e() {
        try {
            if (this.f48310b.isEmpty()) {
                List<sg.bigo.ads.common.g.b.a> listF = f();
                Iterator<sg.bigo.ads.common.g.b.a> it = this.f48311c.iterator();
                while (it.hasNext()) {
                    listF.remove(it.next());
                }
                this.f48310b.addAll(listF);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final List<sg.bigo.ads.common.g.b.a> f() {
        return sg.bigo.ads.common.g.c.a.a(this.f48309a.a());
    }

    public final synchronized void g() {
        this.f48311c.clear();
        this.f48310b.clear();
    }

    public final synchronized void a(List<sg.bigo.ads.common.g.b.a> list, boolean z2) {
        try {
            this.f48311c.removeAll(list);
            if (!z2) {
                this.f48310b.addAll(list);
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<sg.bigo.ads.common.g.b.a> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(it.next().f47238a));
            }
            sg.bigo.ads.common.g.c.a.a(arrayList);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b0  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final synchronized void a(sg.bigo.ads.common.g.b.a aVar) {
        try {
            this.f48310b.add(aVar);
            byte b2 = 0;
            sg.bigo.ads.common.t.a.a(0, 3, "EventDbHelper", "insertEventInfo:" + aVar.toString());
            ContentValues contentValues = new ContentValues();
            contentValues.put("event_action", aVar.f47239b);
            contentValues.put("event_info", aVar.f47240c);
            contentValues.put("states", Integer.valueOf(aVar.d));
            contentValues.put("ext", aVar.f47241e);
            long jCurrentTimeMillis = aVar.f;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            contentValues.put("ctime", Long.valueOf(jCurrentTimeMillis));
            long jCurrentTimeMillis2 = aVar.g;
            if (jCurrentTimeMillis2 == 0) {
                jCurrentTimeMillis2 = System.currentTimeMillis();
            }
            contentValues.put("mtime", Long.valueOf(jCurrentTimeMillis2));
            aVar.f47238a = sg.bigo.ads.common.g.a.a.a("tb_event", contentValues);
            a();
            a aVar2 = this.f48312e;
            String str = aVar.f47239b;
            switch (str.hashCode()) {
                case -1274499742:
                    if (!str.equals("filled")) {
                        b2 = -1;
                    } else {
                        b2 = 1;
                    }
                    break;
                case 3327206:
                    if (!str.equals("load")) {
                        b2 = -1;
                    }
                    break;
                case 120623625:
                    if (!str.equals("impression")) {
                        b2 = -1;
                    } else {
                        b2 = 2;
                    }
                    break;
                case 860524583:
                    if (!str.equals("clicked")) {
                        b2 = -1;
                    } else {
                        b2 = 3;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                aVar2.f48314a++;
            } else if (b2 == 1) {
                aVar2.f48315b++;
            } else if (b2 == 2) {
                aVar2.f48316c++;
            } else if (b2 == 3) {
                aVar2.d++;
            }
            sg.bigo.ads.common.x.a.d(aVar2.toString());
        } catch (Throwable th) {
            throw th;
        }
    }
}
