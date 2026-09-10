package ae;

import com.ironsource.X3;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class p implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f3521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f3522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f3523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p f3524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p f3525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f3526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f3527g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f3528h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3529i;

    public p(boolean z10) {
        this.f3526f = null;
        this.f3527g = z10;
        this.f3525e = this;
        this.f3524d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f3526f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f3528h;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3526f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3528h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f3526f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f3528h;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f3527g) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f3528h;
        this.f3528h = obj;
        return obj2;
    }

    public final String toString() {
        return this.f3526f + X3.j.f27830b + this.f3528h;
    }

    public p(boolean z10, p pVar, Object obj, p pVar2, p pVar3) {
        this.f3521a = pVar;
        this.f3526f = obj;
        this.f3527g = z10;
        this.f3529i = 1;
        this.f3524d = pVar2;
        this.f3525e = pVar3;
        pVar3.f3524d = this;
        pVar2.f3525e = this;
    }
}
