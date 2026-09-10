package dent;

import com.ironsource.X3;
import cultivated.competently;
import cultivated.impromptu;
import java.util.HashMap;
import java.util.LinkedHashSet;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.rotuma;

/* JADX INFO: compiled from: LruCache.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0007J\u0017\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\nJ1\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00012\b\u0010\u0014\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0017\u0010\nJ\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u001d\u0010\u0019R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R0\u0010%\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010$R$\u0010)\u001a\u0012\u0012\u0004\u0012\u00028\u00000&j\b\u0012\u0004\u0012\u00028\u0000`'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010(R$\u0010.\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00048G@BX\u0086\u000e¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010+R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010+R\u0016\u00100\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010+R\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010+R\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010+R\u0016\u00103\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010+¨\u00064"}, d2 = {"Ldent/saneness;", "K", "V", "", "", "maxSize", "<init>", "(I)V", X3.i.W, "wireman", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "marial", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "cutely", "beachfront", "", "evicted", "oldValue", "newValue", "dern", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "saneness", "taiyuan", "(Ljava/lang/Object;Ljava/lang/Object;)I", "", "toString", "()Ljava/lang/String;", "competently", "Lcultivated/impromptu;", "attabal", "Lcultivated/impromptu;", "monitor", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "map", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "Ljava/util/LinkedHashSet;", "keySet", "<set-?>", "I", "impromptu", "()I", "size", "putCount", "createCount", "evictionCount", "hitCount", "missCount", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class saneness<K, V> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final impromptu monitor = competently.attabal();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public int putCount;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public int createCount;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public int missCount;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final LinkedHashSet<K> keySet;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public int evictionCount;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public int maxSize;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final HashMap<K, V> map;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public int hitCount;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public int size;

    public saneness(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.maxSize = i;
        this.map = new HashMap<>(0, 0.75f);
        this.keySet = new LinkedHashSet<>();
    }

    public final V beachfront(K key) {
        V vRemove;
        key.getClass();
        synchronized (this.monitor) {
            try {
                vRemove = this.map.remove(key);
                this.keySet.remove(key);
                if (vRemove != null) {
                    this.size = impromptu() - competently(key, vRemove);
                }
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vRemove != null) {
            dern(false, key, vRemove, null);
        }
        return vRemove;
    }

    public final int competently(K key, V value) {
        int iTaiyuan = taiyuan(key, value);
        if (iTaiyuan >= 0) {
            return iTaiyuan;
        }
        throw new IllegalStateException(("Negative size: " + key + '=' + value).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void cutely(int maxSize) {
        Object objCoffeecake;
        V v;
        while (true) {
            synchronized (this.monitor) {
                try {
                    if (impromptu() >= 0 && (!this.map.isEmpty() || impromptu() == 0)) {
                        if (this.map.isEmpty() != this.keySet.isEmpty()) {
                            break;
                        }
                        if (impromptu() <= maxSize || this.map.isEmpty()) {
                            objCoffeecake = null;
                            v = null;
                        } else {
                            objCoffeecake = CollectionsKt.coffeecake(this.keySet);
                            v = this.map.get(objCoffeecake);
                            if (v == null) {
                                throw new IllegalStateException("inconsistent state");
                            }
                            rotuma.wireman(this.map).remove(objCoffeecake);
                            rotuma.attabal(this.keySet).remove(objCoffeecake);
                            int iImpromptu = impromptu();
                            Intrinsics.beachfront(objCoffeecake);
                            Intrinsics.beachfront(v);
                            this.size = iImpromptu - competently(objCoffeecake, v);
                            this.evictionCount++;
                        }
                        Unit unit = Unit.f29295attabal;
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (objCoffeecake == null && v == null) {
                return;
            }
            Intrinsics.beachfront(objCoffeecake);
            Intrinsics.beachfront(v);
            dern(true, objCoffeecake, v, null);
        }
        throw new IllegalStateException("map/keySet size inconsistency");
    }

    public final int impromptu() {
        int i;
        synchronized (this.monitor) {
            i = this.size;
        }
        return i;
    }

    public final V marial(K key, V value) {
        V vPut;
        if (key == null || value == null) {
            throw null;
        }
        synchronized (this.monitor) {
            try {
                this.putCount++;
                this.size = impromptu() + competently(key, value);
                vPut = this.map.put(key, value);
                if (vPut != null) {
                    this.size = impromptu() - competently(key, vPut);
                }
                if (this.keySet.contains(key)) {
                    this.keySet.remove(key);
                }
                this.keySet.add(key);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vPut != null) {
            dern(false, key, vPut, value);
        }
        cutely(this.maxSize);
        return vPut;
    }

    public V saneness(K key) {
        return null;
    }

    public int taiyuan(K key, V value) {
        return 1;
    }

    public String toString() {
        String str;
        synchronized (this.monitor) {
            try {
                int i = this.hitCount;
                int i2 = this.missCount + i;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final V wireman(K key) {
        synchronized (this.monitor) {
            V v = this.map.get(key);
            if (v != null) {
                this.keySet.remove(key);
                this.keySet.add(key);
                this.hitCount++;
                return v;
            }
            this.missCount++;
            V vSaneness = saneness(key);
            if (vSaneness == null) {
                return null;
            }
            synchronized (this.monitor) {
                try {
                    this.createCount++;
                    V vPut = this.map.put(key, vSaneness);
                    this.keySet.remove(key);
                    this.keySet.add(key);
                    if (vPut != null) {
                        this.map.put(key, vPut);
                        v = vPut;
                    } else {
                        this.size = impromptu() + competently(key, vSaneness);
                    }
                    Unit unit = Unit.f29295attabal;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (v != null) {
                dern(false, key, vSaneness, v);
                return v;
            }
            cutely(this.maxSize);
            return vSaneness;
        }
    }

    public void dern(boolean evicted, K key, V oldValue, V newValue) {
    }
}
