package dh;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.n;
import xj.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ah.c f38870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f38871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f38872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Date f38873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Set f38874f;

    public a(String str, ah.c cVar, ArrayList arrayList) {
        this.f38869a = str;
        this.f38870b = cVar;
        this.f38871c = arrayList;
        this.f38872d = "";
        this.f38873e = new Date();
        this.f38874f = new LinkedHashSet();
        a(this.f38871c);
        b();
    }

    public final void a(ArrayList assets) {
        String str;
        n.f(assets, "assets");
        Iterator it = this.f38871c.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            str = this.f38869a;
            if (!zHasNext) {
                break;
            }
            b bVar = (b) it.next();
            if (n.a(bVar.f38886k, str)) {
                bVar.f38886k = null;
            }
        }
        Iterator it2 = assets.iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).f38886k = str;
        }
        this.f38871c = xj.n.O0(assets);
        ArrayList arrayList = new ArrayList(p.W(assets, 10));
        Iterator it3 = assets.iterator();
        while (it3.hasNext()) {
            arrayList.add(((b) it3.next()).f38876a);
        }
        this.f38874f = xj.n.Q0(arrayList);
        b();
    }

    public final void b() {
        Object obj;
        if (this.f38871c.isEmpty()) {
            return;
        }
        Iterator it = this.f38871c.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                Date date = ((b) next).f38882g;
                do {
                    Object next2 = it.next();
                    Date date2 = ((b) next2).f38882g;
                    if (date.compareTo(date2) > 0) {
                        next = next2;
                        date = date2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        b bVar = (b) obj;
        if (bVar != null) {
            this.f38872d = bVar.f38885j;
            this.f38873e = bVar.f38882g;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(ah.c cVar, ArrayList arrayList) {
        String string = UUID.randomUUID().toString();
        n.e(string, "toString(...)");
        this(string, cVar, arrayList);
    }
}
