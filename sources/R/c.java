package r;

import com.ironsource.X3;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f49207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f49208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f49209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f49210d;

    public c(Object obj, Object obj2) {
        this.f49207a = obj;
        this.f49208b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f49207a.equals(cVar.f49207a) && this.f49208b.equals(cVar.f49208b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f49207a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f49208b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f49208b.hashCode() ^ this.f49207a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f49207a + X3.j.f27830b + this.f49208b;
    }
}
