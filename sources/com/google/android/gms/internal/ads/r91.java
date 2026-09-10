package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r91 extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f19483j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Object f19484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int[] f19485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Object[] f19486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Object[] f19487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int f19488e = Math.min(Math.max(3, 1), 1073741823);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient int f19489f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient o91 f19490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient o91 f19491h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient j91 f19492i;

    public r91() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (i()) {
            return;
        }
        this.f19488e += 32;
        Map mapJ = j();
        if (mapJ != null) {
            this.f19488e = Math.min(Math.max(size(), 3), 1073741823);
            mapJ.clear();
            this.f19484a = null;
            this.f19489f = 0;
            return;
        }
        Arrays.fill(g(), 0, this.f19489f, (Object) null);
        Arrays.fill(h(), 0, this.f19489f, (Object) null);
        Object obj = this.f19484a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(d(), 0, this.f19489f, 0);
        this.f19489f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapJ = j();
        if (mapJ != null) {
            return mapJ.containsKey(obj);
        }
        return o(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapJ = j();
        if (mapJ != null) {
            return mapJ.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f19489f; i10++) {
            if (Objects.equals(obj, h()[i10])) {
                return true;
            }
        }
        return false;
    }

    public final int[] d() {
        int[] iArr = this.f19485b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        o91 o91Var = this.f19491h;
        if (o91Var != null) {
            return o91Var;
        }
        o91 o91Var2 = new o91(this, 0);
        this.f19491h = o91Var2;
        return o91Var2;
    }

    public final Object[] g() {
        Object[] objArr = this.f19486c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapJ = j();
        if (mapJ != null) {
            return mapJ.get(obj);
        }
        int iO = o(obj);
        if (iO == -1) {
            return null;
        }
        return h()[iO];
    }

    public final Object[] h() {
        Object[] objArr = this.f19487d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final boolean i() {
        return this.f19484a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Map j() {
        Object obj = this.f19484a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void k(int i10, int i11) {
        Object obj = this.f19484a;
        Objects.requireNonNull(obj);
        int[] iArrD = d();
        Object[] objArrG = g();
        Object[] objArrH = h();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrG[i10] = null;
            objArrH[i10] = null;
            iArrD[i10] = 0;
            return;
        }
        int i13 = i10 + 1;
        Object obj2 = objArrG[i12];
        objArrG[i10] = obj2;
        objArrH[i10] = objArrH[i12];
        objArrG[i12] = null;
        objArrH[i12] = null;
        iArrD[i10] = iArrD[i12];
        iArrD[i12] = 0;
        int iM = dv.m(obj2) & i11;
        int iP = pi1.p(iM, obj);
        if (iP == size) {
            pi1.A(iM, i13, obj);
            return;
        }
        while (true) {
            int i14 = iP - 1;
            int i15 = iArrD[i14];
            int i16 = i15 & i11;
            if (i16 == size) {
                iArrD[i14] = ((~i11) & i15) | (i13 & i11);
                return;
            }
            iP = i16;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        o91 o91Var = this.f19490g;
        if (o91Var != null) {
            return o91Var;
        }
        o91 o91Var2 = new o91(this, 1);
        this.f19490g = o91Var2;
        return o91Var2;
    }

    public final int l() {
        return (1 << (this.f19488e & 31)) - 1;
    }

    public final int m(int i10, int i11, int i12, int i13) {
        int i14 = i11 - 1;
        Object objE = pi1.e(i11);
        if (i13 != 0) {
            pi1.A(i12 & i14, i13 + 1, objE);
        }
        Object obj = this.f19484a;
        Objects.requireNonNull(obj);
        int[] iArrD = d();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iP = pi1.p(i15, obj);
            while (iP != 0) {
                int i16 = iP - 1;
                int i17 = iArrD[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int iP2 = pi1.p(i19, objE);
                pi1.A(i19, iP, objE);
                iArrD[i16] = ((~i14) & i18) | (iP2 & i14);
                iP = i17 & i10;
            }
        }
        this.f19484a = objE;
        this.f19488e = ((32 - Integer.numberOfLeadingZeros(i14)) & 31) | (this.f19488e & (-32));
        return i14;
    }

    public final int o(Object obj) {
        if (i()) {
            return -1;
        }
        int iM = dv.m(obj);
        int iL = l();
        Object obj2 = this.f19484a;
        Objects.requireNonNull(obj2);
        int iP = pi1.p(iM & iL, obj2);
        if (iP != 0) {
            int i10 = ~iL;
            int i11 = iM & i10;
            do {
                int i12 = iP - 1;
                int i13 = d()[i12];
                if ((i13 & i10) == i11 && Objects.equals(obj, g()[i12])) {
                    return i12;
                }
                iP = i13 & iL;
            } while (iP != 0);
        }
        return -1;
    }

    public final Object p(Object obj) {
        if (!i()) {
            int iL = l();
            Object obj2 = this.f19484a;
            Objects.requireNonNull(obj2);
            int iD = pi1.D(obj, null, iL, obj2, d(), g(), null);
            if (iD != -1) {
                Object obj3 = h()[iD];
                k(iD, iL);
                this.f19489f--;
                this.f19488e += 32;
                return obj3;
            }
        }
        return f19483j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i10;
        int i11 = 32;
        if (i()) {
            ps1.d0("Arrays already allocated", i());
            int i12 = this.f19488e;
            int iMax = Math.max(i12 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f19484a = pi1.e(iMax2);
            this.f19488e = ((32 - Integer.numberOfLeadingZeros(iMax2 - 1)) & 31) | (this.f19488e & (-32));
            this.f19485b = new int[i12];
            this.f19486c = new Object[i12];
            this.f19487d = new Object[i12];
        }
        Map mapJ = j();
        if (mapJ != null) {
            return mapJ.put(obj, obj2);
        }
        int[] iArrD = d();
        Object[] objArrG = g();
        Object[] objArrH = h();
        int i13 = this.f19489f;
        int i14 = i13 + 1;
        int iM = dv.m(obj);
        int iL = l();
        int i15 = iM & iL;
        Object obj3 = this.f19484a;
        Objects.requireNonNull(obj3);
        int iP = pi1.p(i15, obj3);
        if (iP == 0) {
            if (i14 > iL) {
                iL = m(iL, (iL + 1) * (iL < 32 ? 4 : 2), iM, i13);
            } else {
                Object obj4 = this.f19484a;
                Objects.requireNonNull(obj4);
                pi1.A(i15, i14, obj4);
            }
            i10 = 1;
        } else {
            int i16 = ~iL;
            int i17 = iM & i16;
            int i18 = 0;
            while (true) {
                int i19 = iP - 1;
                int i20 = iArrD[i19];
                i10 = 1;
                int i21 = i20 & i16;
                int i22 = i11;
                if (i21 == i17 && Objects.equals(obj, objArrG[i19])) {
                    Object obj5 = objArrH[i19];
                    objArrH[i19] = obj2;
                    return obj5;
                }
                int i23 = i20 & iL;
                int i24 = i18 + 1;
                if (i23 == 0) {
                    if (i24 < 9) {
                        if (i14 <= iL) {
                            iArrD[i19] = (i14 & iL) | i21;
                            break;
                        }
                        iL = m(iL, (iL + 1) * (iL < i22 ? 4 : 2), iM, i13);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(l() + 1, 1.0f);
                    int i25 = isEmpty() ? -1 : 0;
                    while (i25 >= 0) {
                        linkedHashMap.put(g()[i25], h()[i25]);
                        int i26 = i25 + 1;
                        i25 = i26 < this.f19489f ? i26 : -1;
                    }
                    this.f19484a = linkedHashMap;
                    this.f19485b = null;
                    this.f19486c = null;
                    this.f19487d = null;
                    this.f19488e += 32;
                    return linkedHashMap.put(obj, obj2);
                }
                i18 = i24;
                iP = i23;
                i11 = i22;
            }
        }
        int length = d().length;
        if (i14 > length) {
            int i27 = i10;
            int iMin = Math.min(1073741823, (Math.max(i27, length >>> 1) + length) | i27);
            if (iMin != length) {
                this.f19485b = Arrays.copyOf(d(), iMin);
                this.f19486c = Arrays.copyOf(g(), iMin);
                this.f19487d = Arrays.copyOf(h(), iMin);
            }
        }
        d()[i13] = (~iL) & iM;
        g()[i13] = obj;
        h()[i13] = obj2;
        this.f19489f = i14;
        this.f19488e += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapJ = j();
        if (mapJ != null) {
            return mapJ.remove(obj);
        }
        Object objP = p(obj);
        if (objP == f19483j) {
            return null;
        }
        return objP;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapJ = j();
        return mapJ != null ? mapJ.size() : this.f19489f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        j91 j91Var = this.f19492i;
        if (j91Var != null) {
            return j91Var;
        }
        j91 j91Var2 = new j91(1, this);
        this.f19492i = j91Var2;
        return j91Var2;
    }

    public r91(int i10) {
    }
}
