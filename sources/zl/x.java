package zl;

import androidx.datastore.preferences.protobuf.i1;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class x extends AbstractMap {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f55088f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f55090b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f55091c = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f55092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile i1 f55093e;

    public x(int i10) {
        this.f55089a = i10;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int a(Comparable comparable) {
        int i10;
        int i11;
        int i12;
        int iCompareTo;
        int size = this.f55090b.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = comparable.compareTo(((b0) this.f55090b.get(i12)).f55016a);
                if (iCompareTo < 0) {
                    i13 = i12 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i12;
                    }
                    i10 = i12 + 1;
                }
            }
            i11 = i10 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((b0) this.f55090b.get(i13)).f55016a);
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = comparable.compareTo(((b0) this.f55090b.get(i12)).f55016a);
                    if (iCompareTo < 0) {
                        i13 = i12 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i12;
                        }
                        i10 = i12 + 1;
                    }
                }
                i11 = i10 + 1;
            }
        }
        return -i11;
    }

    public final void b() {
        if (this.f55092d) {
            throw new UnsupportedOperationException();
        }
    }

    public final Iterable c() {
        return this.f55091c.isEmpty() ? a0.f55015b : this.f55091c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f55090b.isEmpty()) {
            this.f55090b.clear();
        }
        if (this.f55091c.isEmpty()) {
            return;
        }
        this.f55091c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f55091c.containsKey(comparable);
    }

    public final SortedMap d() {
        b();
        if (this.f55091c.isEmpty() && !(this.f55091c instanceof TreeMap)) {
            this.f55091c = new TreeMap();
        }
        return (SortedMap) this.f55091c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((b0) this.f55090b.get(iA)).setValue(obj);
        }
        b();
        boolean zIsEmpty = this.f55090b.isEmpty();
        int i10 = this.f55089a;
        if (zIsEmpty && !(this.f55090b instanceof ArrayList)) {
            this.f55090b = new ArrayList(i10);
        }
        int i11 = -(iA + 1);
        if (i11 >= i10) {
            return d().put(comparable, obj);
        }
        if (this.f55090b.size() == i10) {
            b0 b0Var = (b0) this.f55090b.remove(i10 - 1);
            d().put(b0Var.f55016a, b0Var.f55017b);
        }
        this.f55090b.add(i11, new b0(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f55093e == null) {
            this.f55093e = new i1(this, 7);
        }
        return this.f55093e;
    }

    public final Object f(int i10) {
        b();
        Object obj = ((b0) this.f55090b.remove(i10)).f55017b;
        if (!this.f55091c.isEmpty()) {
            Iterator it = d().entrySet().iterator();
            List list = this.f55090b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new b0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((b0) this.f55090b.get(iA)).f55017b : this.f55091c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return f(iA);
        }
        if (this.f55091c.isEmpty()) {
            return null;
        }
        return this.f55091c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f55091c.size() + this.f55090b.size();
    }
}
