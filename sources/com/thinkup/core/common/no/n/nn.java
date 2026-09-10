package com.thinkup.core.common.no.n;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class nn extends AbstractList<om> implements RandomAccess {
    final int[] m;
    final om[] o;

    private nn(om[] omVarArr, int[] iArr) {
        this.o = omVarArr;
        this.m = iArr;
    }

    public static nn o(om... omVarArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(omVarArr));
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(-1);
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList2.set(Collections.binarySearch(arrayList, omVarArr[i3]), Integer.valueOf(i3));
        }
        if (((om) arrayList.get(0)).mm() == 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i4 = 0;
        while (i4 < arrayList.size()) {
            om omVar = (om) arrayList.get(i4);
            int i5 = i4 + 1;
            int i6 = i5;
            while (i6 < arrayList.size()) {
                om omVar2 = (om) arrayList.get(i6);
                if (!omVar2.n(omVar)) {
                    break;
                }
                if (omVar2.mm() == omVar.mm()) {
                    throw new IllegalArgumentException("duplicate option: ".concat(String.valueOf(omVar2)));
                }
                if (((Integer) arrayList2.get(i6)).intValue() > ((Integer) arrayList2.get(i4)).intValue()) {
                    arrayList.remove(i6);
                    arrayList2.remove(i6);
                } else {
                    i6++;
                }
            }
            i4 = i5;
        }
        n nVar = new n();
        o(0L, nVar, 0, arrayList, 0, arrayList.size(), arrayList2);
        int iO = o(nVar);
        int[] iArr = new int[iO];
        for (int i7 = 0; i7 < iO; i7++) {
            iArr[i7] = nVar.no();
        }
        if (nVar.on()) {
            return new nn((om[]) omVarArr.clone(), iArr);
        }
        throw new AssertionError();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        return this.o[i2];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.o.length;
    }

    private static void o(long j, n nVar, int i2, List<om> list, int i3, int i4, List<Integer> list2) {
        int i5;
        int i6;
        long j2;
        int i7;
        List<Integer> list3;
        long j3;
        int i8;
        List<om> list4 = list;
        List<Integer> list5 = list2;
        if (i3 < i4) {
            for (int i9 = i3; i9 < i4; i9++) {
                if (list4.get(i9).mm() < i2) {
                    throw new AssertionError();
                }
            }
            om omVar = list.get(i3);
            om omVar2 = list4.get(i4 - 1);
            if (i2 == omVar.mm()) {
                int iIntValue = list5.get(i3).intValue();
                int i10 = i3 + 1;
                om omVar3 = list4.get(i10);
                i5 = i10;
                i6 = iIntValue;
                omVar = omVar3;
            } else {
                i5 = i3;
                i6 = -1;
            }
            long j4 = 2;
            if (omVar.m(i2) != omVar2.m(i2)) {
                int i11 = 1;
                for (int i12 = i5 + 1; i12 < i4; i12++) {
                    if (list4.get(i12 - 1).m(i2) != list4.get(i12).m(i2)) {
                        i11++;
                    }
                }
                long jO = j + ((long) o(nVar)) + 2 + ((long) (i11 * 2));
                nVar.mo(i11);
                nVar.mo(i6);
                for (int i13 = i5; i13 < i4; i13++) {
                    byte bM = list4.get(i13).m(i2);
                    if (i13 == i5 || bM != list4.get(i13 - 1).m(i2)) {
                        nVar.mo(bM & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    }
                }
                n nVar2 = new n();
                int i14 = i5;
                while (i14 < i4) {
                    byte bM2 = list4.get(i14).m(i2);
                    int i15 = i14 + 1;
                    int i16 = i15;
                    while (true) {
                        if (i16 >= i4) {
                            i16 = i4;
                            break;
                        } else if (bM2 != list4.get(i16).m(i2)) {
                            break;
                        } else {
                            i16++;
                        }
                    }
                    if (i15 == i16 && i2 + 1 == list4.get(i14).mm()) {
                        nVar.mo(list5.get(i14).intValue());
                        list3 = list5;
                        j3 = jO;
                        i8 = i16;
                    } else {
                        nVar.mo((int) ((((long) o(nVar2)) + jO) * (-1)));
                        list3 = list5;
                        j3 = jO;
                        i8 = i16;
                        o(j3, nVar2, i2 + 1, list, i14, i8, list3);
                        list4 = list;
                    }
                    jO = j3;
                    i14 = i8;
                    list5 = list3;
                }
                nVar.o(nVar2, nVar2.f42084n);
                return;
            }
            int iMin = Math.min(omVar.mm(), omVar2.mm());
            int i17 = 0;
            int i18 = i2;
            while (true) {
                if (i18 >= iMin) {
                    j2 = j4;
                    break;
                }
                j2 = j4;
                if (omVar.m(i18) != omVar2.m(i18)) {
                    break;
                }
                i17++;
                i18++;
                j4 = j2;
            }
            long jO2 = j + ((long) o(nVar)) + j2 + ((long) i17) + 1;
            nVar.mo(-i17);
            nVar.mo(i6);
            int i19 = i2;
            while (true) {
                i7 = i2 + i17;
                if (i19 >= i7) {
                    break;
                }
                nVar.mo(omVar.m(i19) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                i19++;
            }
            if (i5 + 1 == i4) {
                if (i7 == list4.get(i5).mm()) {
                    nVar.mo(list5.get(i5).intValue());
                    return;
                }
                throw new AssertionError();
            }
            n nVar3 = new n();
            nVar.mo((int) ((((long) o(nVar3)) + jO2) * (-1)));
            o(jO2, nVar3, i7, list4, i5, i4, list5);
            nVar.o(nVar3, nVar3.f42084n);
            return;
        }
        throw new AssertionError();
    }

    private om o(int i2) {
        return this.o[i2];
    }

    private static int o(n nVar) {
        return (int) (nVar.f42084n / 4);
    }
}
