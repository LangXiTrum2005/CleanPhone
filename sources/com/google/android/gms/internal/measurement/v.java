package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends AbstractMap {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t f24052f = new t(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f24053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f24054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f24055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f24056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f24057e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.v, java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.measurement.v] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public v(v vVar, v vVar2) {
        Object obj;
        Object[] objArr;
        ?? abstractMap = new AbstractMap();
        abstractMap.f24055c = new u(abstractMap, -1);
        abstractMap.f24056d = null;
        abstractMap.f24057e = null;
        int size = vVar2.size() + vVar.size();
        int i10 = vVar.f24054b[vVar.size()] + vVar2.f24054b[vVar2.size()];
        int i11 = size + 1;
        Object[] objArr2 = new Object[i10];
        int[] iArr = new int[i11];
        int i12 = 0;
        iArr[0] = size;
        Map.Entry entryC = vVar.c(0);
        Map.Entry entryC2 = vVar2.c(0);
        int i13 = 0;
        int i14 = 0;
        int iA = size;
        int i15 = 0;
        while (true) {
            if (entryC == null && entryC2 == null) {
                break;
            }
            i15++;
            if (entryC != null) {
                if (entryC2 != null) {
                    int iCompareTo = ((String) entryC.getKey()).compareTo((String) entryC2.getKey());
                    if (iCompareTo == 0) {
                        int i16 = i13 + 1;
                        int i17 = i14 + 1;
                        objArr2[i15] = new AbstractMap.SimpleImmutableEntry((String) entryC.getKey(), new u(abstractMap, i15));
                        u uVar = (u) entryC.getValue();
                        u uVar2 = (u) entryC2.getValue();
                        int i18 = 0;
                        int i19 = 0;
                        abstractMap = abstractMap;
                        while (true) {
                            int iH = uVar.h();
                            v vVar3 = uVar.f24003b;
                            if (i18 >= iH - uVar.b() && i19 >= uVar2.h() - uVar2.b()) {
                                break;
                            }
                            int iCompare = i18 == uVar.h() - uVar.b() ? 1 : i19 == uVar2.h() - uVar2.b() ? -1 : 0;
                            if (iCompare == 0) {
                                t tVar = w.f24102b;
                                iCompare = w.f24102b.compare(vVar3.f24053a[uVar.b() + i18], uVar2.f24003b.f24053a[uVar2.b() + i19]);
                            }
                            if (iCompare < 0) {
                                i18++;
                                obj = vVar3.f24053a[uVar.b() + i18];
                            } else {
                                int i20 = i19 + 1;
                                Object obj2 = uVar2.f24003b.f24053a[uVar2.b() + i19];
                                if (iCompare == 0) {
                                    i19 = i20;
                                    obj = obj2;
                                    i18++;
                                } else {
                                    i19 = i20;
                                    obj = obj2;
                                    i18 = i18;
                                }
                            }
                            objArr2[iA] = obj;
                            abstractMap = this;
                            iA++;
                        }
                        iArr[i15] = iA;
                        entryC = vVar.c(i17);
                        entryC2 = vVar2.c(i16);
                        i14 = i17;
                        i13 = i16;
                        i12 = 0;
                    } else {
                        if (iCompareTo < 0) {
                        }
                        i12 = 0;
                        abstractMap = this;
                    }
                }
                i14++;
                iA = a(entryC, i15, iA, objArr2, iArr);
                entryC = vVar.c(i14);
                i12 = 0;
                abstractMap = this;
            }
            Map.Entry entry = entryC;
            i13++;
            int iA2 = a(entryC2, i15, iA, objArr2, iArr);
            entryC2 = vVar2.c(i13);
            iA = iA2;
            entryC = entry;
            i12 = 0;
            abstractMap = this;
        }
        int i21 = iArr[i12];
        int i22 = i21 - i15;
        if (i22 != 0) {
            for (int i23 = i12; i23 <= i15; i23++) {
                iArr[i23] = iArr[i23] - i22;
            }
            int i24 = iArr[i15];
            int i25 = i24 - i15;
            if (b(i10, i24)) {
                objArr = new Object[i24];
                System.arraycopy(objArr2, i12, objArr, i12, i15);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i21, objArr, i15, i25);
            objArr2 = objArr;
        }
        abstractMap.f24053a = objArr2;
        int i26 = iArr[i12] + 1;
        abstractMap.f24054b = b(i11, i26) ? Arrays.copyOf(iArr, i26) : iArr;
    }

    public static boolean b(int i10, int i11) {
        return i10 > 16 && i10 * 9 > i11 * 10;
    }

    public final int a(Map.Entry entry, int i10, int i11, Object[] objArr, int[] iArr) {
        u uVar = (u) entry.getValue();
        int iH = uVar.h() - uVar.b();
        System.arraycopy(uVar.f24003b.f24053a, uVar.b(), objArr, i11, iH);
        objArr[i10] = new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), new u(this, i10));
        int i12 = i11 + iH;
        iArr[i10 + 1] = i12;
        return i12;
    }

    public final Map.Entry c(int i10) {
        if (i10 < this.f24054b[0]) {
            return (Map.Entry) this.f24053a[i10];
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.f24055c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.f24056d == null) {
            this.f24056d = Integer.valueOf(super.hashCode());
        }
        return this.f24056d.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.f24057e == null) {
            this.f24057e = super.toString();
        }
        return this.f24057e;
    }

    public v() {
        List list = Collections.EMPTY_LIST;
        this.f24055c = new u(this, -1);
        this.f24056d = null;
        this.f24057e = null;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                int[] iArr = {0};
                this.f24053a = b(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                this.f24054b = iArr;
                return;
            }
            throw f2.j(it2);
        }
        throw f2.j(it);
    }
}
