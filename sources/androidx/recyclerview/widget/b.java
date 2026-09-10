package androidx.recyclerview.widget;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f0 f4722d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2.w f4719a = new b2.w(30, 16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f4720b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f4721c = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4724f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f4723e = new t(this);

    public b(f0 f0Var) {
        this.f4722d = f0Var;
    }

    public final boolean a(int i10) {
        ArrayList arrayList = this.f4721c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) arrayList.get(i11);
            int i12 = aVar.f4701a;
            if (i12 != 8) {
                if (i12 == 1) {
                    int i13 = aVar.f4702b;
                    int i14 = aVar.f4704d + i13;
                    while (i13 < i14) {
                        if (f(i13, i11 + 1) == i10) {
                            return true;
                        }
                        i13++;
                    }
                } else {
                    continue;
                }
            } else {
                if (f(aVar.f4704d, i11 + 1) == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        ArrayList arrayList = this.f4721c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f4722d.a((a) arrayList.get(i10));
        }
        k(arrayList);
        this.f4724f = 0;
    }

    public final void c() {
        b();
        ArrayList arrayList = this.f4720b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) arrayList.get(i10);
            int i11 = aVar.f4701a;
            f0 f0Var = this.f4722d;
            if (i11 == 1) {
                f0Var.a(aVar);
                int i12 = aVar.f4702b;
                int i13 = aVar.f4704d;
                RecyclerView recyclerView = f0Var.f4767a;
                recyclerView.offsetPositionRecordsForInsert(i12, i13);
                recyclerView.mItemsAddedOrRemoved = true;
            } else if (i11 == 2) {
                f0Var.a(aVar);
                int i14 = aVar.f4702b;
                int i15 = aVar.f4704d;
                RecyclerView recyclerView2 = f0Var.f4767a;
                recyclerView2.offsetPositionRecordsForRemove(i14, i15, true);
                recyclerView2.mItemsAddedOrRemoved = true;
                recyclerView2.mState.f4751c += i15;
            } else if (i11 == 4) {
                f0Var.a(aVar);
                int i16 = aVar.f4702b;
                int i17 = aVar.f4704d;
                Object obj = aVar.f4703c;
                RecyclerView recyclerView3 = f0Var.f4767a;
                recyclerView3.viewRangeUpdate(i16, i17, obj);
                recyclerView3.mItemsChanged = true;
            } else if (i11 == 8) {
                f0Var.a(aVar);
                int i18 = aVar.f4702b;
                int i19 = aVar.f4704d;
                RecyclerView recyclerView4 = f0Var.f4767a;
                recyclerView4.offsetPositionRecordsForMove(i18, i19);
                recyclerView4.mItemsAddedOrRemoved = true;
            }
        }
        k(arrayList);
        this.f4724f = 0;
    }

    public final void d(a aVar) {
        int i10;
        b2.w wVar;
        int i11 = aVar.f4701a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iL = l(aVar.f4702b, i11);
        int i12 = aVar.f4702b;
        int i13 = aVar.f4701a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + aVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        int i15 = 1;
        while (true) {
            int i16 = aVar.f4704d;
            wVar = this.f4719a;
            if (i14 >= i16) {
                break;
            }
            int iL2 = l((i10 * i14) + aVar.f4702b, aVar.f4701a);
            int i17 = aVar.f4701a;
            if (i17 == 2 ? iL2 != iL : !(i17 == 4 && iL2 == iL + 1)) {
                a aVarH = h(i17, iL, i15, aVar.f4703c);
                e(aVarH, i12);
                aVarH.f4703c = null;
                wVar.e(aVarH);
                if (aVar.f4701a == 4) {
                    i12 += i15;
                }
                i15 = 1;
                iL = iL2;
            } else {
                i15++;
            }
            i14++;
        }
        Object obj = aVar.f4703c;
        aVar.f4703c = null;
        wVar.e(aVar);
        if (i15 > 0) {
            a aVarH2 = h(aVar.f4701a, iL, i15, obj);
            e(aVarH2, i12);
            aVarH2.f4703c = null;
            wVar.e(aVarH2);
        }
    }

    public final void e(a aVar, int i10) {
        f0 f0Var = this.f4722d;
        f0Var.a(aVar);
        RecyclerView recyclerView = f0Var.f4767a;
        int i11 = aVar.f4701a;
        if (i11 != 2) {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            recyclerView.viewRangeUpdate(i10, aVar.f4704d, aVar.f4703c);
            recyclerView.mItemsChanged = true;
            return;
        }
        int i12 = aVar.f4704d;
        recyclerView.offsetPositionRecordsForRemove(i10, i12, true);
        recyclerView.mItemsAddedOrRemoved = true;
        recyclerView.mState.f4751c += i12;
    }

    public final int f(int i10, int i11) {
        ArrayList arrayList = this.f4721c;
        int size = arrayList.size();
        while (i11 < size) {
            a aVar = (a) arrayList.get(i11);
            int i12 = aVar.f4701a;
            if (i12 == 8) {
                int i13 = aVar.f4702b;
                if (i13 == i10) {
                    i10 = aVar.f4704d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (aVar.f4704d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = aVar.f4702b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = aVar.f4704d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += aVar.f4704d;
                }
            }
            i11++;
        }
        return i10;
    }

    public final boolean g() {
        return this.f4720b.size() > 0;
    }

    public final a h(int i10, int i11, int i12, Object obj) {
        a aVar = (a) this.f4719a.g();
        if (aVar != null) {
            aVar.f4701a = i10;
            aVar.f4702b = i11;
            aVar.f4704d = i12;
            aVar.f4703c = obj;
            return aVar;
        }
        a aVar2 = new a();
        aVar2.f4701a = i10;
        aVar2.f4702b = i11;
        aVar2.f4704d = i12;
        aVar2.f4703c = obj;
        return aVar2;
    }

    public final void i(a aVar) {
        this.f4721c.add(aVar);
        int i10 = aVar.f4701a;
        f0 f0Var = this.f4722d;
        if (i10 == 1) {
            int i11 = aVar.f4702b;
            int i12 = aVar.f4704d;
            RecyclerView recyclerView = f0Var.f4767a;
            recyclerView.offsetPositionRecordsForInsert(i11, i12);
            recyclerView.mItemsAddedOrRemoved = true;
            return;
        }
        if (i10 == 2) {
            int i13 = aVar.f4702b;
            int i14 = aVar.f4704d;
            RecyclerView recyclerView2 = f0Var.f4767a;
            recyclerView2.offsetPositionRecordsForRemove(i13, i14, false);
            recyclerView2.mItemsAddedOrRemoved = true;
            return;
        }
        if (i10 == 4) {
            int i15 = aVar.f4702b;
            int i16 = aVar.f4704d;
            Object obj = aVar.f4703c;
            RecyclerView recyclerView3 = f0Var.f4767a;
            recyclerView3.viewRangeUpdate(i15, i16, obj);
            recyclerView3.mItemsChanged = true;
            return;
        }
        if (i10 != 8) {
            throw new IllegalArgumentException("Unknown update op type for " + aVar);
        }
        int i17 = aVar.f4702b;
        int i18 = aVar.f4704d;
        RecyclerView recyclerView4 = f0Var.f4767a;
        recyclerView4.offsetPositionRecordsForMove(i17, i18);
        recyclerView4.mItemsAddedOrRemoved = true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017d  */
    /* JADX WARN: Code duplicated, block: B:104:0x018b  */
    /* JADX WARN: Code duplicated, block: B:105:0x018f  */
    /* JADX WARN: Code duplicated, block: B:138:0x0208  */
    /* JADX WARN: Code duplicated, block: B:166:0x027a  */
    /* JADX WARN: Code duplicated, block: B:199:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0072  */
    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0092  */
    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0125  */
    /* JADX WARN: Code duplicated, block: B:77:0x0127  */
    /* JADX WARN: Code duplicated, block: B:79:0x012d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0138  */
    /* JADX WARN: Code duplicated, block: B:85:0x0143  */
    /* JADX WARN: Code duplicated, block: B:88:0x014e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0154  */
    /* JADX WARN: Code duplicated, block: B:90:0x0156  */
    /* JADX WARN: Code duplicated, block: B:92:0x015c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0167  */
    /* JADX WARN: Code duplicated, block: B:98:0x0172  */
    public final void j() {
        ArrayList arrayList;
        int i10;
        byte b10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        byte b11;
        a aVarH;
        int i14;
        int i15;
        int i16;
        a aVarH2;
        boolean z11;
        boolean z12;
        Object obj;
        a aVar;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        t tVar = this.f4723e;
        tVar.getClass();
        while (true) {
            arrayList = this.f4720b;
            int size = arrayList.size() - 1;
            boolean z13 = false;
            while (true) {
                i10 = 8;
                b10 = -1;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((a) arrayList.get(size)).f4701a != 8) {
                    z13 = true;
                } else if (z13) {
                    break;
                }
                size--;
            }
            i11 = 2;
            i12 = 4;
            if (size == -1) {
                break;
            }
            int i25 = size + 1;
            b bVar = (b) tVar.f4931a;
            b2.w wVar = bVar.f4719a;
            a aVar2 = (a) arrayList.get(size);
            a aVar3 = (a) arrayList.get(i25);
            int i26 = aVar3.f4701a;
            if (i26 == 1) {
                int i27 = aVar2.f4704d;
                int i28 = aVar3.f4702b;
                int i29 = i27 < i28 ? -1 : 0;
                int i30 = aVar2.f4702b;
                if (i30 < i28) {
                    i29++;
                }
                if (i28 <= i30) {
                    aVar2.f4702b = i30 + aVar3.f4704d;
                }
                int i31 = aVar3.f4702b;
                if (i31 <= i27) {
                    aVar2.f4704d = i27 + aVar3.f4704d;
                }
                aVar3.f4702b = i31 + i29;
                arrayList.set(size, aVar3);
                arrayList.set(i25, aVar2);
            } else if (i26 == 2) {
                int i32 = aVar2.f4702b;
                int i33 = aVar2.f4704d;
                if (i32 < i33) {
                    z12 = aVar3.f4702b == i32 && aVar3.f4704d == i33 - i32;
                    z11 = false;
                } else if (aVar3.f4702b == i33 + 1 && aVar3.f4704d == i32 - i33) {
                    z12 = true;
                    z11 = true;
                } else {
                    z11 = true;
                    z12 = false;
                }
                int i34 = aVar3.f4702b;
                if (i33 < i34) {
                    aVar3.f4702b = i34 - 1;
                } else {
                    int i35 = aVar3.f4704d;
                    if (i33 < i34 + i35) {
                        aVar3.f4704d = i35 - 1;
                        aVar2.f4701a = 2;
                        aVar2.f4704d = 1;
                        if (aVar3.f4704d == 0) {
                            arrayList.remove(i25);
                            aVar3.f4703c = null;
                            wVar.e(aVar3);
                        }
                    }
                }
                int i36 = aVar2.f4702b;
                int i37 = aVar3.f4702b;
                if (i36 <= i37) {
                    aVar3.f4702b = i37 + 1;
                } else {
                    int i38 = i37 + aVar3.f4704d;
                    if (i36 < i38) {
                        obj = null;
                        a aVarH3 = bVar.h(2, i36 + 1, i38 - i36, null);
                        aVar3.f4704d = aVar2.f4702b - aVar3.f4702b;
                        aVar = aVarH3;
                    }
                    if (z12) {
                        arrayList.set(size, aVar3);
                        arrayList.remove(i25);
                        aVar2.f4703c = obj;
                        wVar.e(aVar2);
                    } else {
                        if (z11) {
                            if (aVar != null) {
                                i23 = aVar2.f4702b;
                                if (i23 > aVar.f4702b) {
                                    aVar2.f4702b = i23 - aVar.f4704d;
                                }
                                i24 = aVar2.f4704d;
                                if (i24 > aVar.f4702b) {
                                    aVar2.f4704d = i24 - aVar.f4704d;
                                }
                            }
                            i21 = aVar2.f4702b;
                            if (i21 > aVar3.f4702b) {
                                aVar2.f4702b = i21 - aVar3.f4704d;
                            }
                            i22 = aVar2.f4704d;
                            if (i22 > aVar3.f4702b) {
                                aVar2.f4704d = i22 - aVar3.f4704d;
                            }
                        } else {
                            if (aVar != null) {
                                i19 = aVar2.f4702b;
                                if (i19 >= aVar.f4702b) {
                                    aVar2.f4702b = i19 - aVar.f4704d;
                                }
                                i20 = aVar2.f4704d;
                                if (i20 >= aVar.f4702b) {
                                    aVar2.f4704d = i20 - aVar.f4704d;
                                }
                            }
                            i17 = aVar2.f4702b;
                            if (i17 >= aVar3.f4702b) {
                                aVar2.f4702b = i17 - aVar3.f4704d;
                            }
                            i18 = aVar2.f4704d;
                            if (i18 >= aVar3.f4702b) {
                                aVar2.f4704d = i18 - aVar3.f4704d;
                            }
                        }
                        arrayList.set(size, aVar3);
                        if (aVar2.f4702b != aVar2.f4704d) {
                            arrayList.set(i25, aVar2);
                        } else {
                            arrayList.remove(i25);
                        }
                        if (aVar != null) {
                            arrayList.add(size, aVar);
                        }
                    }
                }
                obj = null;
                aVar = null;
                if (z12) {
                    arrayList.set(size, aVar3);
                    arrayList.remove(i25);
                    aVar2.f4703c = obj;
                    wVar.e(aVar2);
                } else {
                    if (z11) {
                        if (aVar != null) {
                            i23 = aVar2.f4702b;
                            if (i23 > aVar.f4702b) {
                                aVar2.f4702b = i23 - aVar.f4704d;
                            }
                            i24 = aVar2.f4704d;
                            if (i24 > aVar.f4702b) {
                                aVar2.f4704d = i24 - aVar.f4704d;
                            }
                        }
                        i21 = aVar2.f4702b;
                        if (i21 > aVar3.f4702b) {
                            aVar2.f4702b = i21 - aVar3.f4704d;
                        }
                        i22 = aVar2.f4704d;
                        if (i22 > aVar3.f4702b) {
                            aVar2.f4704d = i22 - aVar3.f4704d;
                        }
                    } else {
                        if (aVar != null) {
                            i19 = aVar2.f4702b;
                            if (i19 >= aVar.f4702b) {
                                aVar2.f4702b = i19 - aVar.f4704d;
                            }
                            i20 = aVar2.f4704d;
                            if (i20 >= aVar.f4702b) {
                                aVar2.f4704d = i20 - aVar.f4704d;
                            }
                        }
                        i17 = aVar2.f4702b;
                        if (i17 >= aVar3.f4702b) {
                            aVar2.f4702b = i17 - aVar3.f4704d;
                        }
                        i18 = aVar2.f4704d;
                        if (i18 >= aVar3.f4702b) {
                            aVar2.f4704d = i18 - aVar3.f4704d;
                        }
                    }
                    arrayList.set(size, aVar3);
                    if (aVar2.f4702b != aVar2.f4704d) {
                        arrayList.set(i25, aVar2);
                    } else {
                        arrayList.remove(i25);
                    }
                    if (aVar != null) {
                        arrayList.add(size, aVar);
                    }
                }
            } else if (i26 == 4) {
                int i39 = aVar2.f4704d;
                int i40 = aVar3.f4702b;
                if (i39 < i40) {
                    aVar3.f4702b = i40 - 1;
                } else {
                    int i41 = aVar3.f4704d;
                    if (i39 < i40 + i41) {
                        aVar3.f4704d = i41 - 1;
                        aVarH = bVar.h(4, aVar2.f4702b, 1, aVar3.f4703c);
                    }
                    i14 = aVar2.f4702b;
                    i15 = aVar3.f4702b;
                    if (i14 <= i15) {
                        aVar3.f4702b = i15 + 1;
                    } else {
                        i16 = i15 + aVar3.f4704d;
                        if (i14 < i16) {
                            int i42 = i16 - i14;
                            aVarH2 = bVar.h(4, i14 + 1, i42, aVar3.f4703c);
                            aVar3.f4704d -= i42;
                        }
                        arrayList.set(i25, aVar2);
                        if (aVar3.f4704d > 0) {
                            arrayList.set(size, aVar3);
                        } else {
                            arrayList.remove(size);
                            aVar3.f4703c = null;
                            wVar.e(aVar3);
                        }
                        if (aVarH != null) {
                            arrayList.add(size, aVarH);
                        }
                        if (aVarH2 != null) {
                            arrayList.add(size, aVarH2);
                        }
                    }
                    aVarH2 = null;
                    arrayList.set(i25, aVar2);
                    if (aVar3.f4704d > 0) {
                        arrayList.set(size, aVar3);
                    } else {
                        arrayList.remove(size);
                        aVar3.f4703c = null;
                        wVar.e(aVar3);
                    }
                    if (aVarH != null) {
                        arrayList.add(size, aVarH);
                    }
                    if (aVarH2 != null) {
                        arrayList.add(size, aVarH2);
                    }
                }
                aVarH = null;
                i14 = aVar2.f4702b;
                i15 = aVar3.f4702b;
                if (i14 <= i15) {
                    aVar3.f4702b = i15 + 1;
                } else {
                    i16 = i15 + aVar3.f4704d;
                    if (i14 < i16) {
                        int i43 = i16 - i14;
                        aVarH2 = bVar.h(4, i14 + 1, i43, aVar3.f4703c);
                        aVar3.f4704d -= i43;
                    }
                    arrayList.set(i25, aVar2);
                    if (aVar3.f4704d > 0) {
                        arrayList.set(size, aVar3);
                    } else {
                        arrayList.remove(size);
                        aVar3.f4703c = null;
                        wVar.e(aVar3);
                    }
                    if (aVarH != null) {
                        arrayList.add(size, aVarH);
                    }
                    if (aVarH2 != null) {
                        arrayList.add(size, aVarH2);
                    }
                }
                aVarH2 = null;
                arrayList.set(i25, aVar2);
                if (aVar3.f4704d > 0) {
                    arrayList.set(size, aVar3);
                } else {
                    arrayList.remove(size);
                    aVar3.f4703c = null;
                    wVar.e(aVar3);
                }
                if (aVarH != null) {
                    arrayList.add(size, aVarH);
                }
                if (aVarH2 != null) {
                    arrayList.add(size, aVarH2);
                }
            }
        }
        int size2 = arrayList.size();
        int i44 = 0;
        while (i44 < size2) {
            a aVarH4 = (a) arrayList.get(i44);
            int i45 = aVarH4.f4701a;
            if (i45 != 1) {
                b2.w wVar2 = this.f4719a;
                f0 f0Var = this.f4722d;
                if (i45 == i11) {
                    int i46 = aVarH4.f4702b;
                    int i47 = aVarH4.f4704d + i46;
                    int i48 = i46;
                    int i49 = 0;
                    byte b12 = -1;
                    while (i48 < i47) {
                        RecyclerView recyclerView = f0Var.f4767a;
                        h1 h1VarFindViewHolderForPosition = recyclerView.findViewHolderForPosition(i48, true);
                        if (h1VarFindViewHolderForPosition == null) {
                            h1VarFindViewHolderForPosition = null;
                        } else {
                            if (recyclerView.mChildHelper.f4742c.contains(h1VarFindViewHolderForPosition.itemView)) {
                                h1VarFindViewHolderForPosition = null;
                            }
                        }
                        if (h1VarFindViewHolderForPosition != null || a(i48)) {
                            if (b12 == 0) {
                                d(h(2, i46, i49, null));
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            b11 = 1;
                        } else {
                            if (b12 == 1) {
                                i(h(2, i46, i49, null));
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            b11 = 0;
                        }
                        if (z10) {
                            i48 -= i49;
                            i47 -= i49;
                            i49 = 1;
                        } else {
                            i49++;
                        }
                        i48++;
                        b12 = b11;
                    }
                    if (i49 != aVarH4.f4704d) {
                        aVarH4.f4703c = null;
                        wVar2.e(aVarH4);
                        i13 = 2;
                        aVarH4 = h(2, i46, i49, null);
                    } else {
                        i13 = 2;
                    }
                    if (b12 == 0) {
                        d(aVarH4);
                    } else {
                        i(aVarH4);
                    }
                } else if (i45 != i12) {
                    if (i45 == i10) {
                        i(aVarH4);
                    }
                    i13 = i11;
                } else {
                    int i50 = aVarH4.f4702b;
                    int i51 = aVarH4.f4704d + i50;
                    int i52 = i50;
                    byte b13 = b10;
                    int i53 = 0;
                    while (i50 < i51) {
                        RecyclerView recyclerView2 = f0Var.f4767a;
                        h1 h1VarFindViewHolderForPosition2 = recyclerView2.findViewHolderForPosition(i50, true);
                        if (h1VarFindViewHolderForPosition2 == null) {
                            h1VarFindViewHolderForPosition2 = null;
                        } else {
                            if (recyclerView2.mChildHelper.f4742c.contains(h1VarFindViewHolderForPosition2.itemView)) {
                                h1VarFindViewHolderForPosition2 = null;
                            }
                        }
                        if (h1VarFindViewHolderForPosition2 != null || a(i50)) {
                            if (b13 == 0) {
                                d(h(4, i52, i53, aVarH4.f4703c));
                                i52 = i50;
                                i53 = 0;
                            }
                            b13 = 1;
                        } else {
                            if (b13 == 1) {
                                i(h(4, i52, i53, aVarH4.f4703c));
                                i52 = i50;
                                i53 = 0;
                            }
                            b13 = 0;
                        }
                        i53++;
                        i50++;
                    }
                    if (i53 != aVarH4.f4704d) {
                        Object obj2 = aVarH4.f4703c;
                        aVarH4.f4703c = null;
                        wVar2.e(aVarH4);
                        aVarH4 = h(4, i52, i53, obj2);
                    }
                    if (b13 == 0) {
                        d(aVarH4);
                    } else {
                        i(aVarH4);
                    }
                    i13 = 2;
                }
            } else {
                i13 = i11;
                i(aVarH4);
            }
            i44++;
            i11 = i13;
            i10 = 8;
            b10 = -1;
            i12 = 4;
        }
        arrayList.clear();
    }

    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) arrayList.get(i10);
            aVar.f4703c = null;
            this.f4719a.e(aVar);
        }
        arrayList.clear();
    }

    public final int l(int i10, int i11) {
        int i12;
        int i13;
        ArrayList arrayList = this.f4721c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            int i14 = aVar.f4701a;
            if (i14 == 8) {
                int i15 = aVar.f4702b;
                int i16 = aVar.f4704d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            aVar.f4702b = i15 + 1;
                            aVar.f4704d = i16 + 1;
                        } else if (i11 == 2) {
                            aVar.f4702b = i15 - 1;
                            aVar.f4704d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        aVar.f4704d = i16 + 1;
                    } else if (i11 == 2) {
                        aVar.f4704d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        aVar.f4702b = i15 + 1;
                    } else if (i11 == 2) {
                        aVar.f4702b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = aVar.f4702b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= aVar.f4704d;
                    } else if (i14 == 2) {
                        i10 += aVar.f4704d;
                    }
                } else if (i11 == 1) {
                    aVar.f4702b = i17 + 1;
                } else if (i11 == 2) {
                    aVar.f4702b = i17 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            a aVar2 = (a) arrayList.get(size2);
            int i18 = aVar2.f4701a;
            b2.w wVar = this.f4719a;
            if (i18 == 8) {
                int i19 = aVar2.f4704d;
                if (i19 == aVar2.f4702b || i19 < 0) {
                    arrayList.remove(size2);
                    aVar2.f4703c = null;
                    wVar.e(aVar2);
                }
            } else if (aVar2.f4704d <= 0) {
                arrayList.remove(size2);
                aVar2.f4703c = null;
                wVar.e(aVar2);
            }
        }
        return i10;
    }
}
