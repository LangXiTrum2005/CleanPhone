package ads_mobile_sdk;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import saneness.coffeecake;

/* JADX INFO: loaded from: classes.dex */
public final class bd1 extends e {
    public static final h21 b = h21.a(Collections.EMPTY_MAP);

    public bd1(LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
    }

    @Override // saneness.adultoid
    public final Object get() {
        int size = this.a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        for (Map.Entry entry : this.a.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((coffeecake) entry.getValue()).get());
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }
}
