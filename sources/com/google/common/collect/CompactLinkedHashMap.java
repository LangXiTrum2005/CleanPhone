package com.google.common.collect;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
class CompactLinkedHashMap<K, V> extends CompactHashMap<K, V> {
    public transient long[] l0;
    public transient int m0;
    public transient int n0;

    public final long[] B() {
        long[] jArr = this.l0;
        Objects.requireNonNull(jArr);
        return jArr;
    }

    public final void C(int i2, int i3) {
        if (i2 == -2) {
            this.m0 = i3;
        } else {
            B()[i2] = (B()[i2] & (-4294967296L)) | (((long) (i3 + 1)) & 4294967295L);
        }
        if (i3 == -2) {
            this.n0 = i2;
        } else {
            B()[i3] = (4294967295L & B()[i3]) | (((long) (i2 + 1)) << 32);
        }
    }

    @Override // com.google.common.collect.CompactHashMap
    public final void a(int i2) {
    }

    @Override // com.google.common.collect.CompactHashMap
    public final int b(int i2, int i3) {
        return i2 >= size() ? i3 : i2;
    }

    @Override // com.google.common.collect.CompactHashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (u()) {
            return;
        }
        this.m0 = -2;
        this.n0 = -2;
        long[] jArr = this.l0;
        if (jArr != null) {
            Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }

    @Override // com.google.common.collect.CompactHashMap
    public final int d() {
        int iD = super.d();
        this.l0 = new long[iD];
        return iD;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final Map g() {
        Map mapG = super.g();
        this.l0 = null;
        return mapG;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final LinkedHashMap i(int i2) {
        return new LinkedHashMap(i2, 1.0f, false);
    }

    @Override // com.google.common.collect.CompactHashMap
    public final int k() {
        return this.m0;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final int l(int i2) {
        return ((int) B()[i2]) - 1;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final void q(int i2) {
        super.q(i2);
        this.m0 = -2;
        this.n0 = -2;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final void r(int i2, Object obj, Object obj2, int i3, int i4) {
        super.r(i2, obj, obj2, i3, i4);
        C(this.n0, i2);
        C(i2, -2);
    }

    @Override // com.google.common.collect.CompactHashMap
    public final void t(int i2, int i3) {
        int size = size() - 1;
        super.t(i2, i3);
        C(((int) (B()[i2] >>> 32)) - 1, l(i2));
        if (i2 < size) {
            C(((int) (B()[size] >>> 32)) - 1, i2);
            C(i2, l(size));
        }
        B()[size] = 0;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final void z(int i2) {
        super.z(i2);
        this.l0 = Arrays.copyOf(B(), i2);
    }
}
