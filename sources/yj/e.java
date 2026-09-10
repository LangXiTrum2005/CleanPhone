package yj;

import com.ironsource.B5;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements Map.Entry, kk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f54418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54420c;

    public e(f map, int i10) {
        n.f(map, "map");
        this.f54418a = map;
        this.f54419b = i10;
        this.f54420c = map.f54429h;
    }

    public final void a() {
        if (this.f54418a.f54429h != this.f54420c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return n.a(entry.getKey(), getKey()) && n.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f54418a.f54422a[this.f54419b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f54418a.f54423b;
        n.c(objArr);
        return objArr[this.f54419b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        f fVar = this.f54418a;
        fVar.h();
        Object[] objArr = fVar.f54423b;
        if (objArr == null) {
            int length = fVar.f54422a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            fVar.f54423b = objArr;
        }
        int i10 = this.f54419b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append(B5.U);
        sb2.append(getValue());
        return sb2.toString();
    }
}
