package impassible;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: FastSafeIterableMap.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal<K, V> extends saneness<K, V> {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final HashMap<K, saneness.dern<K, V>> f28463molybdenite = new HashMap<>();

    @Override // impassible.saneness
    public V competently(K k, V v) {
        saneness.dern<K, V> dernVarDern = dern(k);
        if (dernVarDern != null) {
            return dernVarDern.f28468arytenoidectomy;
        }
        this.f28463molybdenite.put(k, beachfront(k, v));
        return null;
    }

    public boolean contains(K k) {
        return this.f28463molybdenite.containsKey(k);
    }

    @Override // impassible.saneness
    public saneness.dern<K, V> dern(K k) {
        return this.f28463molybdenite.get(k);
    }

    @Override // impassible.saneness
    public V impromptu(K k) {
        V v = (V) super.impromptu(k);
        this.f28463molybdenite.remove(k);
        return v;
    }

    public Map.Entry<K, V> taiyuan(K k) {
        if (contains(k)) {
            return this.f28463molybdenite.get(k).f28471polloi;
        }
        return null;
    }
}
