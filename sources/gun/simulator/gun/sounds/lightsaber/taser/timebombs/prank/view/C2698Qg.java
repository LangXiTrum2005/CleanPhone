package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Qg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2698Qg extends AbstractMap implements Serializable {
    public static final Object j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Object f3614a;
    public transient int[] b;
    public transient Object[] c;
    public transient Object[] d;
    public transient int e;
    public transient int f;
    public transient C2594Mg g;
    public transient C2594Mg h;
    public transient C2672Pg i;

    public static C2698Qg a() {
        C2698Qg c2698Qg = new C2698Qg();
        c2698Qg.e = AbstractC2995aW.t(3, 1);
        return c2698Qg;
    }

    public static C2698Qg b(int i) {
        C2698Qg c2698Qg = new C2698Qg();
        if (i < 0) {
            throw new IllegalArgumentException("Expected size must be >= 0");
        }
        c2698Qg.e = AbstractC2995aW.t(i, 1);
        return c2698Qg;
    }

    public final Map c() {
        Object obj = this.f3614a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (h()) {
            return;
        }
        this.e += 32;
        Map mapC = c();
        if (mapC != null) {
            this.e = AbstractC2995aW.t(size(), 3);
            mapC.clear();
            this.f3614a = null;
            this.f = 0;
            return;
        }
        Arrays.fill(k(), 0, this.f, (Object) null);
        Arrays.fill(l(), 0, this.f, (Object) null);
        Object obj = this.f3614a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(j(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.containsKey(obj);
        }
        return f(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (FW.B(obj, l()[i])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.e & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C2594Mg c2594Mg = this.h;
        if (c2594Mg != null) {
            return c2594Mg;
        }
        C2594Mg c2594Mg2 = new C2594Mg(this, 0);
        this.h = c2594Mg2;
        return c2594Mg2;
    }

    public final int f(Object obj) {
        if (h()) {
            return -1;
        }
        int iC0 = FW.c0(obj);
        int iD = d();
        Object obj2 = this.f3614a;
        Objects.requireNonNull(obj2);
        int iE0 = FW.e0(iC0 & iD, obj2);
        if (iE0 == 0) {
            return -1;
        }
        int i = ~iD;
        int i2 = iC0 & i;
        do {
            int i3 = iE0 - 1;
            int i4 = j()[i3];
            if ((i4 & i) == i2 && FW.B(obj, k()[i3])) {
                return i3;
            }
            iE0 = i4 & iD;
        } while (iE0 != 0);
        return -1;
    }

    public final void g(int i, int i2) {
        Object obj = this.f3614a;
        Objects.requireNonNull(obj);
        int[] iArrJ = j();
        Object[] objArrK = k();
        Object[] objArrL = l();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrK[i] = null;
            objArrL[i] = null;
            iArrJ[i] = 0;
            return;
        }
        Object obj2 = objArrK[i3];
        objArrK[i] = obj2;
        objArrL[i] = objArrL[i3];
        objArrK[i3] = null;
        objArrL[i3] = null;
        iArrJ[i] = iArrJ[i3];
        iArrJ[i3] = 0;
        int iC0 = FW.c0(obj2) & i2;
        int iE0 = FW.e0(iC0, obj);
        if (iE0 == size) {
            FW.f0(iC0, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = iE0 - 1;
            int i5 = iArrJ[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArrJ[i4] = FW.M(i5, i + 1, i2);
                return;
            }
            iE0 = i6;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.get(obj);
        }
        int iF = f(obj);
        if (iF == -1) {
            return null;
        }
        return l()[iF];
    }

    public final boolean h() {
        return this.f3614a == null;
    }

    public final Object i(Object obj) {
        boolean zH = h();
        Object obj2 = j;
        if (zH) {
            return obj2;
        }
        int iD = d();
        Object obj3 = this.f3614a;
        Objects.requireNonNull(obj3);
        int iT = FW.T(obj, null, iD, obj3, j(), k(), null);
        if (iT == -1) {
            return obj2;
        }
        Object obj4 = l()[iT];
        g(iT, iD);
        this.f--;
        this.e += 32;
        return obj4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final int[] j() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] k() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C2594Mg c2594Mg = this.g;
        if (c2594Mg != null) {
            return c2594Mg;
        }
        C2594Mg c2594Mg2 = new C2594Mg(this, 1);
        this.g = c2594Mg2;
        return c2594Mg2;
    }

    public final Object[] l() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int m(int i, int i2, int i3, int i4) {
        Object objX = FW.x(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            FW.f0(i3 & i5, i4 + 1, objX);
        }
        Object obj = this.f3614a;
        Objects.requireNonNull(obj);
        int[] iArrJ = j();
        for (int i6 = 0; i6 <= i; i6++) {
            int iE0 = FW.e0(i6, obj);
            while (iE0 != 0) {
                int i7 = iE0 - 1;
                int i8 = iArrJ[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iE1 = FW.e0(i10, objX);
                FW.f0(i10, iE0, objX);
                iArrJ[i7] = FW.M(i9, iE1, i5);
                iE0 = i8 & i;
            }
        }
        this.f3614a = objX;
        this.e = FW.M(this.e, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:45:0x0106 A[LOOP:1: B:42:0x00ef->B:45:0x0106, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ea A[EDGE_INSN: B:66:0x00ea->B:40:0x00ea BREAK  A[LOOP:1: B:42:0x00ef->B:45:0x0106], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0104 -> B:40:0x00ea). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object r21, java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2698Qg.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.remove(obj);
        }
        Object objI = i(obj);
        if (objI == j) {
            return null;
        }
        return objI;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapC = c();
        return mapC != null ? mapC.size() : this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C2672Pg c2672Pg = this.i;
        if (c2672Pg != null) {
            return c2672Pg;
        }
        C2672Pg c2672Pg2 = new C2672Pg(this);
        this.i = c2672Pg2;
        return c2672Pg2;
    }
}
