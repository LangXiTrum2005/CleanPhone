package sg.bigo.ads.common.utils;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class h<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<String, V> f47519a = new HashMap<>();

    public final V a(String str) {
        if (str == null) {
            return null;
        }
        return this.f47519a.get(str.toLowerCase());
    }

    public final V b(String str) {
        return this.f47519a.remove(str.toLowerCase());
    }

    public final void a(Map<? extends String, ? extends V> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<? extends String, ? extends V> entry : map.entrySet()) {
            String key = entry.getKey();
            V value = entry.getValue();
            if (key != null && value != null) {
                this.f47519a.put(key.toLowerCase(), value);
            }
        }
    }
}
