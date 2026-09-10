package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.ads.ax1;
import com.google.android.gms.internal.ads.du1;
import com.google.android.gms.internal.consent_sdk.u6;
import com.google.android.gms.internal.measurement.gi;
import com.google.android.gms.internal.measurement.q2;
import com.google.protobuf.z3;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class i1 extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4103b;

    public /* synthetic */ i1(Object obj, int i10) {
        this.f4102a = i10;
        this.f4103b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f4102a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((f1) this.f4103b).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((du1) this.f4103b).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            case 2:
                Map.Entry entry3 = (Map.Entry) obj;
                if (contains(entry3)) {
                    return false;
                }
                ((u6) this.f4103b).put((Comparable) entry3.getKey(), entry3.getValue());
                return true;
            case 3:
                Map.Entry entry4 = (Map.Entry) obj;
                if (contains(entry4)) {
                    return false;
                }
                ((q2) this.f4103b).c((Comparable) entry4.getKey(), entry4.getValue());
                return true;
            case 4:
            case 6:
            default:
                return super.add(obj);
            case 5:
                Map.Entry entry5 = (Map.Entry) obj;
                if (contains(entry5)) {
                    return false;
                }
                ((z3) this.f4103b).put((Comparable) entry5.getKey(), entry5.getValue());
                return true;
            case 7:
                Map.Entry entry6 = (Map.Entry) obj;
                if (contains(entry6)) {
                    return false;
                }
                ((zl.x) this.f4103b).e((Comparable) entry6.getKey(), entry6.getValue());
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f4102a) {
            case 0:
                ((f1) this.f4103b).clear();
                break;
            case 1:
                ((du1) this.f4103b).clear();
                break;
            case 2:
                ((u6) this.f4103b).clear();
                break;
            case 3:
                ((q2) this.f4103b).clear();
                break;
            case 4:
            case 6:
            default:
                super.clear();
                break;
            case 5:
                ((z3) this.f4103b).clear();
                break;
            case 7:
                ((zl.x) this.f4103b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f4102a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((f1) this.f4103b).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((du1) this.f4103b).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj3 != value2) {
                    return obj3 != null && obj3.equals(value2);
                }
                return true;
            case 2:
                Map.Entry entry3 = (Map.Entry) obj;
                Object obj4 = ((u6) this.f4103b).get(entry3.getKey());
                Object value3 = entry3.getValue();
                if (obj4 != value3) {
                    return obj4 != null && obj4.equals(value3);
                }
                return true;
            case 3:
                Map.Entry entry4 = (Map.Entry) obj;
                Object obj5 = ((q2) this.f4103b).get(entry4.getKey());
                Object value4 = entry4.getValue();
                if (obj5 != value4) {
                    return obj5 != null && obj5.equals(value4);
                }
                return true;
            case 4:
            case 6:
            default:
                return super.contains(obj);
            case 5:
                Map.Entry entry5 = (Map.Entry) obj;
                Object obj6 = ((z3) this.f4103b).get(entry5.getKey());
                Object value5 = entry5.getValue();
                return obj6 == value5 || (obj6 != null && obj6.equals(value5));
            case 7:
                Map.Entry entry6 = (Map.Entry) obj;
                Object obj7 = ((zl.x) this.f4103b).get(entry6.getKey());
                Object value6 = entry6.getValue();
                return obj7 == value6 || (obj7 != null && obj7.equals(value6));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f4102a) {
            case 0:
                return new h1((f1) this.f4103b, 0);
            case 1:
                return new h1((du1) this.f4103b);
            case 2:
                return new h1((u6) this.f4103b);
            case 3:
                return new h1((q2) this.f4103b);
            case 4:
                return new ax1(this, 2);
            case 5:
                return new h1((z3) this.f4103b, 4);
            case 6:
                return new x.c((x.e) this.f4103b);
            default:
                return new h1((zl.x) this.f4103b, 5);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f4102a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((f1) this.f4103b).remove(entry.getKey());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((du1) this.f4103b).remove(entry2.getKey());
                return true;
            case 2:
                Map.Entry entry3 = (Map.Entry) obj;
                if (!contains(entry3)) {
                    return false;
                }
                ((u6) this.f4103b).remove(entry3.getKey());
                return true;
            case 3:
                Map.Entry entry4 = (Map.Entry) obj;
                if (!contains(entry4)) {
                    return false;
                }
                ((q2) this.f4103b).remove(entry4.getKey());
                return true;
            case 4:
            case 6:
            default:
                return super.remove(obj);
            case 5:
                Map.Entry entry5 = (Map.Entry) obj;
                if (!contains(entry5)) {
                    return false;
                }
                ((z3) this.f4103b).remove(entry5.getKey());
                return true;
            case 7:
                Map.Entry entry6 = (Map.Entry) obj;
                if (!contains(entry6)) {
                    return false;
                }
                ((zl.x) this.f4103b).remove(entry6.getKey());
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f4102a) {
            case 0:
                return ((f1) this.f4103b).size();
            case 1:
                return ((du1) this.f4103b).size();
            case 2:
                return ((u6) this.f4103b).size();
            case 3:
                return ((q2) this.f4103b).size();
            case 4:
                return ((gi) this.f4103b).f23521e;
            case 5:
                return ((z3) this.f4103b).size();
            case 6:
                return ((x.e) this.f4103b).f53506c;
            default:
                return ((zl.x) this.f4103b).size();
        }
    }
}
