package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.core.view.PointerIconCompat;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Zn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2939Zn extends C4677td0 {
    public static final String A0;
    public static final String B0;
    public static final String C0;
    public static final String D0;
    public static final String E0;
    public static final String F0;
    public static final String p0;
    public static final String q0;
    public static final String r0;
    public static final String s0;
    public static final String t0;
    public static final String u0;
    public static final String v0;
    public static final String w0;
    public static final String x0;
    public static final String y0;
    public static final String z0;
    public final boolean a0;
    public final boolean b0;
    public final boolean c0;
    public final boolean d0;
    public final boolean e0;
    public final boolean f0;
    public final boolean g0;
    public final boolean h0;
    public final boolean i0;
    public final boolean j0;
    public final boolean k0;
    public final boolean l0;
    public final boolean m0;
    public final SparseArray n0;
    public final SparseBooleanArray o0;

    static {
        new C2939Zn(new C2913Yn());
        int i = Ug0.f3833a;
        p0 = Integer.toString(1000, 36);
        q0 = Integer.toString(1001, 36);
        r0 = Integer.toString(1002, 36);
        s0 = Integer.toString(PointerIconCompat.TYPE_HELP, 36);
        t0 = Integer.toString(1004, 36);
        u0 = Integer.toString(1005, 36);
        v0 = Integer.toString(PointerIconCompat.TYPE_CELL, 36);
        w0 = Integer.toString(PointerIconCompat.TYPE_CROSSHAIR, 36);
        x0 = Integer.toString(PointerIconCompat.TYPE_TEXT, 36);
        y0 = Integer.toString(PointerIconCompat.TYPE_VERTICAL_TEXT, 36);
        z0 = Integer.toString(1010, 36);
        A0 = Integer.toString(1011, 36);
        B0 = Integer.toString(1012, 36);
        C0 = Integer.toString(PointerIconCompat.TYPE_ALL_SCROLL, 36);
        D0 = Integer.toString(PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, 36);
        E0 = Integer.toString(PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW, 36);
        F0 = Integer.toString(PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, 36);
    }

    public C2939Zn(C2913Yn c2913Yn) {
        super(c2913Yn);
        this.a0 = c2913Yn.w;
        this.b0 = c2913Yn.x;
        this.c0 = c2913Yn.y;
        this.d0 = c2913Yn.z;
        this.e0 = c2913Yn.A;
        this.f0 = c2913Yn.B;
        this.g0 = c2913Yn.C;
        this.h0 = c2913Yn.D;
        this.i0 = c2913Yn.E;
        this.j0 = c2913Yn.F;
        this.k0 = c2913Yn.G;
        this.l0 = c2913Yn.H;
        this.m0 = c2913Yn.I;
        this.n0 = c2913Yn.J;
        this.o0 = c2913Yn.K;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4677td0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2939Zn.class != obj.getClass()) {
            return false;
        }
        C2939Zn c2939Zn = (C2939Zn) obj;
        if (super.equals(c2939Zn) && this.a0 == c2939Zn.a0 && this.b0 == c2939Zn.b0 && this.c0 == c2939Zn.c0 && this.d0 == c2939Zn.d0 && this.e0 == c2939Zn.e0 && this.f0 == c2939Zn.f0 && this.g0 == c2939Zn.g0 && this.h0 == c2939Zn.h0 && this.i0 == c2939Zn.i0 && this.j0 == c2939Zn.j0 && this.k0 == c2939Zn.k0 && this.l0 == c2939Zn.l0 && this.m0 == c2939Zn.m0) {
            SparseBooleanArray sparseBooleanArray = this.o0;
            int size = sparseBooleanArray.size();
            SparseBooleanArray sparseBooleanArray2 = c2939Zn.o0;
            if (sparseBooleanArray2.size() == size) {
                for (int i = 0; i < size; i++) {
                    if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) >= 0) {
                    }
                }
                SparseArray sparseArray = this.n0;
                int size2 = sparseArray.size();
                SparseArray sparseArray2 = c2939Zn.n0;
                if (sparseArray2.size() == size2) {
                    for (int i2 = 0; i2 < size2; i2++) {
                        int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                        if (iIndexOfKey >= 0) {
                            Map map = (Map) sparseArray.valueAt(i2);
                            Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                            if (map2.size() == map.size()) {
                                for (Map.Entry entry : map.entrySet()) {
                                    C4062md0 c4062md0 = (C4062md0) entry.getKey();
                                    if (!map2.containsKey(c4062md0) || !Ug0.a(entry.getValue(), map2.get(c4062md0))) {
                                    }
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4677td0
    public final int hashCode() {
        return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.a0 ? 1 : 0)) * 31) + (this.b0 ? 1 : 0)) * 31) + (this.c0 ? 1 : 0)) * 31) + (this.d0 ? 1 : 0)) * 31) + (this.e0 ? 1 : 0)) * 31) + (this.f0 ? 1 : 0)) * 31) + (this.g0 ? 1 : 0)) * 31) + (this.h0 ? 1 : 0)) * 31) + (this.i0 ? 1 : 0)) * 31) + (this.j0 ? 1 : 0)) * 31) + (this.k0 ? 1 : 0)) * 31) + (this.l0 ? 1 : 0)) * 31) + (this.m0 ? 1 : 0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4677td0, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2538Kb
    public final Bundle toBundle() {
        Bundle bundle = super.toBundle();
        bundle.putBoolean(p0, this.a0);
        bundle.putBoolean(q0, this.b0);
        bundle.putBoolean(r0, this.c0);
        bundle.putBoolean(D0, this.d0);
        bundle.putBoolean(s0, this.e0);
        bundle.putBoolean(t0, this.f0);
        bundle.putBoolean(u0, this.g0);
        bundle.putBoolean(v0, this.h0);
        bundle.putBoolean(E0, this.i0);
        bundle.putBoolean(F0, this.j0);
        bundle.putBoolean(w0, this.k0);
        bundle.putBoolean(x0, this.l0);
        bundle.putBoolean(y0, this.m0);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = this.n0;
            if (i >= sparseArray2.size()) {
                break;
            }
            int iKeyAt = sparseArray2.keyAt(i);
            for (Map.Entry entry : ((Map) sparseArray2.valueAt(i)).entrySet()) {
                C3027ao c3027ao = (C3027ao) entry.getValue();
                if (c3027ao != null) {
                    sparseArray.put(arrayList2.size(), c3027ao);
                }
                arrayList2.add((C4062md0) entry.getKey());
                arrayList.add(Integer.valueOf(iKeyAt));
            }
            bundle.putIntArray(z0, AbstractC2995aW.z0(arrayList));
            bundle.putParcelableArrayList(A0, FW.g0(arrayList2));
            SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>(sparseArray.size());
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                sparseArray3.put(sparseArray.keyAt(i2), ((InterfaceC2538Kb) sparseArray.valueAt(i2)).toBundle());
            }
            bundle.putSparseParcelableArray(B0, sparseArray3);
            i++;
        }
        SparseBooleanArray sparseBooleanArray = this.o0;
        int[] iArr = new int[sparseBooleanArray.size()];
        for (int i3 = 0; i3 < sparseBooleanArray.size(); i3++) {
            iArr[i3] = sparseBooleanArray.keyAt(i3);
        }
        bundle.putIntArray(C0, iArr);
        return bundle;
    }
}
