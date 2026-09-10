package h2;

import an.h;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import go.k;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import kotlin.jvm.internal.n;
import oa.f0;
import oa.j0;
import oa.n1;
import oa.q;
import xn.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f42079a;

    public d(int i10) {
        this.f42079a = new ArrayList(i10);
    }

    @Override // h2.a
    public j0 a(long j10) {
        int iJ = j(j10);
        if (iJ == 0) {
            f0 f0Var = j0.f47265b;
            return n1.f47281e;
        }
        k3.a aVar = (k3.a) this.f42079a.get(iJ - 1);
        long j11 = aVar.f44271d;
        if (j11 == C.TIME_UNSET || j10 < j11) {
            return aVar.f44268a;
        }
        f0 f0Var2 = j0.f47265b;
        return n1.f47281e;
    }

    @Override // h2.a
    public long b(long j10) {
        ArrayList arrayList = this.f42079a;
        if (arrayList.isEmpty() || j10 < ((k3.a) arrayList.get(0)).f44269b) {
            return C.TIME_UNSET;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            long j11 = ((k3.a) arrayList.get(i10)).f44269b;
            if (j10 == j11) {
                return j11;
            }
            if (j10 < j11) {
                k3.a aVar = (k3.a) arrayList.get(i10 - 1);
                long j12 = aVar.f44271d;
                return (j12 == C.TIME_UNSET || j12 > j10) ? aVar.f44269b : j12;
            }
        }
        k3.a aVar2 = (k3.a) q.k(arrayList);
        long j13 = aVar2.f44271d;
        return (j13 == C.TIME_UNSET || j10 < j13) ? aVar2.f44269b : j13;
    }

    @Override // h2.a
    public long c(long j10) {
        ArrayList arrayList = this.f42079a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j10 < ((k3.a) arrayList.get(0)).f44269b) {
            return ((k3.a) arrayList.get(0)).f44269b;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            k3.a aVar = (k3.a) arrayList.get(i10);
            long j11 = aVar.f44269b;
            long j12 = aVar.f44269b;
            if (j10 < j11) {
                long j13 = ((k3.a) arrayList.get(i10 - 1)).f44271d;
                return (j13 == C.TIME_UNSET || j13 <= j10 || j13 >= j12) ? j12 : j13;
            }
        }
        long j14 = ((k3.a) q.k(arrayList)).f44271d;
        if (j14 == C.TIME_UNSET || j10 >= j14) {
            return Long.MIN_VALUE;
        }
        return j14;
    }

    @Override // h2.a
    public void clear() {
        this.f42079a.clear();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    @Override // h2.a
    public boolean d(k3.a aVar, long j10) {
        boolean z10;
        long j11 = aVar.f44269b;
        k.i(j11 != C.TIME_UNSET);
        if (j11 <= j10) {
            long j12 = aVar.f44271d;
            if (j12 == C.TIME_UNSET || j10 < j12) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        ArrayList arrayList = this.f42079a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j11 >= ((k3.a) arrayList.get(size)).f44269b) {
                arrayList.add(size + 1, aVar);
                return z10;
            }
            if (((k3.a) arrayList.get(size)).f44269b <= j10) {
                z10 = false;
            }
        }
        arrayList.add(0, aVar);
        return z10;
    }

    @Override // h2.a
    public void e(long j10) {
        int iJ = j(j10);
        if (iJ == 0) {
            return;
        }
        ArrayList arrayList = this.f42079a;
        long j11 = ((k3.a) arrayList.get(iJ - 1)).f44271d;
        if (j11 == C.TIME_UNSET || j11 >= j10) {
            iJ--;
        }
        arrayList.subList(0, iJ).clear();
    }

    public void f(Object obj) {
        this.f42079a.add(obj);
    }

    public void g(String name, String value) {
        n.f(name, "name");
        n.f(value, "value");
        ArrayList arrayList = this.f42079a;
        arrayList.add(name);
        arrayList.add(h.T0(value).toString());
    }

    public void h(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z10 = obj instanceof Object[];
        ArrayList arrayList = this.f42079a;
        if (z10) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            if (!(obj instanceof Iterator)) {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
    }

    public l i() {
        return new l((String[]) this.f42079a.toArray(new String[0]));
    }

    public int j(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f42079a;
            if (i10 >= arrayList.size()) {
                return arrayList.size();
            }
            if (j10 < ((k3.a) arrayList.get(i10)).f44269b) {
                return i10;
            }
            i10++;
        }
    }

    public void k(String str) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f42079a;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i10))) {
                arrayList.remove(i10);
                arrayList.remove(i10);
                i10 -= 2;
            }
            i10 += 2;
        }
    }

    public ShortBuffer l(ShortBuffer shortBuffer) {
        ShortBuffer shortBufferAsShortBuffer;
        int iRemaining = shortBuffer.remaining();
        ArrayList arrayList = this.f42079a;
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (((ShortBuffer) it.next()).capacity() >= iRemaining) {
                break;
            }
            i10++;
        }
        if (i10 >= 0) {
            shortBufferAsShortBuffer = (ShortBuffer) arrayList.remove(i10);
        } else {
            int i11 = iRemaining * 2;
            if (i11 < 1024) {
                i11 = 1024;
            }
            shortBufferAsShortBuffer = ByteBuffer.allocateDirect(i11).order(shortBuffer.order()).asShortBuffer();
        }
        shortBufferAsShortBuffer.put(shortBuffer);
        shortBufferAsShortBuffer.flip();
        return shortBufferAsShortBuffer;
    }

    public d(int i10, boolean z10) {
        switch (i10) {
            case 2:
                this.f42079a = new ArrayList();
                break;
            case 3:
                this.f42079a = new ArrayList();
                break;
            case 4:
                this.f42079a = new ArrayList(20);
                break;
            default:
                this.f42079a = new ArrayList();
                break;
        }
    }
}
