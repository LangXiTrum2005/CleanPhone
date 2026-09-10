package oa;

import com.google.android.gms.internal.ads.j91;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class u extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f47315j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Object f47316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int[] f47317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Object[] f47318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Object[] f47319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int f47320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient int f47321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient s f47322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient s f47323h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient j91 f47324i;

    public static u d() {
        u uVar = new u();
        uVar.j(3);
        return uVar;
    }

    public static u e(int i10) {
        u uVar = new u();
        uVar.j(i10);
        return uVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i10 = objectInputStream.readInt();
        if (i10 < 0) {
            throw new InvalidObjectException(l1.d.e(i10, "Invalid size: "));
        }
        j(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map mapG = g();
        Iterator it = mapG != null ? mapG.entrySet().iterator() : new r(this, 1);
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (l()) {
            return;
        }
        this.f47320e += 32;
        Map mapG = g();
        if (mapG != null) {
            this.f47320e = Math.min(Math.max(size(), 3), 1073741823);
            mapG.clear();
            this.f47316a = null;
            this.f47321f = 0;
            return;
        }
        Arrays.fill(p(), 0, this.f47321f, (Object) null);
        Arrays.fill(q(), 0, this.f47321f, (Object) null);
        Object obj = this.f47316a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(o(), 0, this.f47321f, 0);
        this.f47321f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapG = g();
        if (mapG != null) {
            return mapG.containsKey(obj);
        }
        return i(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapG = g();
        if (mapG != null) {
            return mapG.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f47321f; i10++) {
            if (d0.c.h(obj, q()[i10])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        s sVar = this.f47323h;
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(this, 0);
        this.f47323h = sVar2;
        return sVar2;
    }

    public final Map g() {
        Object obj = this.f47316a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapG = g();
        if (mapG != null) {
            return mapG.get(obj);
        }
        int i10 = i(obj);
        if (i10 == -1) {
            return null;
        }
        return q()[i10];
    }

    public final int h() {
        return (1 << (this.f47320e & 31)) - 1;
    }

    public final int i(Object obj) {
        if (l()) {
            return -1;
        }
        int iW = q.w(obj);
        int iH = h();
        Object obj2 = this.f47316a;
        Objects.requireNonNull(obj2);
        int iX = q.x(iW & iH, obj2);
        if (iX == 0) {
            return -1;
        }
        int i10 = ~iH;
        int i11 = iW & i10;
        do {
            int i12 = iX - 1;
            int i13 = o()[i12];
            if ((i13 & i10) == i11 && d0.c.h(obj, p()[i12])) {
                return i12;
            }
            iX = i13 & iH;
        } while (iX != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final void j(int i10) {
        go.k.h("Expected size must be >= 0", i10 >= 0);
        this.f47320e = Math.min(Math.max(i10, 1), 1073741823);
    }

    public final void k(int i10, int i11) {
        Object obj = this.f47316a;
        Objects.requireNonNull(obj);
        int[] iArrO = o();
        Object[] objArrP = p();
        Object[] objArrQ = q();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrP[i10] = null;
            objArrQ[i10] = null;
            iArrO[i10] = 0;
            return;
        }
        Object obj2 = objArrP[i12];
        objArrP[i10] = obj2;
        objArrQ[i10] = objArrQ[i12];
        objArrP[i12] = null;
        objArrQ[i12] = null;
        iArrO[i10] = iArrO[i12];
        iArrO[i12] = 0;
        int iW = q.w(obj2) & i11;
        int iX = q.x(iW, obj);
        if (iX == size) {
            q.y(iW, i10 + 1, obj);
            return;
        }
        while (true) {
            int i13 = iX - 1;
            int i14 = iArrO[i13];
            int i15 = i14 & i11;
            if (i15 == size) {
                iArrO[i13] = q.q(i14, i10 + 1, i11);
                return;
            }
            iX = i15;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        s sVar = this.f47322g;
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(this, 1);
        this.f47322g = sVar2;
        return sVar2;
    }

    public final boolean l() {
        return this.f47316a == null;
    }

    public final Object m(Object obj) {
        if (!l()) {
            int iH = h();
            Object obj2 = this.f47316a;
            Objects.requireNonNull(obj2);
            int iS = q.s(obj, null, iH, obj2, o(), p(), null);
            if (iS != -1) {
                Object obj3 = q()[iS];
                k(iS, iH);
                this.f47321f--;
                this.f47320e += 32;
                return obj3;
            }
        }
        return f47315j;
    }

    public final int[] o() {
        int[] iArr = this.f47317b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] p() {
        Object[] objArr = this.f47318c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:42:0x0100 A[LOOP:1: B:39:0x00e9->B:42:0x0100, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e4 A[EDGE_INSN: B:63:0x00e4->B:37:0x00e4 BREAK  A[LOOP:1: B:39:0x00e9->B:42:0x0100], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00fe -> B:37:0x00e4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object r23, java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oa.u.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final Object[] q() {
        Object[] objArr = this.f47319d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int r(int i10, int i11, int i12, int i13) {
        Object objE = q.e(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            q.y(i12 & i14, i13 + 1, objE);
        }
        Object obj = this.f47316a;
        Objects.requireNonNull(obj);
        int[] iArrO = o();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iX = q.x(i15, obj);
            while (iX != 0) {
                int i16 = iX - 1;
                int i17 = iArrO[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int iX2 = q.x(i19, objE);
                q.y(i19, iX, objE);
                iArrO[i16] = q.q(i18, iX2, i14);
                iX = i17 & i10;
            }
        }
        this.f47316a = objE;
        this.f47320e = q.q(this.f47320e, 32 - Integer.numberOfLeadingZeros(i14), 31);
        return i14;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapG = g();
        if (mapG != null) {
            return mapG.remove(obj);
        }
        Object objM = m(obj);
        if (objM == f47315j) {
            return null;
        }
        return objM;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapG = g();
        return mapG != null ? mapG.size() : this.f47321f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        j91 j91Var = this.f47324i;
        if (j91Var != null) {
            return j91Var;
        }
        j91 j91Var2 = new j91(4, this);
        this.f47324i = j91Var2;
        return j91Var2;
    }
}
