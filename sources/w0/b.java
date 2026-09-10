package w0;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.n;
import xj.b0;
import xj.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f52735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final na.g f52736b;

    public b(LinkedHashMap linkedHashMap, boolean z10) {
        this.f52735a = linkedHashMap;
        this.f52736b = new na.g(z10);
    }

    public final Map a() {
        wj.f fVar;
        Set<Map.Entry> setEntrySet = this.f52735a.entrySet();
        int iO = b0.O(p.W(setEntrySet, 10));
        if (iO < 16) {
            iO = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iO);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                n.e(bArrCopyOf, "copyOf(this, size)");
                fVar = new wj.f(key, bArrCopyOf);
            } else {
                fVar = new wj.f(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(fVar.f53283a, fVar.f53284b);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        n.e(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.f52736b.f46631b).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(d key) {
        n.f(key, "key");
        Object obj = this.f52735a.get(key);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        n.e(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public final void d(d key) {
        n.f(key, "key");
        b();
        this.f52735a.remove(key);
    }

    public final void e(d key, Object obj) {
        n.f(key, "key");
        f(key, obj);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    public final boolean equals(Object obj) {
        boolean zA;
        if (obj instanceof b) {
            LinkedHashMap linkedHashMap = ((b) obj).f52735a;
            LinkedHashMap linkedHashMap2 = this.f52735a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    zA = n.a(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    zA = true;
                                } else {
                                    zA = false;
                                }
                            } else {
                                zA = false;
                            }
                            if (!zA) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void f(d key, Object obj) {
        n.f(key, "key");
        b();
        if (obj == null) {
            d(key);
            return;
        }
        boolean z10 = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.f52735a;
        if (z10) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(xj.n.R0((Set) obj));
            n.e(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
            linkedHashMap.put(key, setUnmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                linkedHashMap.put(key, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            n.e(bArrCopyOf, "copyOf(this, size)");
            linkedHashMap.put(key, bArrCopyOf);
        }
    }

    public final int hashCode() {
        Iterator it = this.f52735a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return xj.n.u0(this.f52735a.entrySet(), ",\n", "{\n", "\n}", a.f52734e, 24);
    }

    public /* synthetic */ b(boolean z10) {
        this(new LinkedHashMap(), z10);
    }
}
