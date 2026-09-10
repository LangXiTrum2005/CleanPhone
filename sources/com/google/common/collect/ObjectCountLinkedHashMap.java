package com.google.common.collect;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
class ObjectCountLinkedHashMap<K> extends ObjectCountHashMap<K> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient long[] f19944i;
    public transient int j;
    public transient int k;

    @Override // com.google.common.collect.ObjectCountHashMap
    public final void a() {
        super.a();
        this.j = -2;
        this.k = -2;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public final int c() {
        int i2 = this.j;
        if (i2 == -2) {
            return -1;
        }
        return i2;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public final void h(int i2) {
        super.h(i2);
        this.j = -2;
        this.k = -2;
        long[] jArr = new long[i2];
        this.f19944i = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public final void i(int i2, int i3, int i4, Object obj) {
        super.i(i2, i3, i4, obj);
        r(this.k, i2);
        r(i2, -2);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public final void j(int i2) {
        int i3 = this.f19940c - 1;
        long j = this.f19944i[i2];
        r((int) (j >>> 32), (int) j);
        if (i2 < i3) {
            r((int) (this.f19944i[i3] >>> 32), i2);
            r(i2, (int) this.f19944i[i3]);
        }
        super.j(i2);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public final int k(int i2) {
        int i3 = (int) this.f19944i[i2];
        if (i3 == -2) {
            return -1;
        }
        return i3;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public final int l(int i2, int i3) {
        return i2 == this.f19940c ? i3 : i2;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public final void p(int i2) {
        super.p(i2);
        long[] jArr = this.f19944i;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i2);
        this.f19944i = jArrCopyOf;
        Arrays.fill(jArrCopyOf, length, i2, -1L);
    }

    public final void r(int i2, int i3) {
        if (i2 == -2) {
            this.j = i3;
        } else {
            long[] jArr = this.f19944i;
            jArr[i2] = (jArr[i2] & (-4294967296L)) | (((long) i3) & 4294967295L);
        }
        if (i3 == -2) {
            this.k = i2;
        } else {
            long[] jArr2 = this.f19944i;
            jArr2[i3] = (4294967295L & jArr2[i3]) | (((long) i2) << 32);
        }
    }
}
