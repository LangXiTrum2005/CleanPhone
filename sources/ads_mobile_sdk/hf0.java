package ads_mobile_sdk;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p002kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class hf0 extends LinkedHashMap {
    public final int a;
    public final Object b;
    public final List c;

    public hf0(int i, ArrayList arrayList) {
        nk2 nk2Var = nk2.EVICTION_REASON_OVERFLOW;
        this.a = i;
        this.b = nk2Var;
        this.c = arrayList;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        if (size() <= this.a) {
            return false;
        }
        this.c.add(new Pair(this.b, entry.getValue()));
        return true;
    }
}
