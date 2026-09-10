package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.SparseBooleanArray;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3125bv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f4194a;

    public C3125bv(SparseBooleanArray sparseBooleanArray) {
        this.f4194a = sparseBooleanArray;
    }

    public final int a(int i) {
        SparseBooleanArray sparseBooleanArray = this.f4194a;
        FW.m(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3125bv)) {
            return false;
        }
        C3125bv c3125bv = (C3125bv) obj;
        int i = Ug0.f3833a;
        SparseBooleanArray sparseBooleanArray = this.f4194a;
        if (i >= 24) {
            return sparseBooleanArray.equals(c3125bv.f4194a);
        }
        if (sparseBooleanArray.size() != c3125bv.f4194a.size()) {
            return false;
        }
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            if (a(i2) != c3125bv.a(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = Ug0.f3833a;
        SparseBooleanArray sparseBooleanArray = this.f4194a;
        if (i >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            size = (size * 31) + a(i2);
        }
        return size;
    }
}
