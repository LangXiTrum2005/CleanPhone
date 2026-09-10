package cn;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class m1 implements b1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6742b = AtomicIntegerFieldUpdater.newUpdater(m1.class, "_isCompleting$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6743c = AtomicReferenceFieldUpdater.newUpdater(m1.class, Object.class, "_rootCause$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6744d = AtomicReferenceFieldUpdater.newUpdater(m1.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f6745a;

    public m1(t1 t1Var, Throwable th2) {
        this.f6745a = t1Var;
        this._rootCause$volatile = th2;
    }

    public final void a(Throwable th2) {
        Throwable thC = c();
        if (thC == null) {
            f6743c.set(this, th2);
            return;
        }
        if (th2 == thC) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6744d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th2);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th2);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th2 == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th2);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    @Override // cn.b1
    public final t1 b() {
        return this.f6745a;
    }

    public final Throwable c() {
        return (Throwable) f6743c.get(this);
    }

    public final boolean d() {
        return c() != null;
    }

    public final ArrayList e(Throwable th2) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6744d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable thC = c();
        if (thC != null) {
            arrayList.add(0, thC);
        }
        if (th2 != null && !th2.equals(thC)) {
            arrayList.add(th2);
        }
        atomicReferenceFieldUpdater.set(this, d0.f6695h);
        return arrayList;
    }

    @Override // cn.b1
    public final boolean isActive() {
        return c() == null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Finishing[cancelling=");
        sb2.append(d());
        sb2.append(", completing=");
        sb2.append(f6742b.get(this) == 1);
        sb2.append(", rootCause=");
        sb2.append(c());
        sb2.append(", exceptions=");
        sb2.append(f6744d.get(this));
        sb2.append(", list=");
        sb2.append(this.f6745a);
        sb2.append(']');
        return sb2.toString();
    }
}
