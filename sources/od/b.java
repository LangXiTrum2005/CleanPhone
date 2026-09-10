package od;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f47383b;

    public b(Set set, c cVar) {
        this.f47382a = b(set);
        this.f47383b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f47380a);
            sb2.append('/');
            sb2.append(aVar.f47381b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        String str = this.f47382a;
        c cVar = this.f47383b;
        synchronized (((HashSet) cVar.f47386b)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) cVar.f47386b);
        }
        if (setUnmodifiableSet.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(' ');
        synchronized (((HashSet) cVar.f47386b)) {
            setUnmodifiableSet2 = Collections.unmodifiableSet((HashSet) cVar.f47386b);
        }
        sb2.append(b(setUnmodifiableSet2));
        return sb2.toString();
    }
}
