package androidx.recyclerview.widget;

import android.support.v4.media.a;
import androidx.core.util.Pools;
import com.p004ironsource.d9;
import com.smartdigimkt.o1.b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class AdapterHelper implements OpReorderer.Callback {
    public final RecyclerView.AnonymousClass6 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pools.SimplePool f7997a = new Pools.SimplePool(30);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f7998b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f7999c = new ArrayList();
    public int f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final OpReorderer f8000e = new OpReorderer(this);

    public interface Callback {
    }

    public static final class UpdateOp {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f8003c;
        public int d;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof UpdateOp)) {
                    return false;
                }
                UpdateOp updateOp = (UpdateOp) obj;
                int i2 = this.f8001a;
                if (i2 != updateOp.f8001a) {
                    return false;
                }
                if (i2 != 8 || Math.abs(this.d - this.f8002b) != 1 || this.d != updateOp.f8002b || this.f8002b != updateOp.d) {
                    if (this.d != updateOp.d || this.f8002b != updateOp.f8002b) {
                        return false;
                    }
                    Object obj2 = this.f8003c;
                    if (obj2 != null) {
                        if (!obj2.equals(updateOp.f8003c)) {
                            return false;
                        }
                    } else if (updateOp.f8003c != null) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            return (((this.f8001a * 31) + this.f8002b) * 31) + this.d;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(d9.i.d);
            int i2 = this.f8001a;
            if (i2 == 1) {
                str = b.y0;
            } else if (i2 == 2) {
                str = "rm";
            } else if (i2 != 4) {
                str = i2 != 8 ? "??" : "mv";
            } else {
                str = "up";
            }
            sb.append(str);
            sb.append(",s:");
            sb.append(this.f8002b);
            sb.append("c:");
            sb.append(this.d);
            sb.append(",p:");
            return a.q(sb, this.f8003c, d9.i.f24752e);
        }
    }

    public AdapterHelper(RecyclerView.AnonymousClass6 anonymousClass6) {
        this.d = anonymousClass6;
    }

    public final boolean a(int i2) {
        ArrayList arrayList = this.f7999c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            UpdateOp updateOp = (UpdateOp) arrayList.get(i3);
            int i4 = updateOp.f8001a;
            if (i4 != 8) {
                if (i4 == 1) {
                    int i5 = updateOp.f8002b;
                    int i6 = updateOp.d + i5;
                    while (i5 < i6) {
                        if (f(i5, i3 + 1) == i2) {
                            return true;
                        }
                        i5++;
                    }
                } else {
                    continue;
                }
            } else {
                if (f(updateOp.d, i3 + 1) == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        ArrayList arrayList = this.f7999c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.d.a((UpdateOp) arrayList.get(i2));
        }
        k(arrayList);
        this.f = 0;
    }

    public final void c() {
        b();
        ArrayList arrayList = this.f7998b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            UpdateOp updateOp = (UpdateOp) arrayList.get(i2);
            int i3 = updateOp.f8001a;
            RecyclerView.AnonymousClass6 anonymousClass6 = this.d;
            if (i3 == 1) {
                anonymousClass6.a(updateOp);
                anonymousClass6.d(updateOp.f8002b, updateOp.d);
            } else if (i3 == 2) {
                anonymousClass6.a(updateOp);
                anonymousClass6.f(updateOp.f8002b, updateOp.d);
            } else if (i3 == 4) {
                anonymousClass6.a(updateOp);
                anonymousClass6.c(updateOp.f8002b, updateOp.d, updateOp.f8003c);
            } else if (i3 == 8) {
                anonymousClass6.a(updateOp);
                anonymousClass6.e(updateOp.f8002b, updateOp.d);
            }
        }
        k(arrayList);
        this.f = 0;
    }

    public final void d(UpdateOp updateOp) {
        int i2;
        int i3 = updateOp.f8001a;
        if (i3 == 1 || i3 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iL = l(updateOp.f8002b, i3);
        int i4 = updateOp.f8002b;
        int i5 = updateOp.f8001a;
        if (i5 == 2) {
            i2 = 0;
        } else {
            if (i5 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + updateOp);
            }
            i2 = 1;
        }
        int i6 = 1;
        for (int i7 = 1; i7 < updateOp.d; i7++) {
            int iL2 = l((i2 * i7) + updateOp.f8002b, updateOp.f8001a);
            int i8 = updateOp.f8001a;
            if (i8 == 2 ? iL2 != iL : !(i8 == 4 && iL2 == iL + 1)) {
                UpdateOp updateOpH = h(i8, iL, i6, updateOp.f8003c);
                e(updateOpH, i4);
                updateOpH.f8003c = null;
                this.f7997a.a(updateOpH);
                if (updateOp.f8001a == 4) {
                    i4 += i6;
                }
                i6 = 1;
                iL = iL2;
            } else {
                i6++;
            }
        }
        Object obj = updateOp.f8003c;
        updateOp.f8003c = null;
        this.f7997a.a(updateOp);
        if (i6 > 0) {
            UpdateOp updateOpH2 = h(updateOp.f8001a, iL, i6, obj);
            e(updateOpH2, i4);
            updateOpH2.f8003c = null;
            this.f7997a.a(updateOpH2);
        }
    }

    public final void e(UpdateOp updateOp, int i2) {
        RecyclerView.AnonymousClass6 anonymousClass6 = this.d;
        anonymousClass6.a(updateOp);
        int i3 = updateOp.f8001a;
        if (i3 == 2) {
            anonymousClass6.f(i2, updateOp.d);
        } else {
            if (i3 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            anonymousClass6.c(i2, updateOp.d, updateOp.f8003c);
        }
    }

    public final int f(int i2, int i3) {
        ArrayList arrayList = this.f7999c;
        int size = arrayList.size();
        while (i3 < size) {
            UpdateOp updateOp = (UpdateOp) arrayList.get(i3);
            int i4 = updateOp.f8001a;
            if (i4 == 8) {
                int i5 = updateOp.f8002b;
                if (i5 == i2) {
                    i2 = updateOp.d;
                } else {
                    if (i5 < i2) {
                        i2--;
                    }
                    if (updateOp.d <= i2) {
                        i2++;
                    }
                }
            } else {
                int i6 = updateOp.f8002b;
                if (i6 > i2) {
                    continue;
                } else if (i4 == 2) {
                    int i7 = updateOp.d;
                    if (i2 < i6 + i7) {
                        return -1;
                    }
                    i2 -= i7;
                } else if (i4 == 1) {
                    i2 += updateOp.d;
                }
            }
            i3++;
        }
        return i2;
    }

    public final boolean g() {
        return this.f7998b.size() > 0;
    }

    public final UpdateOp h(int i2, int i3, int i4, Object obj) {
        UpdateOp updateOp = (UpdateOp) this.f7997a.b();
        if (updateOp != null) {
            updateOp.f8001a = i2;
            updateOp.f8002b = i3;
            updateOp.d = i4;
            updateOp.f8003c = obj;
            return updateOp;
        }
        UpdateOp updateOp2 = new UpdateOp();
        updateOp2.f8001a = i2;
        updateOp2.f8002b = i3;
        updateOp2.d = i4;
        updateOp2.f8003c = obj;
        return updateOp2;
    }

    public final void i(UpdateOp updateOp) {
        this.f7999c.add(updateOp);
        int i2 = updateOp.f8001a;
        RecyclerView.AnonymousClass6 anonymousClass6 = this.d;
        if (i2 == 1) {
            anonymousClass6.d(updateOp.f8002b, updateOp.d);
            return;
        }
        if (i2 == 2) {
            int i3 = updateOp.f8002b;
            int i4 = updateOp.d;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.offsetPositionRecordsForRemove(i3, i4, false);
            recyclerView.mItemsAddedOrRemoved = true;
            return;
        }
        if (i2 == 4) {
            anonymousClass6.c(updateOp.f8002b, updateOp.d, updateOp.f8003c);
        } else if (i2 == 8) {
            anonymousClass6.e(updateOp.f8002b, updateOp.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + updateOp);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0188  */
    /* JADX WARN: Code duplicated, block: B:105:0x018c  */
    /* JADX WARN: Code duplicated, block: B:184:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    /* JADX WARN: Code duplicated, block: B:31:0x006e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x008e  */
    /* JADX WARN: Code duplicated, block: B:40:0x009a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0122  */
    /* JADX WARN: Code duplicated, block: B:77:0x0124  */
    /* JADX WARN: Code duplicated, block: B:79:0x012a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0135  */
    /* JADX WARN: Code duplicated, block: B:85:0x0140  */
    /* JADX WARN: Code duplicated, block: B:88:0x014b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0151  */
    /* JADX WARN: Code duplicated, block: B:90:0x0153  */
    /* JADX WARN: Code duplicated, block: B:92:0x0159  */
    /* JADX WARN: Code duplicated, block: B:95:0x0164  */
    /* JADX WARN: Code duplicated, block: B:98:0x016f  */
    public final void j() {
        byte b2;
        boolean z2;
        byte b3;
        UpdateOp updateOpH;
        int i2;
        int i3;
        int i4;
        UpdateOp updateOpH2;
        boolean z3;
        boolean z4;
        UpdateOp updateOpH3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList = this.f7998b;
        OpReorderer opReorderer = this.f8000e;
        opReorderer.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z5 = false;
            while (true) {
                b2 = -1;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((UpdateOp) arrayList.get(size)).f8001a != 8) {
                    z5 = true;
                } else if (z5) {
                    break;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i13 = size + 1;
            UpdateOp updateOp = (UpdateOp) arrayList.get(size);
            UpdateOp updateOp2 = (UpdateOp) arrayList.get(i13);
            int i14 = updateOp2.f8001a;
            if (i14 != 1) {
                AdapterHelper adapterHelper = opReorderer.f8082a;
                if (i14 == 2) {
                    int i15 = updateOp.f8002b;
                    int i16 = updateOp.d;
                    if (i15 < i16) {
                        z4 = updateOp2.f8002b == i15 && updateOp2.d == i16 - i15;
                        z3 = false;
                    } else if (updateOp2.f8002b == i16 + 1 && updateOp2.d == i15 - i16) {
                        z4 = true;
                        z3 = true;
                    } else {
                        z3 = true;
                        z4 = false;
                    }
                    int i17 = updateOp2.f8002b;
                    if (i16 < i17) {
                        updateOp2.f8002b = i17 - 1;
                    } else {
                        int i18 = updateOp2.d;
                        if (i16 < i17 + i18) {
                            updateOp2.d = i18 - 1;
                            updateOp.f8001a = 2;
                            updateOp.d = 1;
                            if (updateOp2.d == 0) {
                                arrayList.remove(i13);
                                updateOp2.f8003c = null;
                                adapterHelper.f7997a.a(updateOp2);
                            }
                        }
                    }
                    int i19 = updateOp.f8002b;
                    int i20 = updateOp2.f8002b;
                    if (i19 <= i20) {
                        updateOp2.f8002b = i20 + 1;
                    } else {
                        int i21 = i20 + updateOp2.d;
                        if (i19 < i21) {
                            updateOpH3 = adapterHelper.h(2, i19 + 1, i21 - i19, null);
                            updateOp2.d = updateOp.f8002b - updateOp2.f8002b;
                        }
                        if (z4) {
                            arrayList.set(size, updateOp2);
                            arrayList.remove(i13);
                            updateOp.f8003c = null;
                            adapterHelper.f7997a.a(updateOp);
                        } else {
                            if (z3) {
                                if (updateOpH3 != null) {
                                    i11 = updateOp.f8002b;
                                    if (i11 > updateOpH3.f8002b) {
                                        updateOp.f8002b = i11 - updateOpH3.d;
                                    }
                                    i12 = updateOp.d;
                                    if (i12 > updateOpH3.f8002b) {
                                        updateOp.d = i12 - updateOpH3.d;
                                    }
                                }
                                i9 = updateOp.f8002b;
                                if (i9 > updateOp2.f8002b) {
                                    updateOp.f8002b = i9 - updateOp2.d;
                                }
                                i10 = updateOp.d;
                                if (i10 > updateOp2.f8002b) {
                                    updateOp.d = i10 - updateOp2.d;
                                }
                            } else {
                                if (updateOpH3 != null) {
                                    i7 = updateOp.f8002b;
                                    if (i7 >= updateOpH3.f8002b) {
                                        updateOp.f8002b = i7 - updateOpH3.d;
                                    }
                                    i8 = updateOp.d;
                                    if (i8 >= updateOpH3.f8002b) {
                                        updateOp.d = i8 - updateOpH3.d;
                                    }
                                }
                                i5 = updateOp.f8002b;
                                if (i5 >= updateOp2.f8002b) {
                                    updateOp.f8002b = i5 - updateOp2.d;
                                }
                                i6 = updateOp.d;
                                if (i6 >= updateOp2.f8002b) {
                                    updateOp.d = i6 - updateOp2.d;
                                }
                            }
                            arrayList.set(size, updateOp2);
                            if (updateOp.f8002b != updateOp.d) {
                                arrayList.set(i13, updateOp);
                            } else {
                                arrayList.remove(i13);
                            }
                            if (updateOpH3 != null) {
                                arrayList.add(size, updateOpH3);
                            }
                        }
                    }
                    updateOpH3 = null;
                    if (z4) {
                        arrayList.set(size, updateOp2);
                        arrayList.remove(i13);
                        updateOp.f8003c = null;
                        adapterHelper.f7997a.a(updateOp);
                    } else {
                        if (z3) {
                            if (updateOpH3 != null) {
                                i11 = updateOp.f8002b;
                                if (i11 > updateOpH3.f8002b) {
                                    updateOp.f8002b = i11 - updateOpH3.d;
                                }
                                i12 = updateOp.d;
                                if (i12 > updateOpH3.f8002b) {
                                    updateOp.d = i12 - updateOpH3.d;
                                }
                            }
                            i9 = updateOp.f8002b;
                            if (i9 > updateOp2.f8002b) {
                                updateOp.f8002b = i9 - updateOp2.d;
                            }
                            i10 = updateOp.d;
                            if (i10 > updateOp2.f8002b) {
                                updateOp.d = i10 - updateOp2.d;
                            }
                        } else {
                            if (updateOpH3 != null) {
                                i7 = updateOp.f8002b;
                                if (i7 >= updateOpH3.f8002b) {
                                    updateOp.f8002b = i7 - updateOpH3.d;
                                }
                                i8 = updateOp.d;
                                if (i8 >= updateOpH3.f8002b) {
                                    updateOp.d = i8 - updateOpH3.d;
                                }
                            }
                            i5 = updateOp.f8002b;
                            if (i5 >= updateOp2.f8002b) {
                                updateOp.f8002b = i5 - updateOp2.d;
                            }
                            i6 = updateOp.d;
                            if (i6 >= updateOp2.f8002b) {
                                updateOp.d = i6 - updateOp2.d;
                            }
                        }
                        arrayList.set(size, updateOp2);
                        if (updateOp.f8002b != updateOp.d) {
                            arrayList.set(i13, updateOp);
                        } else {
                            arrayList.remove(i13);
                        }
                        if (updateOpH3 != null) {
                            arrayList.add(size, updateOpH3);
                        }
                    }
                } else if (i14 == 4) {
                    int i22 = updateOp.d;
                    int i23 = updateOp2.f8002b;
                    if (i22 < i23) {
                        updateOp2.f8002b = i23 - 1;
                    } else {
                        int i24 = updateOp2.d;
                        if (i22 < i23 + i24) {
                            updateOp2.d = i24 - 1;
                            updateOpH = adapterHelper.h(4, updateOp.f8002b, 1, updateOp2.f8003c);
                        }
                        i2 = updateOp.f8002b;
                        i3 = updateOp2.f8002b;
                        if (i2 <= i3) {
                            updateOp2.f8002b = i3 + 1;
                        } else {
                            i4 = i3 + updateOp2.d;
                            if (i2 < i4) {
                                int i25 = i4 - i2;
                                updateOpH2 = adapterHelper.h(4, i2 + 1, i25, updateOp2.f8003c);
                                updateOp2.d -= i25;
                            }
                            arrayList.set(i13, updateOp);
                            if (updateOp2.d > 0) {
                                arrayList.set(size, updateOp2);
                            } else {
                                arrayList.remove(size);
                                updateOp2.f8003c = null;
                                adapterHelper.f7997a.a(updateOp2);
                            }
                            if (updateOpH != null) {
                                arrayList.add(size, updateOpH);
                            }
                            if (updateOpH2 != null) {
                                arrayList.add(size, updateOpH2);
                            }
                        }
                        updateOpH2 = null;
                        arrayList.set(i13, updateOp);
                        if (updateOp2.d > 0) {
                            arrayList.set(size, updateOp2);
                        } else {
                            arrayList.remove(size);
                            updateOp2.f8003c = null;
                            adapterHelper.f7997a.a(updateOp2);
                        }
                        if (updateOpH != null) {
                            arrayList.add(size, updateOpH);
                        }
                        if (updateOpH2 != null) {
                            arrayList.add(size, updateOpH2);
                        }
                    }
                    updateOpH = null;
                    i2 = updateOp.f8002b;
                    i3 = updateOp2.f8002b;
                    if (i2 <= i3) {
                        updateOp2.f8002b = i3 + 1;
                    } else {
                        i4 = i3 + updateOp2.d;
                        if (i2 < i4) {
                            int i26 = i4 - i2;
                            updateOpH2 = adapterHelper.h(4, i2 + 1, i26, updateOp2.f8003c);
                            updateOp2.d -= i26;
                        }
                        arrayList.set(i13, updateOp);
                        if (updateOp2.d > 0) {
                            arrayList.set(size, updateOp2);
                        } else {
                            arrayList.remove(size);
                            updateOp2.f8003c = null;
                            adapterHelper.f7997a.a(updateOp2);
                        }
                        if (updateOpH != null) {
                            arrayList.add(size, updateOpH);
                        }
                        if (updateOpH2 != null) {
                            arrayList.add(size, updateOpH2);
                        }
                    }
                    updateOpH2 = null;
                    arrayList.set(i13, updateOp);
                    if (updateOp2.d > 0) {
                        arrayList.set(size, updateOp2);
                    } else {
                        arrayList.remove(size);
                        updateOp2.f8003c = null;
                        adapterHelper.f7997a.a(updateOp2);
                    }
                    if (updateOpH != null) {
                        arrayList.add(size, updateOpH);
                    }
                    if (updateOpH2 != null) {
                        arrayList.add(size, updateOpH2);
                    }
                }
            } else {
                int i27 = updateOp.d;
                int i28 = updateOp2.f8002b;
                int i29 = i27 < i28 ? -1 : 0;
                int i30 = updateOp.f8002b;
                if (i30 < i28) {
                    i29++;
                }
                if (i28 <= i30) {
                    updateOp.f8002b = i30 + updateOp2.d;
                }
                int i31 = updateOp2.f8002b;
                if (i31 <= i27) {
                    updateOp.d = i27 + updateOp2.d;
                }
                updateOp2.f8002b = i31 + i29;
                arrayList.set(size, updateOp2);
                arrayList.set(i13, updateOp);
            }
        }
        int size2 = arrayList.size();
        int i32 = 0;
        while (i32 < size2) {
            UpdateOp updateOpH4 = (UpdateOp) arrayList.get(i32);
            int i33 = updateOpH4.f8001a;
            if (i33 != 1) {
                RecyclerView.AnonymousClass6 anonymousClass6 = this.d;
                if (i33 == 2) {
                    int i34 = updateOpH4.f8002b;
                    int i35 = updateOpH4.d + i34;
                    int i36 = i34;
                    int i37 = 0;
                    byte b4 = -1;
                    while (i36 < i35) {
                        if (anonymousClass6.b(i36) != null || a(i36)) {
                            if (b4 == 0) {
                                d(h(2, i34, i37, null));
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            b3 = 1;
                        } else {
                            if (b4 == 1) {
                                i(h(2, i34, i37, null));
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            b3 = 0;
                        }
                        if (z2) {
                            i36 -= i37;
                            i35 -= i37;
                            i37 = 1;
                        } else {
                            i37++;
                        }
                        i36++;
                        b4 = b3;
                    }
                    if (i37 != updateOpH4.d) {
                        updateOpH4.f8003c = null;
                        this.f7997a.a(updateOpH4);
                        updateOpH4 = h(2, i34, i37, null);
                    }
                    if (b4 == 0) {
                        d(updateOpH4);
                    } else {
                        i(updateOpH4);
                    }
                } else if (i33 == 4) {
                    int i38 = updateOpH4.f8002b;
                    int i39 = updateOpH4.d + i38;
                    int i40 = i38;
                    int i41 = 0;
                    while (i38 < i39) {
                        if (anonymousClass6.b(i38) != null || a(i38)) {
                            if (b2 == 0) {
                                d(h(4, i40, i41, updateOpH4.f8003c));
                                i40 = i38;
                                i41 = 0;
                            }
                            b2 = 1;
                        } else {
                            if (b2 == 1) {
                                i(h(4, i40, i41, updateOpH4.f8003c));
                                i40 = i38;
                                i41 = 0;
                            }
                            b2 = 0;
                        }
                        i41++;
                        i38++;
                    }
                    if (i41 != updateOpH4.d) {
                        Object obj = updateOpH4.f8003c;
                        updateOpH4.f8003c = null;
                        this.f7997a.a(updateOpH4);
                        updateOpH4 = h(4, i40, i41, obj);
                    }
                    if (b2 == 0) {
                        d(updateOpH4);
                    } else {
                        i(updateOpH4);
                    }
                } else if (i33 == 8) {
                    i(updateOpH4);
                }
            } else {
                i(updateOpH4);
            }
            i32++;
            b2 = -1;
        }
        arrayList.clear();
    }

    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            UpdateOp updateOp = (UpdateOp) arrayList.get(i2);
            updateOp.f8003c = null;
            this.f7997a.a(updateOp);
        }
        arrayList.clear();
    }

    public final int l(int i2, int i3) {
        int i4;
        int i5;
        ArrayList arrayList = this.f7999c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            UpdateOp updateOp = (UpdateOp) arrayList.get(size);
            int i6 = updateOp.f8001a;
            if (i6 == 8) {
                int i7 = updateOp.f8002b;
                int i8 = updateOp.d;
                if (i7 < i8) {
                    i5 = i7;
                    i4 = i8;
                } else {
                    i4 = i7;
                    i5 = i8;
                }
                if (i2 < i5 || i2 > i4) {
                    if (i2 < i7) {
                        if (i3 == 1) {
                            updateOp.f8002b = i7 + 1;
                            updateOp.d = i8 + 1;
                        } else if (i3 == 2) {
                            updateOp.f8002b = i7 - 1;
                            updateOp.d = i8 - 1;
                        }
                    }
                } else if (i5 == i7) {
                    if (i3 == 1) {
                        updateOp.d = i8 + 1;
                    } else if (i3 == 2) {
                        updateOp.d = i8 - 1;
                    }
                    i2++;
                } else {
                    if (i3 == 1) {
                        updateOp.f8002b = i7 + 1;
                    } else if (i3 == 2) {
                        updateOp.f8002b = i7 - 1;
                    }
                    i2--;
                }
            } else {
                int i9 = updateOp.f8002b;
                if (i9 <= i2) {
                    if (i6 == 1) {
                        i2 -= updateOp.d;
                    } else if (i6 == 2) {
                        i2 += updateOp.d;
                    }
                } else if (i3 == 1) {
                    updateOp.f8002b = i9 + 1;
                } else if (i3 == 2) {
                    updateOp.f8002b = i9 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            UpdateOp updateOp2 = (UpdateOp) arrayList.get(size2);
            if (updateOp2.f8001a == 8) {
                int i10 = updateOp2.d;
                if (i10 == updateOp2.f8002b || i10 < 0) {
                    arrayList.remove(size2);
                    updateOp2.f8003c = null;
                    this.f7997a.a(updateOp2);
                }
            } else if (updateOp2.d <= 0) {
                arrayList.remove(size2);
                updateOp2.f8003c = null;
                this.f7997a.a(updateOp2);
            }
        }
        return i2;
    }
}
