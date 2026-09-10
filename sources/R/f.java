package r;

import com.ironsource.X3;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class f implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f49214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f49215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakHashMap f49216c = new WeakHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f49217d = 0;

    public c b(Object obj) {
        c cVar = this.f49214a;
        while (cVar != null && !cVar.f49207a.equals(obj)) {
            cVar = cVar.f49209c;
        }
        return cVar;
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f49217d != fVar.f49217d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = fVar.iterator();
        while (true) {
            bVar = (b) it;
            if (!bVar.hasNext()) {
                break;
            }
            b bVar2 = (b) it2;
            if (!bVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            Object next = bVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (bVar.hasNext() || ((b) it2).hasNext()) ? false : true;
    }

    public Object h(Object obj) {
        c cVarB = b(obj);
        if (cVarB == null) {
            return null;
        }
        this.f49217d--;
        WeakHashMap weakHashMap = this.f49216c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(cVarB);
            }
        }
        c cVar = cVarB.f49210d;
        if (cVar != null) {
            cVar.f49209c = cVarB.f49209c;
        } else {
            this.f49214a = cVarB.f49209c;
        }
        c cVar2 = cVarB.f49209c;
        if (cVar2 != null) {
            cVar2.f49210d = cVar;
        } else {
            this.f49215b = cVar;
        }
        cVarB.f49209c = null;
        cVarB.f49210d = null;
        return cVarB.f49208b;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f49214a, this.f49215b, 0);
        this.f49216c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(X3.j.f27834d);
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                sb2.append(X3.j.f27836e);
                return sb2.toString();
            }
            sb2.append(((Map.Entry) bVar.next()).toString());
            if (bVar.hasNext()) {
                sb2.append(", ");
            }
        }
    }
}
