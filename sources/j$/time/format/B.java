package j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f43066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f43067b;

    B(Map map) {
        this.f43066a = map;
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap map3 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l2 = (Long) entry2.getKey();
                int i2 = C.d;
                map3.put(str, new AbstractMap.SimpleImmutableEntry(str2, l2));
            }
            ArrayList arrayList2 = new ArrayList(map3.values());
            Collections.sort(arrayList2, C.f43069b);
            map2.put((H) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            map2.put(null, arrayList);
        }
        Collections.sort(arrayList, C.f43069b);
        this.f43067b = map2;
    }

    final String a(long j, H h2) {
        Map map = (Map) this.f43066a.get(h2);
        if (map != null) {
            return (String) map.get(Long.valueOf(j));
        }
        return null;
    }

    final Iterator b(H h2) {
        List list = (List) this.f43067b.get(h2);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
